package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileCode: ImageVector
    get() {
        if (_fileCode != null) return _fileCode!!
        _fileCode = phosphorBoldIcon(
            name = "FileCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 180.490 143.510 C 182.749 145.762 184.019 148.820 184.019 152.010 C 184.019 155.200 182.749 158.258 180.490 160.510 L 156.490 184.510 C 151.796 189.204 144.184 189.204 139.490 184.510 C 134.796 179.816 134.796 172.204 139.490 167.510 L 155.000 152.000 L 139.480 136.490 C 134.786 131.796 134.786 124.184 139.480 119.490 C 144.174 114.796 151.786 114.796 156.480 119.490 ZM 116.490 119.510 C 114.238 117.251 111.180 115.981 107.990 115.981 C 104.800 115.981 101.742 117.251 99.490 119.510 L 75.490 143.510 C 73.231 145.762 71.961 148.820 71.961 152.010 C 71.961 155.200 73.231 158.258 75.490 160.510 L 99.490 184.510 C 104.184 189.204 111.796 189.204 116.490 184.510 C 121.184 179.816 121.184 172.204 116.490 167.510 L 101.000 152.000 L 116.520 136.490 C 118.769 134.235 120.030 131.179 120.024 127.994 C 120.019 124.809 118.747 121.757 116.490 119.510 ZM 220.000 88.000 L 220.000 216.000 C 220.000 227.046 211.046 236.000 200.000 236.000 L 56.000 236.000 C 44.954 236.000 36.000 227.046 36.000 216.000 L 36.000 40.000 C 36.000 28.954 44.954 20.000 56.000 20.000 L 152.000 20.000 C 155.185 20.000 158.239 21.266 160.490 23.520 L 216.490 79.520 C 218.737 81.770 220.000 84.820 220.000 88.000 ZM 160.000 57.000 L 160.000 80.000 L 183.000 80.000 ZM 196.000 212.000 L 196.000 104.000 L 148.000 104.000 C 141.373 104.000 136.000 98.627 136.000 92.000 L 136.000 44.000 L 60.000 44.000 L 60.000 212.000 Z"),
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
        return _fileCode!!
    }

private var _fileCode: ImageVector? = null
