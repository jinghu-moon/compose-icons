package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Vignette: ImageVector
    get() {
        if (_vignette != null) return _vignette!!
        _vignette = phosphorThinIcon(
            name = "Vignette",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 44h-176C33.373 44 28 49.373 28 56v144c0 6.627 5.373 12 12 12h176c6.627 0 12-5.373 12-12v-144c0-6.627-5.373-12-12-12ZM220 200c0 2.209-1.791 4-4 4h-176c-2.209 0-4-1.791-4-4v-144c0-2.209 1.791-4 4-4h176c2.209 0 4 1.791 4 4ZM128 76C90.5 76 60 99.33 60 128c0 28.67 30.5 52 68 52 37.5 0 68-23.33 68-52C196 99.33 165.5 76 128 76ZM128 172C94.92 172 68 152.26 68 128 68 103.74 94.92 84 128 84c33.08 0 60 19.74 60 44 0 24.26-26.92 44-60 44Z"),
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
        return _vignette!!
    }

private var _vignette: ImageVector? = null
