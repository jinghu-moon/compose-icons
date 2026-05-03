package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FolderOpenDot: ImageVector
    get() {
        if (_folderOpenDot != null) return _folderOpenDot!!
        _folderOpenDot = lucideOutlineIcon(
            name = "FolderOpenDot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.000 14.000 L 7.450 11.100 C 7.791 10.424 8.483 9.999 9.240 10.000 L 20.000 10.000 C 20.619 9.999 21.204 10.285 21.584 10.774 C 21.963 11.263 22.095 11.900 21.940 12.500 L 20.390 18.500 C 20.162 19.384 19.363 20.002 18.450 20.000 L 4.000 20.000 C 2.895 20.000 2.000 19.105 2.000 18.000 L 2.000 5.000 C 2.000 3.900 2.900 3.000 4.000 3.000 L 7.930 3.000 C 8.599 3.003 9.222 3.341 9.590 3.900 L 10.410 5.100 C 10.778 5.659 11.401 5.997 12.070 6.000 L 18.000 6.000 C 19.105 6.000 20.000 6.895 20.000 8.000 L 20.000 10.000"),
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
                pathData = parseSvgPathData("M 15.000 15.000 C 15.000 15.552 14.552 16.000 14.000 16.000 C 13.448 16.000 13.000 15.552 13.000 15.000 C 13.000 14.448 13.448 14.000 14.000 14.000 C 14.552 14.000 15.000 14.448 15.000 15.000 Z"),
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
        return _folderOpenDot!!
    }

private var _folderOpenDot: ImageVector? = null
