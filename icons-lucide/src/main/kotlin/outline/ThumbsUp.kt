package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ThumbsUp: ImageVector
    get() {
        if (_thumbsUp != null) return _thumbsUp!!
        _thumbsUp = lucideOutlineIcon(
            name = "ThumbsUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.000 5.880 L 14.000 10.000 L 19.830 10.000 C 20.460 10.000 21.052 10.296 21.430 10.800 C 21.808 11.304 21.926 11.956 21.750 12.560 L 19.420 20.560 C 19.171 21.413 18.389 22.000 17.500 22.000 L 4.000 22.000 C 2.895 22.000 2.000 21.105 2.000 20.000 L 2.000 12.000 C 2.000 10.895 2.895 10.000 4.000 10.000 L 6.760 10.000 C 7.519 10.000 8.212 9.570 8.550 8.890 L 12.000 2.000 C 12.955 2.012 13.853 2.459 14.437 3.215 C 15.022 3.971 15.229 4.952 15.000 5.880 Z"),
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
        pathData = parseSvgPathData("M 7.000 10.000 L 7.000 22.000"),
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
        return _thumbsUp!!
    }

private var _thumbsUp: ImageVector? = null
