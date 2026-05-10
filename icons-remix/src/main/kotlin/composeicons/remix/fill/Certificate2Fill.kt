package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Certificate2Fill: ImageVector
    get() {
        if (_certificate2Fill != null) return _certificate2Fill!!
        _certificate2Fill = remixIcon(
            name = "Certificate2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 12c2.209 0 4 1.791 4 4 0 1.263-.586 2.388-1.5 3.121v4.379L19 22l-2.5 1.5v-4.379C15.586 18.388 15 17.263 15 16c0-1.622 .966-3.018 2.354-3.646 .005-.002 .01-.005 .016-.008 .094-.042 .19-.08 .288-.115 .009-.003 .018-.006 .027-.01 .196-.068 .399-.122 .608-.159 .012-.002 .025-.005 .037-.007 .099-.017 .2-.03 .302-.039 .017-.002 .034-.003 .051-.004C18.788 12.005 18.893 12 19 12ZM20 2c.552 0 1 .448 1 1v7.342C20.374 10.121 19.701 10 19 10c-1.093 0-2.117 .293-3 .804v-1.804h-8v2h7.684C14.066 12.075 13 13.913 13 16c0 1.777 .773 3.372 2 4.471v1.529h-11C3.448 22 3 21.552 3 21v-18C3 2.448 3.448 2 4 2h16ZM19 14c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2ZM8 15h5v-2h-5v2Z"),
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
        return _certificate2Fill!!
    }

private var _certificate2Fill: ImageVector? = null
