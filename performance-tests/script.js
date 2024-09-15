import http from 'k6/http';
import { check, sleep } from 'k6';

export let options = {
    vus: 10, // 10 virtual users
    duration: '30s', // test duration
};

export default function () {
    let res = http.get('https://seu-endpoint.com/api/test');

    // Check if the response was successful (status 200)
    check(res, {
        'status is 200': (r) => r.status === 200,
    });

    // Wait 1 second between each request
    sleep(1);
}