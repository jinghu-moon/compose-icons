package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Truck: ImageVector
    get() {
        if (_truck != null) return _truck!!
        _truck = phosphorThinIcon(
            name = "Truck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 251.710 118.520 L 237.710 83.520 C 235.882 78.977 231.477 76.001 226.580 76.000 L 188.000 76.000 L 188.000 64.000 C 188.000 61.791 186.209 60.000 184.000 60.000 L 32.000 60.000 C 25.373 60.000 20.000 65.373 20.000 72.000 L 20.000 184.000 C 20.000 190.627 25.373 196.000 32.000 196.000 L 52.290 196.000 C 54.287 209.767 66.089 219.981 80.000 219.981 C 93.911 219.981 105.713 209.767 107.710 196.000 L 164.290 196.000 C 166.287 209.767 178.089 219.981 192.000 219.981 C 205.911 219.981 217.713 209.767 219.710 196.000 L 240.000 196.000 C 246.627 196.000 252.000 190.627 252.000 184.000 L 252.000 120.000 C 251.998 119.493 251.900 118.990 251.710 118.520 ZM 188.000 84.000 L 226.580 84.000 C 228.217 83.997 229.690 84.991 230.300 86.510 L 242.090 116.000 L 188.000 116.000 ZM 28.000 72.000 C 28.000 69.791 29.791 68.000 32.000 68.000 L 180.000 68.000 L 180.000 140.000 L 28.000 140.000 ZM 80.000 212.000 C 68.954 212.000 60.000 203.046 60.000 192.000 C 60.000 180.954 68.954 172.000 80.000 172.000 C 91.046 172.000 100.000 180.954 100.000 192.000 C 100.000 203.046 91.046 212.000 80.000 212.000 ZM 164.290 188.000 L 107.710 188.000 C 105.713 174.233 93.911 164.019 80.000 164.019 C 66.089 164.019 54.287 174.233 52.290 188.000 L 32.000 188.000 C 29.791 188.000 28.000 186.209 28.000 184.000 L 28.000 148.000 L 180.000 148.000 L 180.000 166.710 C 171.535 170.736 165.640 178.724 164.290 188.000 ZM 192.000 212.000 C 180.954 212.000 172.000 203.046 172.000 192.000 C 172.000 180.954 180.954 172.000 192.000 172.000 C 203.046 172.000 212.000 180.954 212.000 192.000 C 212.000 203.046 203.046 212.000 192.000 212.000 ZM 244.000 184.000 C 244.000 186.209 242.209 188.000 240.000 188.000 L 219.710 188.000 C 217.499 172.697 203.303 162.082 188.000 164.290 L 188.000 124.000 L 244.000 124.000 Z"),
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
        return _truck!!
    }

private var _truck: ImageVector? = null
