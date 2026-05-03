package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BellRinging2: ImageVector
    get() {
        if (_bellRinging2 != null) return _bellRinging2!!
        _bellRinging2 = tablerFilledIcon(
            name = "BellRinging2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.630 17.531 C 10.242 18.142 9.841 19.189 8.978 19.237 C 7.842 19.301 6.732 18.877 5.928 18.071 C 5.123 17.267 4.699 16.158 4.763 15.022 C 4.809 14.196 5.768 13.794 6.387 14.296 L 6.469 14.370 L 9.630 17.530 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 20.071 3.929 C 21.031 4.889 21.205 6.339 20.591 7.476 L 20.501 7.629 L 20.477 7.665 C 21.166 10.138 20.629 12.792 19.031 14.802 L 18.848 15.025 L 18.657 15.243 L 16.584 17.315 L 16.504 17.427 C 16.080 18.044 15.902 18.798 16.005 19.540 L 16.040 19.741 L 16.085 19.926 C 16.349 20.878 15.232 21.571 14.500 20.977 L 14.414 20.899 L 3.101 9.586 C 2.374 8.859 3.084 7.641 4.074 7.915 C 4.928 8.152 5.843 7.999 6.574 7.497 L 6.690 7.411 L 8.791 5.311 C 10.754 3.524 13.476 2.827 16.056 3.451 L 16.334 3.522 L 16.371 3.499 C 17.442 2.837 18.812 2.914 19.803 3.691 L 19.943 3.808 L 20.071 3.928 Z"),
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
        return _bellRinging2!!
    }

private var _bellRinging2: ImageVector? = null
