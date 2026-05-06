package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Pizza: ImageVector
    get() {
        if (_pizza != null) return _pizza!!
        _pizza = tablerFilledIcon(
            name = "Pizza",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.89 2.542l8.5 16.517c.123 .238 .144 .516 .061 .77-.084 .255-.266 .465-.507 .584-2.781 1.377-5.842 2.091-8.945 2.087l-.522-.007C8.551 22.421 5.677 21.711 3.054 20.413c-.24-.119-.422-.33-.505-.584-.083-.255-.061-.532 .062-.77L11.111 2.542c.171-.333 .515-.542 .889-.542 .374 0 .718 .209 .889 .542M5.825 17.182l-.96 1.865 .409 .17c1.984 .787 4.092 1.219 6.226 1.276l.5 .007c2.297 .003 4.573-.431 6.708-1.279l.424-.176-.89-1.728c-1.919 .785-3.973 1.187-6.046 1.183-2.191 .004-4.36-.444-6.37-1.318M11 12.99c-.552 0-1 .448-1 1l.007 .127c.062 .525 .523 .911 1.052 .88 .528-.031 .941-.468 .941-.997l-.007-.127c-.059-.503-.486-.883-.993-.883M13 10c-.552 0-1 .448-1 1l.007 .127c.062 .525 .523 .911 1.052 .88 .528-.031 .941-.468 .941-.997l-.007-.127C13.934 10.38 13.507 10 13 10"),
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
        return _pizza!!
    }

private var _pizza: ImageVector? = null
