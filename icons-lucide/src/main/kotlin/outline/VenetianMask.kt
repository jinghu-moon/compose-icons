package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.VenetianMask: ImageVector
    get() {
        if (_venetianMask != null) return _venetianMask!!
        _venetianMask = lucideOutlineIcon(
            name = "VenetianMask",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.000 11.000 C 16.500 11.000 15.500 11.500 15.000 13.000"),
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
                pathData = parseSvgPathData("M 4.000 6.000 C 2.895 6.000 2.000 6.895 2.000 8.000 L 2.000 12.000 C 2.000 14.761 4.239 17.000 7.000 17.000 C 8.848 17.069 10.615 17.776 12.000 19.000 C 13.385 17.776 15.152 17.069 17.000 17.000 C 19.761 17.000 22.000 14.761 22.000 12.000 L 22.000 8.000 C 22.000 6.895 21.105 6.000 20.000 6.000 L 17.000 6.000 C 15.152 6.069 13.385 6.776 12.000 8.000 C 10.615 6.776 8.848 6.069 7.000 6.000 Z"),
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
                pathData = parseSvgPathData("M 6.000 11.000 C 7.500 11.000 8.500 11.500 9.000 13.000"),
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
        return _venetianMask!!
    }

private var _venetianMask: ImageVector? = null
