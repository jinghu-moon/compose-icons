package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Cake: ImageVector
    get() {
        if (_cake != null) return _cake!!
        _cake = phosphorBoldIcon(
            name = "Cake",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 112C236 96.536 223.464 84 208 84h-68v-2.06C154.37 76.837 163.979 63.249 164 48 164 16.94 134.62 1.89 133.37 1.27c-3.38-1.691-7.36-1.691-10.74 0C121.38 1.89 92 16.94 92 48c.021 15.249 9.63 28.837 24 33.94v2.06h-68C32.536 84 20 96.536 20 112v23.33c.006 9.114 2.797 18.008 8 25.49v39.18c0 15.464 12.536 28 28 28h144c15.464 0 28-12.536 28-28v-39.18c5.203-7.482 7.994-16.376 8-25.49ZM124 29.93c1.257-1.273 2.593-2.465 4-3.57 1.409 1.102 2.745 2.295 4 3.57 5.33 5.52 8 11.6 8 18.07 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.47 2.71-12.55 8-18.07ZM44 112c0-2.209 1.791-4 4-4h160c2.209 0 4 1.791 4 4v23.33c0 11.1-8.72 20.37-19.43 20.66-5.401 .154-10.634-1.884-14.508-5.649C174.187 146.576 172.001 141.403 172 136c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12 0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20 0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12 .002 5.405-2.183 10.58-6.058 14.348-3.875 3.768-9.11 5.807-14.512 5.652C52.72 155.7 44 146.43 44 135.33ZM200 204h-144c-2.209 0-4-1.791-4-4v-21.71c3.502 1.029 7.122 1.603 10.77 1.71 11.887 .37 23.41-4.122 31.91-12.44 .46-.44 .9-.9 1.33-1.35 8.313 8.808 19.889 13.801 32 13.801 12.111 0 23.687-4.992 32-13.801 .43 .45 .87 .91 1.33 1.35 8.192 8.009 19.204 12.477 30.66 12.44h1.25c3.642-.109 7.254-.683 10.75-1.71v21.71c0 2.209-1.791 4-4 4Z"),
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
        return _cake!!
    }

private var _cake: ImageVector? = null
