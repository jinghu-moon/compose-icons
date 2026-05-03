package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Ladder: ImageVector
    get() {
        if (_ladder != null) return _ladder!!
        _ladder = phosphorThinIcon(
            name = "Ladder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 211.760 214.630 L 160.260 73.000 L 170.800 44.000 L 184.000 44.000 C 186.209 44.000 188.000 42.209 188.000 40.000 C 188.000 37.791 186.209 36.000 184.000 36.000 L 88.000 36.000 C 85.791 36.000 84.000 37.791 84.000 40.000 C 84.000 42.209 85.791 44.000 88.000 44.000 L 98.290 44.000 L 36.290 214.630 C 35.926 215.627 35.974 216.728 36.422 217.690 C 36.870 218.652 37.682 219.397 38.680 219.760 C 39.104 219.911 39.550 219.992 40.000 220.000 C 41.682 220.001 43.184 218.950 43.760 217.370 L 54.440 188.000 L 109.930 188.000 L 100.240 214.630 C 99.876 215.627 99.924 216.728 100.372 217.690 C 100.820 218.652 101.632 219.397 102.630 219.760 C 103.070 219.917 103.533 219.998 104.000 220.000 C 105.682 220.001 107.184 218.950 107.760 217.370 L 127.170 164.000 L 184.830 164.000 L 204.240 217.370 C 204.816 218.950 206.318 220.001 208.000 220.000 C 208.467 219.997 208.930 219.916 209.370 219.760 C 210.368 219.397 211.180 218.652 211.628 217.690 C 212.076 216.728 212.124 215.627 211.760 214.630 ZM 130.290 132.000 L 74.800 132.000 L 89.350 92.000 L 144.830 92.000 ZM 162.290 44.000 L 147.740 84.000 L 92.260 84.000 L 106.800 44.000 ZM 57.350 180.000 L 71.890 140.000 L 127.380 140.000 L 112.830 180.000 ZM 130.070 156.000 L 156.000 84.700 L 181.920 156.000 Z"),
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
