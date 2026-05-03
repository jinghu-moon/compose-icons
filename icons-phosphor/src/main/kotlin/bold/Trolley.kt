package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Trolley: ImageVector
    get() {
        if (_trolley != null) return _trolley!!
        _trolley = phosphorBoldIcon(
            name = "Trolley",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 92.000 224.000 C 92.000 235.046 83.046 244.000 72.000 244.000 C 60.954 244.000 52.000 235.046 52.000 224.000 C 52.000 212.954 60.954 204.000 72.000 204.000 C 83.046 204.000 92.000 212.954 92.000 224.000 ZM 216.000 204.000 C 204.954 204.000 196.000 212.954 196.000 224.000 C 196.000 235.046 204.954 244.000 216.000 244.000 C 227.046 244.000 236.000 235.046 236.000 224.000 C 236.000 212.954 227.046 204.000 216.000 204.000 ZM 240.000 168.000 L 60.000 168.000 L 60.000 75.310 C 60.014 70.003 57.904 64.911 54.140 61.170 L 32.490 39.510 C 27.796 34.816 20.184 34.816 15.490 39.510 C 10.796 44.204 10.796 51.816 15.490 56.510 L 36.000 77.000 L 36.000 168.000 L 32.000 168.000 C 25.373 168.000 20.000 173.373 20.000 180.000 C 20.000 186.627 25.373 192.000 32.000 192.000 L 240.000 192.000 C 246.627 192.000 252.000 186.627 252.000 180.000 C 252.000 173.373 246.627 168.000 240.000 168.000 Z"),
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
        return _trolley!!
    }

private var _trolley: ImageVector? = null
