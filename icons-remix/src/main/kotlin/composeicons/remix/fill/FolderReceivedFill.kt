package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FolderReceivedFill: ImageVector
    get() {
        if (_folderReceivedFill != null) return _folderReceivedFill!!
        _folderReceivedFill = remixIcon(
            name = "FolderReceivedFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 13.126C21.015 12.417 19.806 12 18.5 12c-3.314 0-6 2.686-6 6 0 1.093 .292 2.118 .803 3h-10.303C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h7.414l2 2h8.586c.552 0 1 .448 1 1v7.126ZM20 17h3v2h-3v3.5L15 18l5-4.5v3.5Z"),
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
        return _folderReceivedFill!!
    }

private var _folderReceivedFill: ImageVector? = null
