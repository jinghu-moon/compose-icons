package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FolderSharedLine: ImageVector
    get() {
        if (_folderSharedLine != null) return _folderSharedLine!!
        _folderSharedLine = remixIcon(
            name = "FolderSharedLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 22.000 13.000 L 20.000 13.000 L 20.000 7.000 L 11.586 7.000 L 9.586 5.000 L 4.000 5.000 L 4.000 19.000 L 13.000 19.000 L 13.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 10.414 3.000 L 12.414 5.000 L 21.000 5.000 C 21.552 5.000 22.000 5.448 22.000 6.000 L 22.000 13.000 ZM 18.000 17.000 L 18.000 13.500 L 23.000 18.000 L 18.000 22.500 L 18.000 19.000 L 15.000 19.000 L 15.000 17.000 L 18.000 17.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _folderSharedLine!!
    }

private var _folderSharedLine: ImageVector? = null
