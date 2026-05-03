package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Van: ImageVector
    get() {
        if (_van != null) return _van!!
        _van = phosphorThinIcon(
            name = "Van",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 251.000 109.400 L 205.470 56.300 C 203.189 53.573 199.815 51.998 196.260 52.000 L 32.000 52.000 C 25.373 52.000 20.000 57.373 20.000 64.000 L 20.000 176.000 C 20.000 182.627 25.373 188.000 32.000 188.000 L 52.290 188.000 C 54.287 201.767 66.089 211.981 80.000 211.981 C 93.911 211.981 105.713 201.767 107.710 188.000 L 164.290 188.000 C 166.287 201.767 178.089 211.981 192.000 211.981 C 205.911 211.981 217.713 201.767 219.710 188.000 L 240.000 188.000 C 246.627 188.000 252.000 182.627 252.000 176.000 L 252.000 112.000 C 251.989 111.042 251.634 110.119 251.000 109.400 ZM 199.360 61.470 L 239.300 108.000 L 172.000 108.000 L 172.000 60.000 L 196.260 60.000 C 197.462 59.999 198.600 60.539 199.360 61.470 ZM 100.000 108.000 L 100.000 60.000 L 164.000 60.000 L 164.000 108.000 ZM 32.000 60.000 L 92.000 60.000 L 92.000 108.000 L 28.000 108.000 L 28.000 64.000 C 28.000 61.791 29.791 60.000 32.000 60.000 ZM 80.000 204.000 C 68.954 204.000 60.000 195.046 60.000 184.000 C 60.000 172.954 68.954 164.000 80.000 164.000 C 91.046 164.000 100.000 172.954 100.000 184.000 C 100.000 195.046 91.046 204.000 80.000 204.000 ZM 192.000 204.000 C 180.954 204.000 172.000 195.046 172.000 184.000 C 172.000 172.954 180.954 164.000 192.000 164.000 C 203.046 164.000 212.000 172.954 212.000 184.000 C 212.000 195.046 203.046 204.000 192.000 204.000 ZM 240.000 180.000 L 219.710 180.000 C 217.713 166.233 205.911 156.019 192.000 156.019 C 178.089 156.019 166.287 166.233 164.290 180.000 L 107.710 180.000 C 105.713 166.233 93.911 156.019 80.000 156.019 C 66.089 156.019 54.287 166.233 52.290 180.000 L 32.000 180.000 C 29.791 180.000 28.000 178.209 28.000 176.000 L 28.000 116.000 L 244.000 116.000 L 244.000 176.000 C 244.000 178.209 242.209 180.000 240.000 180.000 Z"),
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
        return _van!!
    }

private var _van: ImageVector? = null
