package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Palette: ImageVector
    get() {
        if (_palette != null) return _palette!!
        _palette = phosphorDuotoneIcon(
            name = "Palette",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 127.17c.064 7.461-.738 14.904-2.39 22.18-2.496 10.913-12.205 18.652-23.4 18.65h-46.21c-13.255 0-24 10.745-24 24-.006 7.788-3.79 15.089-10.151 19.584-6.361 4.494-14.507 5.623-21.849 3.026C58.73 201.44 32 169.81 32 128 31.997 75.369 74.372 32.548 127 32c52.84-.53 96.55 42.35 97 95.17Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M200.77 53.89C181.407 34.716 155.25 23.972 128 24h-1.07C69.911 24.587 23.997 70.978 24 128c0 43 26.58 79.06 69.36 94.17 9.791 3.452 20.648 1.939 29.123-4.057C130.958 212.117 135.997 202.382 136 192c0-8.837 7.163-16 16-16h46.21c14.956 .072 27.942-10.283 31.2-24.88 1.788-7.873 2.657-15.927 2.59-24C231.794 99.517 220.548 73.146 200.77 53.89ZM213.77 147.6c-1.637 7.271-8.107 12.427-15.56 12.4h-46.21c-17.673 0-32 14.327-32 32-.008 5.186-2.528 10.046-6.762 13.04-4.234 2.994-9.656 3.751-14.548 2.03C62.49 194.3 40 164 40 128 39.997 79.752 78.845 40.499 127.09 40h.9c48.232 .187 87.4 39.022 88 87.25 .06 6.845-.672 13.673-2.18 20.35ZM140 76c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM96 100c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12C72 93.373 77.373 88 84 88c6.627 0 12 5.373 12 12ZM96 156c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM184 100c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
        return _palette!!
    }

private var _palette: ImageVector? = null
