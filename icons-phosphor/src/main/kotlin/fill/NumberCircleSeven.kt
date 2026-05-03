package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberCircleSeven: ImageVector
    get() {
        if (_numberCircleSeven != null) return _numberCircleSeven!!
        _numberCircleSeven = phosphorFillIcon(
            name = "NumberCircleSeven",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 159.520 90.730 L 127.520 178.730 C 126.371 181.894 123.366 184.000 120.000 184.000 C 119.069 184.002 118.145 183.840 117.270 183.520 C 115.276 182.796 113.650 181.309 112.752 179.387 C 111.854 177.465 111.756 175.264 112.480 173.270 L 140.580 96.000 L 104.000 96.000 C 99.582 96.000 96.000 92.418 96.000 88.000 C 96.000 83.582 99.582 80.000 104.000 80.000 L 152.000 80.000 C 154.609 80.000 157.054 81.272 158.551 83.409 C 160.049 85.545 160.410 88.278 159.520 90.730 Z"),
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
        return _numberCircleSeven!!
    }

private var _numberCircleSeven: ImageVector? = null
