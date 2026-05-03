package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Dot: ImageVector
    get() {
        if (_dot != null) return _dot!!
        _dot = lucideOutlineIcon(
            name = "Dot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.100 12.100 C 13.100 12.652 12.652 13.100 12.100 13.100 C 11.548 13.100 11.100 12.652 11.100 12.100 C 11.100 11.548 11.548 11.100 12.100 11.100 C 12.652 11.100 13.100 11.548 13.100 12.100 Z"),
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
        return _dot!!
    }

private var _dot: ImageVector? = null
