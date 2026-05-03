package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TrainSimple: ImageVector
    get() {
        if (_trainSimple != null) return _trainSimple!!
        _trainSimple = phosphorBoldIcon(
            name = "TrainSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 184.000 20.000 L 72.000 20.000 C 52.118 20.000 36.000 36.118 36.000 56.000 L 36.000 184.000 C 36.000 203.882 52.118 220.000 72.000 220.000 L 72.000 220.000 L 62.400 232.800 C 58.424 238.102 59.498 245.624 64.800 249.600 C 70.102 253.576 77.624 252.502 81.600 247.200 L 102.000 220.000 L 154.000 220.000 L 174.400 247.200 C 178.376 252.502 185.898 253.576 191.200 249.600 C 196.502 245.624 197.576 238.102 193.600 232.800 L 184.000 220.000 L 184.000 220.000 C 203.882 220.000 220.000 203.882 220.000 184.000 L 220.000 56.000 C 220.000 36.118 203.882 20.000 184.000 20.000 ZM 72.000 44.000 L 184.000 44.000 C 190.627 44.000 196.000 49.373 196.000 56.000 L 196.000 116.000 L 60.000 116.000 L 60.000 56.000 C 60.000 49.373 65.373 44.000 72.000 44.000 ZM 184.000 196.000 L 72.000 196.000 C 65.373 196.000 60.000 190.627 60.000 184.000 L 60.000 140.000 L 196.000 140.000 L 196.000 184.000 C 196.000 190.627 190.627 196.000 184.000 196.000 ZM 104.000 168.000 C 104.000 176.837 96.837 184.000 88.000 184.000 C 79.163 184.000 72.000 176.837 72.000 168.000 C 72.000 159.163 79.163 152.000 88.000 152.000 C 96.837 152.000 104.000 159.163 104.000 168.000 ZM 184.000 168.000 C 184.000 176.837 176.837 184.000 168.000 184.000 C 159.163 184.000 152.000 176.837 152.000 168.000 C 152.000 159.163 159.163 152.000 168.000 152.000 C 176.837 152.000 184.000 159.163 184.000 168.000 Z"),
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
        return _trainSimple!!
    }

private var _trainSimple: ImageVector? = null
