package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FolderTree: ImageVector
    get() {
        if (_folderTree != null) return _folderTree!!
        _folderTree = lucideOutlineIcon(
            name = "FolderTree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.000 10.000 C 20.552 10.000 21.000 9.552 21.000 9.000 L 21.000 6.000 C 21.000 5.448 20.552 5.000 20.000 5.000 L 17.500 5.000 C 17.185 5.000 16.889 4.852 16.700 4.600 L 15.800 3.400 C 15.611 3.148 15.315 3.000 15.000 3.000 L 13.000 3.000 C 12.448 3.000 12.000 3.448 12.000 4.000 L 12.000 9.000 C 12.000 9.552 12.448 10.000 13.000 10.000 Z"),
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
        pathData = parseSvgPathData("M 20.000 21.000 C 20.552 21.000 21.000 20.552 21.000 20.000 L 21.000 17.000 C 21.000 16.448 20.552 16.000 20.000 16.000 L 17.100 16.000 C 16.727 15.995 16.388 15.783 16.220 15.450 L 15.800 14.600 C 15.640 14.234 15.279 13.999 14.880 14.000 L 13.000 14.000 C 12.448 14.000 12.000 14.448 12.000 15.000 L 12.000 20.000 C 12.000 20.552 12.448 21.000 13.000 21.000 Z"),
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
        pathData = parseSvgPathData("M 3.000 5.000 C 3.000 6.105 3.895 7.000 5.000 7.000 L 8.000 7.000"),
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
        pathData = parseSvgPathData("M 3.000 3.000 L 3.000 16.000 C 3.000 17.105 3.895 18.000 5.000 18.000 L 8.000 18.000"),
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
        return _folderTree!!
    }

private var _folderTree: ImageVector? = null
