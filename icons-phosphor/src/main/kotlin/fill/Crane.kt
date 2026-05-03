package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Crane: ImageVector
    get() {
        if (_crane != null) return _crane!!
        _crane = phosphorFillIcon(
            name = "Crane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.120 17.140 C 225.711 15.694 222.720 15.618 220.240 16.940 L 102.000 80.000 L 32.000 80.000 C 23.163 80.000 16.000 87.163 16.000 96.000 L 16.000 200.000 C 16.000 208.837 23.163 216.000 32.000 216.000 L 120.000 216.000 C 128.837 216.000 136.000 208.837 136.000 200.000 L 136.000 168.000 C 135.999 167.649 135.972 167.298 135.920 166.950 L 135.920 166.710 C 135.865 166.373 135.791 166.039 135.700 165.710 C 135.705 165.694 135.705 165.676 135.700 165.660 L 135.700 165.660 C 135.699 165.637 135.699 165.613 135.700 165.590 L 113.540 92.000 L 216.000 37.330 L 216.000 160.000 L 200.000 160.000 L 200.000 152.000 C 200.000 147.582 196.418 144.000 192.000 144.000 C 187.582 144.000 184.000 147.582 184.000 152.000 L 184.000 160.000 C 184.000 168.837 191.163 176.000 200.000 176.000 L 216.000 176.000 C 224.837 176.000 232.000 168.837 232.000 160.000 L 232.000 24.000 C 232.001 21.191 230.528 18.587 228.120 17.140 ZM 48.000 96.000 L 48.000 160.000 L 32.000 160.000 L 32.000 96.000 ZM 32.000 200.000 L 32.000 200.000 L 32.000 176.000 L 120.000 176.000 L 120.000 200.000 Z"),
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
        return _crane!!
    }

private var _crane: ImageVector? = null
