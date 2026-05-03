package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CellSignalMedium: ImageVector
    get() {
        if (_cellSignalMedium != null) return _cellSignalMedium!!
        _cellSignalMedium = phosphorBoldIcon(
            name = "CellSignalMedium",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 132.000 112.000 L 132.000 200.000 C 132.000 206.627 126.627 212.000 120.000 212.000 C 113.373 212.000 108.000 206.627 108.000 200.000 L 108.000 112.000 C 108.000 105.373 113.373 100.000 120.000 100.000 C 126.627 100.000 132.000 105.373 132.000 112.000 ZM 80.000 140.000 C 73.373 140.000 68.000 145.373 68.000 152.000 L 68.000 200.000 C 68.000 206.627 73.373 212.000 80.000 212.000 C 86.627 212.000 92.000 206.627 92.000 200.000 L 92.000 152.000 C 92.000 145.373 86.627 140.000 80.000 140.000 ZM 40.000 180.000 C 33.373 180.000 28.000 185.373 28.000 192.000 L 28.000 200.000 C 28.000 206.627 33.373 212.000 40.000 212.000 C 46.627 212.000 52.000 206.627 52.000 200.000 L 52.000 192.000 C 52.000 185.373 46.627 180.000 40.000 180.000 Z"),
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
        return _cellSignalMedium!!
    }

private var _cellSignalMedium: ImageVector? = null
