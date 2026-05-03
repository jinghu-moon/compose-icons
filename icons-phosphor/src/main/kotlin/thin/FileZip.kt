package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FileZip: ImageVector
    get() {
        if (_fileZip != null) return _fileZip!!
        _fileZip = phosphorThinIcon(
            name = "FileZip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 184.000 148.000 L 168.000 148.000 C 165.791 148.000 164.000 149.791 164.000 152.000 L 164.000 208.000 C 164.000 210.209 165.791 212.000 168.000 212.000 C 170.209 212.000 172.000 210.209 172.000 208.000 L 172.000 196.000 L 184.000 196.000 C 197.255 196.000 208.000 185.255 208.000 172.000 C 208.000 158.745 197.255 148.000 184.000 148.000 ZM 184.000 188.000 L 172.000 188.000 L 172.000 156.000 L 184.000 156.000 C 192.837 156.000 200.000 163.163 200.000 172.000 C 200.000 180.837 192.837 188.000 184.000 188.000 ZM 132.000 152.000 L 132.000 208.000 C 132.000 210.209 130.209 212.000 128.000 212.000 C 125.791 212.000 124.000 210.209 124.000 208.000 L 124.000 152.000 C 124.000 149.791 125.791 148.000 128.000 148.000 C 130.209 148.000 132.000 149.791 132.000 152.000 ZM 91.470 154.000 L 62.890 204.000 L 88.000 204.000 C 90.209 204.000 92.000 205.791 92.000 208.000 C 92.000 210.209 90.209 212.000 88.000 212.000 L 56.000 212.000 C 54.570 212.002 53.247 211.241 52.531 210.003 C 51.816 208.765 51.815 207.239 52.530 206.000 L 81.110 156.000 L 56.000 156.000 C 53.791 156.000 52.000 154.209 52.000 152.000 C 52.000 149.791 53.791 148.000 56.000 148.000 L 88.000 148.000 C 89.430 147.998 90.753 148.759 91.469 149.997 C 92.185 151.235 92.185 152.761 91.470 154.000 ZM 210.830 85.170 L 154.830 29.170 C 154.079 28.420 153.061 27.999 152.000 28.000 L 56.000 28.000 C 49.373 28.000 44.000 33.373 44.000 40.000 L 44.000 112.000 C 44.000 114.209 45.791 116.000 48.000 116.000 C 50.209 116.000 52.000 114.209 52.000 112.000 L 52.000 40.000 C 52.000 37.791 53.791 36.000 56.000 36.000 L 148.000 36.000 L 148.000 88.000 C 148.000 90.209 149.791 92.000 152.000 92.000 L 204.000 92.000 L 204.000 112.000 C 204.000 114.209 205.791 116.000 208.000 116.000 C 210.209 116.000 212.000 114.209 212.000 112.000 L 212.000 88.000 C 212.001 86.939 211.580 85.921 210.830 85.170 ZM 156.000 84.000 L 156.000 41.650 L 198.340 84.000 Z"),
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
        return _fileZip!!
    }

private var _fileZip: ImageVector? = null
