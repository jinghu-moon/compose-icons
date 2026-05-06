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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.017 2.814c.088-.473 .502-.816 .983-.816 .481 0 .895 .343 .983 .816l1.051 5.558c.153 .809 .785 1.441 1.594 1.594l5.558 1.051c.473 .088 .816 .502 .816 .983 0 .481-.343 .895-.816 .983l-5.558 1.051c-.809 .153-1.441 .785-1.594 1.594l-1.051 5.558c-.088 .473-.502 .816-.983 .816-.481 0-.895-.343-.983-.816L9.966 15.628C9.813 14.819 9.181 14.187 8.372 14.034L2.814 12.983C2.341 12.895 1.998 12.481 1.998 12c0-.481 .343-.895 .816-.983L8.372 9.966C9.181 9.813 9.813 9.181 9.966 8.372Z"),
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
        return _sparkle!!
    }

private var _sparkle: ImageVector? = null
