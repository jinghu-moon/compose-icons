package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FolderClock: ImageVector
    get() {
        if (_folderClock != null) return _folderClock!!
        _folderClock = lucideOutlineIcon(
            name = "FolderClock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.000 14.000 L 16.000 16.200 L 17.600 17.200"),
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
                pathData = parseSvgPathData("M 7.000 20.000 L 4.000 20.000 C 2.895 20.000 2.000 19.105 2.000 18.000 L 2.000 5.000 C 2.000 3.895 2.895 3.000 4.000 3.000 L 7.900 3.000 C 8.580 2.993 9.216 3.332 9.590 3.900 L 10.400 5.100 C 10.770 5.662 11.397 6.000 12.070 6.000 L 20.000 6.000 C 21.105 6.000 22.000 6.895 22.000 8.000"),
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
                pathData = parseSvgPathData("M 22.000 16.000 C 22.000 19.314 19.314 22.000 16.000 22.000 C 12.686 22.000 10.000 19.314 10.000 16.000 C 10.000 12.686 12.686 10.000 16.000 10.000 C 19.314 10.000 22.000 12.686 22.000 16.000 Z"),
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
        return _folderClock!!
    }

private var _folderClock: ImageVector? = null
