package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Lockers: ImageVector
    get() {
        if (_lockers != null) return _lockers!!
        _lockers = phosphorDuotoneIcon(
            name = "Lockers",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 216.000 48.000 L 216.000 200.000 L 40.000 200.000 L 40.000 48.000 C 40.000 43.582 43.582 40.000 48.000 40.000 L 208.000 40.000 C 212.418 40.000 216.000 43.582 216.000 48.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 192.000 72.000 C 192.000 76.418 188.418 80.000 184.000 80.000 L 160.000 80.000 C 155.582 80.000 152.000 76.418 152.000 72.000 C 152.000 67.582 155.582 64.000 160.000 64.000 L 184.000 64.000 C 188.418 64.000 192.000 67.582 192.000 72.000 ZM 184.000 96.000 L 160.000 96.000 C 155.582 96.000 152.000 99.582 152.000 104.000 C 152.000 108.418 155.582 112.000 160.000 112.000 L 184.000 112.000 C 188.418 112.000 192.000 108.418 192.000 104.000 C 192.000 99.582 188.418 96.000 184.000 96.000 ZM 72.000 80.000 L 96.000 80.000 C 100.418 80.000 104.000 76.418 104.000 72.000 C 104.000 67.582 100.418 64.000 96.000 64.000 L 72.000 64.000 C 67.582 64.000 64.000 67.582 64.000 72.000 C 64.000 76.418 67.582 80.000 72.000 80.000 ZM 96.000 96.000 L 72.000 96.000 C 67.582 96.000 64.000 99.582 64.000 104.000 C 64.000 108.418 67.582 112.000 72.000 112.000 L 96.000 112.000 C 100.418 112.000 104.000 108.418 104.000 104.000 C 104.000 99.582 100.418 96.000 96.000 96.000 ZM 224.000 48.000 L 224.000 224.000 C 224.000 228.418 220.418 232.000 216.000 232.000 C 211.582 232.000 208.000 228.418 208.000 224.000 L 208.000 208.000 L 136.000 208.000 L 136.000 224.000 C 136.000 228.418 132.418 232.000 128.000 232.000 C 123.582 232.000 120.000 228.418 120.000 224.000 L 120.000 208.000 L 48.000 208.000 L 48.000 224.000 C 48.000 228.418 44.418 232.000 40.000 232.000 C 35.582 232.000 32.000 228.418 32.000 224.000 L 32.000 48.000 C 32.000 39.163 39.163 32.000 48.000 32.000 L 208.000 32.000 C 216.837 32.000 224.000 39.163 224.000 48.000 ZM 120.000 192.000 L 120.000 48.000 L 48.000 48.000 L 48.000 192.000 ZM 136.000 192.000 L 208.000 192.000 L 208.000 48.000 L 136.000 48.000 Z"),
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
