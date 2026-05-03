package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CarProfile: ImageVector
    get() {
        if (_carProfile != null) return _carProfile!!
        _carProfile = phosphorThinIcon(
            name = "CarProfile",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 116.000 L 209.660 116.000 L 165.170 71.520 C 162.928 69.260 159.874 67.992 156.690 68.000 L 44.280 68.000 C 40.263 67.994 36.509 69.998 34.280 73.340 L 4.670 117.780 C 4.232 118.438 3.999 119.210 4.000 120.000 L 4.000 168.000 C 4.000 174.627 9.373 180.000 16.000 180.000 L 36.290 180.000 C 38.287 193.767 50.089 203.981 64.000 203.981 C 77.911 203.981 89.713 193.767 91.710 180.000 L 164.290 180.000 C 166.287 193.767 178.089 203.981 192.000 203.981 C 205.911 203.981 217.713 193.767 219.710 180.000 L 240.000 180.000 C 246.627 180.000 252.000 174.627 252.000 168.000 L 252.000 128.000 C 252.000 121.373 246.627 116.000 240.000 116.000 ZM 41.000 77.780 C 41.733 76.682 42.960 76.016 44.280 76.000 L 156.690 76.000 C 157.748 76.002 158.762 76.422 159.510 77.170 L 198.340 116.000 L 15.470 116.000 ZM 64.000 196.000 C 52.954 196.000 44.000 187.046 44.000 176.000 C 44.000 164.954 52.954 156.000 64.000 156.000 C 75.046 156.000 84.000 164.954 84.000 176.000 C 84.000 187.046 75.046 196.000 64.000 196.000 ZM 192.000 196.000 C 180.954 196.000 172.000 187.046 172.000 176.000 C 172.000 164.954 180.954 156.000 192.000 156.000 C 203.046 156.000 212.000 164.954 212.000 176.000 C 212.000 187.046 203.046 196.000 192.000 196.000 ZM 244.000 168.000 C 244.000 170.209 242.209 172.000 240.000 172.000 L 219.710 172.000 C 217.713 158.233 205.911 148.019 192.000 148.019 C 178.089 148.019 166.287 158.233 164.290 172.000 L 91.710 172.000 C 89.713 158.233 77.911 148.019 64.000 148.019 C 50.089 148.019 38.287 158.233 36.290 172.000 L 16.000 172.000 C 13.791 172.000 12.000 170.209 12.000 168.000 L 12.000 124.000 L 240.000 124.000 C 242.209 124.000 244.000 125.791 244.000 128.000 Z"),
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
        return _carProfile!!
    }

private var _carProfile: ImageVector? = null
