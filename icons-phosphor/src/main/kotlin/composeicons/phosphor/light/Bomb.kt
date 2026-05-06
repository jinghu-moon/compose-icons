package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Bomb: ImageVector
    get() {
        if (_bomb != null) return _bomb!!
        _bomb = phosphorLightIcon(
            name = "Bomb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 34c-3.314 0-6 2.686-6 6-.182 6.082-1.389 12.09-3.57 17.77C234.06 68.69 226.72 74 216 74 203.09 74 194.24 61.62 184.88 48.51 174.67 34.21 163.09 18 144 18c-15.74 0-27.35 8.22-33.57 23.77-2.022 5.216-3.367 10.671-4 16.23h-18.43C80.268 58 74 64.268 74 72v10.83C38.109 100.484 19.127 140.551 28.199 179.506 37.271 218.461 72.002 246.02 112 246h1.55c39.712-.684 73.79-28.475 82.45-67.238C204.659 139.999 185.646 100.348 150 82.83v-10.83c0-7.732-6.268-14-14-14h-17.47c.562-4.113 1.619-8.142 3.15-12C126.06 35.26 133.37 30 144 30c12.91 0 21.75 12.38 31.12 25.49C185.33 69.79 196.91 86 216 86c15.74 0 27.35-8.22 33.57-23.77C252.309 55.128 253.807 47.609 254 40c0-3.314-2.686-6-6-6ZM138 72v14.66c.004 2.382 1.416 4.537 3.6 5.49 32.116 14.017 49.998 48.638 42.839 82.941-7.159 34.303-37.397 58.881-72.439 58.881-35.042 0-65.28-24.578-72.439-58.881C32.402 140.788 50.284 106.167 82.4 92.15c2.184-.953 3.596-3.108 3.6-5.49v-14.66c0-1.105 .895-2 2-2h48c1.105 0 2 .895 2 2ZM105 202.08c3.087 .509 5.264 3.304 5.003 6.422-.262 3.117-2.874 5.511-6.003 5.498-.335-.002-.669-.029-1-.08C80.088 209.849 62.151 191.912 58.08 169c-.552-3.27 1.65-6.368 4.92-6.92 3.27-.552 6.368 1.65 6.92 4.92 3.169 17.898 17.182 31.911 35.08 35.08Z"),
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
