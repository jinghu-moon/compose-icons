package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FolderForbidLine: ImageVector
    get() {
        if (_folderForbidLine != null) return _folderForbidLine!!
        _folderForbidLine = remixIcon(
            name = "FolderForbidLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 22.000 11.255 C 21.396 10.833 20.722 10.505 20.000 10.290 L 20.000 7.000 L 11.586 7.000 L 9.586 5.000 L 4.000 5.000 L 4.000 19.000 L 11.290 19.000 C 11.505 19.722 11.833 20.396 12.255 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 10.414 3.000 L 12.414 5.000 L 21.000 5.000 C 21.552 5.000 22.000 5.448 22.000 6.000 L 22.000 11.255 ZM 18.000 22.000 C 15.239 22.000 13.000 19.761 13.000 17.000 C 13.000 14.239 15.239 12.000 18.000 12.000 C 20.761 12.000 23.000 14.239 23.000 17.000 C 23.000 19.761 20.761 22.000 18.000 22.000 ZM 16.707 19.708 C 17.098 19.895 17.537 20.000 18.000 20.000 C 19.657 20.000 21.000 18.657 21.000 17.000 C 21.000 16.537 20.895 16.098 20.708 15.707 L 16.707 19.708 ZM 15.292 18.293 L 19.293 14.292 C 18.902 14.105 18.463 14.000 18.000 14.000 C 16.343 14.000 15.000 15.343 15.000 17.000 C 15.000 17.463 15.105 17.902 15.292 18.293 Z"),
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
        return _folderForbidLine!!
    }

private var _folderForbidLine: ImageVector? = null
