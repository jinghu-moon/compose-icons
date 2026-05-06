package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FolderMusicLine: ImageVector
    get() {
        if (_folderMusicLine != null) return _folderMusicLine!!
        _folderMusicLine = remixIcon(
            name = "FolderMusicLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.414 5h8.586c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h7.414l2 2ZM4 5v14h16v-12h-8.414L9.586 5h-5.586ZM11 13.05v-4.05h5v2h-3v4.5C13 16.881 11.881 18 10.5 18 9.119 18 8 16.881 8 15.5 8 14.119 9.119 13 10.5 13c.171 0 .338 .017 .5 .05Z"),
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
        return _folderMusicLine!!
    }

private var _folderMusicLine: ImageVector? = null
