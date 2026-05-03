package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Pulse: ImageVector
    get() {
        if (_pulse != null) return _pulse!!
        _pulse = phosphorThinIcon(
            name = "Pulse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 236.000 128.000 C 236.000 130.209 234.209 132.000 232.000 132.000 L 202.470 132.000 L 163.580 209.790 C 162.902 211.145 161.516 212.001 160.000 212.000 L 159.800 212.000 C 158.212 211.920 156.822 210.907 156.260 209.420 L 95.670 50.420 L 59.670 129.700 C 59.003 131.120 57.568 132.019 56.000 132.000 L 24.000 132.000 C 21.791 132.000 20.000 130.209 20.000 128.000 C 20.000 125.791 21.791 124.000 24.000 124.000 L 53.420 124.000 L 92.360 38.350 C 93.028 36.880 94.513 35.956 96.127 36.006 C 97.740 36.056 99.165 37.071 99.740 38.580 L 160.500 198.060 L 196.420 126.210 C 197.098 124.855 198.484 123.999 200.000 124.000 L 232.000 124.000 C 234.209 124.000 236.000 125.791 236.000 128.000 Z"),
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
        return _pulse!!
    }

private var _pulse: ImageVector? = null
