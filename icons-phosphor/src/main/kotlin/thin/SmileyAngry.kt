package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SmileyAngry: ImageVector
    get() {
        if (_smileyAngry != null) return _smileyAngry!!
        _smileyAngry = phosphorThinIcon(
            name = "SmileyAngry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 100.000 140.000 C 100.000 144.418 96.418 148.000 92.000 148.000 C 87.582 148.000 84.000 144.418 84.000 140.000 C 84.000 135.582 87.582 132.000 92.000 132.000 C 96.418 132.000 100.000 135.582 100.000 140.000 ZM 164.000 132.000 C 159.582 132.000 156.000 135.582 156.000 140.000 C 156.000 144.418 159.582 148.000 164.000 148.000 C 168.418 148.000 172.000 144.418 172.000 140.000 C 172.000 135.582 168.418 132.000 164.000 132.000 ZM 228.000 128.000 C 228.000 183.228 183.228 228.000 128.000 228.000 C 72.772 228.000 28.000 183.228 28.000 128.000 C 28.000 72.772 72.772 28.000 128.000 28.000 C 183.203 28.061 227.939 72.797 228.000 128.000 ZM 220.000 128.000 C 220.000 77.190 178.810 36.000 128.000 36.000 C 77.190 36.000 36.000 77.190 36.000 128.000 C 36.000 178.810 77.190 220.000 128.000 220.000 C 178.787 219.945 219.945 178.787 220.000 128.000 ZM 173.780 84.670 L 128.000 115.190 L 82.220 84.670 C 80.381 83.444 77.896 83.941 76.670 85.780 C 75.444 87.619 75.941 90.104 77.780 91.330 L 125.780 123.330 C 127.124 124.227 128.876 124.227 130.220 123.330 L 178.220 91.330 C 180.059 90.104 180.556 87.619 179.330 85.780 C 178.104 83.941 175.619 83.444 173.780 84.670 ZM 154.210 180.670 C 146.390 175.470 138.940 172.000 128.000 172.000 C 117.060 172.000 109.610 175.470 101.790 180.670 C 100.534 181.431 99.796 182.819 99.868 184.285 C 99.939 185.752 100.808 187.061 102.132 187.697 C 103.456 188.332 105.021 188.191 106.210 187.330 C 113.200 182.690 119.000 180.000 128.000 180.000 C 137.000 180.000 142.800 182.690 149.790 187.330 C 150.979 188.191 152.544 188.332 153.868 187.697 C 155.192 187.061 156.061 185.752 156.132 184.285 C 156.204 182.819 155.466 181.431 154.210 180.670 Z"),
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
        return _smileyAngry!!
    }

private var _smileyAngry: ImageVector? = null
