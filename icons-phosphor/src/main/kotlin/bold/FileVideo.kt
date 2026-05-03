package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileVideo: ImageVector
    get() {
        if (_fileVideo != null) return _fileVideo!!
        _fileVideo = phosphorBoldIcon(
            name = "FileVideo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.490 79.510 L 160.490 23.510 C 158.238 21.260 155.184 19.997 152.000 20.000 L 56.000 20.000 C 44.954 20.000 36.000 28.954 36.000 40.000 L 36.000 108.000 C 36.000 114.627 41.373 120.000 48.000 120.000 C 54.627 120.000 60.000 114.627 60.000 108.000 L 60.000 44.000 L 136.000 44.000 L 136.000 92.000 C 136.000 98.627 141.373 104.000 148.000 104.000 L 196.000 104.000 L 196.000 212.000 C 189.373 212.000 184.000 217.373 184.000 224.000 C 184.000 230.627 189.373 236.000 196.000 236.000 L 200.000 236.000 C 211.046 236.000 220.000 227.046 220.000 216.000 L 220.000 88.000 C 220.003 84.816 218.740 81.762 216.490 79.510 ZM 160.000 57.000 L 183.000 80.000 L 160.000 80.000 ZM 158.090 141.690 C 154.424 139.530 149.889 139.473 146.170 141.540 L 126.500 152.440 C 123.431 144.922 116.120 140.007 108.000 140.000 L 48.000 140.000 C 36.954 140.000 28.000 148.954 28.000 160.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 108.000 228.000 C 116.120 227.993 123.431 223.078 126.500 215.560 L 146.170 226.490 C 149.887 228.556 154.420 228.501 158.085 226.344 C 161.750 224.188 164.000 220.253 164.000 216.000 L 164.000 152.000 C 164.000 147.750 161.752 143.817 158.090 141.660 ZM 104.000 204.000 L 52.000 204.000 L 52.000 164.000 L 104.000 164.000 ZM 140.000 195.610 L 128.000 188.940 L 128.000 179.060 L 140.000 172.390 Z"),
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
        return _fileVideo!!
    }

private var _fileVideo: ImageVector? = null
