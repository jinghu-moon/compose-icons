package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.RainbowCloud: ImageVector
    get() {
        if (_rainbowCloud != null) return _rainbowCloud!!
        _rainbowCloud = phosphorLightIcon(
            name = "RainbowCloud",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 114c-19.45 .05-36.784 12.282-43.35 30.59-1.538-.244-3.093-.368-4.65-.37-16.54 0-30 13.86-30 30.89 0 17.03 13.46 30.89 30 30.89h48c25.405 0 46-20.595 46-46 0-25.405-20.595-46-46-46ZM200 194h-48c-9.93 0-18-8.47-18-18.89 0-10.42 8.07-18.89 18-18.89 2.239-.005 4.458 .43 6.53 1.28 1.654 .68 3.525 .587 5.104-.255 1.578-.841 2.699-2.343 3.056-4.095 3.603-17.518 20.163-29.25 37.885-26.84 17.722 2.41 30.547 18.138 29.341 35.982C232.709 180.137 217.885 193.996 200 194ZM22 160v16c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-16C9.998 119.003 34.542 81.99 72.307 66.036c37.765-15.954 81.412-7.747 110.803 20.834 2.378 2.311 2.431 6.112 .12 8.49-2.311 2.378-6.112 2.431-8.49 .12C148.807 70.265 110.299 63.025 76.979 77.1 43.659 91.175 22.003 123.829 22 160ZM112 102c-32.017 .039-57.961 25.983-58 58v16c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-16c0-26.384 14.835-50.527 38.373-62.447 23.537-11.921 51.778-9.594 73.047 6.017 1.8 1.242 2.781 3.366 2.561 5.542-.22 2.176-1.607 4.06-3.619 4.917-2.012 .857-4.331 .551-6.052-.798C136.375 105.9 124.346 101.963 112 102ZM118 134.7c-1.967-.46-3.98-.695-6-.7-14.359 0-26 11.641-26 26v16c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-16c-.011-11.634 5.309-22.633 14.436-29.847 9.127-7.215 21.057-9.85 32.374-7.153 3.231 .776 5.221 4.024 4.445 7.255-.776 3.231-4.024 5.221-7.255 4.445Z"),
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
