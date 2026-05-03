package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TrolleySuitcase: ImageVector
    get() {
        if (_trolleySuitcase != null) return _trolleySuitcase!!
        _trolleySuitcase = phosphorBoldIcon(
            name = "TrolleySuitcase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 96.000 156.000 L 216.000 156.000 C 227.046 156.000 236.000 147.046 236.000 136.000 L 236.000 76.000 C 236.000 64.954 227.046 56.000 216.000 56.000 L 192.000 56.000 L 192.000 40.000 C 192.000 28.954 183.046 20.000 172.000 20.000 L 140.000 20.000 C 128.954 20.000 120.000 28.954 120.000 40.000 L 120.000 56.000 L 96.000 56.000 C 84.954 56.000 76.000 64.954 76.000 76.000 L 76.000 136.000 C 76.000 147.046 84.954 156.000 96.000 156.000 ZM 144.000 44.000 L 168.000 44.000 L 168.000 56.000 L 144.000 56.000 ZM 100.000 80.000 L 212.000 80.000 L 212.000 132.000 L 100.000 132.000 ZM 92.000 224.000 C 92.000 235.046 83.046 244.000 72.000 244.000 C 60.954 244.000 52.000 235.046 52.000 224.000 C 52.000 212.954 60.954 204.000 72.000 204.000 C 83.046 204.000 92.000 212.954 92.000 224.000 ZM 236.000 224.000 C 236.000 235.046 227.046 244.000 216.000 244.000 C 204.954 244.000 196.000 235.046 196.000 224.000 C 196.000 212.954 204.954 204.000 216.000 204.000 C 227.046 204.000 236.000 212.954 236.000 224.000 ZM 252.000 180.000 C 252.000 186.627 246.627 192.000 240.000 192.000 L 32.000 192.000 C 25.373 192.000 20.000 186.627 20.000 180.000 C 20.000 173.373 25.373 168.000 32.000 168.000 L 36.000 168.000 L 36.000 77.000 L 15.510 56.490 C 10.816 51.796 10.816 44.184 15.510 39.490 C 20.204 34.796 27.816 34.796 32.510 39.490 L 54.140 61.170 C 57.904 64.911 60.014 70.003 60.000 75.310 L 60.000 168.000 L 240.000 168.000 C 246.627 168.000 252.000 173.373 252.000 180.000 Z"),
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
        return _trolleySuitcase!!
    }

private var _trolleySuitcase: ImageVector? = null
