package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CameraRotate: ImageVector
    get() {
        if (_cameraRotate != null) return _cameraRotate!!
        _cameraRotate = phosphorLightIcon(
            name = "CameraRotate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 58h-28.79L165 36.67C163.885 34.999 162.008 33.997 160 34h-64c-2.009-.003-3.885 .999-5 2.67L76.78 58h-28.78C35.85 58 26 67.85 26 80v112c0 12.15 9.85 22 22 22h160c12.15 0 22-9.85 22-22v-112C230 67.85 220.15 58 208 58ZM218 192c0 5.523-4.477 10-10 10h-160c-5.523 0-10-4.477-10-10v-112C38 74.477 42.477 70 48 70h32c2.009 .003 3.885-.999 5-2.67L99.21 46h57.57L171 67.33c1.115 1.671 2.992 2.673 5 2.67h32c5.523 0 10 4.477 10 10ZM174 96v24c0 3.314-2.686 6-6 6h-24c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h10l-2-2.09C140.012 100.042 121.151 98.716 107.62 108.79c-2.648 1.994-6.411 1.463-8.405-1.185-1.994-2.648-1.463-6.411 1.185-8.405 18.341-13.656 43.912-11.84 60.14 4.27 .028 .038 .062 .072 .1 .1L162 105v-9c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM156.8 156.4c1.99 2.648 1.458 6.409-1.19 8.4-18.338 13.665-43.916 11.848-60.14-4.27l-.1-.1L94 159v9c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-24c0-3.314 2.686-6 6-6h24c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-10l2 2.09c11.988 11.868 30.849 13.194 44.38 3.12 1.273-.962 2.877-1.378 4.457-1.154 1.58 .223 3.006 1.067 3.963 2.344Z"),
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
        return _cameraRotate!!
    }

private var _cameraRotate: ImageVector? = null
