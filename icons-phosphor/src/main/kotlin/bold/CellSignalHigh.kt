package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CellSignalHigh: ImageVector
    get() {
        if (_cellSignalHigh != null) return _cellSignalHigh!!
        _cellSignalHigh = phosphorBoldIcon(
            name = "CellSignalHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 172.000 72.000 L 172.000 200.000 C 172.000 206.627 166.627 212.000 160.000 212.000 C 153.373 212.000 148.000 206.627 148.000 200.000 L 148.000 72.000 C 148.000 65.373 153.373 60.000 160.000 60.000 C 166.627 60.000 172.000 65.373 172.000 72.000 ZM 120.000 100.000 C 113.373 100.000 108.000 105.373 108.000 112.000 L 108.000 200.000 C 108.000 206.627 113.373 212.000 120.000 212.000 C 126.627 212.000 132.000 206.627 132.000 200.000 L 132.000 112.000 C 132.000 105.373 126.627 100.000 120.000 100.000 ZM 80.000 140.000 C 73.373 140.000 68.000 145.373 68.000 152.000 L 68.000 200.000 C 68.000 206.627 73.373 212.000 80.000 212.000 C 86.627 212.000 92.000 206.627 92.000 200.000 L 92.000 152.000 C 92.000 145.373 86.627 140.000 80.000 140.000 ZM 40.000 180.000 C 33.373 180.000 28.000 185.373 28.000 192.000 L 28.000 200.000 C 28.000 206.627 33.373 212.000 40.000 212.000 C 46.627 212.000 52.000 206.627 52.000 200.000 L 52.000 192.000 C 52.000 185.373 46.627 180.000 40.000 180.000 Z"),
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
        return _cellSignalHigh!!
    }

private var _cellSignalHigh: ImageVector? = null
