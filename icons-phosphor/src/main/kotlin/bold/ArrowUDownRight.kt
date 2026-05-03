package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowUDownRight: ImageVector
    get() {
        if (_arrowUDownRight != null) return _arrowUDownRight!!
        _arrowUDownRight = phosphorBoldIcon(
            name = "ArrowUDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.490 176.490 L 184.490 224.490 C 179.796 229.184 172.184 229.184 167.490 224.490 C 162.796 219.796 162.796 212.184 167.490 207.490 L 195.000 180.000 L 88.000 180.000 C 50.445 180.000 20.000 149.555 20.000 112.000 C 20.000 74.445 50.445 44.000 88.000 44.000 L 176.000 44.000 C 182.627 44.000 188.000 49.373 188.000 56.000 C 188.000 62.627 182.627 68.000 176.000 68.000 L 88.000 68.000 C 63.699 68.000 44.000 87.699 44.000 112.000 C 44.000 136.301 63.699 156.000 88.000 156.000 L 195.000 156.000 L 167.480 128.490 C 162.786 123.796 162.786 116.184 167.480 111.490 C 172.174 106.796 179.786 106.796 184.480 111.490 L 232.480 159.490 C 234.741 161.740 236.013 164.798 236.014 167.988 C 236.016 171.178 234.748 174.237 232.490 176.490 Z"),
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
        return _arrowUDownRight!!
    }

private var _arrowUDownRight: ImageVector? = null
