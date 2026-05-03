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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.285 10.668 L 22.500 13.991 L 17.248 17.337 L 12.000 13.993 L 6.752 17.337 L 1.500 13.991 L 6.715 10.668 L 1.500 7.346 L 6.752 4.000 L 12.000 7.343 L 17.248 4.000 L 22.500 7.346 L 17.285 10.668 ZM 17.211 10.668 L 12.000 7.348 L 6.789 10.668 L 12.000 13.988 L 17.211 10.668 ZM 6.786 18.446 L 12.038 15.100 L 17.290 18.446 L 12.038 21.792 L 6.786 18.446 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _dropboxFill!!
    }

private var _dropboxFill: ImageVector? = null
