package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextAa: ImageVector
    get() {
        if (_textAa != null) return _textAa!!
        _textAa = phosphorLightIcon(
            name = "TextAa",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M85.43 53.45C84.441 51.346 82.325 50.002 80 50.002c-2.325 0-4.441 1.343-5.43 3.448l-64 136c-1.411 2.999-.124 6.574 2.875 7.985 2.999 1.411 6.574 .124 7.985-2.875L38.63 158h82.74l17.2 36.55c1.411 2.999 4.986 4.286 7.985 2.875 2.999-1.411 4.286-4.986 2.875-7.985ZM44.28 146 80 70.09 115.72 146ZM200 98c-12.21 0-21.71 3.28-28.23 9.74-2.353 2.336-2.366 6.137-.03 8.49 2.336 2.353 6.137 2.366 8.49 .03C184.41 112.11 191.07 110 200 110c14.34 0 26 9.87 26 22v7.24c-7.312-6.039-16.517-9.31-26-9.24-20.95 0-38 15.25-38 34 0 18.75 17.05 34 38 34 9.483 .07 18.688-3.201 26-9.24v3.24c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-60C238 113.25 221 98 200 98ZM200 186c-14.34 0-26-9.87-26-22 0-12.13 11.66-22 26-22 14.34 0 26 9.87 26 22 0 12.13-11.66 22-26 22Z"),
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
        return _textAa!!
    }

private var _textAa: ImageVector? = null
