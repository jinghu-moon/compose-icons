package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Coin: ImageVector
    get() {
        if (_coin != null) return _coin!!
        _coin = phosphorLightIcon(
            name = "Coin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M206.68 65.63C186.23 55.41 159 50 128 50 97 50 69.77 55.41 49.32 65.63 29.41 75.58 18 89.57 18 104v48c0 14.43 11.41 28.42 31.32 38.37C69.77 200.59 97 206 128 206c31 0 58.23-5.41 78.68-15.63C226.59 180.42 238 166.43 238 152v-48C238 89.57 226.59 75.58 206.68 65.63ZM54.68 76.37C73.21 67.1 99.25 62 128 62c28.75 0 54.79 5.1 73.32 14.37C217 84.21 226 94.28 226 104c0 9.72-9 19.79-24.68 27.63C182.79 140.9 156.75 146 128 146 99.25 146 73.21 140.9 54.68 131.63 39 123.79 30 113.72 30 104 30 94.28 39 84.21 54.68 76.37ZM122 157.93v36c-19.24-.48-37.07-3.28-52-8.11v-35.4c15.27 4.51 32.85 7.07 52 7.51ZM134 157.93c19.15-.44 36.73-3 52-7.52v35.4c-14.93 4.83-32.76 7.63-52 8.11ZM30 152v-23c5.709 5.428 12.227 9.935 19.32 13.36q4.16 2.07 8.68 3.88v35c-1.13-.52-2.24-1-3.32-1.58C39 171.79 30 161.72 30 152ZM201.32 179.63c-1.08 .54-2.19 1.06-3.32 1.58v-35q4.51-1.81 8.68-3.88C213.771 138.914 220.289 134.417 226 129v23c0 9.72-9 19.79-24.68 27.63Z"),
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
        return _coin!!
    }

private var _coin: ImageVector? = null
