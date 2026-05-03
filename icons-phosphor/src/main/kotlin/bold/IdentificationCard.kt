package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.IdentificationCard: ImageVector
    get() {
        if (_identificationCard != null) return _identificationCard!!
        _identificationCard = phosphorBoldIcon(
            name = "IdentificationCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 148.000 108.000 C 148.000 101.373 153.373 96.000 160.000 96.000 L 188.000 96.000 C 194.627 96.000 200.000 101.373 200.000 108.000 C 200.000 114.627 194.627 120.000 188.000 120.000 L 160.000 120.000 C 153.373 120.000 148.000 114.627 148.000 108.000 ZM 188.000 136.000 L 168.000 136.000 C 161.373 136.000 156.000 141.373 156.000 148.000 C 156.000 154.627 161.373 160.000 168.000 160.000 L 188.000 160.000 C 194.627 160.000 200.000 154.627 200.000 148.000 C 200.000 141.373 194.627 136.000 188.000 136.000 ZM 236.000 56.000 L 236.000 200.000 C 236.000 211.046 227.046 220.000 216.000 220.000 L 40.000 220.000 C 28.954 220.000 20.000 211.046 20.000 200.000 L 20.000 56.000 C 20.000 44.954 28.954 36.000 40.000 36.000 L 216.000 36.000 C 227.046 36.000 236.000 44.954 236.000 56.000 ZM 212.000 60.000 L 44.000 60.000 L 44.000 196.000 L 212.000 196.000 ZM 58.280 159.370 C 61.159 152.554 65.718 146.579 71.530 142.000 C 60.082 127.208 61.869 106.114 75.642 93.458 C 89.415 80.803 110.585 80.803 124.358 93.458 C 138.131 106.114 139.918 127.208 128.470 142.000 C 134.285 146.578 138.847 152.554 141.730 159.370 C 144.287 165.487 141.402 172.518 135.285 175.075 C 129.168 177.632 122.137 174.747 119.580 168.630 C 116.480 161.190 108.420 156.000 100.000 156.000 C 91.580 156.000 83.530 161.200 80.410 168.630 C 78.843 172.713 75.180 175.620 70.849 176.218 C 66.517 176.817 62.203 175.011 59.588 171.506 C 56.973 168.001 56.472 163.352 58.280 159.370 ZM 88.000 120.000 C 88.000 126.627 93.373 132.000 100.000 132.000 C 106.627 132.000 112.000 126.627 112.000 120.000 C 112.000 113.373 106.627 108.000 100.000 108.000 C 93.373 108.000 88.000 113.373 88.000 120.000 Z"),
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
        return _identificationCard!!
    }

private var _identificationCard: ImageVector? = null
