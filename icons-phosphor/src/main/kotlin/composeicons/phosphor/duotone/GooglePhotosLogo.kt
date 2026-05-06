package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GooglePhotosLogo: ImageVector
    get() {
        if (_googlePhotosLogo != null) return _googlePhotosLogo!!
        _googlePhotosLogo = phosphorDuotoneIcon(
            name = "GooglePhotosLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 88c.036 14.541-4.904 28.656-14 40h-50v-104c35.346 0 64 28.654 64 64ZM64 168c0 35.346 28.654 64 64 64v-104h-50c-9.096 11.344-14.036 25.459-14 40Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M232 120h-39.51c11.072-22.317 9.821-48.772-3.308-69.944C176.053 28.884 152.913 16.003 128 16c-4.418 0-8 3.582-8 8v39.51C97.683 52.438 71.228 53.689 50.056 66.818 28.884 79.947 16.003 103.087 16 128c0 4.418 3.582 8 8 8h39.51c-11.072 22.317-9.821 48.772 3.308 69.944C79.947 227.116 103.087 239.997 128 240c4.418 0 8-3.582 8-8v-39.51c22.317 11.072 48.772 9.821 69.944-3.308C227.116 176.053 239.997 152.913 240 128c0-4.418-3.582-8-8-8ZM120 223.43C92.466 219.417 72.036 195.825 72 168c-.058-11.444 3.436-22.625 10-32h38ZM120 120h-87.43C36.583 92.466 60.175 72.036 88 72c11.444-.058 22.625 3.436 32 10ZM136 32.57c27.534 4.013 47.964 27.605 48 55.43 .058 11.444-3.436 22.625-10 32h-38ZM168 184c-11.444 .058-22.625-3.436-32-10v-38h87.43c-4.013 27.534-27.605 47.964-55.43 48Z"),
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
        return _googlePhotosLogo!!
    }

private var _googlePhotosLogo: ImageVector? = null
