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
                pathData = parseSvgPathData("M12.586 2.586C12.211 2.211 11.702 2 11.172 2h-7.172C2.895 2 2 2.895 2 4v7.172c0 .53 .211 1.039 .586 1.414l8.704 8.704c.946 .94 2.474 .94 3.42 0l6.58-6.58c.94-.946 .94-2.474 0-3.42Z"),
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
                pathData = parseSvgPathData("M8 7.5C8 7.776 7.776 8 7.5 8 7.224 8 7 7.776 7 7.5 7 7.224 7.224 7 7.5 7 7.776 7 8 7.224 8 7.5Z"),
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
