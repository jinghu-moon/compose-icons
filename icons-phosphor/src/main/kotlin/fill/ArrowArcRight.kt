package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowArcRight: ImageVector
    get() {
        if (_arrowArcRight != null) return _arrowArcRight!!
        _arrowArcRight = phosphorFillIcon(
            name = "ArrowArcRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 88.000 L 240.000 152.000 C 240.000 156.418 236.418 160.000 232.000 160.000 L 168.000 160.000 C 164.762 160.003 161.842 158.053 160.603 155.062 C 159.364 152.071 160.049 148.628 162.340 146.340 L 188.530 120.160 C 163.012 95.978 125.549 89.305 93.250 103.187 C 60.951 117.070 40.014 148.844 40.000 184.000 C 40.000 188.418 36.418 192.000 32.000 192.000 C 27.582 192.000 24.000 188.418 24.000 184.000 C 24.000 142.363 48.834 104.739 87.119 88.373 C 125.404 72.006 169.761 80.050 199.860 108.820 L 226.340 82.340 C 228.628 80.049 232.071 79.364 235.062 80.603 C 238.053 81.842 240.003 84.762 240.000 88.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _arrowArcRight!!
    }

private var _arrowArcRight: ImageVector? = null
