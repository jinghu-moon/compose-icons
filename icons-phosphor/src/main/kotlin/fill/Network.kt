package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Network: ImageVector
    get() {
        if (_network != null) return _network!!
        _network = phosphorFillIcon(
            name = "Network",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.000 120.000 C 240.000 124.418 236.418 128.000 232.000 128.000 L 200.000 128.000 L 200.000 160.000 L 208.000 160.000 C 216.837 160.000 224.000 167.163 224.000 176.000 L 224.000 208.000 C 224.000 216.837 216.837 224.000 208.000 224.000 L 176.000 224.000 C 167.163 224.000 160.000 216.837 160.000 208.000 L 160.000 176.000 C 160.000 167.163 167.163 160.000 176.000 160.000 L 184.000 160.000 L 184.000 128.000 L 72.000 128.000 L 72.000 160.000 L 80.000 160.000 C 88.837 160.000 96.000 167.163 96.000 176.000 L 96.000 208.000 C 96.000 216.837 88.837 224.000 80.000 224.000 L 48.000 224.000 C 39.163 224.000 32.000 216.837 32.000 208.000 L 32.000 176.000 C 32.000 167.163 39.163 160.000 48.000 160.000 L 56.000 160.000 L 56.000 128.000 L 24.000 128.000 C 19.582 128.000 16.000 124.418 16.000 120.000 C 16.000 115.582 19.582 112.000 24.000 112.000 L 120.000 112.000 L 120.000 88.000 L 112.000 88.000 C 103.163 88.000 96.000 80.837 96.000 72.000 L 96.000 40.000 C 96.000 31.163 103.163 24.000 112.000 24.000 L 144.000 24.000 C 152.837 24.000 160.000 31.163 160.000 40.000 L 160.000 72.000 C 160.000 80.837 152.837 88.000 144.000 88.000 L 136.000 88.000 L 136.000 112.000 L 232.000 112.000 C 236.418 112.000 240.000 115.582 240.000 120.000 Z"),
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
        return _network!!
    }

private var _network: ImageVector? = null
