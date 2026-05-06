package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Coin: ImageVector
    get() {
        if (_coin != null) return _coin!!
        _coin = tablerFilledIcon(
            name = "Coin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3.34c4.203 2.426 6.057 7.52 4.397 12.081-1.66 4.56-6.354 7.271-11.134 6.428C5.484 21.006 2 16.853 2 12l.005-.324C2.119 8.163 4.069 4.968 7.141 3.26 10.213 1.552 13.956 1.582 17 3.34ZM12 6c-.552 0-1 .448-1 1C9.343 7 8 8.343 8 10c0 1.657 1.343 3 3 3v2c-.337 .018-.66-.131-.866-.398l-.068-.101c-.284-.459-.882-.609-1.349-.339-.468 .269-.637 .861-.383 1.337 .519 .9 1.467 1.467 2.505 1.5h.161c-0 .507 .379 .935 .883 .994L12 18c.552 0 1-.448 1-1l.176-.005c1.621-.094 2.873-1.46 2.826-3.083C15.954 12.289 14.624 10.998 13 11v-2c.358-.012 .671 .14 .866 .398l.068 .101c.284 .459 .882 .609 1.349 .339 .468-.269 .637-.861 .383-1.337C15.147 7.601 14.2 7.033 13.161 7h-.161C13 6.448 12.552 6 12 6ZM13 13c.552 0 1 .448 1 1 0 .552-.448 1-1 1v-2ZM11 9v2c-.552 0-1-.448-1-1 0-.552 .448-1 1-1Z"),
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
        return _coin!!
    }

private var _coin: ImageVector? = null
