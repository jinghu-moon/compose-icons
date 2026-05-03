package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CassetteTape: ImageVector
    get() {
        if (_cassetteTape != null) return _cassetteTape!!
        _cassetteTape = phosphorBoldIcon(
            name = "CassetteTape",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 44.000 L 32.000 44.000 C 20.954 44.000 12.000 52.954 12.000 64.000 L 12.000 192.000 C 12.000 203.046 20.954 212.000 32.000 212.000 L 224.000 212.000 C 235.046 212.000 244.000 203.046 244.000 192.000 L 244.000 64.000 C 244.000 52.954 235.046 44.000 224.000 44.000 ZM 220.000 188.000 L 183.000 188.000 L 170.400 171.200 C 168.889 169.186 166.518 168.000 164.000 168.000 L 92.000 168.000 C 89.482 168.000 87.111 169.186 85.600 171.200 L 73.000 188.000 L 36.000 188.000 L 36.000 68.000 L 220.000 68.000 ZM 82.000 152.000 L 174.000 152.000 C 192.778 152.000 208.000 136.778 208.000 118.000 C 208.000 99.222 192.778 84.000 174.000 84.000 L 82.000 84.000 C 63.222 84.000 48.000 99.222 48.000 118.000 C 48.000 136.778 63.222 152.000 82.000 152.000 ZM 82.000 108.000 C 87.523 108.000 92.000 112.477 92.000 118.000 C 92.000 123.523 87.523 128.000 82.000 128.000 C 76.477 128.000 72.000 123.523 72.000 118.000 C 72.000 112.477 76.477 108.000 82.000 108.000 ZM 184.000 118.000 C 184.000 123.523 179.523 128.000 174.000 128.000 C 168.477 128.000 164.000 123.523 164.000 118.000 C 164.000 112.477 168.477 108.000 174.000 108.000 C 179.523 108.000 184.000 112.477 184.000 118.000 ZM 141.500 128.000 L 114.500 128.000 C 116.500 121.483 116.500 114.517 114.500 108.000 L 141.500 108.000 C 139.500 114.517 139.500 121.483 141.500 128.000 Z"),
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
        return _cassetteTape!!
    }

private var _cassetteTape: ImageVector? = null
