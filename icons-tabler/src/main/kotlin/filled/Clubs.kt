package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Clubs: ImageVector
    get() {
        if (_clubs != null) return _clubs!!
        _clubs = tablerFilledIcon(
            name = "Clubs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 10.093 2.000 8.352 3.085 7.512 4.797 L 7.409 5.022 C 7.024 5.915 6.908 6.901 7.075 7.859 L 7.102 7.999 C 4.928 7.954 2.974 9.318 2.268 11.375 C 1.562 13.432 2.267 15.709 4.011 17.008 L 4.209 17.148 C 5.510 18.024 7.146 18.239 8.629 17.728 L 8.803 17.662 L 8.030 20.757 C 7.955 21.056 8.022 21.372 8.212 21.615 C 8.401 21.858 8.692 22.000 9.000 22.000 L 15.000 22.000 L 15.113 21.994 C 15.399 21.961 15.658 21.807 15.822 21.570 C 15.986 21.333 16.040 21.037 15.970 20.757 L 15.196 17.662 L 15.370 17.727 C 17.259 18.377 19.353 17.840 20.696 16.363 C 22.040 14.885 22.375 12.749 21.549 10.931 C 20.723 9.113 18.894 7.960 16.897 8.000 L 16.925 7.860 C 17.180 6.405 16.779 4.913 15.828 3.782 C 14.878 2.651 13.477 1.999 12.000 2.000 Z"),
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
        return _clubs!!
    }

private var _clubs: ImageVector? = null
