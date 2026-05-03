package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChartBar: ImageVector
    get() {
        if (_chartBar != null) return _chartBar!!
        _chartBar = phosphorFillIcon(
            name = "ChartBar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 208.000 C 232.000 212.418 228.418 216.000 224.000 216.000 L 32.000 216.000 C 27.582 216.000 24.000 212.418 24.000 208.000 C 24.000 203.582 27.582 200.000 32.000 200.000 L 40.000 200.000 L 40.000 136.000 C 40.000 131.582 43.582 128.000 48.000 128.000 L 72.000 128.000 C 76.418 128.000 80.000 131.582 80.000 136.000 L 80.000 200.000 L 96.000 200.000 L 96.000 88.000 C 96.000 83.582 99.582 80.000 104.000 80.000 L 136.000 80.000 C 140.418 80.000 144.000 83.582 144.000 88.000 L 144.000 200.000 L 160.000 200.000 L 160.000 40.000 C 160.000 35.582 163.582 32.000 168.000 32.000 L 208.000 32.000 C 212.418 32.000 216.000 35.582 216.000 40.000 L 216.000 200.000 L 224.000 200.000 C 228.418 200.000 232.000 203.582 232.000 208.000 Z"),
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
