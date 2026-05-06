package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Wrench: ImageVector
    get() {
        if (_wrench != null) return _wrench!!
        _wrench = lucideOutlineIcon(
            name = "Wrench",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.7 6.3c-.381 .389-.381 1.011 0 1.4l1.6 1.6c.389 .381 1.011 .381 1.4 0L20.806 6.195c.32-.322 .863-.22 .983 .218 .617 2.243-.119 4.641-1.888 6.152-1.769 1.511-4.252 1.864-6.371 .905L5.62 21.38c-.828 .828-2.171 .828-2.999-0-.828-.828-.828-2.171 0-3l7.91-7.91C9.572 8.35 9.924 5.867 11.436 4.099 12.947 2.33 15.345 1.594 17.588 2.211c.438 .12 .54 .662 .219 .984Z"),
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
        return _wrench!!
    }

private var _wrench: ImageVector? = null
