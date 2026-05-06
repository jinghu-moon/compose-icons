package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FolderKeyholeLine: ImageVector
    get() {
        if (_folderKeyholeLine != null) return _folderKeyholeLine!!
        _folderKeyholeLine = remixIcon(
            name = "FolderKeyholeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.414 3l2 2h8.586c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h7.414ZM9.586 5h-5.586v14h16v-12h-8.414L9.586 5ZM12 9c1.105 0 2 .895 2 2 0 .74-.402 1.386-.999 1.732L13 17h-2l-0-4.268C10.402 12.387 10 11.74 10 11c0-1.105 .895-2 2-2Z"),
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
        return _folderKeyholeLine!!
    }

private var _folderKeyholeLine: ImageVector? = null
