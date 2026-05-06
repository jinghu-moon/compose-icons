package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Search: ImageVector
    get() {
        if (_search != null) return _search!!
        _search = tablerFilledIcon(
            name = "Search",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 3.072c2.002 1.156 3.406 3.121 3.851 5.389 .445 2.269-.114 4.618-1.531 6.445l5.387 5.387c.379 .392 .374 1.016-.012 1.402-.386 .386-1.009 .391-1.402 .012L14.905 16.32C11.729 18.784 7.217 18.509 4.364 15.677 1.512 12.845 1.203 8.335 3.645 5.141 6.086 1.947 10.518 1.061 14 3.071"),
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
        return _search!!
    }

private var _search: ImageVector? = null
