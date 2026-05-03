package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FolderDot: ImageVector
    get() {
        if (_folderDot != null) return _folderDot!!
        _folderDot = lucideOutlineIcon(
            name = "FolderDot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 20.000 L 20.000 20.000 C 21.105 20.000 22.000 19.105 22.000 18.000 L 22.000 8.000 C 22.000 6.895 21.105 6.000 20.000 6.000 L 12.070 6.000 C 11.401 5.997 10.778 5.659 10.410 5.100 L 9.590 3.900 C 9.222 3.341 8.599 3.003 7.930 3.000 L 4.000 3.000 C 2.895 3.000 2.000 3.895 2.000 5.000 L 2.000 18.000 C 2.000 19.100 2.900 20.000 4.000 20.000 Z"),
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
        pathData = parseSvgPathData("M 13.000 13.000 C 13.000 13.552 12.552 14.000 12.000 14.000 C 11.448 14.000 11.000 13.552 11.000 13.000 C 11.000 12.448 11.448 12.000 12.000 12.000 C 12.552 12.000 13.000 12.448 13.000 13.000 Z"),
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
        return _folderDot!!
    }

private var _folderDot: ImageVector? = null
