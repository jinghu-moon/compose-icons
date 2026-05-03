package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TicketMinus: ImageVector
    get() {
        if (_ticketMinus != null) return _ticketMinus!!
        _ticketMinus = lucideOutlineIcon(
            name = "TicketMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.000 9.000 C 3.657 9.000 5.000 10.343 5.000 12.000 C 5.000 13.657 3.657 15.000 2.000 15.000 L 2.000 17.000 C 2.000 18.105 2.895 19.000 4.000 19.000 L 20.000 19.000 C 21.105 19.000 22.000 18.105 22.000 17.000 L 22.000 15.000 C 20.343 15.000 19.000 13.657 19.000 12.000 C 19.000 10.343 20.343 9.000 22.000 9.000 L 22.000 7.000 C 22.000 5.895 21.105 5.000 20.000 5.000 L 4.000 5.000 C 2.895 5.000 2.000 5.895 2.000 7.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 9.000 12.000 L 15.000 12.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _ticketMinus!!
    }

private var _ticketMinus: ImageVector? = null
