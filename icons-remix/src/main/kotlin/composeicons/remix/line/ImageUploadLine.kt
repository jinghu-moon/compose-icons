package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ImageUploadLine: ImageVector
    get() {
        if (_imageUploadLine != null) return _imageUploadLine!!
        _imageUploadLine = remixIcon(
            name = "ImageUploadLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M24 19h-3v4h-2v-4h-3l4-4 4 4ZM21.008 3c.548 0 .992 .445 .992 .993v9.007h-2v-8h-16v13.999L14 9l3 3v2.829L14 11.828 6.827 19h7.173v2h-11.008C2.445 21 2 20.555 2 20.007v-16.014C2 3.445 2.456 3 2.992 3h18.016ZM8 7c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2C6.895 11 6 10.105 6 9 6 7.895 6.895 7 8 7Z"),
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
        return _imageUploadLine!!
    }

private var _imageUploadLine: ImageVector? = null
