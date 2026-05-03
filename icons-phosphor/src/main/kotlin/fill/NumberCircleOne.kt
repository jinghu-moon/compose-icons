package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberCircleOne: ImageVector
    get() {
        if (_numberCircleOne != null) return _numberCircleOne!!
        _numberCircleOne = phosphorFillIcon(
            name = "NumberCircleOne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 140.000 176.000 C 140.000 180.418 136.418 184.000 132.000 184.000 C 127.582 184.000 124.000 180.418 124.000 176.000 L 124.000 95.000 L 112.440 102.710 C 108.762 105.162 103.792 104.168 101.340 100.490 C 98.888 96.812 99.882 91.842 103.560 89.390 L 127.560 73.390 C 130.008 71.757 133.155 71.599 135.754 72.980 C 138.353 74.361 139.984 77.057 140.000 80.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _numberCircleOne!!
    }

private var _numberCircleOne: ImageVector? = null
