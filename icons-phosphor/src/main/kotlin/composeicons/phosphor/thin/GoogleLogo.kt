package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GoogleLogo: ImageVector
    get() {
        if (_googleLogo != null) return _googleLogo!!
        _googleLogo = phosphorThinIcon(
            name = "GoogleLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 128c-.021 44.72-32.198 82.948-76.258 90.6C99.681 226.252 56.5 201.111 41.402 159.016 26.304 116.922 43.663 70.068 82.543 47.971 121.423 25.875 170.561 34.938 199 69.45c1.408 1.704 1.169 4.227-.535 5.635-1.704 1.408-4.227 1.169-5.635-.535C167.102 43.331 122.775 34.885 87.369 54.456 51.964 74.027 35.537 116.055 48.288 154.448c12.751 38.393 51.056 62.243 91.136 56.745 40.079-5.499 70.546-38.784 72.486-79.193h-83.91c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h88c2.209 0 4 1.791 4 4Z"),
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
        return _googleLogo!!
    }

private var _googleLogo: ImageVector? = null
