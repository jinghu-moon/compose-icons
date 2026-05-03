package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PlusMinus: ImageVector
    get() {
        if (_plusMinus != null) return _plusMinus!!
        _plusMinus = phosphorBoldIcon(
            name = "PlusMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.490 64.490 L 64.490 208.490 C 59.796 213.184 52.184 213.184 47.490 208.490 C 42.796 203.796 42.796 196.184 47.490 191.490 L 191.490 47.490 C 196.184 42.796 203.796 42.796 208.490 47.490 C 213.184 52.184 213.184 59.796 208.490 64.490 ZM 60.000 112.000 C 60.000 118.627 65.373 124.000 72.000 124.000 C 78.627 124.000 84.000 118.627 84.000 112.000 L 84.000 84.000 L 112.000 84.000 C 118.627 84.000 124.000 78.627 124.000 72.000 C 124.000 65.373 118.627 60.000 112.000 60.000 L 84.000 60.000 L 84.000 32.000 C 84.000 25.373 78.627 20.000 72.000 20.000 C 65.373 20.000 60.000 25.373 60.000 32.000 L 60.000 60.000 L 32.000 60.000 C 25.373 60.000 20.000 65.373 20.000 72.000 C 20.000 78.627 25.373 84.000 32.000 84.000 L 60.000 84.000 ZM 224.000 172.000 L 144.000 172.000 C 137.373 172.000 132.000 177.373 132.000 184.000 C 132.000 190.627 137.373 196.000 144.000 196.000 L 224.000 196.000 C 230.627 196.000 236.000 190.627 236.000 184.000 C 236.000 177.373 230.627 172.000 224.000 172.000 Z"),
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
        return _plusMinus!!
    }

private var _plusMinus: ImageVector? = null
