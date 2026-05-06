package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.EyeSlash: ImageVector
    get() {
        if (_eyeSlash != null) return _eyeSlash!!
        _eyeSlash = phosphorLightIcon(
            name = "EyeSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M52.44 36c-2.277-2.113-5.79-2.139-8.098-.06-2.308 2.079-2.647 5.576-.782 8.06L64.44 67C27.16 88.9 11.21 124 10.52 125.57c-.691 1.553-.691 3.327 0 4.88 .34 .77 8.66 19.22 27.24 37.8C55 185.47 84.62 206 128 206c18.132 .11 36.071-3.729 52.57-11.25l23 25.29c2.231 2.452 6.028 2.631 8.48 .4 2.452-2.231 2.631-6.028 .4-8.48ZM101.06 107.32l45 49.52c-13.943 8.712-32.123 6.2-43.18-5.968C91.823 138.704 91.057 120.368 101.06 107.32ZM128 194C96.62 194 69.22 182.58 46.55 160.07 37.044 150.627 29.002 139.818 22.69 128 26.98 119.8 42.79 92.82 72.69 76.09L92.89 98.3c-14.875 17.627-14.397 43.545 1.119 60.611 15.516 17.066 41.271 20.003 60.231 6.869l17.81 19.6C158.087 191.158 143.111 194.088 128 194ZM134.4 94.6c-3.256-.621-5.391-3.764-4.77-7.02 .621-3.256 3.764-5.391 7.02-4.77 20.065 3.898 35.179 20.525 37.15 40.87 .147 1.585-.341 3.163-1.357 4.388-1.016 1.225-2.478 1.995-4.063 2.142h-.56c-3.11 .013-5.715-2.353-6-5.45C160.356 109.749 149.204 97.483 134.4 94.6ZM245.48 130.45c-.41 .92-10.37 23-32.86 43.12-1.588 1.488-3.858 2-5.931 1.337-2.073-.663-3.625-2.397-4.054-4.531-.43-2.134 .33-4.333 1.985-5.746C216.245 154.185 225.955 141.789 233.31 128 226.996 116.183 218.954 105.374 209.45 95.93 186.78 73.42 159.38 62 128 62c-6.596-.008-13.182 .527-19.69 1.6-2.133 .402-4.317-.379-5.711-2.043-1.394-1.664-1.781-3.951-1.011-5.98 .77-2.03 2.575-3.485 4.722-3.807C113.478 50.58 120.733 49.988 128 50c43.38 0 73 20.54 90.24 37.76 18.58 18.58 26.9 37 27.24 37.81 .691 1.553 .691 3.327 0 4.88Z"),
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
        return _eyeSlash!!
    }

private var _eyeSlash: ImageVector? = null
