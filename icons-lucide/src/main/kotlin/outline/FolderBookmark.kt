package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FolderBookmark: ImageVector
    get() {
        if (_folderBookmark != null) return _folderBookmark!!
        _folderBookmark = lucideOutlineIcon(
            name = "FolderBookmark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 6.000 L 12.000 14.000 L 15.000 11.000 L 18.000 14.000 L 18.000 6.000"),
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
                pathData = parseSvgPathData("M 20.000 20.000 C 21.105 20.000 22.000 19.105 22.000 18.000 L 22.000 8.000 C 22.000 6.895 21.105 6.000 20.000 6.000 L 12.100 6.000 C 11.420 6.007 10.784 5.668 10.410 5.100 L 9.600 3.900 C 9.230 3.338 8.603 3.000 7.930 3.000 L 4.000 3.000 C 2.895 3.000 2.000 3.895 2.000 5.000 L 2.000 18.000 C 2.000 19.105 2.895 20.000 4.000 20.000 Z"),
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
        return _folderBookmark!!
    }

private var _folderBookmark: ImageVector? = null
