package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PictureInPicture: ImageVector
    get() {
        if (_pictureInPicture != null) return _pictureInPicture!!
        _pictureInPicture = phosphorBoldIcon(
            name = "PictureInPicture",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 44h-176C28.954 44 20 52.954 20 64v128c0 11.046 8.954 20 20 20h176c11.046 0 20-8.954 20-20v-128C236 52.954 227.046 44 216 44ZM44 68h168v48h-76c-6.627 0-12 5.373-12 12v60h-80ZM148 188v-48h64v48Z"),
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
        return _pictureInPicture!!
    }

private var _pictureInPicture: ImageVector? = null
