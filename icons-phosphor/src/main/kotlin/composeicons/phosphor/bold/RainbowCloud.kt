package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.RainbowCloud: ImageVector
    get() {
        if (_rainbowCloud != null) return _rainbowCloud!!
        _rainbowCloud = phosphorBoldIcon(
            name = "RainbowCloud",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204 108c-20.277 .055-38.689 11.84-47.23 30.23h-.77c-19.85 0-36 16.55-36 36.89 0 20.34 16.15 36.88 36 36.88h48c28.719 0 52-23.281 52-52 0-28.719-23.281-52-52-52ZM204 188h-48c-6.62 0-12-5.78-12-12.89 0-7.11 5.38-12.89 12-12.89 1.462-.006 2.91 .28 4.26 .84 3.309 1.356 7.05 1.166 10.204-.518 3.154-1.684 5.393-4.688 6.106-8.192 2.972-14.425 16.61-24.082 31.203-22.094 14.593 1.988 25.152 14.941 24.157 29.635C230.936 176.585 218.728 187.997 204 188ZM109.22 136.84c4.059 5.234 3.11 12.766-2.12 16.83-1.957 1.517-3.102 3.854-3.1 6.33v16c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-16c-.031-9.894 4.545-19.238 12.38-25.28 2.514-1.952 5.701-2.826 8.859-2.428 3.158 .398 6.029 2.034 7.981 4.548ZM136.66 118.84c-14.827-8.879-33.282-9.101-48.319-.583C73.305 126.775 64.008 142.718 64 160v16c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-16C39.998 134.069 53.941 110.14 76.502 97.355 99.062 84.57 126.755 84.904 149 98.23c5.683 3.41 7.525 10.782 4.115 16.465-3.41 5.683-10.782 7.525-16.465 4.115ZM24 160v16c0 6.627-5.373 12-12 12C5.373 188 0 182.627 0 176v-16C-.002 116.121 25.62 76.282 65.547 58.083 105.474 39.883 152.351 46.676 185.47 75.46c5.001 4.349 5.529 11.929 1.18 16.93-4.349 5.001-11.929 5.529-16.93 1.18C143.697 70.958 106.866 65.623 75.497 79.924 44.128 94.224 23.998 125.525 24 160Z"),
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
        return _rainbowCloud!!
    }

private var _rainbowCloud: ImageVector? = null
