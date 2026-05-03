package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FolderGit2: ImageVector
    get() {
        if (_folderGit2 != null) return _folderGit2!!
        _folderGit2 = lucideOutlineIcon(
            name = "FolderGit2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.000 19.000 C 15.239 19.000 13.000 16.761 13.000 14.000 L 13.000 22.000"),
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
                pathData = parseSvgPathData("M 9.000 20.000 L 4.000 20.000 C 2.895 20.000 2.000 19.105 2.000 18.000 L 2.000 5.000 C 2.000 3.895 2.895 3.000 4.000 3.000 L 7.900 3.000 C 8.580 2.993 9.216 3.332 9.590 3.900 L 10.400 5.100 C 10.770 5.662 11.397 6.000 12.070 6.000 L 20.000 6.000 C 21.105 6.000 22.000 6.895 22.000 8.000 L 22.000 13.000"),
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
                pathData = parseSvgPathData("M 15.000 12.000 C 15.000 13.105 14.105 14.000 13.000 14.000 C 11.895 14.000 11.000 13.105 11.000 12.000 C 11.000 10.895 11.895 10.000 13.000 10.000 C 14.105 10.000 15.000 10.895 15.000 12.000 Z"),
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
                pathData = parseSvgPathData("M 22.000 19.000 C 22.000 20.105 21.105 21.000 20.000 21.000 C 18.895 21.000 18.000 20.105 18.000 19.000 C 18.000 17.895 18.895 17.000 20.000 17.000 C 21.105 17.000 22.000 17.895 22.000 19.000 Z"),
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
        return _folderGit2!!
    }

private var _folderGit2: ImageVector? = null
