package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FolderOpenLine: ImageVector
    get() {
        if (_folderOpenLine != null) return _folderOpenLine!!
        _folderOpenLine = remixIcon(
            name = "FolderOpenLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 21C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h7.414l2 2h7.586c.552 0 1 .448 1 1v3h-2v-2h-7.414L9.586 5h-5.586v11.998L5.5 11h17l-2.311 9.243c-.111 .445-.511 .757-.97 .757h-16.219ZM19.938 13h-12.877L5.562 19h12.877l1.5-6Z"),
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
        return _folderOpenLine!!
    }

private var _folderOpenLine: ImageVector? = null
