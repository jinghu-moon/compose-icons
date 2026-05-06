package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HandCoins: ImageVector
    get() {
        if (_handCoins != null) return _handCoins!!
        _handCoins = phosphorFillIcon(
            name = "HandCoins",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128.09 57.38c.912-12.629 8.391-23.851 19.697-29.552 11.306-5.701 24.776-5.043 35.473 1.732 1.225 .801 1.914 2.207 1.797 3.666-.117 1.459-1.021 2.737-2.357 3.334C164.028 44.961 152.014 63.526 152 84c0 1.17 0 2.34 .12 3.49 .112 1.481-.606 2.903-1.864 3.692-1.259 .789-2.851 .815-4.136 .068C134.093 84.37 127.081 71.199 128.09 57.38ZM240 160.61c.029 9.326-5.245 17.857-13.6 22l-.44 .2-38.83 16.54c-.384 .169-.782 .303-1.19 .4l-64 16c-.634 .163-1.285 .247-1.94 .25h-104C7.163 216 0 208.837 0 200v-40c0-8.837 7.163-16 16-16h28.69L67.31 121.37c5.991-6.018 14.139-9.391 22.63-9.37h50.06c8.561-.001 16.652 3.915 21.963 10.629 5.311 6.715 7.259 15.49 5.287 23.821l41.84-9.62c7.382-1.955 15.254-.372 21.306 4.284 6.053 4.656 9.601 11.859 9.604 19.496ZM224 160.61c-.003-2.681-1.254-5.208-3.385-6.835-2.131-1.627-4.898-2.169-7.485-1.465l-.31 .08-67 15.41c-.588 .131-1.188 .198-1.79 .2h-32.03c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h28c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-50.06c-4.246-.014-8.32 1.676-11.31 4.69L56 155.31v44.69h63l62.43-15.61 38-16.18c2.819-1.485 4.58-4.414 4.57-7.6ZM168 84c0 19.882 16.118 36 36 36 19.882 0 36-16.118 36-36C240 64.118 223.882 48 204 48c-19.882 0-36 16.118-36 36Z"),
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
        return _handCoins!!
    }

private var _handCoins: ImageVector? = null
