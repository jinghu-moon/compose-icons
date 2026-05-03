package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChartScatter: ImageVector
    get() {
        if (_chartScatter != null) return _chartScatter!!
        _chartScatter = phosphorFillIcon(
            name = "ChartScatter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 188.000 72.000 C 194.627 72.000 200.000 77.373 200.000 84.000 C 200.000 90.627 194.627 96.000 188.000 96.000 C 181.373 96.000 176.000 90.627 176.000 84.000 C 176.000 77.373 181.373 72.000 188.000 72.000 ZM 188.000 128.000 C 194.627 128.000 200.000 133.373 200.000 140.000 C 200.000 146.627 194.627 152.000 188.000 152.000 C 181.373 152.000 176.000 146.627 176.000 140.000 C 176.000 133.373 181.373 128.000 188.000 128.000 ZM 148.000 112.000 C 154.627 112.000 160.000 117.373 160.000 124.000 C 160.000 130.627 154.627 136.000 148.000 136.000 C 141.373 136.000 136.000 130.627 136.000 124.000 C 136.000 117.373 141.373 112.000 148.000 112.000 ZM 124.000 72.000 C 130.627 72.000 136.000 77.373 136.000 84.000 C 136.000 90.627 130.627 96.000 124.000 96.000 C 117.373 96.000 112.000 90.627 112.000 84.000 C 112.000 77.373 117.373 72.000 124.000 72.000 ZM 100.000 128.000 C 106.627 128.000 112.000 133.373 112.000 140.000 C 112.000 146.627 106.627 152.000 100.000 152.000 C 93.373 152.000 88.000 146.627 88.000 140.000 C 88.000 133.373 93.373 128.000 100.000 128.000 ZM 200.000 192.000 L 56.000 192.000 C 51.582 192.000 48.000 188.418 48.000 184.000 L 48.000 72.000 C 48.000 67.582 51.582 64.000 56.000 64.000 C 60.418 64.000 64.000 67.582 64.000 72.000 L 64.000 176.000 L 200.000 176.000 C 204.418 176.000 208.000 179.582 208.000 184.000 C 208.000 188.418 204.418 192.000 200.000 192.000 Z"),
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
        return _chartScatter!!
    }

private var _chartScatter: ImageVector? = null
