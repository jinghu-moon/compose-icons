package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.GlassWater: ImageVector
    get() {
        if (_glassWater != null) return _glassWater!!
        _glassWater = lucideOutlineIcon(
            name = "GlassWater",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.116 4.104 C 5.087 3.822 5.178 3.541 5.367 3.331 C 5.557 3.120 5.827 3.000 6.110 3.000 L 17.890 3.000 C 18.173 3.000 18.443 3.121 18.633 3.331 C 18.823 3.542 18.914 3.823 18.884 4.105 L 17.190 20.210 C 17.083 21.228 16.224 22.001 15.200 22.000 L 8.800 22.000 C 7.773 22.006 6.908 21.232 6.800 20.210 Z"),
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
        pathData = parseSvgPathData("M 6.000 12.000 C 7.778 10.667 10.222 10.667 12.000 12.000 C 13.778 13.333 16.222 13.333 18.000 12.000"),
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
        return _glassWater!!
    }

private var _glassWater: ImageVector? = null
