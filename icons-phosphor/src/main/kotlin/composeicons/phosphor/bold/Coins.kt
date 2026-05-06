package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Coins: ImageVector
    get() {
        if (_coins != null) return _coins!!
        _coins = phosphorBoldIcon(
            name = "Coins",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M188 86.11v-2.11C188 69.38 177.17 56.45 157.49 47.6 140.87 40.12 119 36 96 36 73 36 51.13 40.12 34.51 47.6 14.83 56.45 4 69.38 4 84v40c0 14.62 10.83 27.55 30.51 36.4 10.695 4.628 21.956 7.816 33.49 9.48v2.12c0 14.62 10.83 27.55 30.51 36.4C115.13 215.88 137 220 160 220c23 0 44.87-4.12 61.49-11.6C241.17 199.55 252 186.62 252 172v-40C252 109.86 226.71 92.08 188 86.11ZM228 132c0 7.75-21.77 22.48-61.81 23.88C180.33 147.4 188 136.3 188 124v-13.56c25.88 4.71 40 15.04 40 21.56ZM107.37 147.63C103.74 147.87 99.95 148 96 148c-5.08 0-9.89-.22-14.43-.61-.378-.05-.759-.08-1.14-.09-1.51-.14-3-.3-4.43-.48v-15.89c6.643 .714 13.319 1.071 20 1.07 6.681 .001 13.357-.356 20-1.07v15.89c-2.49 .3-5.07 .56-7.75 .75-.25 .01-.59 .03-.88 .06ZM164 117.14v6.86c0 4.78-8.28 12.21-24 17.54v-15c5.985-1.571 11.834-3.621 17.49-6.13q3.44-1.55 6.51-3.27ZM96 60c44 0 68 15.85 68 24 0 8.15-24 24-68 24C52 108 28 92.15 28 84 28 75.85 52 60 96 60ZM28 124v-6.86q3.08 1.71 6.51 3.26c5.656 2.509 11.505 4.559 17.49 6.13v15C36.28 136.21 28 128.78 28 124ZM92 172h0c1.33 0 2.66 0 4 0q5.44 0 10.77-.32 4.45 1.57 9.23 2.86v15C100.28 184.21 92 176.78 92 172ZM140 194.82v-15.88c6.643 .711 13.319 1.065 20 1.06 6.681 .001 13.357-.356 20-1.07v15.89c-13.287 1.573-26.713 1.573-40 0ZM204 189.54v-15c5.985-1.571 11.834-3.621 17.49-6.13q3.44-1.54 6.51-3.26v6.85c0 4.78-8.28 12.21-24 17.54Z"),
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
        return _coins!!
    }

private var _coins: ImageVector? = null
