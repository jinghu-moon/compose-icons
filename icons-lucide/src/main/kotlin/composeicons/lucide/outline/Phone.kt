package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Phone: ImageVector
    get() {
        if (_phone != null) return _phone!!
        _phone = lucideOutlineIcon(
            name = "Phone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.832 16.568c.425 .195 .929 .069 1.213-.303l.355-.465C15.778 15.296 16.37 15 17 15h3c1.105 0 2 .895 2 2v3c0 1.105-.895 2-2 2C10.059 22 2 13.941 2 4 2 2.895 2.895 2 4 2h3c1.105 0 2 .895 2 2v3c0 .63-.296 1.222-.8 1.6l-.468 .351c-.379 .289-.501 .805-.292 1.233 1.367 2.776 3.614 5.021 6.392 6.384"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _phone!!
    }

private var _phone: ImageVector? = null
