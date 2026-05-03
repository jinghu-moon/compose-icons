package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Taxi: ImageVector
    get() {
        if (_taxi != null) return _taxi!!
        _taxi = phosphorBoldIcon(
            name = "Taxi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 100.000 L 231.000 100.000 L 204.720 54.080 C 201.161 47.849 194.536 44.002 187.360 44.000 L 168.120 44.000 L 157.120 16.570 C 154.109 8.969 146.755 3.984 138.580 4.000 L 117.420 4.000 C 109.234 3.972 101.865 8.959 98.850 16.570 L 87.880 44.000 L 68.640 44.000 C 61.464 44.002 54.839 47.849 51.280 54.080 L 25.000 100.000 L 16.000 100.000 C 9.373 100.000 4.000 105.373 4.000 112.000 C 4.000 118.627 9.373 124.000 16.000 124.000 L 20.000 124.000 L 20.000 200.000 C 20.000 211.046 28.954 220.000 40.000 220.000 L 68.000 220.000 C 79.046 220.000 88.000 211.046 88.000 200.000 L 88.000 180.000 L 168.000 180.000 L 168.000 200.000 C 168.000 211.046 176.954 220.000 188.000 220.000 L 216.000 220.000 C 227.046 220.000 236.000 211.046 236.000 200.000 L 236.000 124.000 L 240.000 124.000 C 246.627 124.000 252.000 118.627 252.000 112.000 C 252.000 105.373 246.627 100.000 240.000 100.000 ZM 120.120 28.000 L 135.880 28.000 L 142.280 44.000 L 113.720 44.000 ZM 71.000 68.000 L 185.000 68.000 L 203.280 100.000 L 52.680 100.000 ZM 64.000 196.000 L 44.000 196.000 L 44.000 180.000 L 64.000 180.000 ZM 212.000 196.000 L 192.000 196.000 L 192.000 180.000 L 212.000 180.000 ZM 212.000 156.000 L 44.000 156.000 L 44.000 124.000 L 212.000 124.000 Z"),
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
        return _taxi!!
    }

private var _taxi: ImageVector? = null
