package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bug: ImageVector
    get() {
        if (_bug != null) return _bug!!
        _bug = tablerFilledIcon(
            name = "Bug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 4c2.131-0 3.888 1.671 3.995 3.8L16 8c.148-0 .294 .033 .428 .096L19.461 6.158c.301-.202 .688-.226 1.011-.062 .323 .164 .532 .491 .546 .853 .014 .362-.17 .704-.479 .892L17.524 9.773c.276 .712 .437 1.464 .476 2.227h3c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-3v1c.001 .515-.065 1.027-.195 1.525l2.708 1.616c.474 .283 .629 .898 .346 1.372-.283 .474-.898 .629-1.372 .346L16.973 18.358c-.918 1.361-2.354 2.286-3.973 2.56v-5.918c0-.552-.448-1-1-1-.552 0-1 .448-1 1v5.917C9.381 20.643 7.945 19.718 7.027 18.357L4.513 19.86c-.474 .283-1.089 .128-1.372-.346-.283-.474-.128-1.089 .346-1.372L6.195 16.526C6.065 16.028 5.999 15.515 6 15v-1h-3C2.448 14 2 13.552 2 13c0-.552 .448-1 1-1h3.001v-.055c.041-.745 .201-1.479 .474-2.173L3.461 7.842C3.151 7.653 2.968 7.312 2.982 6.95c.014-.362 .223-.689 .546-.853 .323-.164 .71-.141 1.011 .062L7.571 8.097l.024-.012 .068-.027 .019-.005 .016-.006 .032-.008 .04-.013 .034-.007 .034-.004 .045-.008 .015-.001 .015-.002L8 8C8 5.791 9.791 4 12 4ZM12 6c-1.105 0-2 .895-2 2h4C14 6.895 13.105 6 12 6Z"),
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
        return _bug!!
    }

private var _bug: ImageVector? = null
