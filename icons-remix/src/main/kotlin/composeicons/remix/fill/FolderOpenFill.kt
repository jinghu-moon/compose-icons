package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FolderOpenFill: ImageVector
    get() {
        if (_folderOpenFill != null) return _folderOpenFill!!
        _folderOpenFill = remixIcon(
            name = "FolderOpenFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 21C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h7.414l2 2h7.586c.552 0 1 .448 1 1v3h-17v9.996L6 11h16.5l-2.311 9.243c-.111 .445-.511 .757-.97 .757h-16.219Z"),
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
        return _folderOpenFill!!
    }

private var _folderOpenFill: ImageVector? = null
