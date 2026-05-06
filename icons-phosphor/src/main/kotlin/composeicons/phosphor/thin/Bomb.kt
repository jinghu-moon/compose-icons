package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Bomb: ImageVector
    get() {
        if (_bomb != null) return _bomb!!
        _bomb = phosphorThinIcon(
            name = "Bomb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 36h0c-2.209 0-4 1.791-4 4 0 1.47-.42 36-28 36C202.06 76 192.92 63.21 183.25 49.67 172.83 35.09 162.06 20 144 20c-14.86 0-25.82 7.79-31.71 22.51-2.175 5.609-3.546 11.497-4.07 17.49h-20.22C81.373 60 76 65.373 76 72v12.08C40.477 100.9 21.365 140.103 29.997 178.448 38.629 216.792 72.696 244.025 112 244h1.51c39.026-.665 72.452-28.124 80.681-66.279C202.42 139.567 183.283 100.771 148 84.08v-12.08c0-6.627-5.373-12-12-12h-19.76c.92-9.42 5.45-32 27.76-32 13.94 0 23.08 12.79 32.75 26.33C187.17 68.91 197.94 84 216 84c14.86 0 25.82-7.79 31.71-22.51C250.36 54.625 251.811 47.356 252 40c0-2.209-1.791-4-4-4ZM140 72v14.66c.002 1.588 .944 3.025 2.4 3.66 32.984 14.396 51.35 49.953 43.997 85.183-7.353 35.23-38.408 60.472-74.397 60.472-35.989 0-67.044-25.243-74.397-60.472C30.25 140.273 48.616 104.716 81.6 90.32c1.456-.635 2.398-2.072 2.4-3.66v-14.66c0-2.209 1.791-4 4-4h48c2.209 0 4 1.791 4 4ZM104.66 204.05c2.066 .329 3.53 2.196 3.357 4.281-.173 2.085-1.924 3.685-4.017 3.669-.221-.002-.441-.019-.66-.05C81.258 208.029 63.971 190.742 60.05 168.66c-.365-2.182 1.108-4.245 3.29-4.61 2.182-.365 4.245 1.108 4.61 3.29 3.318 18.729 17.981 33.392 36.71 36.71Z"),
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
        return _bomb!!
    }

private var _bomb: ImageVector? = null
