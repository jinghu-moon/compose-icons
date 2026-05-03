package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.NumberZero: ImageVector
    get() {
        if (_numberZero != null) return _numberZero!!
        _numberZero = phosphorRegularIcon(
            name = "NumberZero",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 183.250 63.200 C 170.250 42.790 151.150 32.000 128.000 32.000 C 104.850 32.000 85.750 42.790 72.750 63.200 C 62.000 80.180 56.000 103.190 56.000 128.000 C 56.000 152.810 62.000 175.820 72.750 192.800 C 85.750 213.210 104.850 224.000 128.000 224.000 C 151.150 224.000 170.250 213.210 183.250 192.800 C 194.050 175.800 200.000 152.800 200.000 128.000 C 200.000 103.200 194.050 80.180 183.250 63.200 ZM 128.000 208.000 C 89.320 208.000 72.000 167.820 72.000 128.000 C 72.000 88.180 89.320 48.000 128.000 48.000 C 166.680 48.000 184.000 88.180 184.000 128.000 C 184.000 167.820 166.680 208.000 128.000 208.000 Z"),
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
