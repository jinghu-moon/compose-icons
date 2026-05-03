package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DropboxLogo: ImageVector
    get() {
        if (_dropboxLogo != null) return _dropboxLogo!!
        _dropboxLogo = phosphorBoldIcon(
            name = "DropboxLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 238.830 146.130 L 201.080 120.000 L 238.830 93.870 C 242.071 91.629 244.005 87.940 244.005 84.000 C 244.005 80.060 242.071 76.371 238.830 74.130 L 186.830 38.130 C 182.721 35.286 177.279 35.286 173.170 38.130 L 128.000 69.410 L 82.830 38.130 C 78.721 35.286 73.279 35.286 69.170 38.130 L 17.170 74.130 C 13.929 76.371 11.995 80.060 11.995 84.000 C 11.995 87.940 13.929 91.629 17.170 93.870 L 54.920 120.000 L 17.170 146.130 C 13.929 148.371 11.995 152.060 11.995 156.000 C 11.995 159.940 13.929 163.629 17.170 165.870 L 69.170 201.870 C 73.279 204.714 78.721 204.714 82.830 201.870 L 128.000 170.590 L 173.170 201.870 C 177.279 204.714 182.721 204.714 186.830 201.870 L 238.830 165.870 C 242.071 163.629 244.005 159.940 244.005 156.000 C 244.005 152.060 242.071 148.371 238.830 146.130 ZM 128.000 141.410 L 97.080 120.000 L 128.000 98.590 L 158.920 120.000 ZM 180.000 62.600 L 210.920 84.000 L 180.000 105.400 L 149.080 84.000 ZM 76.000 62.600 L 106.920 84.000 L 76.000 105.400 L 45.080 84.000 ZM 76.000 177.400 L 45.080 156.000 L 76.000 134.600 L 106.920 156.000 ZM 180.000 177.400 L 149.080 156.000 L 180.000 134.600 L 210.920 156.000 ZM 154.730 209.490 C 158.512 214.930 157.169 222.406 151.730 226.190 L 134.870 237.870 C 130.761 240.714 125.319 240.714 121.210 237.870 L 104.350 226.190 C 100.697 223.804 98.628 219.623 98.945 215.271 C 99.263 210.920 101.917 207.083 105.877 205.252 C 109.837 203.421 114.479 203.883 118.000 206.460 L 128.000 213.400 L 138.000 206.460 C 140.618 204.637 143.855 203.932 146.994 204.501 C 150.133 205.070 152.917 206.865 154.730 209.490 Z"),
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
        return _dropboxLogo!!
    }

private var _dropboxLogo: ImageVector? = null
