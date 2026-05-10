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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.409 19c-.776-2.399-2.277-3.885-4.266-5.602C15.024 11.897 17.407 11 20 11v-8h1.008c.548 0 .992 .445 .992 .993v16.013c0 .549-.455 .993-.992 .993h-18.016C2.444 21 2 20.555 2 20.007v-16.013C2 3.445 2.455 3 2.992 3h3.008v-2h2v4h-4v7c5.22 0 9.662 2.462 11.313 7h2.096ZM18 1v4h-8v-2h6v-2h2ZM16.5 10C15.672 10 15 9.328 15 8.5 15 7.672 15.672 7 16.5 7 17.328 7 18 7.672 18 8.5 18 9.328 17.328 10 16.5 10Z"),
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
        return _galleryFill!!
    }

private var _galleryFill: ImageVector? = null
