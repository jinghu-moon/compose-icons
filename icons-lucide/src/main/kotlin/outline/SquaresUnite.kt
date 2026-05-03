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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 16.000 C 2.895 16.000 2.000 15.105 2.000 14.000 L 2.000 4.000 C 2.000 2.895 2.895 2.000 4.000 2.000 L 14.000 2.000 C 15.105 2.000 16.000 2.895 16.000 4.000 L 16.000 7.000 C 16.000 7.552 16.448 8.000 17.000 8.000 L 20.000 8.000 C 21.105 8.000 22.000 8.895 22.000 10.000 L 22.000 20.000 C 22.000 21.105 21.105 22.000 20.000 22.000 L 10.000 22.000 C 8.895 22.000 8.000 21.105 8.000 20.000 L 8.000 17.000 C 8.000 16.448 7.552 16.000 7.000 16.000 Z"),
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
        return _squaresUnite!!
    }

private var _squaresUnite: ImageVector? = null
