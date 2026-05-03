package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Folders: ImageVector
    get() {
        if (_folders != null) return _folders!!
        _folders = lucideOutlineIcon(
            name = "Folders",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.000 5.000 C 21.105 5.000 22.000 5.895 22.000 7.000 L 22.000 14.000 C 22.000 15.105 21.105 16.000 20.000 16.000 L 9.000 16.000 C 7.895 16.000 7.000 15.105 7.000 14.000 L 7.000 5.000 C 7.000 3.895 7.895 3.000 9.000 3.000 L 11.500 3.000 C 11.972 3.000 12.417 3.222 12.700 3.600 L 13.300 4.400 C 13.583 4.778 14.028 5.000 14.500 5.000 Z"),
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
                pathData = parseSvgPathData("M 3.000 8.268 C 2.379 8.626 1.998 9.289 2.000 10.006 L 2.000 19.000 C 2.000 20.105 2.895 21.000 4.000 21.000 L 15.000 21.000 C 15.715 21.000 16.375 20.619 16.732 20.000"),
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
        return _folders!!
    }

private var _folders: ImageVector? = null
