package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SquaresUnite: ImageVector
    get() {
        if (_squaresUnite != null) return _squaresUnite!!
        _squaresUnite = lucideOutlineIcon(
            name = "SquaresUnite",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 16C2.895 16 2 15.105 2 14v-10C2 2.895 2.895 2 4 2h10c1.105 0 2 .895 2 2v3c0 .552 .448 1 1 1h3c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-10C8.895 22 8 21.105 8 20v-3C8 16.448 7.552 16 7 16Z"),
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
        return _squaresUnite!!
    }

private var _squaresUnite: ImageVector? = null
