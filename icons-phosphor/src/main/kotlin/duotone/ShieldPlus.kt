package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ShieldPlus: ImageVector
    get() {
        if (_shieldPlus != null) return _shieldPlus!!
        _shieldPlus = phosphorDuotoneIcon(
            name = "ShieldPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 216.000 56.000 L 216.000 112.000 C 216.000 208.000 128.000 232.000 128.000 232.000 C 128.000 232.000 40.000 208.000 40.000 112.000 L 40.000 56.000 C 40.000 51.582 43.582 48.000 48.000 48.000 L 208.000 48.000 C 212.418 48.000 216.000 51.582 216.000 56.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 88.000 128.000 C 88.000 123.582 91.582 120.000 96.000 120.000 L 120.000 120.000 L 120.000 96.000 C 120.000 91.582 123.582 88.000 128.000 88.000 C 132.418 88.000 136.000 91.582 136.000 96.000 L 136.000 120.000 L 160.000 120.000 C 164.418 120.000 168.000 123.582 168.000 128.000 C 168.000 132.418 164.418 136.000 160.000 136.000 L 136.000 136.000 L 136.000 160.000 C 136.000 164.418 132.418 168.000 128.000 168.000 C 123.582 168.000 120.000 164.418 120.000 160.000 L 120.000 136.000 L 96.000 136.000 C 91.582 136.000 88.000 132.418 88.000 128.000 ZM 224.000 56.000 L 224.000 112.000 C 224.000 164.720 198.480 196.670 177.070 214.190 C 154.010 233.050 131.070 239.460 130.070 239.720 C 128.695 240.094 127.245 240.094 125.870 239.720 C 124.870 239.460 101.960 233.050 78.870 214.190 C 57.520 196.670 32.000 164.720 32.000 112.000 L 32.000 56.000 C 32.000 47.163 39.163 40.000 48.000 40.000 L 208.000 40.000 C 216.837 40.000 224.000 47.163 224.000 56.000 ZM 208.000 56.000 L 48.000 56.000 L 48.000 112.000 C 48.000 149.300 61.820 179.510 89.070 201.810 C 100.672 211.299 113.849 218.681 128.000 223.620 C 142.339 218.593 155.680 211.078 167.410 201.420 C 194.340 179.160 208.000 149.070 208.000 112.000 Z"),
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
        return _shieldPlus!!
    }

private var _shieldPlus: ImageVector? = null
