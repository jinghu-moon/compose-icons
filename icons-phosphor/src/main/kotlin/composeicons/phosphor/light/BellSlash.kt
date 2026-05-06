package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BellSlash: ImageVector
    get() {
        if (_bellSlash != null) return _bellSlash!!
        _bellSlash = phosphorLightIcon(
            name = "BellSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M52.44 36c-2.277-2.113-5.79-2.139-8.098-.06-2.308 2.079-2.647 5.576-.782 8.06L61.31 63.56C53.888 75.741 49.974 89.736 50 104c0 35.74-8.42 63.2-14.08 72.94-2.528 4.328-2.548 9.678-.055 14.026 2.494 4.348 7.122 7.031 12.135 7.034h42.5c3.01 18.37 18.885 31.856 37.5 31.856 18.615 0 34.49-13.485 37.5-31.856h18l20 22c2.231 2.452 6.028 2.631 8.48 .4 2.452-2.231 2.631-6.028 .4-8.48ZM128 218c-12.045-.004-22.51-8.28-25.29-20h50.58c-2.78 11.72-13.245 19.996-25.29 20ZM48 186c-.709 .01-1.364-.376-1.7-1-.357-.619-.357-1.381 0-2C53.86 170 62 139.69 62 104 61.979 93.143 64.652 82.45 69.78 72.88L172.62 186ZM213.29 177.38c-.7 .28-1.447 .422-2.2 .42-2.466-.002-4.68-1.514-5.58-3.81-7.2-18.31-11.49-44.48-11.49-70C194.026 80.496 181.542 58.77 161.241 46.944 140.941 35.119 115.884 34.976 95.45 46.57c-1.866 1.108-4.185 1.121-6.064 .035C87.506 45.519 86.36 43.503 86.388 41.333c.028-2.17 1.226-4.156 3.132-5.193 24.148-13.696 53.757-13.524 77.745 .451C191.252 50.566 206.004 76.238 206 104c0 35.7 8.16 59.24 10.66 65.61 1.206 3.082-.311 6.558-3.39 7.77Z"),
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
        return _bellSlash!!
    }

private var _bellSlash: ImageVector? = null
