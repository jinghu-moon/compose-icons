package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GalleryFill: ImageVector
    get() {
        if (_galleryFill != null) return _galleryFill!!
        _galleryFill = remixIcon(
            name = "GalleryFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.409 19.000 C 16.633 16.601 15.132 15.115 13.143 13.398 C 15.024 11.897 17.407 11.000 20.000 11.000 L 20.000 3.000 L 21.008 3.000 C 21.556 3.000 22.000 3.445 22.000 3.993 L 22.000 20.007 C 22.000 20.555 21.545 21.000 21.008 21.000 L 2.992 21.000 C 2.444 21.000 2.000 20.555 2.000 20.007 L 2.000 3.993 C 2.000 3.445 2.455 3.000 2.992 3.000 L 6.000 3.000 L 6.000 1.000 L 8.000 1.000 L 8.000 5.000 L 4.000 5.000 L 4.000 12.000 C 9.220 12.000 13.662 14.462 15.313 19.000 L 17.409 19.000 ZM 18.000 1.000 L 18.000 5.000 L 10.000 5.000 L 10.000 3.000 L 16.000 3.000 L 16.000 1.000 L 18.000 1.000 ZM 16.500 10.000 C 15.672 10.000 15.000 9.328 15.000 8.500 C 15.000 7.672 15.672 7.000 16.500 7.000 C 17.328 7.000 18.000 7.672 18.000 8.500 C 18.000 9.328 17.328 10.000 16.500 10.000 Z"),
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
        return _galleryFill!!
    }

private var _galleryFill: ImageVector? = null
