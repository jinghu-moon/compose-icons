package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ImageEditFill: ImageVector
    get() {
        if (_imageEditFill != null) return _imageEditFill!!
        _imageEditFill = remixIcon(
            name = "ImageEditFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.000 3.000 C 20.552 3.000 21.000 3.448 21.000 4.000 L 21.000 5.757 L 19.000 7.757 L 19.000 5.000 L 5.000 5.000 L 5.000 13.100 L 9.000 9.101 L 13.328 13.429 L 12.001 14.756 L 11.995 18.995 L 16.241 19.001 L 17.571 17.671 L 18.899 19.000 L 19.000 19.000 L 19.000 16.242 L 21.000 14.242 L 21.000 20.000 C 21.000 20.552 20.552 21.000 20.000 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 4.000 C 3.000 3.448 3.448 3.000 4.000 3.000 L 20.000 3.000 ZM 21.778 7.808 L 23.192 9.222 L 15.414 17.000 L 13.998 16.998 L 14.000 15.586 L 21.778 7.808 ZM 15.500 7.000 C 16.328 7.000 17.000 7.672 17.000 8.500 C 17.000 9.328 16.328 10.000 15.500 10.000 C 14.672 10.000 14.000 9.328 14.000 8.500 C 14.000 7.672 14.672 7.000 15.500 7.000 Z"),
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
        return _imageEditFill!!
    }

private var _imageEditFill: ImageVector? = null
