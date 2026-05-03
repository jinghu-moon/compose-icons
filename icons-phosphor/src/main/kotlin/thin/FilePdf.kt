package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FilePdf: ImageVector
    get() {
        if (_filePdf != null) return _filePdf!!
        _filePdf = phosphorThinIcon(
            name = "FilePdf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.000 152.000 C 220.000 154.209 218.209 156.000 216.000 156.000 L 188.000 156.000 L 188.000 180.000 L 208.000 180.000 C 210.209 180.000 212.000 181.791 212.000 184.000 C 212.000 186.209 210.209 188.000 208.000 188.000 L 188.000 188.000 L 188.000 208.000 C 188.000 210.209 186.209 212.000 184.000 212.000 C 181.791 212.000 180.000 210.209 180.000 208.000 L 180.000 152.000 C 180.000 149.791 181.791 148.000 184.000 148.000 L 216.000 148.000 C 218.209 148.000 220.000 149.791 220.000 152.000 ZM 88.000 172.000 C 88.000 185.255 77.255 196.000 64.000 196.000 L 52.000 196.000 L 52.000 208.000 C 52.000 210.209 50.209 212.000 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 152.000 C 44.000 149.791 45.791 148.000 48.000 148.000 L 64.000 148.000 C 77.255 148.000 88.000 158.745 88.000 172.000 ZM 80.000 172.000 C 80.000 163.163 72.837 156.000 64.000 156.000 L 52.000 156.000 L 52.000 188.000 L 64.000 188.000 C 72.837 188.000 80.000 180.837 80.000 172.000 ZM 160.000 180.000 C 160.000 197.673 145.673 212.000 128.000 212.000 L 112.000 212.000 C 109.791 212.000 108.000 210.209 108.000 208.000 L 108.000 152.000 C 108.000 149.791 109.791 148.000 112.000 148.000 L 128.000 148.000 C 145.673 148.000 160.000 162.327 160.000 180.000 ZM 152.000 180.000 C 152.000 166.745 141.255 156.000 128.000 156.000 L 116.000 156.000 L 116.000 204.000 L 128.000 204.000 C 141.255 204.000 152.000 193.255 152.000 180.000 ZM 44.000 112.000 L 44.000 40.000 C 44.000 33.373 49.373 28.000 56.000 28.000 L 152.000 28.000 C 153.061 27.999 154.079 28.420 154.830 29.170 L 210.830 85.170 C 211.580 85.921 212.001 86.939 212.000 88.000 L 212.000 112.000 C 212.000 114.209 210.209 116.000 208.000 116.000 C 205.791 116.000 204.000 114.209 204.000 112.000 L 204.000 92.000 L 152.000 92.000 C 149.791 92.000 148.000 90.209 148.000 88.000 L 148.000 36.000 L 56.000 36.000 C 53.791 36.000 52.000 37.791 52.000 40.000 L 52.000 112.000 C 52.000 114.209 50.209 116.000 48.000 116.000 C 45.791 116.000 44.000 114.209 44.000 112.000 ZM 156.000 84.000 L 198.340 84.000 L 156.000 41.650 Z"),
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
        return _filePdf!!
    }

private var _filePdf: ImageVector? = null
