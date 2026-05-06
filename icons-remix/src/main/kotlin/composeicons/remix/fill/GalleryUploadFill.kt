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
                pathData = parseSvgPathData("M8 1v2h8v-2h2v2h3.008c.548 0 .992 .445 .992 .993v16.013c0 .549-.455 .993-.992 .993h-18.016C2.444 21 2 20.555 2 20.007v-16.013C2 3.445 2.455 3 2.992 3h3.008v-2h2ZM12 8 8 12h3v4h2v-4h3L12 8Z"),
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
