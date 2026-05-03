package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowUUpLeft: ImageVector
    get() {
        if (_arrowUUpLeft != null) return _arrowUUpLeft!!
        _arrowUUpLeft = phosphorBoldIcon(
            name = "ArrowUUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 236.000 144.000 C 235.961 181.539 205.539 211.961 168.000 212.000 L 80.000 212.000 C 73.373 212.000 68.000 206.627 68.000 200.000 C 68.000 193.373 73.373 188.000 80.000 188.000 L 168.000 188.000 C 192.301 188.000 212.000 168.301 212.000 144.000 C 212.000 119.699 192.301 100.000 168.000 100.000 L 61.000 100.000 L 88.520 127.510 C 93.214 132.204 93.214 139.816 88.520 144.510 C 83.826 149.204 76.214 149.204 71.520 144.510 L 23.520 96.510 C 21.261 94.258 19.991 91.200 19.991 88.010 C 19.991 84.820 21.261 81.762 23.520 79.510 L 71.520 31.510 C 76.214 26.816 83.826 26.816 88.520 31.510 C 93.214 36.204 93.214 43.816 88.520 48.510 L 61.000 76.000 L 168.000 76.000 C 205.537 76.044 235.956 106.463 236.000 144.000 Z"),
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
        return _arrowUUpLeft!!
    }

private var _arrowUUpLeft: ImageVector? = null
