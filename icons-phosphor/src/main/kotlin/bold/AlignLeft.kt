package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AlignLeft: ImageVector
    get() {
        if (_alignLeft != null) return _alignLeft!!
        _alignLeft = phosphorBoldIcon(
            name = "AlignLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 52.000 40.000 L 52.000 216.000 C 52.000 222.627 46.627 228.000 40.000 228.000 C 33.373 228.000 28.000 222.627 28.000 216.000 L 28.000 40.000 C 28.000 33.373 33.373 28.000 40.000 28.000 C 46.627 28.000 52.000 33.373 52.000 40.000 ZM 68.000 100.000 L 68.000 64.000 C 68.000 52.954 76.954 44.000 88.000 44.000 L 176.000 44.000 C 187.046 44.000 196.000 52.954 196.000 64.000 L 196.000 100.000 C 196.000 111.046 187.046 120.000 176.000 120.000 L 88.000 120.000 C 76.954 120.000 68.000 111.046 68.000 100.000 ZM 92.000 96.000 L 172.000 96.000 L 172.000 68.000 L 92.000 68.000 ZM 236.000 156.000 L 236.000 192.000 C 236.000 203.046 227.046 212.000 216.000 212.000 L 88.000 212.000 C 76.954 212.000 68.000 203.046 68.000 192.000 L 68.000 156.000 C 68.000 144.954 76.954 136.000 88.000 136.000 L 216.000 136.000 C 227.046 136.000 236.000 144.954 236.000 156.000 ZM 212.000 160.000 L 92.000 160.000 L 92.000 188.000 L 212.000 188.000 Z"),
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
        return _alignLeft!!
    }

private var _alignLeft: ImageVector? = null
