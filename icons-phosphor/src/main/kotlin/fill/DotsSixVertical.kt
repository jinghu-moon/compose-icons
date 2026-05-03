package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.DotsSixVertical: ImageVector
    get() {
        if (_dotsSixVertical != null) return _dotsSixVertical!!
        _dotsSixVertical = phosphorFillIcon(
            name = "DotsSixVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 192.000 16.000 L 64.000 16.000 C 55.163 16.000 48.000 23.163 48.000 32.000 L 48.000 224.000 C 48.000 232.837 55.163 240.000 64.000 240.000 L 192.000 240.000 C 200.837 240.000 208.000 232.837 208.000 224.000 L 208.000 32.000 C 208.000 23.163 200.837 16.000 192.000 16.000 ZM 100.000 200.000 C 93.373 200.000 88.000 194.627 88.000 188.000 C 88.000 181.373 93.373 176.000 100.000 176.000 C 106.627 176.000 112.000 181.373 112.000 188.000 C 112.000 194.627 106.627 200.000 100.000 200.000 ZM 100.000 140.000 C 93.373 140.000 88.000 134.627 88.000 128.000 C 88.000 121.373 93.373 116.000 100.000 116.000 C 106.627 116.000 112.000 121.373 112.000 128.000 C 112.000 134.627 106.627 140.000 100.000 140.000 ZM 100.000 80.000 C 93.373 80.000 88.000 74.627 88.000 68.000 C 88.000 61.373 93.373 56.000 100.000 56.000 C 106.627 56.000 112.000 61.373 112.000 68.000 C 112.000 74.627 106.627 80.000 100.000 80.000 ZM 156.000 200.000 C 149.373 200.000 144.000 194.627 144.000 188.000 C 144.000 181.373 149.373 176.000 156.000 176.000 C 162.627 176.000 168.000 181.373 168.000 188.000 C 168.000 194.627 162.627 200.000 156.000 200.000 ZM 156.000 140.000 C 149.373 140.000 144.000 134.627 144.000 128.000 C 144.000 121.373 149.373 116.000 156.000 116.000 C 162.627 116.000 168.000 121.373 168.000 128.000 C 168.000 134.627 162.627 140.000 156.000 140.000 ZM 156.000 80.000 C 149.373 80.000 144.000 74.627 144.000 68.000 C 144.000 61.373 149.373 56.000 156.000 56.000 C 162.627 56.000 168.000 61.373 168.000 68.000 C 168.000 74.627 162.627 80.000 156.000 80.000 Z"),
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
        return _dotsSixVertical!!
    }

private var _dotsSixVertical: ImageVector? = null
