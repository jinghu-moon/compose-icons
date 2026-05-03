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
                pathData = parseSvgPathData("M 232.000 120.000 L 192.490 120.000 C 203.562 97.683 202.311 71.228 189.182 50.056 C 176.053 28.884 152.913 16.003 128.000 16.000 C 123.582 16.000 120.000 19.582 120.000 24.000 L 120.000 63.510 C 97.683 52.438 71.228 53.689 50.056 66.818 C 28.884 79.947 16.003 103.087 16.000 128.000 C 16.000 132.418 19.582 136.000 24.000 136.000 L 63.510 136.000 C 52.438 158.317 53.689 184.772 66.818 205.944 C 79.947 227.116 103.087 239.997 128.000 240.000 C 132.418 240.000 136.000 236.418 136.000 232.000 L 136.000 192.490 C 158.317 203.562 184.772 202.311 205.944 189.182 C 227.116 176.053 239.997 152.913 240.000 128.000 C 240.000 123.582 236.418 120.000 232.000 120.000 ZM 88.000 72.000 C 99.444 71.942 110.625 75.436 120.000 82.000 L 120.000 120.000 L 32.570 120.000 C 36.583 92.466 60.175 72.036 88.000 72.000 ZM 168.000 184.000 C 156.556 184.058 145.375 180.564 136.000 174.000 L 136.000 136.000 L 223.430 136.000 C 219.417 163.534 195.825 183.964 168.000 184.000 Z"),
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
