package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.JewishStar: ImageVector
    get() {
        if (_jewishStar != null) return _jewishStar!!
        _jewishStar = tablerFilledIcon(
            name = "JewishStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.433 6h-5.433l-.114 .006c-.338 .039-.632 .247-.783 .551-.15 .305-.135 .665 .04 .957L4.833 12 2.143 16.486l-.054 .1c-.141 .31-.115 .67 .07 .956 .184 .286 .501 .459 .841 .458h5.434l2.709 4.514 .074 .108c.204 .257 .521 .397 .848 .375 .327-.022 .623-.202 .792-.483L15.565 18h5.435l.114-.006c.338-.039 .632-.247 .783-.551 .15-.305 .135-.665-.04-.957L19.166 12 21.857 7.514l.054-.1c.141-.31 .115-.67-.07-.956C21.657 6.172 21.34 6 21 6h-5.434L12.857 1.486C12.676 1.185 12.351 1.001 12 1.001c-.351 0-.676 .184-.857 .485L8.433 6Z"),
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
        return _jewishStar!!
    }

private var _jewishStar: ImageVector? = null
