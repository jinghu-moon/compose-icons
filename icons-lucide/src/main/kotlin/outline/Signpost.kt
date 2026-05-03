package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Signpost: ImageVector
    get() {
        if (_signpost != null) return _signpost!!
        _signpost = lucideOutlineIcon(
            name = "Signpost",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 13.000 L 12.000 21.000"),
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
                pathData = parseSvgPathData("M 12.000 3.000 L 12.000 6.000"),
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
                pathData = parseSvgPathData("M 2.354 10.354 C 2.127 10.128 2.000 9.820 2.000 9.500 C 2.000 9.180 2.127 8.872 2.354 8.646 L 4.414 6.586 C 4.789 6.211 5.298 6.000 5.828 6.000 L 18.172 6.000 C 18.702 6.000 19.211 6.211 19.586 6.586 L 21.646 8.646 C 21.873 8.872 22.000 9.180 22.000 9.500 C 22.000 9.820 21.873 10.128 21.646 10.354 L 19.586 12.414 C 19.211 12.789 18.702 13.000 18.172 13.000 L 5.828 13.000 C 5.298 13.000 4.789 12.789 4.414 12.414 Z"),
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
        return _signpost!!
    }

private var _signpost: ImageVector? = null
