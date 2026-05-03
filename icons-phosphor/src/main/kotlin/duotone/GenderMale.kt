package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GenderMale: ImageVector
    get() {
        if (_genderMale != null) return _genderMale!!
        _genderMale = phosphorDuotoneIcon(
            name = "GenderMale",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 154.910 202.910 C 134.319 223.503 103.350 229.664 76.445 218.520 C 49.539 207.376 31.997 181.122 31.997 152.000 C 31.997 122.878 49.539 96.624 76.445 85.480 C 103.350 74.336 134.319 80.497 154.910 101.090 C 183.025 129.207 183.025 174.793 154.910 202.910 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 216.000 32.000 L 168.000 32.000 C 163.582 32.000 160.000 35.582 160.000 40.000 C 160.000 44.418 163.582 48.000 168.000 48.000 L 196.690 48.000 L 154.620 90.070 C 121.616 63.093 73.256 66.731 44.661 98.344 C 16.066 129.956 17.280 178.437 47.421 208.579 C 77.563 238.720 126.044 239.934 157.656 211.339 C 189.269 182.744 192.907 134.384 165.930 101.380 L 208.000 59.320 L 208.000 88.000 C 208.000 92.418 211.582 96.000 216.000 96.000 C 220.418 96.000 224.000 92.418 224.000 88.000 L 224.000 40.000 C 224.000 35.582 220.418 32.000 216.000 32.000 ZM 149.240 197.290 C 124.243 222.275 83.726 222.269 58.737 197.276 C 33.748 172.284 33.748 131.766 58.737 106.774 C 83.726 81.781 124.243 81.775 149.240 106.760 C 174.192 131.779 174.192 172.271 149.240 197.290 Z"),
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
        return _genderMale!!
    }

private var _genderMale: ImageVector? = null
