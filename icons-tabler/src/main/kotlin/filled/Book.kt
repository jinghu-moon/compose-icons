package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Book: ImageVector
    get() {
        if (_book != null) return _book!!
        _book = tablerFilledIcon(
            name = "Book",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.500 5.134 C 21.773 5.292 21.956 5.569 21.993 5.882 L 22.000 6.000 L 22.000 19.000 C 22.000 19.357 21.809 19.687 21.500 19.866 C 21.191 20.045 20.809 20.045 20.500 19.866 C 18.199 18.537 15.389 18.438 13.000 19.600 L 13.000 4.426 C 15.797 3.381 18.914 3.641 21.500 5.134M 11.000 4.427 L 11.001 19.601 C 8.709 18.485 6.022 18.529 3.767 19.718 L 3.440 19.898 L 3.337 19.942 L 3.288 19.958 L 3.178 19.984 L 3.117 19.994 L 3.000 20.000 L 2.958 20.000 L 2.848 19.988 L 2.771 19.974 L 2.663 19.942 L 2.537 19.886 L 2.442 19.830 L 2.353 19.763 L 2.293 19.707 L 2.220 19.625 L 2.156 19.536 L 2.134 19.500 L 2.102 19.440 L 2.058 19.337 L 2.042 19.288 L 2.016 19.178 L 2.006 19.117 L 2.002 19.068 L 2.000 6.000 C 2.000 5.643 2.191 5.313 2.500 5.134 C 5.086 3.641 8.203 3.382 11.000 4.427"),
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
        return _book!!
    }

private var _book: ImageVector? = null
