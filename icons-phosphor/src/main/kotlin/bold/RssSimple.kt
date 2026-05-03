package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.RssSimple: ImageVector
    get() {
        if (_rssSimple != null) return _rssSimple!!
        _rssSimple = phosphorBoldIcon(
            name = "RssSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.000 192.000 C 228.000 198.627 222.627 204.000 216.000 204.000 C 209.373 204.000 204.000 198.627 204.000 192.000 C 204.000 114.800 141.200 52.000 64.000 52.000 C 57.373 52.000 52.000 46.627 52.000 40.000 C 52.000 33.373 57.373 28.000 64.000 28.000 C 154.430 28.000 228.000 101.570 228.000 192.000 ZM 64.000 100.000 C 57.373 100.000 52.000 105.373 52.000 112.000 C 52.000 118.627 57.373 124.000 64.000 124.000 C 101.539 124.039 131.961 154.461 132.000 192.000 C 132.000 198.627 137.373 204.000 144.000 204.000 C 150.627 204.000 156.000 198.627 156.000 192.000 C 155.945 141.213 114.787 100.055 64.000 100.000 ZM 68.000 172.000 C 59.163 172.000 52.000 179.163 52.000 188.000 C 52.000 196.837 59.163 204.000 68.000 204.000 C 76.837 204.000 84.000 196.837 84.000 188.000 C 84.000 179.163 76.837 172.000 68.000 172.000 Z"),
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
        return _rssSimple!!
    }

private var _rssSimple: ImageVector? = null
