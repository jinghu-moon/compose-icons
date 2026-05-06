package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FolderUserFill: ImageVector
    get() {
        if (_folderUserFill != null) return _folderUserFill!!
        _folderUserFill = remixIcon(
            name = "FolderUserFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.414 5h8.586c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h7.414l2 2ZM12 13c1.381 0 2.5-1.119 2.5-2.5C14.5 9.119 13.381 8 12 8 10.619 8 9.5 9.119 9.5 10.5 9.5 11.881 10.619 13 12 13ZM8 18h8c0-2.209-1.791-4-4-4C9.791 14 8 15.791 8 18Z"),
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
        return _folderUserFill!!
    }

private var _folderUserFill: ImageVector? = null
