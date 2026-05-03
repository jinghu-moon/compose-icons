package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberCircleSix: ImageVector
    get() {
        if (_numberCircleSix != null) return _numberCircleSix!!
        _numberCircleSix = phosphorFillIcon(
            name = "NumberCircleSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 148.000 148.000 C 148.000 159.046 139.046 168.000 128.000 168.000 C 116.954 168.000 108.000 159.046 108.000 148.000 C 108.000 136.954 116.954 128.000 128.000 128.000 C 139.046 128.000 148.000 136.954 148.000 148.000 ZM 232.000 128.000 C 232.000 185.438 185.438 232.000 128.000 232.000 C 70.562 232.000 24.000 185.438 24.000 128.000 C 24.000 70.562 70.562 24.000 128.000 24.000 C 185.412 24.061 231.939 70.588 232.000 128.000 ZM 164.000 148.000 C 164.000 128.118 147.882 112.000 128.000 112.000 C 127.390 112.000 126.780 112.000 126.180 112.000 L 142.870 84.100 C 145.134 80.306 143.894 75.394 140.100 73.130 C 136.306 70.866 131.394 72.106 129.130 75.900 C 129.130 75.900 96.730 130.180 96.660 130.320 C 89.231 143.464 90.792 159.847 100.571 171.351 C 110.350 182.855 126.269 187.034 140.437 181.818 C 154.606 176.602 164.014 163.098 164.000 148.000 Z"),
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
        return _numberCircleSix!!
    }

private var _numberCircleSix: ImageVector? = null
