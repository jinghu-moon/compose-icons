package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CrownCross: ImageVector
    get() {
        if (_crownCross != null) return _crownCross!!
        _crownCross = phosphorDuotoneIcon(
            name = "CrownCross",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 232.000 116.000 C 232.000 168.000 184.000 184.000 184.000 184.000 L 184.000 208.000 C 184.000 212.418 180.418 216.000 176.000 216.000 L 80.000 216.000 C 75.582 216.000 72.000 212.418 72.000 208.000 L 72.000 184.000 C 72.000 184.000 24.000 168.000 24.000 116.000 C 24.000 87.281 47.281 64.000 76.000 64.000 C 104.720 64.000 128.000 83.280 128.000 112.000 C 128.000 83.280 151.280 64.000 180.000 64.000 C 208.719 64.000 232.000 87.281 232.000 116.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 180.000 56.000 C 162.260 56.000 146.790 62.480 136.000 73.160 L 136.000 40.000 L 152.000 40.000 C 156.418 40.000 160.000 36.418 160.000 32.000 C 160.000 27.582 156.418 24.000 152.000 24.000 L 136.000 24.000 L 136.000 8.000 C 136.000 3.582 132.418 0.000 128.000 0.000 C 123.582 0.000 120.000 3.582 120.000 8.000 L 120.000 24.000 L 104.000 24.000 C 99.582 24.000 96.000 27.582 96.000 32.000 C 96.000 36.418 99.582 40.000 104.000 40.000 L 120.000 40.000 L 120.000 73.160 C 109.210 62.480 93.740 56.000 76.000 56.000 C 42.879 56.039 16.039 82.879 16.000 116.000 C 16.000 145.860 30.540 164.850 42.730 175.520 C 49.136 181.103 56.296 185.755 64.000 189.340 L 64.000 208.000 C 64.000 216.837 71.163 224.000 80.000 224.000 L 176.000 224.000 C 184.837 224.000 192.000 216.837 192.000 208.000 L 192.000 189.340 C 199.704 185.755 206.864 181.103 213.270 175.520 C 225.460 164.850 240.000 145.860 240.000 116.000 C 239.961 82.879 213.121 56.039 180.000 56.000 ZM 181.470 176.410 C 178.203 177.499 176.000 180.556 176.000 184.000 L 176.000 208.000 L 80.000 208.000 L 80.000 184.000 C 80.000 180.556 77.797 177.499 74.530 176.410 C 74.100 176.270 32.000 161.700 32.000 116.000 C 32.028 91.711 51.711 72.028 76.000 72.000 C 101.500 72.000 120.000 88.820 120.000 112.000 L 120.000 176.000 C 120.000 180.418 123.582 184.000 128.000 184.000 C 132.418 184.000 136.000 180.418 136.000 176.000 L 136.000 112.000 C 136.000 88.820 154.500 72.000 180.000 72.000 C 204.289 72.028 223.972 91.711 224.000 116.000 C 224.000 161.400 183.180 175.830 181.470 176.410 Z"),
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
        return _crownCross!!
    }

private var _crownCross: ImageVector? = null
