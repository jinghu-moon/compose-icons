package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SoundcloudLine: ImageVector
    get() {
        if (_soundcloudLine != null) return _soundcloudLine!!
        _soundcloudLine = remixIcon(
            name = "SoundcloudLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 10c.552 0 1 .448 1 1v7c0 .552-.448 1-1 1C3.448 19 3 18.552 3 18v-7c0-.552 .448-1 1-1ZM7 11c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1C6.448 19 6 18.552 6 18v-6c0-.552 .448-1 1-1ZM10 7c.552 0 1 .448 1 1v10c0 .552-.448 1-1 1C9.448 19 9 18.552 9 18v-10C9 7.448 9.448 7 10 7ZM15 6c3.238 0 5.878 2.566 5.996 5.775l.003 .26c1.697 .242 3.001 1.701 3.001 3.465 0 1.869-1.464 3.395-3.308 3.495L20.5 19h-3.501c-.552 0-1-.448-1-1-0-.513 .386-.935 .883-.993L16.999 17l3.447 .001 .138-.003C21.375 16.955 22 16.298 22 15.5c0-.702-.486-1.301-1.149-1.459l-.135-.026-1.77-.253 .052-1.787-.004-.176C18.894 9.75 17.25 8.106 15.2 8.005L15 8c-.268 0-.531 .026-.788 .077l-.213 .049v9.874c0 .513-.386 .935-.883 .993L13 19c-.552 0-1-.448-1-1L11.999 6.803C12.882 6.292 13.907 6 15 6ZM1 12c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1C.448 18 0 17.552 0 17v-4c0-.552 .448-1 1-1Z"),
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
        return _soundcloudLine!!
    }

private var _soundcloudLine: ImageVector? = null
