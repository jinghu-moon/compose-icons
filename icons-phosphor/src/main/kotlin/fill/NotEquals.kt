package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NotEquals: ImageVector
    get() {
        if (_notEquals != null) return _notEquals!!
        _notEquals = phosphorFillIcon(
            name = "NotEquals",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 184.000 144.000 C 188.418 144.000 192.000 147.582 192.000 152.000 C 192.000 156.418 188.418 160.000 184.000 160.000 L 110.630 160.000 L 78.000 197.270 C 75.022 200.278 70.216 200.446 67.035 197.653 C 63.855 194.859 63.401 190.071 66.000 186.730 L 89.370 160.000 L 72.000 160.000 C 67.582 160.000 64.000 156.418 64.000 152.000 C 64.000 147.582 67.582 144.000 72.000 144.000 L 103.370 144.000 L 131.370 112.000 L 72.000 112.000 C 67.582 112.000 64.000 108.418 64.000 104.000 C 64.000 99.582 67.582 96.000 72.000 96.000 L 145.370 96.000 L 178.000 58.730 C 179.825 56.384 182.800 55.243 185.725 55.767 C 188.650 56.291 191.044 58.394 191.941 61.227 C 192.838 64.061 192.091 67.158 190.000 69.270 L 166.630 96.000 L 184.000 96.000 C 188.418 96.000 192.000 99.582 192.000 104.000 C 192.000 108.418 188.418 112.000 184.000 112.000 L 152.630 112.000 L 124.630 144.000 Z"),
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
        return _notEquals!!
    }

private var _notEquals: ImageVector? = null
