package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.DotsSix: ImageVector
    get() {
        if (_dotsSix != null) return _dotsSix!!
        _dotsSix = phosphorFillIcon(
            name = "DotsSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 48.000 L 32.000 48.000 C 23.163 48.000 16.000 55.163 16.000 64.000 L 16.000 192.000 C 16.000 200.837 23.163 208.000 32.000 208.000 L 224.000 208.000 C 232.837 208.000 240.000 200.837 240.000 192.000 L 240.000 64.000 C 240.000 55.163 232.837 48.000 224.000 48.000 ZM 68.000 168.000 C 61.373 168.000 56.000 162.627 56.000 156.000 C 56.000 149.373 61.373 144.000 68.000 144.000 C 74.627 144.000 80.000 149.373 80.000 156.000 C 80.000 162.627 74.627 168.000 68.000 168.000 ZM 68.000 112.000 C 61.373 112.000 56.000 106.627 56.000 100.000 C 56.000 93.373 61.373 88.000 68.000 88.000 C 74.627 88.000 80.000 93.373 80.000 100.000 C 80.000 106.627 74.627 112.000 68.000 112.000 ZM 128.000 168.000 C 121.373 168.000 116.000 162.627 116.000 156.000 C 116.000 149.373 121.373 144.000 128.000 144.000 C 134.627 144.000 140.000 149.373 140.000 156.000 C 140.000 162.627 134.627 168.000 128.000 168.000 ZM 128.000 112.000 C 121.373 112.000 116.000 106.627 116.000 100.000 C 116.000 93.373 121.373 88.000 128.000 88.000 C 134.627 88.000 140.000 93.373 140.000 100.000 C 140.000 106.627 134.627 112.000 128.000 112.000 ZM 188.000 168.000 C 181.373 168.000 176.000 162.627 176.000 156.000 C 176.000 149.373 181.373 144.000 188.000 144.000 C 194.627 144.000 200.000 149.373 200.000 156.000 C 200.000 162.627 194.627 168.000 188.000 168.000 ZM 188.000 112.000 C 181.373 112.000 176.000 106.627 176.000 100.000 C 176.000 93.373 181.373 88.000 188.000 88.000 C 194.627 88.000 200.000 93.373 200.000 100.000 C 200.000 106.627 194.627 112.000 188.000 112.000 Z"),
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
        return _dotsSix!!
    }

private var _dotsSix: ImageVector? = null
