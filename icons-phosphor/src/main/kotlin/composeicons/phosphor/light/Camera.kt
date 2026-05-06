package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Camera: ImageVector
    get() {
        if (_camera != null) return _camera!!
        _camera = phosphorLightIcon(
            name = "Camera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 58h-28.79L165 36.67C163.885 34.999 162.008 33.997 160 34h-64c-2.009-.003-3.885 .999-5 2.67L76.78 58h-28.78C35.85 58 26 67.85 26 80v112c0 12.15 9.85 22 22 22h160c12.15 0 22-9.85 22-22v-112C230 67.85 220.15 58 208 58ZM218 192c0 5.523-4.477 10-10 10h-160c-5.523 0-10-4.477-10-10v-112C38 74.477 42.477 70 48 70h32c2.009 .003 3.885-.999 5-2.67L99.21 46h57.57L171 67.33c1.115 1.671 2.992 2.673 5 2.67h32c5.523 0 10 4.477 10 10ZM128 90c-23.196 0-42 18.804-42 42 0 23.196 18.804 42 42 42 23.196 0 42-18.804 42-42C170 108.804 151.196 90 128 90ZM128 162C111.431 162 98 148.569 98 132c0-16.569 13.431-30 30-30 16.569 0 30 13.431 30 30 0 16.569-13.431 30-30 30Z"),
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
        return _camera!!
    }

private var _camera: ImageVector? = null
