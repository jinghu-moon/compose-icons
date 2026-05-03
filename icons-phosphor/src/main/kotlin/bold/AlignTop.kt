package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AlignTop: ImageVector
    get() {
        if (_alignTop != null) return _alignTop!!
        _alignTop = phosphorBoldIcon(
            name = "AlignTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.000 40.000 C 228.000 46.627 222.627 52.000 216.000 52.000 L 40.000 52.000 C 33.373 52.000 28.000 46.627 28.000 40.000 C 28.000 33.373 33.373 28.000 40.000 28.000 L 216.000 28.000 C 222.627 28.000 228.000 33.373 228.000 40.000 ZM 212.000 88.000 L 212.000 176.000 C 212.000 187.046 203.046 196.000 192.000 196.000 L 156.000 196.000 C 144.954 196.000 136.000 187.046 136.000 176.000 L 136.000 88.000 C 136.000 76.954 144.954 68.000 156.000 68.000 L 192.000 68.000 C 203.046 68.000 212.000 76.954 212.000 88.000 ZM 188.000 92.000 L 160.000 92.000 L 160.000 172.000 L 188.000 172.000 ZM 120.000 88.000 L 120.000 216.000 C 120.000 227.046 111.046 236.000 100.000 236.000 L 64.000 236.000 C 52.954 236.000 44.000 227.046 44.000 216.000 L 44.000 88.000 C 44.000 76.954 52.954 68.000 64.000 68.000 L 100.000 68.000 C 111.046 68.000 120.000 76.954 120.000 88.000 ZM 96.000 92.000 L 68.000 92.000 L 68.000 212.000 L 96.000 212.000 Z"),
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
        return _alignTop!!
    }

private var _alignTop: ImageVector? = null
