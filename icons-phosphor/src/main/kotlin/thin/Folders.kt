package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Folders: ImageVector
    get() {
        if (_folders != null) return _folders!!
        _folders = phosphorThinIcon(
            name = "Folders",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 68.000 L 153.330 68.000 L 124.530 46.400 C 122.451 44.845 119.926 44.004 117.330 44.000 L 72.000 44.000 C 65.373 44.000 60.000 49.373 60.000 56.000 L 60.000 76.000 L 40.000 76.000 C 33.373 76.000 28.000 81.373 28.000 88.000 L 28.000 200.000 C 28.000 206.627 33.373 212.000 40.000 212.000 L 192.890 212.000 C 199.024 211.994 203.994 207.024 204.000 200.890 L 204.000 180.000 L 224.890 180.000 C 231.024 179.994 235.994 175.024 236.000 168.890 L 236.000 80.000 C 236.000 73.373 230.627 68.000 224.000 68.000 ZM 196.000 200.890 C 195.995 202.605 194.605 203.995 192.890 204.000 L 40.000 204.000 C 37.791 204.000 36.000 202.209 36.000 200.000 L 36.000 88.000 C 36.000 85.791 37.791 84.000 40.000 84.000 L 85.330 84.000 C 86.195 84.000 87.038 84.281 87.730 84.800 L 117.600 107.200 C 118.292 107.719 119.135 108.000 120.000 108.000 L 192.000 108.000 C 194.209 108.000 196.000 109.791 196.000 112.000 ZM 228.000 168.890 C 227.995 170.605 226.605 171.995 224.890 172.000 L 204.000 172.000 L 204.000 112.000 C 204.000 105.373 198.627 100.000 192.000 100.000 L 121.330 100.000 L 92.530 78.400 C 90.451 76.845 87.926 76.004 85.330 76.000 L 68.000 76.000 L 68.000 56.000 C 68.000 53.791 69.791 52.000 72.000 52.000 L 117.330 52.000 C 118.195 52.000 119.038 52.281 119.730 52.800 L 149.600 75.200 C 150.292 75.719 151.135 76.000 152.000 76.000 L 224.000 76.000 C 226.209 76.000 228.000 77.791 228.000 80.000 Z"),
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
        return _folders!!
    }

private var _folders: ImageVector? = null
