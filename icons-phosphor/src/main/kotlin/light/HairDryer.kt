package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HairDryer: ImageVector
    get() {
        if (_hairDryer != null) return _hairDryer!!
        _hairDryer = phosphorLightIcon(
            name = "HairDryer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 198.000 88.000 C 198.000 71.431 184.569 58.000 168.000 58.000 C 151.431 58.000 138.000 71.431 138.000 88.000 C 138.000 104.569 151.431 118.000 168.000 118.000 C 184.569 118.000 198.000 104.569 198.000 88.000 ZM 168.000 106.000 C 158.059 106.000 150.000 97.941 150.000 88.000 C 150.000 78.059 158.059 70.000 168.000 70.000 C 177.941 70.000 186.000 78.059 186.000 88.000 C 186.000 97.941 177.941 106.000 168.000 106.000 ZM 162.850 214.000 C 168.339 213.997 173.320 210.787 175.590 205.790 L 207.390 135.850 C 227.580 119.215 235.156 91.698 226.326 67.073 C 217.496 42.448 194.160 26.015 168.000 26.000 C 167.665 26.001 167.331 26.028 167.000 26.080 L 29.700 49.000 C 22.960 50.123 18.015 55.947 18.000 62.780 L 18.000 113.220 C 18.015 120.053 22.960 125.877 29.700 127.000 L 130.000 143.750 L 130.000 200.000 C 130.000 207.732 136.268 214.000 144.000 214.000 L 146.000 214.000 L 146.000 216.000 C 146.000 236.987 163.013 254.000 184.000 254.000 L 200.000 254.000 C 203.314 254.000 206.000 251.314 206.000 248.000 C 206.000 244.686 203.314 242.000 200.000 242.000 L 184.000 242.000 C 169.641 242.000 158.000 230.359 158.000 216.000 L 158.000 214.000 ZM 30.000 113.220 L 30.000 62.780 C 29.986 61.792 30.696 60.943 31.670 60.780 L 168.480 38.000 C 196.094 38.000 218.480 60.386 218.480 88.000 C 218.480 115.614 196.094 138.000 168.480 138.000 L 31.670 115.200 C 30.703 115.038 29.996 114.200 30.000 113.220 ZM 142.000 200.000 L 142.000 145.750 L 167.000 149.920 C 167.331 149.972 167.665 149.999 168.000 150.000 C 175.349 150.005 182.640 148.698 189.530 146.140 L 164.670 200.830 C 164.345 201.543 163.633 202.000 162.850 202.000 L 144.000 202.000 C 142.895 202.000 142.000 201.105 142.000 200.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _hairDryer!!
    }

private var _hairDryer: ImageVector? = null
