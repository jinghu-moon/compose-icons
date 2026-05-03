package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Folder: ImageVector
    get() {
        if (_folder != null) return _folder!!
        _folder = lucideOutlineIcon(
            name = "Folder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.000 20.000 C 21.105 20.000 22.000 19.105 22.000 18.000 L 22.000 8.000 C 22.000 6.895 21.105 6.000 20.000 6.000 L 12.100 6.000 C 11.420 6.007 10.784 5.668 10.410 5.100 L 9.600 3.900 C 9.230 3.338 8.603 3.000 7.930 3.000 L 4.000 3.000 C 2.895 3.000 2.000 3.895 2.000 5.000 L 2.000 18.000 C 2.000 19.105 2.895 20.000 4.000 20.000 Z"),
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
        return _folder!!
    }

private var _folder: ImageVector? = null
