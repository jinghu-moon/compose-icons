package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Tags: ImageVector
    get() {
        if (_tags != null) return _tags!!
        _tags = lucideOutlineIcon(
            name = "Tags",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.172 2c.53 0 1.039 .211 1.414 .586l6.71 6.71c.454 .451 .71 1.064 .71 1.704 0 .64-.256 1.253-.71 1.704l-4.592 4.592c-.451 .454-1.064 .71-1.704 .71-.64 0-1.253-.256-1.704-.71L6.586 10.586C6.211 10.211 6 9.702 6 9.172v-6.172C6 2.448 6.448 2 7 2Z"),
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
                pathData = parseSvgPathData("M2 7v6.172c0 .53 .211 1.039 .586 1.414l6.71 6.71c.86 .866 2.233 .95 3.191 .193"),
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
                pathData = parseSvgPathData("M11 6.5C11 6.776 10.776 7 10.5 7 10.224 7 10 6.776 10 6.5 10 6.224 10.224 6 10.5 6c.276 0 .5 .224 .5 .5Z"),
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
        return _tags!!
    }

private var _tags: ImageVector? = null
