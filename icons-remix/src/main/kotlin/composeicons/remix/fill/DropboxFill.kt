package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DropboxFill: ImageVector
    get() {
        if (_dropboxFill != null) return _dropboxFill!!
        _dropboxFill = remixIcon(
            name = "DropboxFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.285 10.668l5.215 3.323-5.252 3.346L12 13.993 6.752 17.337 1.5 13.991 6.715 10.668 1.5 7.346 6.752 4l5.248 3.343L17.248 4l5.252 3.346-5.215 3.322ZM17.211 10.668 12 7.348 6.789 10.668 12 13.988l5.211-3.32ZM6.786 18.446l5.252-3.346 5.252 3.346-5.252 3.346L6.786 18.446Z"),
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
        return _dropboxFill!!
    }

private var _dropboxFill: ImageVector? = null
