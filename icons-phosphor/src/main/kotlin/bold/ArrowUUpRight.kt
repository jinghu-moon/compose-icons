package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowUUpRight: ImageVector
    get() {
        if (_arrowUUpRight != null) return _arrowUUpRight!!
        _arrowUUpRight = phosphorBoldIcon(
            name = "ArrowUUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 167.510 127.510 L 195.000 100.000 L 88.000 100.000 C 63.699 100.000 44.000 119.699 44.000 144.000 C 44.000 168.301 63.699 188.000 88.000 188.000 L 176.000 188.000 C 182.627 188.000 188.000 193.373 188.000 200.000 C 188.000 206.627 182.627 212.000 176.000 212.000 L 88.000 212.000 C 50.445 212.000 20.000 181.555 20.000 144.000 C 20.000 106.445 50.445 76.000 88.000 76.000 L 195.000 76.000 L 167.510 48.490 C 162.816 43.796 162.816 36.184 167.510 31.490 C 172.204 26.796 179.816 26.796 184.510 31.490 L 232.510 79.490 C 234.769 81.742 236.039 84.800 236.039 87.990 C 236.039 91.180 234.769 94.238 232.510 96.490 L 184.510 144.490 C 179.816 149.184 172.204 149.184 167.510 144.490 C 162.816 139.796 162.816 132.184 167.510 127.490 Z"),
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
        return _arrowUUpRight!!
    }

private var _arrowUUpRight: ImageVector? = null
