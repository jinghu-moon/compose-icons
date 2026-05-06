package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DropboxLine: ImageVector
    get() {
        if (_dropboxLine != null) return _dropboxLine!!
        _dropboxLine = remixIcon(
            name = "DropboxLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.65 17.261l3.392 2.161 3.392-2.161 1.86 1.185-5.252 3.346L6.79 18.446 8.65 17.261ZM7.774 8.98 10.167 7.427 7.741 5.854 5.286 7.37 7.774 8.98ZM9.613 10.171l2.391 1.548 2.391-1.547L12.004 8.619 9.613 10.171ZM13.845 12.91l2.424 1.569 2.45-1.502L16.233 11.364l-2.388 1.546ZM12.004 6.235 16.241 3.487l6.224 3.844-4.393 2.843 4.394 2.851-6.227 3.818L12.005 14.101 7.769 16.842 1.54 13.024 5.935 10.173 1.543 7.33 7.768 3.487l4.236 2.749ZM13.842 7.427l2.393 1.553L18.723 7.37 16.268 5.853 13.842 7.427ZM10.164 12.91 7.775 11.363 5.289 12.976l2.451 1.502 2.424-1.569Z"),
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
        return _dropboxLine!!
    }

private var _dropboxLine: ImageVector? = null
