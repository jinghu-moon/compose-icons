package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Diamonds: ImageVector
    get() {
        if (_diamonds != null) return _diamonds!!
        _diamonds = tablerFilledIcon(
            name = "Diamonds",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2.005c-.777 0-1.508 .367-1.971 .99L4.667 9.89c-.89 1.136-.89 3.083 0 4.227l5.375 6.911c.467 .616 1.196 .977 1.969 .974 .773-.003 1.499-.37 1.961-.991l5.361-6.894c.89-1.136 .89-3.083 0-4.227L13.958 2.979C13.495 2.364 12.77 2.004 12 2.005Z"),
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
        return _diamonds!!
    }

private var _diamonds: ImageVector? = null
