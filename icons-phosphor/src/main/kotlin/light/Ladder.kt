package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Ladder: ImageVector
    get() {
        if (_ladder != null) return _ladder!!
        _ladder = phosphorLightIcon(
            name = "Ladder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 213.640 214.000 L 162.380 73.000 L 172.200 46.000 L 184.000 46.000 C 187.314 46.000 190.000 43.314 190.000 40.000 C 190.000 36.686 187.314 34.000 184.000 34.000 L 88.000 34.000 C 84.686 34.000 82.000 36.686 82.000 40.000 C 82.000 43.314 84.686 46.000 88.000 46.000 L 95.430 46.000 L 34.360 214.000 C 33.265 217.114 34.891 220.528 38.000 221.640 C 38.642 221.870 39.318 221.992 40.000 222.000 C 42.524 222.000 44.778 220.422 45.640 218.050 L 55.840 190.000 L 107.070 190.000 L 98.360 214.000 C 97.816 215.496 97.889 217.146 98.562 218.589 C 99.235 220.031 100.454 221.147 101.950 221.690 C 102.592 221.920 103.268 222.042 103.950 222.050 C 106.474 222.050 108.728 220.472 109.590 218.100 L 128.570 166.000 L 183.430 166.000 L 202.360 218.050 C 203.222 220.422 205.476 222.000 208.000 222.000 C 208.699 221.997 209.392 221.876 210.050 221.640 C 213.139 220.508 214.740 217.100 213.640 214.000 ZM 128.890 130.000 L 77.660 130.000 L 90.750 94.000 L 142.000 94.000 ZM 159.430 46.000 L 146.340 82.000 L 95.110 82.000 L 108.200 46.000 ZM 60.200 178.000 L 73.290 142.000 L 124.520 142.000 L 111.430 178.000 ZM 132.930 154.000 L 156.000 90.560 L 179.070 154.000 Z"),
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
        return _ladder!!
    }

private var _ladder: ImageVector? = null
