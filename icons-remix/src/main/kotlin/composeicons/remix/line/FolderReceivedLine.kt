package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FolderReceivedLine: ImageVector
    get() {
        if (_folderReceivedLine != null) return _folderReceivedLine!!
        _folderReceivedLine = remixIcon(
            name = "FolderReceivedLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 13h-2v-6h-8.414L9.586 5h-5.586v14h9v2h-10C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h7.414l2 2h8.586c.552 0 1 .448 1 1v7ZM20 17h3v2h-3v3.5L15 18l5-4.5v3.5Z"),
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
        return _folderReceivedLine!!
    }

private var _folderReceivedLine: ImageVector? = null
