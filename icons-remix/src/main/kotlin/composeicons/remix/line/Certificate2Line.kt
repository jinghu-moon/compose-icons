package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Certificate2Line: ImageVector
    get() {
        if (_certificate2Line != null) return _certificate2Line!!
        _certificate2Line = remixIcon(
            name = "Certificate2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 12c2.209 0 4 1.791 4 4 0 1.263-.586 2.388-1.5 3.121v4.379L19 22l-2.5 1.5v-4.379C15.586 18.388 15 17.263 15 16c0-2.209 1.791-4 4-4ZM20 2c.552 0 1 .448 1 1v7h-2v-6h-14v16h8v2h-9C3.448 22 3 21.552 3 21v-18C3 2.448 3.448 2 4 2h16ZM19 14c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2ZM13 15h-5v-2h5v2ZM16 11h-8v-2h8v2Z"),
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
        return _certificate2Line!!
    }

private var _certificate2Line: ImageVector? = null
