package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Function: ImageVector
    get() {
        if (_function != null) return _function!!
        _function = phosphorThinIcon(
            name = "Function",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 204.000 40.000 C 204.000 42.209 202.209 44.000 200.000 44.000 L 170.710 44.000 C 157.175 44.000 145.577 53.682 143.160 67.000 L 132.790 124.000 L 184.000 124.000 C 186.209 124.000 188.000 125.791 188.000 128.000 C 188.000 130.209 186.209 132.000 184.000 132.000 L 131.340 132.000 L 120.710 190.440 C 117.598 207.558 102.689 220.000 85.290 220.000 L 56.000 220.000 C 53.791 220.000 52.000 218.209 52.000 216.000 C 52.000 213.791 53.791 212.000 56.000 212.000 L 85.290 212.000 C 98.825 212.000 110.423 202.318 112.840 189.000 L 123.210 132.000 L 72.000 132.000 C 69.791 132.000 68.000 130.209 68.000 128.000 C 68.000 125.791 69.791 124.000 72.000 124.000 L 124.660 124.000 L 135.290 65.560 C 138.402 48.442 153.311 36.000 170.710 36.000 L 200.000 36.000 C 202.209 36.000 204.000 37.791 204.000 40.000 Z"),
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
        return _function!!
    }

private var _function: ImageVector? = null
