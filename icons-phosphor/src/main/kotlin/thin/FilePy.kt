package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FilePy: ImageVector
    get() {
        if (_filePy != null) return _filePy!!
        _filePy = phosphorThinIcon(
            name = "FilePy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 210.830 85.170 L 154.830 29.170 C 154.079 28.420 153.061 27.999 152.000 28.000 L 56.000 28.000 C 49.373 28.000 44.000 33.373 44.000 40.000 L 44.000 112.000 C 44.000 114.209 45.791 116.000 48.000 116.000 C 50.209 116.000 52.000 114.209 52.000 112.000 L 52.000 40.000 C 52.000 37.791 53.791 36.000 56.000 36.000 L 148.000 36.000 L 148.000 88.000 C 148.000 90.209 149.791 92.000 152.000 92.000 L 204.000 92.000 L 204.000 216.000 C 204.000 218.209 202.209 220.000 200.000 220.000 L 168.000 220.000 C 165.791 220.000 164.000 221.791 164.000 224.000 C 164.000 226.209 165.791 228.000 168.000 228.000 L 200.000 228.000 C 206.627 228.000 212.000 222.627 212.000 216.000 L 212.000 88.000 C 212.001 86.939 211.580 85.921 210.830 85.170 ZM 156.000 41.650 L 198.340 84.000 L 156.000 84.000 ZM 64.000 148.000 L 48.000 148.000 C 45.791 148.000 44.000 149.791 44.000 152.000 L 44.000 208.000 C 44.000 210.209 45.791 212.000 48.000 212.000 C 50.209 212.000 52.000 210.209 52.000 208.000 L 52.000 196.000 L 64.000 196.000 C 77.255 196.000 88.000 185.255 88.000 172.000 C 88.000 158.745 77.255 148.000 64.000 148.000 ZM 64.000 188.000 L 52.000 188.000 L 52.000 156.000 L 64.000 156.000 C 72.837 156.000 80.000 163.163 80.000 172.000 C 80.000 180.837 72.837 188.000 64.000 188.000 ZM 151.390 154.120 L 132.000 185.120 L 132.000 208.000 C 132.000 210.209 130.209 212.000 128.000 212.000 C 125.791 212.000 124.000 210.209 124.000 208.000 L 124.000 185.150 L 104.610 154.150 C 103.516 152.283 104.106 149.884 105.941 148.737 C 107.775 147.590 110.190 148.109 111.390 149.910 L 128.000 176.450 L 144.610 149.880 C 145.346 148.623 146.708 147.866 148.164 147.903 C 149.620 147.940 150.941 148.766 151.612 150.059 C 152.283 151.352 152.198 152.908 151.390 154.120 Z"),
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
        return _filePy!!
    }

private var _filePy: ImageVector? = null
