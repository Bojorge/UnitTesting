const chai = window.chai
const expect = chai.expect

describe('toCelcius', () => {
  it('Debe convertir de farenheit a celcius para todos los valores en los array', () => {
    expect(toCelcius([23, 140, 212, 41])).to.deep.equal([-5, 60, 100, 5])
    expect(toCelcius([-58, -22, -4, 14])).to.deep.equal([-50, -30, -20, -10])
    expect(toCelcius([104, 122, 158, 176])).to.deep.equal([40, 50, 70, 80])
  })
})
