package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Lectern: ImageVector
    get() {
        if (_lectern != null) return _lectern!!
        _lectern = phosphorBoldIcon(
            name = "Lectern",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 249.870 119.060 L 209.870 39.060 C 206.506 32.270 199.577 27.982 192.000 28.000 L 64.000 28.000 C 56.423 27.982 49.494 32.270 46.130 39.060 L 6.130 119.060 C 3.034 125.256 3.364 132.614 7.003 138.508 C 10.643 144.402 17.073 147.993 24.000 148.000 L 116.000 148.000 L 116.000 204.000 L 96.000 204.000 C 89.373 204.000 84.000 209.373 84.000 216.000 C 84.000 222.627 89.373 228.000 96.000 228.000 L 160.000 228.000 C 166.627 228.000 172.000 222.627 172.000 216.000 C 172.000 209.373 166.627 204.000 160.000 204.000 L 140.000 204.000 L 140.000 148.000 L 232.000 148.000 C 238.931 148.000 245.367 144.411 249.011 138.516 C 252.655 132.621 252.988 125.260 249.890 119.060 ZM 30.490 124.000 L 66.490 52.000 L 189.490 52.000 L 225.490 124.000 ZM 192.000 100.000 C 192.000 106.627 186.627 112.000 180.000 112.000 L 76.000 112.000 C 69.373 112.000 64.000 106.627 64.000 100.000 C 64.000 93.373 69.373 88.000 76.000 88.000 L 180.000 88.000 C 186.627 88.000 192.000 93.373 192.000 100.000 Z"),
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
        return _lectern!!
    }

private var _lectern: ImageVector? = null
