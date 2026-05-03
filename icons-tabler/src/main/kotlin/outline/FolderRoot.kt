package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FolderRoot: ImageVector
    get() {
        if (_folderRoot != null) return _folderRoot!!
        _folderRoot = tablerOutlineIcon(
            name = "FolderRoot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.000 13.000 C 10.000 14.105 10.895 15.000 12.000 15.000 C 13.105 15.000 14.000 14.105 14.000 13.000 C 14.000 11.895 13.105 11.000 12.000 11.000 C 10.895 11.000 10.000 11.895 10.000 13.000"),
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
                pathData = parseSvgPathData("M 12.000 15.000 L 12.000 19.000"),
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
                pathData = parseSvgPathData("M 5.000 4.000 L 9.000 4.000 L 12.000 7.000 L 19.000 7.000 C 20.105 7.000 21.000 7.895 21.000 9.000 L 21.000 17.000 C 21.000 18.105 20.105 19.000 19.000 19.000 L 5.000 19.000 C 3.895 19.000 3.000 18.105 3.000 17.000 L 3.000 6.000 C 3.000 4.895 3.895 4.000 5.000 4.000"),
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
        return _folderRoot!!
    }

private var _folderRoot: ImageVector? = null
