package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Oven: ImageVector
    get() {
        if (_oven != null) return _oven!!
        _oven = phosphorFillIcon(
            name = "Oven",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 172.000 56.000 C 178.627 56.000 184.000 61.373 184.000 68.000 C 184.000 74.627 178.627 80.000 172.000 80.000 C 165.373 80.000 160.000 74.627 160.000 68.000 C 160.000 61.373 165.373 56.000 172.000 56.000 ZM 128.000 56.000 C 134.627 56.000 140.000 61.373 140.000 68.000 C 140.000 74.627 134.627 80.000 128.000 80.000 C 121.373 80.000 116.000 74.627 116.000 68.000 C 116.000 61.373 121.373 56.000 128.000 56.000 ZM 84.000 56.000 C 90.627 56.000 96.000 61.373 96.000 68.000 C 96.000 74.627 90.627 80.000 84.000 80.000 C 77.373 80.000 72.000 74.627 72.000 68.000 C 72.000 61.373 77.373 56.000 84.000 56.000 ZM 192.000 192.000 L 64.000 192.000 L 64.000 104.000 L 192.000 104.000 Z"),
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
        return _oven!!
    }

private var _oven: ImageVector? = null
