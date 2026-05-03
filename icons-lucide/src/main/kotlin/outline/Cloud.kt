package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Cloud: ImageVector
    get() {
        if (_cloud != null) return _cloud!!
        _cloud = lucideOutlineIcon(
            name = "Cloud",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.500 19.000 L 9.000 19.000 C 5.396 18.999 2.381 16.261 2.034 12.674 C 1.687 9.086 4.121 5.822 7.659 5.130 C 11.196 4.438 14.680 6.546 15.710 10.000 L 17.500 10.000 C 19.985 10.000 22.000 12.015 22.000 14.500 C 22.000 16.985 19.985 19.000 17.500 19.000 Z"),
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
        return _cloud!!
    }

private var _cloud: ImageVector? = null
