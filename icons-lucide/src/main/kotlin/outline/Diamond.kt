package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Diamond: ImageVector
    get() {
        if (_diamond != null) return _diamond!!
        _diamond = lucideOutlineIcon(
            name = "Diamond",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.700 10.300 C 2.248 10.752 1.993 11.365 1.993 12.005 C 1.993 12.645 2.248 13.258 2.700 13.710 L 10.290 21.300 C 10.742 21.752 11.355 22.007 11.995 22.007 C 12.635 22.007 13.248 21.752 13.700 21.300 L 21.290 13.710 C 21.742 13.258 21.997 12.645 21.997 12.005 C 21.997 11.365 21.742 10.752 21.290 10.300 L 13.700 2.710 C 13.248 2.258 12.635 2.003 11.995 2.003 C 11.355 2.003 10.742 2.258 10.290 2.710 Z"),
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
        return _diamond!!
    }

private var _diamond: ImageVector? = null
