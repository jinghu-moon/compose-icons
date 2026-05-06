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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.5 19h-8.5C5.396 18.999 2.381 16.261 2.034 12.674 1.687 9.086 4.121 5.822 7.659 5.13c3.537-.692 7.022 1.416 8.051 4.87h1.79C19.985 10 22 12.015 22 14.5 22 16.985 19.985 19 17.5 19Z"),
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
        return _cloud!!
    }

private var _cloud: ImageVector? = null
