package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ShieldCheck: ImageVector
    get() {
        if (_shieldCheck != null) return _shieldCheck!!
        _shieldCheck = phosphorDuotoneIcon(
            name = "ShieldCheck",
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
                pathData = parseSvgPathData("M 208.000 40.000 L 48.000 40.000 C 39.163 40.000 32.000 47.163 32.000 56.000 L 32.000 112.000 C 32.000 164.720 57.520 196.670 78.930 214.190 C 101.990 233.050 124.930 239.450 125.930 239.720 C 127.305 240.094 128.755 240.094 130.130 239.720 C 131.130 239.450 154.040 233.050 177.130 214.190 C 198.480 196.670 224.000 164.720 224.000 112.000 L 224.000 56.000 C 224.000 47.163 216.837 40.000 208.000 40.000 ZM 208.000 112.000 C 208.000 149.070 194.340 179.160 167.400 201.420 C 155.673 211.077 142.336 218.592 128.000 223.620 C 113.852 218.680 100.679 211.298 89.080 201.810 C 61.820 179.510 48.000 149.300 48.000 112.000 L 48.000 56.000 L 208.000 56.000 ZM 82.340 141.660 C 79.214 138.534 79.214 133.466 82.340 130.340 C 85.466 127.214 90.534 127.214 93.660 130.340 L 112.000 148.690 L 162.340 98.340 C 165.466 95.214 170.534 95.214 173.660 98.340 C 176.786 101.466 176.786 106.534 173.660 109.660 L 117.660 165.660 C 116.159 167.162 114.123 168.006 112.000 168.006 C 109.877 168.006 107.841 167.162 106.340 165.660 Z"),
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
        return _shieldCheck!!
    }

private var _shieldCheck: ImageVector? = null
