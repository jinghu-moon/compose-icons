package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FolderUserLine: ImageVector
    get() {
        if (_folderUserLine != null) return _folderUserLine!!
        _folderUserLine = remixIcon(
            name = "FolderUserLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.414 5h8.586c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h7.414l2 2ZM4 5v14h16v-12h-8.414L9.586 5h-5.586ZM8 18c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4h-8ZM12 13C10.619 13 9.5 11.881 9.5 10.5 9.5 9.119 10.619 8 12 8c1.381 0 2.5 1.119 2.5 2.5C14.5 11.881 13.381 13 12 13Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _folderUserLine!!
    }

private var _folderUserLine: ImageVector? = null
