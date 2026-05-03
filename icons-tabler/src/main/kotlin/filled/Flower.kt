package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Flower: ImageVector
    get() {
        if (_flower != null) return _flower!!
        _flower = tablerFilledIcon(
            name = "Flower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 1.000 C 14.209 1.000 16.000 2.791 16.000 5.000 L 15.998 5.055 L 16.028 5.037 C 16.871 4.548 17.864 4.386 18.818 4.582 L 19.055 4.638 C 20.075 4.914 20.943 5.585 21.467 6.503 C 22.565 8.414 21.915 10.853 20.012 11.964 L 19.944 12.000 L 20.015 12.039 C 21.845 13.109 22.526 15.417 21.570 17.309 L 21.469 17.495 C 20.945 18.414 20.076 19.086 19.054 19.362 C 18.033 19.638 16.943 19.494 16.028 18.963 L 15.998 18.943 L 16.000 19.000 C 16.000 21.131 14.329 22.888 12.200 22.995 L 12.000 23.000 C 9.791 23.000 8.000 21.209 8.000 19.000 L 8.001 18.944 L 7.972 18.963 C 7.129 19.452 6.136 19.614 5.182 19.419 L 4.946 19.363 C 3.925 19.087 3.057 18.416 2.533 17.498 C 1.435 15.588 2.084 13.150 3.986 12.038 L 4.056 12.000 L 3.985 11.962 C 2.155 10.892 1.474 8.584 2.430 6.692 L 2.530 6.505 C 3.054 5.585 3.924 4.912 4.946 4.637 C 5.968 4.361 7.058 4.505 7.974 5.037 L 8.000 5.055 L 8.000 5.000 C 8.000 2.869 9.671 1.112 11.800 1.005 ZM 12.000 9.000 C 10.343 9.000 9.000 10.343 9.000 12.000 C 9.000 13.657 10.343 15.000 12.000 15.000 C 13.657 15.000 15.000 13.657 15.000 12.000 C 15.000 10.343 13.657 9.000 12.000 9.000"),
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
        return _flower!!
    }

private var _flower: ImageVector? = null
