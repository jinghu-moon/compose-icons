package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PaintBrushHousehold: ImageVector
    get() {
        if (_paintBrushHousehold != null) return _paintBrushHousehold!!
        _paintBrushHousehold = phosphorFillIcon(
            name = "PaintBrushHousehold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230.64 25.36c-6.001-6.003-14.142-9.375-22.63-9.375-8.488 0-16.629 3.372-22.63 9.375q-.21 .21-.42 .45L131.55 88.22 121 77.64c-4.501-4.504-10.608-7.034-16.975-7.034-6.367 0-12.474 2.53-16.975 7.034L10.36 154.34c-3.122 3.124-3.122 8.186 0 11.31l80 80c3.124 3.122 8.186 3.122 11.31 0L178.36 169c4.504-4.501 7.034-10.608 7.034-16.975 0-6.367-2.53-12.474-7.034-16.975L167.78 124.48 230.19 71c.15-.14 .31-.28 .45-.43 12.467-12.492 12.467-32.718 0-45.21ZM96 228.69 79.32 212l22.34-22.35c2.988-3.145 2.925-8.099-.143-11.167-3.068-3.068-8.022-3.131-11.167-.143L68 200.68 55.32 188 77.66 165.65c2.988-3.145 2.925-8.099-.143-11.167-3.068-3.068-8.022-3.131-11.167-.143L44 176.68 27.31 160 77.66 109.66l68.69 68.69Z"),
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
