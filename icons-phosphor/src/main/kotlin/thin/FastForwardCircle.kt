package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FastForwardCircle: ImageVector
    get() {
        if (_fastForwardCircle != null) return _fastForwardCircle!!
        _fastForwardCircle = phosphorThinIcon(
            name = "FastForwardCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.810 36.000 220.000 77.190 220.000 128.000 C 219.945 178.787 178.787 219.945 128.000 220.000 ZM 190.400 124.800 L 142.400 88.800 C 141.188 87.891 139.566 87.745 138.211 88.422 C 136.856 89.100 136.000 90.485 136.000 92.000 L 136.000 164.000 C 135.999 165.516 136.855 166.902 138.210 167.580 C 138.767 167.855 139.379 167.999 140.000 168.000 C 140.865 168.000 141.708 167.719 142.400 167.200 L 190.400 131.200 C 191.407 130.445 192.000 129.259 192.000 128.000 C 192.000 126.741 191.407 125.555 190.400 124.800 ZM 144.000 156.000 L 144.000 100.000 L 181.330 128.000 ZM 134.400 124.800 L 86.400 88.800 C 85.188 87.891 83.566 87.745 82.211 88.422 C 80.856 89.100 80.000 90.485 80.000 92.000 L 80.000 164.000 C 79.999 165.516 80.855 166.902 82.210 167.580 C 82.767 167.855 83.379 167.999 84.000 168.000 C 84.865 168.000 85.708 167.719 86.400 167.200 L 134.400 131.200 C 135.407 130.445 136.000 129.259 136.000 128.000 C 136.000 126.741 135.407 125.555 134.400 124.800 ZM 88.000 156.000 L 88.000 100.000 L 125.330 128.000 Z"),
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
        return _fastForwardCircle!!
    }

private var _fastForwardCircle: ImageVector? = null
