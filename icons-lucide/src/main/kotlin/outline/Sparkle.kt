package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Sparkle: ImageVector
    get() {
        if (_sparkle != null) return _sparkle!!
        _sparkle = lucideOutlineIcon(
            name = "Sparkle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.017 2.814 C 11.105 2.341 11.519 1.998 12.000 1.998 C 12.481 1.998 12.895 2.341 12.983 2.814 L 14.034 8.372 C 14.187 9.181 14.819 9.813 15.628 9.966 L 21.186 11.017 C 21.659 11.105 22.002 11.519 22.002 12.000 C 22.002 12.481 21.659 12.895 21.186 12.983 L 15.628 14.034 C 14.819 14.187 14.187 14.819 14.034 15.628 L 12.983 21.186 C 12.895 21.659 12.481 22.002 12.000 22.002 C 11.519 22.002 11.105 21.659 11.017 21.186 L 9.966 15.628 C 9.813 14.819 9.181 14.187 8.372 14.034 L 2.814 12.983 C 2.341 12.895 1.998 12.481 1.998 12.000 C 1.998 11.519 2.341 11.105 2.814 11.017 L 8.372 9.966 C 9.181 9.813 9.813 9.181 9.966 8.372 Z"),
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
        return _sparkle!!
    }

private var _sparkle: ImageVector? = null
