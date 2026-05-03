package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FolderArchive: ImageVector
    get() {
        if (_folderArchive != null) return _folderArchive!!
        _folderArchive = lucideOutlineIcon(
            name = "FolderArchive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 19.000 C 17.000 20.105 16.105 21.000 15.000 21.000 C 13.895 21.000 13.000 20.105 13.000 19.000 C 13.000 17.895 13.895 17.000 15.000 17.000 C 16.105 17.000 17.000 17.895 17.000 19.000 Z"),
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
        pathData = parseSvgPathData("M 20.900 19.800 C 21.579 19.458 22.005 18.760 22.000 18.000 L 22.000 8.000 C 22.000 6.895 21.105 6.000 20.000 6.000 L 12.100 6.000 C 11.420 6.007 10.784 5.668 10.410 5.100 L 9.600 3.900 C 9.230 3.338 8.603 3.000 7.930 3.000 L 4.000 3.000 C 2.895 3.000 2.000 3.895 2.000 5.000 L 2.000 18.000 C 2.000 19.105 2.895 20.000 4.000 20.000 L 9.100 20.000"),
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
        pathData = parseSvgPathData("M 15.000 11.000 L 15.000 10.000"),
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
        pathData = parseSvgPathData("M 15.000 17.000 L 15.000 15.000"),
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
        return _folderArchive!!
    }

private var _folderArchive: ImageVector? = null
