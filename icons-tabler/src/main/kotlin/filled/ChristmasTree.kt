package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChristmasTree: ImageVector
    get() {
        if (_christmasTree != null) return _christmasTree!!
        _christmasTree = tablerFilledIcon(
            name = "ChristmasTree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 19.000 L 15.000 20.000 C 15.000 21.105 14.105 22.000 13.000 22.000 L 11.000 22.000 C 9.895 22.000 9.000 21.105 9.000 20.000 L 9.000 19.000 ZM 5.000 18.000 C 4.110 18.000 3.663 16.923 4.293 16.293 L 7.148 13.436 L 5.684 12.949 C 5.375 12.846 5.136 12.600 5.042 12.289 C 4.948 11.978 5.012 11.640 5.212 11.384 L 5.292 11.293 L 8.311 8.273 L 7.553 7.894 C 7.285 7.760 7.092 7.513 7.025 7.222 C 6.959 6.930 7.027 6.624 7.210 6.387 L 7.293 6.293 L 11.293 2.293 C 11.684 1.903 12.316 1.903 12.707 2.293 L 16.707 6.293 C 16.934 6.520 17.038 6.843 16.987 7.160 C 16.935 7.477 16.734 7.750 16.447 7.894 L 15.688 8.273 L 18.708 11.293 C 18.938 11.523 19.041 11.850 18.986 12.170 C 18.930 12.490 18.723 12.764 18.429 12.903 L 18.316 12.949 L 16.851 13.436 L 19.707 16.293 C 20.310 16.895 19.927 17.907 19.114 17.994 L 19.000 18.000 Z"),
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
        return _christmasTree!!
    }

private var _christmasTree: ImageVector? = null
