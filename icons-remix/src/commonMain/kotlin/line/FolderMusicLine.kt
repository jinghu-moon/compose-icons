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
                pathData = parseSvgPathData("M 12.414 5.000 L 21.000 5.000 C 21.552 5.000 22.000 5.448 22.000 6.000 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 10.414 3.000 L 12.414 5.000 ZM 4.000 5.000 L 4.000 19.000 L 20.000 19.000 L 20.000 7.000 L 11.586 7.000 L 9.586 5.000 L 4.000 5.000 ZM 11.000 13.050 L 11.000 9.000 L 16.000 9.000 L 16.000 11.000 L 13.000 11.000 L 13.000 15.500 C 13.000 16.881 11.881 18.000 10.500 18.000 C 9.119 18.000 8.000 16.881 8.000 15.500 C 8.000 14.119 9.119 13.000 10.500 13.000 C 10.671 13.000 10.838 13.017 11.000 13.050 Z"),
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
