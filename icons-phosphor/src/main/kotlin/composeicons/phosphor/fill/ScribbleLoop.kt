package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ScribbleLoop: ImageVector
    get() {
        if (_scribbleLoop != null) return _scribbleLoop!!
        _scribbleLoop = phosphorFillIcon(
            name = "ScribbleLoop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 128c8.738 .039 17.412 1.484 25.69 4.28C151.56 154.87 137.33 176 112 176 96.2 176 87.94 165.15 87.94 154.42c0-6.59 3-12.75 8.56-17.35C103.62 131.14 114.52 128 128 128ZM224 48v160c0 8.837-7.163 16-16 16h-160c-8.837 0-16-7.163-16-16v-160C32 39.163 39.163 32 48 32h160c8.837 0 16 7.163 16 16ZM205.89 146.59C195.517 136.038 183.286 127.491 169.81 121.38c-.9-14.35-5.75-27.54-13.89-37.55C145.38 70.86 130.19 64 112 64 76.44 64 50.68 97.76 49.6 99.2c-2.656 3.532-1.947 8.549 1.585 11.205 3.532 2.656 8.549 1.947 11.205-1.585C62.61 108.53 84.51 80 112 80c13.4 0 24 4.68 31.5 13.92 4.894 6.232 8.153 13.588 9.48 21.4C144.834 113.129 136.436 112.013 128 112c-17.27 0-31.71 4.42-41.74 12.78C77 132.47 71.94 143 71.94 154.42 71.94 172.64 86 192 112 192c17.048 .192 33.185-7.678 43.53-21.23 7.088-9.332 11.719-20.293 13.47-31.88 9.243 4.902 17.711 11.143 25.13 18.52 1.912 2.188 4.859 3.168 7.701 2.559 2.841-.609 5.129-2.71 5.976-5.489 .847-2.779 .121-5.8-1.897-7.89Z"),
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
        return _scribbleLoop!!
    }

private var _scribbleLoop: ImageVector? = null
