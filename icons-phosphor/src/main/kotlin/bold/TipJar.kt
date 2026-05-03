package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TipJar: ImageVector
    get() {
        if (_tipJar != null) return _tipJar!!
        _tipJar = phosphorBoldIcon(
            name = "TipJar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 188.000 49.680 L 188.000 32.000 C 188.000 20.954 179.046 12.000 168.000 12.000 L 88.000 12.000 C 76.954 12.000 68.000 20.954 68.000 32.000 L 68.000 49.680 C 49.083 55.063 36.026 72.332 36.000 92.000 L 36.000 200.000 C 36.028 224.289 55.711 243.972 80.000 244.000 L 176.000 244.000 C 200.289 243.972 219.972 224.289 220.000 200.000 L 220.000 92.000 C 219.974 72.332 206.917 55.063 188.000 49.680 ZM 164.000 48.000 L 140.000 48.000 L 140.000 36.000 L 164.000 36.000 ZM 116.000 36.000 L 116.000 48.000 L 92.000 48.000 L 92.000 36.000 ZM 196.000 200.000 C 196.000 211.046 187.046 220.000 176.000 220.000 L 80.000 220.000 C 68.954 220.000 60.000 211.046 60.000 200.000 L 60.000 92.000 C 60.000 80.954 68.954 72.000 80.000 72.000 L 176.000 72.000 C 187.046 72.000 196.000 80.954 196.000 92.000 ZM 168.000 162.000 C 167.998 177.791 155.756 190.877 140.000 191.930 L 140.000 196.000 C 140.000 202.627 134.627 208.000 128.000 208.000 C 121.373 208.000 116.000 202.627 116.000 196.000 L 116.000 192.000 L 108.000 192.000 C 101.373 192.000 96.000 186.627 96.000 180.000 C 96.000 173.373 101.373 168.000 108.000 168.000 L 138.000 168.000 C 141.314 168.000 144.000 165.314 144.000 162.000 C 144.000 158.686 141.314 156.000 138.000 156.000 L 118.000 156.000 C 101.839 155.974 88.603 143.152 88.064 127.001 C 87.525 110.849 99.877 97.173 116.000 96.070 L 116.000 96.000 C 116.000 89.373 121.373 84.000 128.000 84.000 C 134.627 84.000 140.000 89.373 140.000 96.000 L 148.000 96.000 C 154.627 96.000 160.000 101.373 160.000 108.000 C 160.000 114.627 154.627 120.000 148.000 120.000 L 118.000 120.000 C 114.686 120.000 112.000 122.686 112.000 126.000 C 112.000 129.314 114.686 132.000 118.000 132.000 L 138.000 132.000 C 154.569 132.000 168.000 145.431 168.000 162.000 Z"),
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
        return _tipJar!!
    }

private var _tipJar: ImageVector? = null
