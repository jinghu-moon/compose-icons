package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Calculator: ImageVector
    get() {
        if (_calculator != null) return _calculator!!
        _calculator = tablerFilledIcon(
            name = "Calculator",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 2c1.657 0 3 1.343 3 3v14c0 1.657-1.343 3-3 3h-12C4.343 22 3 20.657 3 19v-14C3 3.343 4.343 2 6 2ZM8 17c-.552 0-1 .448-1 1l.007 .127c.062 .525 .523 .911 1.052 .88 .528-.031 .941-.468 .941-.997l-.007-.127C8.934 17.38 8.507 17 8 17ZM12 17c-.552 0-1 .448-1 1l.007 .127c.062 .525 .523 .911 1.052 .88 .528-.031 .941-.468 .941-.997l-.007-.127C12.934 17.38 12.507 17 12 17ZM16 17c-.552 0-1 .448-1 1l.007 .127c.062 .525 .523 .911 1.052 .88 .528-.031 .941-.468 .941-.997l-.007-.127C16.934 17.38 16.507 17 16 17ZM8 13c-.552 0-1 .448-1 1l.007 .127c.062 .525 .523 .911 1.052 .88 .528-.031 .941-.468 .941-.997l-.007-.127C8.934 13.38 8.507 13 8 13ZM12 13c-.552 0-1 .448-1 1l.007 .127c.062 .525 .523 .911 1.052 .88 .528-.031 .941-.468 .941-.997l-.007-.127C12.934 13.38 12.507 13 12 13ZM16 13c-.552 0-1 .448-1 1l.007 .127c.062 .525 .523 .911 1.052 .88 .528-.031 .941-.468 .941-.997l-.007-.127C16.934 13.38 16.507 13 16 13ZM15 6h-6C7.895 6 7 6.895 7 8v1c0 1.105 .895 2 2 2h6c1.105 0 2-.895 2-2v-1C17 6.895 16.105 6 15 6Z"),
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
        return _calculator!!
    }

private var _calculator: ImageVector? = null
