package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CarProfile: ImageVector
    get() {
        if (_carProfile != null) return _carProfile!!
        _carProfile = phosphorBoldIcon(
            name = "CarProfile",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 236.000 108.000 L 213.000 108.000 L 170.830 65.860 C 167.089 62.096 161.997 59.986 156.690 60.000 L 48.280 60.000 C 41.593 60.001 35.348 63.345 31.640 68.910 L 2.000 113.340 C 0.691 115.314 -0.005 117.631 -0.000 120.000 L -0.000 168.000 C 0.000 179.046 8.954 188.000 20.000 188.000 L 33.500 188.000 C 37.886 202.272 51.069 212.013 66.000 212.013 C 80.931 212.013 94.114 202.272 98.500 188.000 L 157.500 188.000 C 161.886 202.272 175.069 212.013 190.000 212.013 C 204.931 212.013 218.114 202.272 222.500 188.000 L 236.000 188.000 C 247.046 188.000 256.000 179.046 256.000 168.000 L 256.000 128.000 C 256.000 116.954 247.046 108.000 236.000 108.000 ZM 50.420 84.000 L 155.000 84.000 L 179.000 108.000 L 34.420 108.000 ZM 66.000 188.000 C 60.477 188.000 56.000 183.523 56.000 178.000 C 56.000 172.477 60.477 168.000 66.000 168.000 C 71.523 168.000 76.000 172.477 76.000 178.000 C 76.000 183.523 71.523 188.000 66.000 188.000 ZM 190.000 188.000 C 184.477 188.000 180.000 183.523 180.000 178.000 C 180.000 172.477 184.477 168.000 190.000 168.000 C 195.523 168.000 200.000 172.477 200.000 178.000 C 200.000 183.523 195.523 188.000 190.000 188.000 ZM 232.000 164.000 L 221.000 164.000 C 215.507 151.805 203.375 143.964 190.000 143.964 C 176.625 143.964 164.493 151.805 159.000 164.000 L 97.000 164.000 C 91.507 151.805 79.375 143.964 66.000 143.964 C 52.625 143.964 40.493 151.805 35.000 164.000 L 24.000 164.000 L 24.000 132.000 L 232.000 132.000 Z"),
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
        return _carProfile!!
    }

private var _carProfile: ImageVector? = null
