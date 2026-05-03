package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GalleryUploadFill: ImageVector
    get() {
        if (_galleryUploadFill != null) return _galleryUploadFill!!
        _galleryUploadFill = remixIcon(
            name = "GalleryUploadFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.000 1.000 L 8.000 3.000 L 16.000 3.000 L 16.000 1.000 L 18.000 1.000 L 18.000 3.000 L 21.008 3.000 C 21.556 3.000 22.000 3.445 22.000 3.993 L 22.000 20.007 C 22.000 20.555 21.545 21.000 21.008 21.000 L 2.992 21.000 C 2.444 21.000 2.000 20.555 2.000 20.007 L 2.000 3.993 C 2.000 3.445 2.455 3.000 2.992 3.000 L 6.000 3.000 L 6.000 1.000 L 8.000 1.000 ZM 12.000 8.000 L 8.000 12.000 L 11.000 12.000 L 11.000 16.000 L 13.000 16.000 L 13.000 12.000 L 16.000 12.000 L 12.000 8.000 Z"),
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
        return _galleryUploadFill!!
    }

private var _galleryUploadFill: ImageVector? = null
