package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Horse: ImageVector
    get() {
        if (_horse != null) return _horse!!
        _horse = phosphorBoldIcon(
            name = "Horse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 104c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM236 129.53C235.032 187.675 188.318 234.676 130.18 236h-2.25C101.435 236.169 75.814 226.531 56 208.94c-3.31-2.827-4.829-7.225-3.97-11.493 .859-4.267 3.962-7.735 8.108-9.061 4.146-1.326 8.685-.303 11.862 2.674 4.924 4.396 10.364 8.177 16.2 11.26l21.54-29.62c-20.4-7-41.91-3.33-54.43-1.21C41.764 173.851 28.062 168.242 20.06 157.06c-.16-.21-.31-.43-.45-.65l-13.78-22C2.362 128.872 3.962 121.578 9.43 118L108 53.51v-21.51c0-6.627 5.373-12 12-12h8c28.91-.003 56.615 11.585 76.914 32.171 20.298 20.586 31.496 48.451 31.086 77.359ZM212 129.2C212.65 83.898 177.256 46.243 132 44.09v15.91c-.014 4.034-2.054 7.791-5.43 10L32.41 131.61l7.31 11.68c2.713 3.552 7.176 5.301 11.58 4.54 16.23-2.75 49.4-8.36 79.64 8C149.601 154.301 163.974 138.723 164 120c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12-.042 30.659-23.159 56.369-53.64 59.66l-22.45 30.87c5.868 1.089 11.833 1.575 17.8 1.45 45.189-1.065 81.493-37.586 82.29-82.78Z"),
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
        return _horse!!
    }

private var _horse: ImageVector? = null
