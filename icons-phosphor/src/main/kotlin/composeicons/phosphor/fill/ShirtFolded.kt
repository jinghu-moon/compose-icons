package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ShirtFolded: ImageVector
    get() {
        if (_shirtFolded != null) return _shirtFolded!!
        _shirtFolded = phosphorFillIcon(
            name = "ShirtFolded",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M201 40h-21.65L165.66 26.34C164.158 24.84 162.122 23.998 160 24h-64c-2.122-.002-4.158 .84-5.66 2.34L76.65 40h-21.65C46.716 40 40 46.716 40 55v154c0 8.284 6.716 15 15 15h61c2.209 0 4-1.791 4-4v-115.73c-.063-4.289 3.197-7.898 7.47-8.27 2.212-.147 4.386 .631 6.003 2.147 1.617 1.517 2.532 3.636 2.527 5.853v116c0 2.209 1.791 4 4 4h61c8.284 0 15-6.716 15-15v-154c0-8.284-6.716-15-15-15ZM86.54 107.08c-1.194 .981-2.846 1.187-4.244 .529C80.898 106.95 80.004 105.545 80 104v-44.69L95.24 44.07l23.47 35.21ZM128 80h0 0ZM176 104c.004 1.554-.893 2.97-2.3 3.63-1.383 .667-3.027 .468-4.21-.51L137.29 79.3 160.76 44.09 176 59.31Z"),
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
        return _shirtFolded!!
    }

private var _shirtFolded: ImageVector? = null
