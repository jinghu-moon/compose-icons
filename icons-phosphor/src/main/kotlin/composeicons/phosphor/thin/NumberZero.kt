package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberZero: ImageVector
    get() {
        if (_numberZero != null) return _numberZero!!
        _numberZero = phosphorThinIcon(
            name = "NumberZero",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M179.87 65.35C167.65 46.15 149.71 36 128 36 106.29 36 88.35 46.15 76.13 65.35 65.73 81.69 60 103.94 60 128c0 24.06 5.73 46.31 16.13 62.65C88.35 209.85 106.29 220 128 220c21.71 0 39.65-10.15 51.87-29.35C190.27 174.31 196 152.06 196 128c0-24.06-5.73-46.31-16.13-62.65ZM128 212C86.55 212 68 169.81 68 128 68 86.19 86.55 44 128 44c41.45 0 60 42.19 60 84 0 41.81-18.55 84-60 84Z"),
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
        return _numberZero!!
    }

private var _numberZero: ImageVector? = null
