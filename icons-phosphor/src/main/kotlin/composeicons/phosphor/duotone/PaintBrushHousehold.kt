package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PaintBrushHousehold: ImageVector
    get() {
        if (_paintBrushHousehold != null) return _paintBrushHousehold!!
        _paintBrushHousehold = phosphorDuotoneIcon(
            name = "PaintBrushHousehold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M225 65l-69 59 16.69 16.69c6.243 6.248 6.243 16.372 0 22.62L152 184 72 104 92.69 83.31c6.248-6.243 16.372-6.243 22.62 0L132 100 191 31c9.389-9.389 24.611-9.389 34 0 9.389 9.389 9.389 24.611 0 34Z"),
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
                pathData = parseSvgPathData("M230.64 25.36c-6.001-6.003-14.142-9.375-22.63-9.375-8.488 0-16.629 3.372-22.63 9.375q-.21 .21-.42 .45L131.55 88.22 121 77.64c-4.501-4.504-10.608-7.034-16.975-7.034-6.367 0-12.474 2.53-16.975 7.034L10.36 154.34c-3.122 3.124-3.122 8.186 0 11.31l80 80c3.124 3.122 8.186 3.122 11.31 0L178.36 169c4.504-4.501 7.034-10.608 7.034-16.975 0-6.367-2.53-12.474-7.034-16.975L167.78 124.48 230.19 71c.15-.14 .31-.28 .45-.43 12.467-12.492 12.467-32.718 0-45.21ZM96 228.69 79.32 212l22.34-22.35c2.988-3.145 2.925-8.099-.143-11.167-3.068-3.068-8.022-3.131-11.167-.143L68 200.68 55.32 188 77.66 165.65c2.988-3.145 2.925-8.099-.143-11.167-3.068-3.068-8.022-3.131-11.167-.143L44 176.68 27.31 160 72 115.31 140.69 184ZM219.52 59.1l-68.71 58.81c-1.696 1.449-2.71 3.54-2.798 5.769-.087 2.229 .76 4.393 2.338 5.971L167 146.34c3.122 3.124 3.122 8.186 0 11.31l-15 15L83.32 104l15-15c3.124-3.122 8.186-3.122 11.31 0l16.69 16.69c1.577 1.578 3.742 2.425 5.971 2.338 2.229-.087 4.32-1.101 5.769-2.798L196.9 36.48c6.291-5.976 16.199-5.85 22.334 .286 6.136 6.136 6.262 16.043 .286 22.334Z"),
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
        return _paintBrushHousehold!!
    }

private var _paintBrushHousehold: ImageVector? = null
