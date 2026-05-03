package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SmileyNervous: ImageVector
    get() {
        if (_smileyNervous != null) return _smileyNervous!!
        _smileyNervous = phosphorBoldIcon(
            name = "SmileyNervous",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 211.950 174.371 174.371 211.950 128.000 212.000 ZM 76.000 108.000 C 76.000 99.163 83.163 92.000 92.000 92.000 C 100.837 92.000 108.000 99.163 108.000 108.000 C 108.000 116.837 100.837 124.000 92.000 124.000 C 83.163 124.000 76.000 116.837 76.000 108.000 ZM 148.000 108.000 C 148.000 99.163 155.163 92.000 164.000 92.000 C 172.837 92.000 180.000 99.163 180.000 108.000 C 180.000 116.837 172.837 124.000 164.000 124.000 C 155.163 124.000 148.000 116.837 148.000 108.000 ZM 178.920 172.940 C 174.982 178.269 167.470 179.397 162.140 175.460 C 159.164 173.107 156.555 170.323 154.400 167.200 C 153.655 166.157 152.854 165.155 152.000 164.200 C 151.146 165.155 150.345 166.157 149.600 167.200 C 146.000 172.000 140.000 180.000 128.000 180.000 C 116.000 180.000 110.000 172.000 106.400 167.200 C 105.655 166.157 104.854 165.155 104.000 164.200 C 103.146 165.155 102.345 166.157 101.600 167.200 C 99.445 170.323 96.836 173.107 93.860 175.460 C 88.530 179.401 81.016 178.275 77.075 172.945 C 73.134 167.615 74.260 160.101 79.590 156.160 C 80.632 155.133 81.573 154.008 82.400 152.800 C 86.000 148.000 92.000 140.000 104.000 140.000 C 116.000 140.000 122.000 148.000 125.600 152.800 C 126.345 153.843 127.146 154.845 128.000 155.800 C 128.854 154.845 129.655 153.843 130.400 152.800 C 134.000 148.000 140.000 140.000 152.000 140.000 C 164.000 140.000 170.000 148.000 173.600 152.800 C 174.427 154.008 175.368 155.133 176.410 156.160 C 181.735 160.101 182.859 167.613 178.920 172.940 Z"),
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
        return _smileyNervous!!
    }

private var _smileyNervous: ImageVector? = null
