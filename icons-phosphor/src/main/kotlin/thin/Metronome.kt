package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Metronome: ImageVector
    get() {
        if (_metronome != null) return _metronome!!
        _metronome = phosphorThinIcon(
            name = "Metronome",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 182.630 113.850 L 211.000 82.690 C 212.486 81.033 212.347 78.486 210.690 77.000 C 209.033 75.514 206.486 75.653 205.000 77.310 L 179.820 105.000 L 160.520 44.320 C 158.920 39.355 154.296 35.992 149.080 36.000 L 106.920 36.000 C 101.693 35.998 97.066 39.379 95.480 44.360 L 44.580 204.360 C 43.419 208.006 44.067 211.986 46.323 215.076 C 48.579 218.166 52.174 219.995 56.000 220.000 L 200.000 220.000 C 203.828 219.999 207.425 218.171 209.684 215.081 C 211.942 211.990 212.591 208.007 211.430 204.360 ZM 190.190 164.000 L 137.000 164.000 L 176.370 120.690 ZM 103.100 46.790 C 103.628 45.126 105.174 43.997 106.920 44.000 L 149.080 44.000 C 150.826 43.997 152.372 45.126 152.900 46.790 L 173.610 111.880 L 126.230 164.000 L 65.810 164.000 ZM 203.220 210.360 C 202.469 211.388 201.273 211.997 200.000 212.000 L 56.000 212.000 C 54.725 211.999 53.527 211.390 52.774 210.361 C 52.021 209.332 51.804 208.005 52.190 206.790 L 63.270 172.000 L 192.730 172.000 L 203.800 206.790 C 204.186 208.004 203.971 209.330 203.220 210.360 Z"),
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
        return _metronome!!
    }

private var _metronome: ImageVector? = null
