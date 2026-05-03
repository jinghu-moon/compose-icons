package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ShieldWarning: ImageVector
    get() {
        if (_shieldWarning != null) return _shieldWarning!!
        _shieldWarning = phosphorRegularIcon(
            name = "ShieldWarning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 120.000 136.000 L 120.000 96.000 C 120.000 91.582 123.582 88.000 128.000 88.000 C 132.418 88.000 136.000 91.582 136.000 96.000 L 136.000 136.000 C 136.000 140.418 132.418 144.000 128.000 144.000 C 123.582 144.000 120.000 140.418 120.000 136.000 ZM 128.000 184.000 C 134.627 184.000 140.000 178.627 140.000 172.000 C 140.000 165.373 134.627 160.000 128.000 160.000 C 121.373 160.000 116.000 165.373 116.000 172.000 C 116.000 178.627 121.373 184.000 128.000 184.000 ZM 224.000 56.000 L 224.000 112.000 C 224.000 164.720 198.480 196.670 177.070 214.190 C 154.010 233.050 131.070 239.460 130.070 239.720 C 128.695 240.094 127.245 240.094 125.870 239.720 C 124.870 239.460 101.960 233.050 78.870 214.190 C 57.520 196.670 32.000 164.720 32.000 112.000 L 32.000 56.000 C 32.000 47.163 39.163 40.000 48.000 40.000 L 208.000 40.000 C 216.837 40.000 224.000 47.163 224.000 56.000 ZM 208.000 56.000 L 48.000 56.000 L 48.000 112.000 C 48.000 149.300 61.820 179.510 89.070 201.810 C 100.672 211.299 113.849 218.681 128.000 223.620 C 142.339 218.593 155.680 211.078 167.410 201.420 C 194.340 179.160 208.000 149.070 208.000 112.000 Z"),
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
        return _shieldWarning!!
    }

private var _shieldWarning: ImageVector? = null
