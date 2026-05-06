package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Omega: ImageVector
    get() {
        if (_omega != null) return _omega!!
        _omega = lucideOutlineIcon(
            name = "Omega",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 20h4.5C7.776 20 8 19.776 8 19.5v-.282c-.002-.178-.095-.343-.247-.437C4.73 16.888 3.325 13.221 4.31 9.792 5.295 6.364 8.431 4.001 11.998 4.001c3.567-0 6.704 2.361 7.69 5.79 .986 3.428-.418 7.095-3.441 8.989-.152 .094-.245 .259-.247 .438v.282c0 .276 .224 .5 .5 .5h4.5"),
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
        return _omega!!
    }

private var _omega: ImageVector? = null
