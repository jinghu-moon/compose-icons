package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ImageUploadFill: ImageVector
    get() {
        if (_imageUploadFill != null) return _imageUploadFill!!
        _imageUploadFill = remixIcon(
            name = "ImageUploadFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M24 19h-3v4h-2v-4h-3l4-4 4 4ZM21.008 3c.548 0 .992 .445 .992 .993l.001 9.349C21.375 13.12 20.701 13 20 13v-8h-16l.001 14L13.293 9.707c.36-.361 .927-.389 1.319-.084l.094 .085 3.546 3.551C15.791 14.007 14 16.294 14 19c0 .701 .12 1.375 .342 2.001L2.992 21C2.445 21 2 20.555 2 20.007v-16.014C2 3.445 2.456 3 2.992 3h18.016ZM8 7c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2C6.895 11 6 10.105 6 9 6 7.895 6.895 7 8 7Z"),
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
        return _imageUploadFill!!
    }

private var _imageUploadFill: ImageVector? = null
