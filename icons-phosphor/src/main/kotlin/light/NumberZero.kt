package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberZero: ImageVector
    get() {
        if (_numberZero != null) return _numberZero!!
        _numberZero = phosphorLightIcon(
            name = "NumberZero",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 181.560 64.280 C 169.000 44.470 150.430 34.000 128.000 34.000 C 105.570 34.000 87.050 44.470 74.440 64.280 C 63.840 80.940 58.000 103.570 58.000 128.000 C 58.000 152.430 63.840 175.060 74.440 191.720 C 87.050 211.530 105.570 222.000 128.000 222.000 C 150.430 222.000 168.950 211.530 181.560 191.720 C 192.160 175.060 198.000 152.430 198.000 128.000 C 198.000 103.570 192.160 80.940 181.560 64.280 ZM 128.000 210.000 C 87.930 210.000 70.000 168.820 70.000 128.000 C 70.000 87.180 87.930 46.000 128.000 46.000 C 168.070 46.000 186.000 87.180 186.000 128.000 C 186.000 168.820 168.070 210.000 128.000 210.000 Z"),
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
