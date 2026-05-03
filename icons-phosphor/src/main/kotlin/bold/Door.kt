package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Door: ImageVector
    get() {
        if (_door != null) return _door!!
        _door = phosphorBoldIcon(
            name = "Door",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 212.000 L 212.000 212.000 L 212.000 40.000 C 212.000 28.954 203.046 20.000 192.000 20.000 L 64.000 20.000 C 52.954 20.000 44.000 28.954 44.000 40.000 L 44.000 212.000 L 24.000 212.000 C 17.373 212.000 12.000 217.373 12.000 224.000 C 12.000 230.627 17.373 236.000 24.000 236.000 L 232.000 236.000 C 238.627 236.000 244.000 230.627 244.000 224.000 C 244.000 217.373 238.627 212.000 232.000 212.000 ZM 68.000 44.000 L 188.000 44.000 L 188.000 212.000 L 68.000 212.000 ZM 172.000 132.000 C 172.000 140.837 164.837 148.000 156.000 148.000 C 147.163 148.000 140.000 140.837 140.000 132.000 C 140.000 123.163 147.163 116.000 156.000 116.000 C 164.837 116.000 172.000 123.163 172.000 132.000 Z"),
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
        return _door!!
    }

private var _door: ImageVector? = null
