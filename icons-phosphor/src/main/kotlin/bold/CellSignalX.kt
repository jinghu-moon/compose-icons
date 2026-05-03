package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CellSignalX: ImageVector
    get() {
        if (_cellSignalX != null) return _cellSignalX!!
        _cellSignalX = phosphorBoldIcon(
            name = "CellSignalX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.490 191.510 C 221.184 196.204 221.184 203.816 216.490 208.510 C 211.796 213.204 204.184 213.204 199.490 208.510 L 184.000 193.000 L 168.490 208.520 C 163.796 213.214 156.184 213.214 151.490 208.520 C 146.796 203.826 146.796 196.214 151.490 191.520 L 167.000 176.000 L 151.480 160.490 C 146.786 155.796 146.786 148.184 151.480 143.490 C 156.174 138.796 163.786 138.796 168.480 143.490 L 184.000 159.000 L 199.510 143.480 C 204.204 138.786 211.816 138.786 216.510 143.480 C 221.204 148.174 221.204 155.786 216.510 160.480 L 201.000 176.000 ZM 160.000 120.000 C 166.627 120.000 172.000 114.627 172.000 108.000 L 172.000 72.000 C 172.000 65.373 166.627 60.000 160.000 60.000 C 153.373 60.000 148.000 65.373 148.000 72.000 L 148.000 108.000 C 148.000 114.627 153.373 120.000 160.000 120.000 ZM 200.000 120.000 C 206.627 120.000 212.000 114.627 212.000 108.000 L 212.000 32.000 C 212.000 25.373 206.627 20.000 200.000 20.000 C 193.373 20.000 188.000 25.373 188.000 32.000 L 188.000 108.000 C 188.000 114.627 193.373 120.000 200.000 120.000 ZM 120.000 100.000 C 113.373 100.000 108.000 105.373 108.000 112.000 L 108.000 200.000 C 108.000 206.627 113.373 212.000 120.000 212.000 C 126.627 212.000 132.000 206.627 132.000 200.000 L 132.000 112.000 C 132.000 105.373 126.627 100.000 120.000 100.000 ZM 80.000 140.000 C 73.373 140.000 68.000 145.373 68.000 152.000 L 68.000 200.000 C 68.000 206.627 73.373 212.000 80.000 212.000 C 86.627 212.000 92.000 206.627 92.000 200.000 L 92.000 152.000 C 92.000 145.373 86.627 140.000 80.000 140.000 ZM 40.000 180.000 C 33.373 180.000 28.000 185.373 28.000 192.000 L 28.000 200.000 C 28.000 206.627 33.373 212.000 40.000 212.000 C 46.627 212.000 52.000 206.627 52.000 200.000 L 52.000 192.000 C 52.000 185.373 46.627 180.000 40.000 180.000 Z"),
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
        return _cellSignalX!!
    }

private var _cellSignalX: ImageVector? = null
