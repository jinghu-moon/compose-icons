package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Subtract: ImageVector
    get() {
        if (_subtract != null) return _subtract!!
        _subtract = phosphorRegularIcon(
            name = "Subtract",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M174.63 81.35C167.243 41.632 131.402 13.654 91.078 16.129 50.755 18.604 18.604 50.755 16.129 91.078c-2.475 40.324 25.503 76.164 65.221 83.552 7.387 39.718 43.228 67.696 83.552 65.221 40.324-2.475 72.474-34.625 74.949-74.949C242.326 124.578 214.348 88.737 174.63 81.35ZM224 160c0 1.52-.07 3-.18 4.51l-50-50C175.118 109.097 175.849 103.564 176 98c28.308 7.239 48.082 32.781 48 62ZM146.6 157.91l52.61 52.62c-4.927 3.831-10.388 6.92-16.21 9.17L131.14 167.84c5.515-2.709 10.703-6.041 15.46-9.93ZM157.91 146.6c3.888-4.751 7.22-9.932 9.93-15.44L219.7 183c-2.252 5.815-5.341 11.269-9.17 16.19ZM32 96C32 60.654 60.654 32 96 32c35.346 0 64 28.654 64 64 0 35.346-28.654 64-64 64C60.67 159.961 32.039 131.33 32 96ZM98 176c5.559-.136 11.089-.849 16.5-2.13l50 50c-1.49 .11-3 .18-4.51 .18C130.76 224.122 105.219 204.324 98 176Z"),
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
        return _subtract!!
    }

private var _subtract: ImageVector? = null
