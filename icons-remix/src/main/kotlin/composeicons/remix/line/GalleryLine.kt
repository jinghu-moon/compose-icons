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
                pathData = parseSvgPathData("M20 13c-1.678 0-3.249 .459-4.593 1.259 1.184 1.385 2.12 2.988 2.74 4.741h1.854v-6ZM16.004 19C14.045 14.302 9.408 11 4 11v8h12.004ZM4 9c3.829 0 7.323 1.435 9.974 3.796C15.705 11.66 17.775 11 20 11v-8h1.008c.548 0 .992 .445 .992 .993v16.013c0 .549-.455 .993-.992 .993h-18.016C2.444 21 2 20.555 2 20.007v-16.013C2 3.445 2.455 3 2.992 3h3.008v-2h2v4h-4v4ZM18 1v4h-8v-2h6v-2h2ZM16.5 10C15.672 10 15 9.328 15 8.5 15 7.672 15.672 7 16.5 7 17.328 7 18 7.672 18 8.5 18 9.328 17.328 10 16.5 10Z"),
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
