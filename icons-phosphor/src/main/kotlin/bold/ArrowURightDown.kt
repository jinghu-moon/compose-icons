package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowURightDown: ImageVector
    get() {
        if (_arrowURightDown != null) return _arrowURightDown!!
        _arrowURightDown = phosphorBoldIcon(
            name = "ArrowURightDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.490 184.490 L 176.490 232.490 C 174.238 234.749 171.180 236.019 167.990 236.019 C 164.800 236.019 161.742 234.749 159.490 232.490 L 111.490 184.490 C 106.796 179.796 106.796 172.184 111.490 167.490 C 116.184 162.796 123.796 162.796 128.490 167.490 L 156.000 195.000 L 156.000 88.000 C 156.000 63.699 136.301 44.000 112.000 44.000 C 87.699 44.000 68.000 63.699 68.000 88.000 L 68.000 176.000 C 68.000 182.627 62.627 188.000 56.000 188.000 C 49.373 188.000 44.000 182.627 44.000 176.000 L 44.000 88.000 C 44.000 50.445 74.445 20.000 112.000 20.000 C 149.555 20.000 180.000 50.445 180.000 88.000 L 180.000 195.000 L 207.510 167.480 C 212.204 162.786 219.816 162.786 224.510 167.480 C 229.204 172.174 229.204 179.786 224.510 184.480 Z"),
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
        return _arrowURightDown!!
    }

private var _arrowURightDown: ImageVector? = null
