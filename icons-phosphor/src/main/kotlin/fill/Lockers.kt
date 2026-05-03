package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Lockers: ImageVector
    get() {
        if (_lockers != null) return _lockers!!
        _lockers = phosphorFillIcon(
            name = "Lockers",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 224.000 C 32.000 228.418 35.582 232.000 40.000 232.000 C 44.418 232.000 48.000 228.418 48.000 224.000 L 48.000 208.000 L 120.000 208.000 L 120.000 224.000 C 120.000 228.418 123.582 232.000 128.000 232.000 C 132.418 232.000 136.000 228.418 136.000 224.000 L 136.000 208.000 L 208.000 208.000 L 208.000 224.000 C 208.000 228.418 211.582 232.000 216.000 232.000 C 220.418 232.000 224.000 228.418 224.000 224.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 96.000 112.000 L 56.000 112.000 C 51.582 112.000 48.000 108.418 48.000 104.000 C 48.000 99.582 51.582 96.000 56.000 96.000 L 96.000 96.000 C 100.418 96.000 104.000 99.582 104.000 104.000 C 104.000 108.418 100.418 112.000 96.000 112.000 ZM 96.000 80.000 L 56.000 80.000 C 51.582 80.000 48.000 76.418 48.000 72.000 C 48.000 67.582 51.582 64.000 56.000 64.000 L 96.000 64.000 C 100.418 64.000 104.000 67.582 104.000 72.000 C 104.000 76.418 100.418 80.000 96.000 80.000 ZM 136.000 184.000 C 136.000 188.418 132.418 192.000 128.000 192.000 C 123.582 192.000 120.000 188.418 120.000 184.000 L 120.000 56.000 C 120.000 51.582 123.582 48.000 128.000 48.000 C 132.418 48.000 136.000 51.582 136.000 56.000 ZM 200.000 112.000 L 160.000 112.000 C 155.582 112.000 152.000 108.418 152.000 104.000 C 152.000 99.582 155.582 96.000 160.000 96.000 L 200.000 96.000 C 204.418 96.000 208.000 99.582 208.000 104.000 C 208.000 108.418 204.418 112.000 200.000 112.000 ZM 200.000 80.000 L 160.000 80.000 C 155.582 80.000 152.000 76.418 152.000 72.000 C 152.000 67.582 155.582 64.000 160.000 64.000 L 200.000 64.000 C 204.418 64.000 208.000 67.582 208.000 72.000 C 208.000 76.418 204.418 80.000 200.000 80.000 Z"),
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
        return _lockers!!
    }

private var _lockers: ImageVector? = null
