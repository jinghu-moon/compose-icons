package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Devices: ImageVector
    get() {
        if (_devices != null) return _devices!!
        _devices = phosphorThinIcon(
            name = "Devices",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 76.000 L 204.000 76.000 L 204.000 64.000 C 204.000 52.954 195.046 44.000 184.000 44.000 L 40.000 44.000 C 28.954 44.000 20.000 52.954 20.000 64.000 L 20.000 160.000 C 20.000 171.046 28.954 180.000 40.000 180.000 L 156.000 180.000 L 156.000 192.000 C 156.000 203.046 164.954 212.000 176.000 212.000 L 224.000 212.000 C 235.046 212.000 244.000 203.046 244.000 192.000 L 244.000 96.000 C 244.000 84.954 235.046 76.000 224.000 76.000 ZM 40.000 172.000 C 33.373 172.000 28.000 166.627 28.000 160.000 L 28.000 64.000 C 28.000 57.373 33.373 52.000 40.000 52.000 L 184.000 52.000 C 190.627 52.000 196.000 57.373 196.000 64.000 L 196.000 76.000 L 176.000 76.000 C 164.954 76.000 156.000 84.954 156.000 96.000 L 156.000 172.000 ZM 236.000 192.000 C 236.000 198.627 230.627 204.000 224.000 204.000 L 176.000 204.000 C 169.373 204.000 164.000 198.627 164.000 192.000 L 164.000 96.000 C 164.000 89.373 169.373 84.000 176.000 84.000 L 224.000 84.000 C 230.627 84.000 236.000 89.373 236.000 96.000 ZM 132.000 208.000 C 132.000 210.209 130.209 212.000 128.000 212.000 L 88.000 212.000 C 85.791 212.000 84.000 210.209 84.000 208.000 C 84.000 205.791 85.791 204.000 88.000 204.000 L 128.000 204.000 C 130.209 204.000 132.000 205.791 132.000 208.000 ZM 212.000 112.000 C 212.000 114.209 210.209 116.000 208.000 116.000 L 192.000 116.000 C 189.791 116.000 188.000 114.209 188.000 112.000 C 188.000 109.791 189.791 108.000 192.000 108.000 L 208.000 108.000 C 210.209 108.000 212.000 109.791 212.000 112.000 Z"),
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
        return _devices!!
    }

private var _devices: ImageVector? = null
