package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FunnelSimpleX: ImageVector
    get() {
        if (_funnelSimpleX != null) return _funnelSimpleX!!
        _funnelSimpleX = phosphorBoldIcon(
            name = "FunnelSimpleX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 192.000 148.000 L 64.000 148.000 C 57.373 148.000 52.000 142.627 52.000 136.000 C 52.000 129.373 57.373 124.000 64.000 124.000 L 192.000 124.000 C 198.627 124.000 204.000 129.373 204.000 136.000 C 204.000 142.627 198.627 148.000 192.000 148.000 ZM 232.000 76.000 L 24.000 76.000 C 17.373 76.000 12.000 81.373 12.000 88.000 C 12.000 94.627 17.373 100.000 24.000 100.000 L 232.000 100.000 C 238.627 100.000 244.000 94.627 244.000 88.000 C 244.000 81.373 238.627 76.000 232.000 76.000 ZM 128.000 172.000 L 104.000 172.000 C 97.373 172.000 92.000 177.373 92.000 184.000 C 92.000 190.627 97.373 196.000 104.000 196.000 L 128.000 196.000 C 134.627 196.000 140.000 190.627 140.000 184.000 C 140.000 177.373 134.627 172.000 128.000 172.000 ZM 224.490 167.510 C 222.238 165.251 219.180 163.981 215.990 163.981 C 212.800 163.981 209.742 165.251 207.490 167.510 L 192.000 183.000 L 176.490 167.480 C 171.796 162.786 164.184 162.786 159.490 167.480 C 154.796 172.174 154.796 179.786 159.490 184.480 L 175.000 200.000 L 159.480 215.510 C 154.786 220.204 154.786 227.816 159.480 232.510 C 164.174 237.204 171.786 237.204 176.480 232.510 L 192.000 217.000 L 207.510 232.520 C 212.204 237.214 219.816 237.214 224.510 232.520 C 229.204 227.826 229.204 220.214 224.510 215.520 L 209.000 200.000 L 224.520 184.490 C 226.769 182.235 228.030 179.179 228.024 175.994 C 228.019 172.809 226.747 169.757 224.490 167.510 Z"),
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
        return _funnelSimpleX!!
    }

private var _funnelSimpleX: ImageVector? = null
