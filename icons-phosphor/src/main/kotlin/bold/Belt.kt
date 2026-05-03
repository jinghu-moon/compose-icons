package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Belt: ImageVector
    get() {
        if (_belt != null) return _belt!!
        _belt = phosphorBoldIcon(
            name = "Belt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 244.000 156.000 L 196.000 156.000 L 196.000 100.000 L 244.000 100.000 C 250.627 100.000 256.000 94.627 256.000 88.000 C 256.000 81.373 250.627 76.000 244.000 76.000 L 192.000 76.000 C 188.223 70.964 182.295 68.000 176.000 68.000 L 112.000 68.000 C 105.705 68.000 99.777 70.964 96.000 76.000 L 67.300 76.000 C 65.594 71.225 61.070 68.039 56.000 68.039 C 50.930 68.039 46.406 71.225 44.700 76.000 L 12.000 76.000 C 5.373 76.000 0.000 81.373 0.000 88.000 C 0.000 94.627 5.373 100.000 12.000 100.000 L 44.000 100.000 L 44.000 156.000 L 12.000 156.000 C 5.373 156.000 0.000 161.373 0.000 168.000 C 0.000 174.627 5.373 180.000 12.000 180.000 L 44.700 180.000 C 46.406 184.775 50.930 187.961 56.000 187.961 C 61.070 187.961 65.594 184.775 67.300 180.000 L 96.000 180.000 C 99.777 185.036 105.705 188.000 112.000 188.000 L 176.000 188.000 C 182.295 188.000 188.223 185.036 192.000 180.000 L 244.000 180.000 C 250.627 180.000 256.000 174.627 256.000 168.000 C 256.000 161.373 250.627 156.000 244.000 156.000 ZM 68.000 100.000 L 92.000 100.000 L 92.000 156.000 L 68.000 156.000 ZM 116.000 92.000 L 172.000 92.000 L 172.000 116.000 L 144.000 116.000 C 137.373 116.000 132.000 121.373 132.000 128.000 C 132.000 134.627 137.373 140.000 144.000 140.000 L 172.000 140.000 L 172.000 164.000 L 116.000 164.000 Z"),
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
        return _belt!!
    }

private var _belt: ImageVector? = null
