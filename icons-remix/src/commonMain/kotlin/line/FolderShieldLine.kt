package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FolderShieldLine: ImageVector
    get() {
        if (_folderShieldLine != null) return _folderShieldLine!!
        _folderShieldLine = remixIcon(
            name = "FolderShieldLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.414 5.000 L 21.000 5.000 C 21.552 5.000 22.000 5.448 22.000 6.000 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 10.414 3.000 L 12.414 5.000 ZM 4.000 5.000 L 4.000 19.000 L 20.000 19.000 L 20.000 7.000 L 11.586 7.000 L 9.586 5.000 L 4.000 5.000 ZM 8.000 9.000 L 16.000 9.000 L 16.000 13.904 C 16.000 14.796 15.554 15.628 14.812 16.123 L 12.000 17.998 L 9.187 16.123 C 8.446 15.628 8.000 14.796 8.000 13.904 L 8.000 9.000 ZM 10.000 13.904 C 10.000 14.127 10.111 14.335 10.297 14.459 L 12.000 15.594 L 13.703 14.459 C 13.889 14.335 14.000 14.127 14.000 13.904 L 14.000 11.000 L 10.000 11.000 L 10.000 13.904 Z"),
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
        return _folderShieldLine!!
    }

private var _folderShieldLine: ImageVector? = null
