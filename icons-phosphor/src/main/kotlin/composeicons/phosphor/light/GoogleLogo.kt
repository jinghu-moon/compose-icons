package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GoogleLogo: ImageVector
    get() {
        if (_googleLogo != null) return _googleLogo!!
        _googleLogo = phosphorLightIcon(
            name = "GoogleLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222 128c-.001 45.692-32.857 84.765-77.871 92.605C99.115 228.445 54.983 202.78 39.535 159.779 24.087 116.778 41.798 68.897 81.511 46.3 121.223 23.702 171.433 32.934 200.51 68.18c1.421 1.646 1.84 3.932 1.095 5.976-.745 2.043-2.537 3.523-4.684 3.869-2.147 .345-4.313-.498-5.661-2.204C166.259 45.507 123.268 37.19 88.765 55.991 54.262 74.791 37.945 115.425 49.863 152.867c11.919 37.442 48.722 61.166 87.745 56.562 39.022-4.604 69.294-36.242 72.172-75.43h-81.78c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h88c3.314 0 6 2.686 6 6Z"),
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
