package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Blob: ImageVector
    get() {
        if (_blob != null) return _blob!!
        _blob = tablerFilledIcon(
            name = "Blob",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 3.000 C 14.779 3.000 17.349 4.556 19.243 7.082 C 20.971 9.388 22.000 12.341 22.000 15.098 C 22.000 16.568 21.707 17.816 21.097 18.843 C 20.494 19.857 19.618 20.601 18.515 21.100 C 16.922 21.818 15.180 22.000 12.000 22.000 C 8.825 22.000 7.080 21.817 5.486 21.100 C 4.474 20.643 3.653 19.980 3.060 19.090 L 2.903 18.843 C 2.293 17.815 2.000 16.569 2.000 15.098 C 2.000 12.341 3.030 9.388 4.757 7.082 C 6.650 4.556 9.220 3.000 12.000 3.000"),
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
        return _blob!!
    }

private var _blob: ImageVector? = null
