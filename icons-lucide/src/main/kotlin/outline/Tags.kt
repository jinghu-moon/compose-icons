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
                pathData = parseSvgPathData("M 13.172 2.000 C 13.702 2.000 14.211 2.211 14.586 2.586 L 21.296 9.296 C 21.750 9.747 22.006 10.360 22.006 11.000 C 22.006 11.640 21.750 12.253 21.296 12.704 L 16.704 17.296 C 16.253 17.750 15.640 18.006 15.000 18.006 C 14.360 18.006 13.747 17.750 13.296 17.296 L 6.586 10.586 C 6.211 10.211 6.000 9.702 6.000 9.172 L 6.000 3.000 C 6.000 2.448 6.448 2.000 7.000 2.000 Z"),
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
                pathData = parseSvgPathData("M 2.000 7.000 L 2.000 13.172 C 2.000 13.702 2.211 14.211 2.586 14.586 L 9.296 21.296 C 10.156 22.162 11.529 22.246 12.487 21.489"),
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
                pathData = parseSvgPathData("M 11.000 6.500 C 11.000 6.776 10.776 7.000 10.500 7.000 C 10.224 7.000 10.000 6.776 10.000 6.500 C 10.000 6.224 10.224 6.000 10.500 6.000 C 10.776 6.000 11.000 6.224 11.000 6.500 Z"),
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
