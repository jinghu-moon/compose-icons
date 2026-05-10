package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GooglePhotosLogo: ImageVector
    get() {
        if (_googlePhotosLogo != null) return _googlePhotosLogo!!
        _googlePhotosLogo = phosphorFillIcon(
            name = "GooglePhotosLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 120h-39.51c11.072-22.317 9.821-48.772-3.308-69.944C176.053 28.884 152.913 16.003 128 16c-4.418 0-8 3.582-8 8v39.51C97.683 52.438 71.228 53.689 50.056 66.818 28.884 79.947 16.003 103.087 16 128c0 4.418 3.582 8 8 8h39.51c-11.072 22.317-9.821 48.772 3.308 69.944C79.947 227.116 103.087 239.997 128 240c4.418 0 8-3.582 8-8v-39.51c22.317 11.072 48.772 9.821 69.944-3.308C227.116 176.053 239.997 152.913 240 128c0-4.418-3.582-8-8-8ZM88 72c11.444-.058 22.625 3.436 32 10v38h-87.43C36.583 92.466 60.175 72.036 88 72ZM168 184c-11.444 .058-22.625-3.436-32-10v-38h87.43c-4.013 27.534-27.605 47.964-55.43 48Z"),
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
