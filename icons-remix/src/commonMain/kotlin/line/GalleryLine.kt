package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GalleryLine: ImageVector
    get() {
        if (_galleryLine != null) return _galleryLine!!
        _galleryLine = remixIcon(
            name = "GalleryLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.000 13.000 C 18.322 13.000 16.751 13.459 15.407 14.259 C 16.591 15.644 17.527 17.247 18.146 19.000 L 20.000 19.000 L 20.000 13.000 ZM 16.004 19.000 C 14.045 14.302 9.408 11.000 4.000 11.000 L 4.000 19.000 L 16.004 19.000 ZM 4.000 9.000 C 7.829 9.000 11.323 10.435 13.974 12.796 C 15.705 11.660 17.775 11.000 20.000 11.000 L 20.000 3.000 L 21.008 3.000 C 21.556 3.000 22.000 3.445 22.000 3.993 L 22.000 20.007 C 22.000 20.555 21.545 21.000 21.008 21.000 L 2.992 21.000 C 2.444 21.000 2.000 20.555 2.000 20.007 L 2.000 3.993 C 2.000 3.445 2.455 3.000 2.992 3.000 L 6.000 3.000 L 6.000 1.000 L 8.000 1.000 L 8.000 5.000 L 4.000 5.000 L 4.000 9.000 ZM 18.000 1.000 L 18.000 5.000 L 10.000 5.000 L 10.000 3.000 L 16.000 3.000 L 16.000 1.000 L 18.000 1.000 ZM 16.500 10.000 C 15.672 10.000 15.000 9.328 15.000 8.500 C 15.000 7.672 15.672 7.000 16.500 7.000 C 17.328 7.000 18.000 7.672 18.000 8.500 C 18.000 9.328 17.328 10.000 16.500 10.000 Z"),
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
        return _galleryLine!!
    }

private var _galleryLine: ImageVector? = null
