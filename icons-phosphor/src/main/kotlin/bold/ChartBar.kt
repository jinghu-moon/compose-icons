package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChartBar: ImageVector
    get() {
        if (_chartBar != null) return _chartBar!!
        _chartBar = phosphorBoldIcon(
            name = "ChartBar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 196.000 L 220.000 196.000 L 220.000 40.000 C 220.000 33.373 214.627 28.000 208.000 28.000 L 152.000 28.000 C 145.373 28.000 140.000 33.373 140.000 40.000 L 140.000 76.000 L 96.000 76.000 C 89.373 76.000 84.000 81.373 84.000 88.000 L 84.000 124.000 L 48.000 124.000 C 41.373 124.000 36.000 129.373 36.000 136.000 L 36.000 196.000 L 32.000 196.000 C 25.373 196.000 20.000 201.373 20.000 208.000 C 20.000 214.627 25.373 220.000 32.000 220.000 L 224.000 220.000 C 230.627 220.000 236.000 214.627 236.000 208.000 C 236.000 201.373 230.627 196.000 224.000 196.000 ZM 164.000 52.000 L 196.000 52.000 L 196.000 196.000 L 164.000 196.000 ZM 108.000 100.000 L 140.000 100.000 L 140.000 196.000 L 108.000 196.000 ZM 60.000 148.000 L 84.000 148.000 L 84.000 196.000 L 60.000 196.000 Z"),
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
        return _chartBar!!
    }

private var _chartBar: ImageVector? = null
