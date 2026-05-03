package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Tag: ImageVector
    get() {
        if (_tag != null) return _tag!!
        _tag = lucideOutlineIcon(
            name = "Tag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.586 2.586 C 12.211 2.211 11.702 2.000 11.172 2.000 L 4.000 2.000 C 2.895 2.000 2.000 2.895 2.000 4.000 L 2.000 11.172 C 2.000 11.702 2.211 12.211 2.586 12.586 L 11.290 21.290 C 12.236 22.230 13.764 22.230 14.710 21.290 L 21.290 14.710 C 22.230 13.764 22.230 12.236 21.290 11.290 Z"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 8.000 7.500 C 8.000 7.776 7.776 8.000 7.500 8.000 C 7.224 8.000 7.000 7.776 7.000 7.500 C 7.000 7.224 7.224 7.000 7.500 7.000 C 7.776 7.000 8.000 7.224 8.000 7.500 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _tag!!
    }

private var _tag: ImageVector? = null
