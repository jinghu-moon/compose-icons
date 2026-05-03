package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Target: ImageVector
    get() {
        if (_target != null) return _target!!
        _target = phosphorThinIcon(
            name = "Target",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 218.260 84.890 C 240.570 131.466 223.810 187.369 179.556 213.989 C 135.302 240.608 78.063 229.216 47.373 187.681 C 16.683 146.146 22.605 88.085 61.048 53.601 C 99.491 19.117 157.851 19.515 195.820 54.520 L 221.170 29.170 C 222.733 27.607 225.267 27.607 226.830 29.170 C 228.393 30.733 228.393 33.267 226.830 34.830 L 130.830 130.830 C 129.267 132.393 126.733 132.393 125.170 130.830 C 123.607 129.267 123.607 126.733 125.170 125.170 L 156.170 94.170 C 140.144 80.831 116.956 80.572 100.636 93.550 C 84.317 106.528 79.346 129.178 88.733 147.796 C 98.119 166.415 119.285 175.889 139.424 170.486 C 159.562 165.083 173.144 146.287 171.950 125.470 C 171.823 123.261 173.511 121.367 175.720 121.240 C 177.929 121.113 179.823 122.801 179.950 125.010 C 181.373 149.680 165.238 171.944 141.351 178.271 C 117.464 184.599 92.423 173.241 81.447 151.102 C 70.471 128.962 76.593 102.156 96.090 86.975 C 115.588 71.794 143.077 72.431 161.850 88.500 L 190.190 60.170 C 153.278 26.584 96.321 28.550 61.813 64.602 C 27.305 100.653 27.832 157.643 63.000 193.050 C 94.704 224.637 144.539 228.826 181.072 202.977 C 217.605 177.127 230.237 128.738 211.000 88.330 C 210.344 87.035 210.441 85.485 211.254 84.282 C 212.068 83.079 213.469 82.411 214.916 82.537 C 216.363 82.663 217.627 83.564 218.220 84.890 Z"),
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
        return _target!!
    }

private var _target: ImageVector? = null
