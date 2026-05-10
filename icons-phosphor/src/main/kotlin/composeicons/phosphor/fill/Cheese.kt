package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Cheese: ImageVector
    get() {
        if (_cheese != null) return _cheese!!
        _cheese = phosphorFillIcon(
            name = "Cheese",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 32c-.779-.002-1.555 .113-2.3 .34L21.7 80.34h0C18.318 81.355 16.001 84.468 16 88v16c0 4.418 3.582 8 8 8h7.46c13.45 0 24.79 11 24.54 24.46C55.749 149.535 45.077 160.002 32 160h-8c-4.418 0-8 3.582-8 8v24c0 4.418 3.582 8 8 8h200c8.837 0 16-7.163 16-16v-96C239.967 57.086 214.914 32.033 184 32ZM80 184c0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32ZM168 136c-9.9 .005-19.245-4.573-25.309-12.398C136.626 115.777 134.525 105.586 137 96h62c2.475 9.586 .374 19.777-5.691 27.602C187.245 131.427 177.9 136.005 168 136ZM78.51 80 185.12 48c18.576 .545 34.339 13.794 38.07 32Z"),
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
        return _cheese!!
    }

private var _cheese: ImageVector? = null
