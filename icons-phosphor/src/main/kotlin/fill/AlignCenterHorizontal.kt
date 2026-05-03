package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.AlignCenterHorizontal: ImageVector
    get() {
        if (_alignCenterHorizontal != null) return _alignCenterHorizontal!!
        _alignCenterHorizontal = phosphorFillIcon(
            name = "AlignCenterHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 152.000 L 224.000 192.000 C 224.000 200.837 216.837 208.000 208.000 208.000 L 136.000 208.000 L 136.000 224.000 C 136.000 228.418 132.418 232.000 128.000 232.000 C 123.582 232.000 120.000 228.418 120.000 224.000 L 120.000 208.000 L 48.000 208.000 C 39.163 208.000 32.000 200.837 32.000 192.000 L 32.000 152.000 C 32.000 143.163 39.163 136.000 48.000 136.000 L 120.000 136.000 L 120.000 120.000 L 72.000 120.000 C 63.163 120.000 56.000 112.837 56.000 104.000 L 56.000 64.000 C 56.000 55.163 63.163 48.000 72.000 48.000 L 120.000 48.000 L 120.000 32.000 C 120.000 27.582 123.582 24.000 128.000 24.000 C 132.418 24.000 136.000 27.582 136.000 32.000 L 136.000 48.000 L 184.000 48.000 C 192.837 48.000 200.000 55.163 200.000 64.000 L 200.000 104.000 C 200.000 112.837 192.837 120.000 184.000 120.000 L 136.000 120.000 L 136.000 136.000 L 208.000 136.000 C 216.837 136.000 224.000 143.163 224.000 152.000 Z"),
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
        return _alignCenterHorizontal!!
    }

private var _alignCenterHorizontal: ImageVector? = null
