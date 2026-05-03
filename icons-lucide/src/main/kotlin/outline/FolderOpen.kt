package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) return _folderOpen!!
        _folderOpen = lucideOutlineIcon(
            name = "FolderOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.000 14.000 L 7.500 11.100 C 7.832 10.440 8.501 10.017 9.240 10.000 L 20.000 10.000 C 20.619 9.999 21.204 10.285 21.584 10.774 C 21.963 11.263 22.095 11.900 21.940 12.500 L 20.400 18.500 C 20.171 19.388 19.367 20.006 18.450 20.000 L 4.000 20.000 C 2.895 20.000 2.000 19.105 2.000 18.000 L 2.000 5.000 C 2.000 3.895 2.895 3.000 4.000 3.000 L 7.900 3.000 C 8.580 2.993 9.216 3.332 9.590 3.900 L 10.400 5.100 C 10.770 5.662 11.397 6.000 12.070 6.000 L 18.000 6.000 C 19.105 6.000 20.000 6.895 20.000 8.000 L 20.000 10.000"),
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
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
