package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Video: ImageVector
    get() {
        if (_video != null) return _video!!
        _video = lucideOutlineIcon(
            name = "Video",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.000 13.000 L 21.223 16.482 C 21.376 16.584 21.574 16.594 21.736 16.507 C 21.898 16.420 22.000 16.250 22.000 16.066 L 22.000 7.870 C 22.000 7.691 21.904 7.525 21.749 7.436 C 21.594 7.347 21.403 7.348 21.248 7.438 L 16.000 10.500"),
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
        pathData = parseSvgPathData("M 4.000 6.000 L 14.000 6.000 C 15.105 6.000 16.000 6.895 16.000 8.000 L 16.000 16.000 C 16.000 17.105 15.105 18.000 14.000 18.000 L 4.000 18.000 C 2.895 18.000 2.000 17.105 2.000 16.000 L 2.000 8.000 C 2.000 6.895 2.895 6.000 4.000 6.000 Z"),
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
        return _video!!
    }

private var _video: ImageVector? = null
