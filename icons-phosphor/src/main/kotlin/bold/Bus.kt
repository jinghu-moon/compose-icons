package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Bus: ImageVector
    get() {
        if (_bus != null) return _bus!!
        _bus = phosphorBoldIcon(
            name = "Bus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 184.000 28.000 L 72.000 28.000 C 52.118 28.000 36.000 44.118 36.000 64.000 L 36.000 208.000 C 36.000 219.046 44.954 228.000 56.000 228.000 L 84.000 228.000 C 95.046 228.000 104.000 219.046 104.000 208.000 L 104.000 192.000 L 152.000 192.000 L 152.000 208.000 C 152.000 219.046 160.954 228.000 172.000 228.000 L 200.000 228.000 C 211.046 228.000 220.000 219.046 220.000 208.000 L 220.000 64.000 C 220.000 44.118 203.882 28.000 184.000 28.000 ZM 60.000 168.000 L 60.000 112.000 L 196.000 112.000 L 196.000 168.000 ZM 72.000 52.000 L 184.000 52.000 C 190.627 52.000 196.000 57.373 196.000 64.000 L 196.000 88.000 L 60.000 88.000 L 60.000 64.000 C 60.000 57.373 65.373 52.000 72.000 52.000 ZM 80.000 204.000 L 60.000 204.000 L 60.000 192.000 L 80.000 192.000 ZM 176.000 204.000 L 176.000 192.000 L 196.000 192.000 L 196.000 204.000 ZM 108.000 140.000 C 108.000 148.837 100.837 156.000 92.000 156.000 C 83.163 156.000 76.000 148.837 76.000 140.000 C 76.000 131.163 83.163 124.000 92.000 124.000 C 100.837 124.000 108.000 131.163 108.000 140.000 ZM 180.000 140.000 C 180.000 148.837 172.837 156.000 164.000 156.000 C 155.163 156.000 148.000 148.837 148.000 140.000 C 148.000 131.163 155.163 124.000 164.000 124.000 C 172.837 124.000 180.000 131.163 180.000 140.000 ZM 256.000 80.000 L 256.000 104.000 C 256.000 110.627 250.627 116.000 244.000 116.000 C 237.373 116.000 232.000 110.627 232.000 104.000 L 232.000 80.000 C 232.000 73.373 237.373 68.000 244.000 68.000 C 250.627 68.000 256.000 73.373 256.000 80.000 ZM 24.000 80.000 L 24.000 104.000 C 24.000 110.627 18.627 116.000 12.000 116.000 C 5.373 116.000 0.000 110.627 0.000 104.000 L 0.000 80.000 C -0.000 73.373 5.373 68.000 12.000 68.000 C 18.627 68.000 24.000 73.373 24.000 80.000 Z"),
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
        return _bus!!
    }

private var _bus: ImageVector? = null
