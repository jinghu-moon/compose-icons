package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FolderPen: ImageVector
    get() {
        if (_folderPen != null) return _folderPen!!
        _folderPen = lucideOutlineIcon(
            name = "FolderPen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.000 11.500 L 2.000 5.000 C 2.000 3.895 2.895 3.000 4.000 3.000 L 7.900 3.000 C 8.600 3.000 9.200 3.300 9.600 3.900 L 10.400 5.100 C 10.800 5.700 11.400 6.000 12.100 6.000 L 20.000 6.000 C 21.105 6.000 22.000 6.895 22.000 8.000 L 22.000 18.000 C 22.000 19.105 21.105 20.000 20.000 20.000 L 10.500 20.000"),
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
        pathData = parseSvgPathData("M 11.378 13.626 C 12.208 12.796 12.208 11.452 11.378 10.622 C 10.548 9.792 9.204 9.792 8.374 10.622 L 3.364 15.634 C 3.126 15.872 2.952 16.165 2.858 16.488 L 2.021 19.358 C 1.970 19.533 2.018 19.722 2.147 19.852 C 2.277 19.981 2.466 20.029 2.641 19.978 L 5.511 19.141 C 5.834 19.047 6.127 18.873 6.365 18.635 Z"),
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
        return _folderPen!!
    }

private var _folderPen: ImageVector? = null
