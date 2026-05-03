package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Pause: ImageVector
    get() {
        if (_pause != null) return _pause!!
        _pause = phosphorDuotoneIcon(
            name = "Pause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 208.000 48.000 L 208.000 208.000 C 208.000 212.418 204.418 216.000 200.000 216.000 L 160.000 216.000 C 155.582 216.000 152.000 212.418 152.000 208.000 L 152.000 48.000 C 152.000 43.582 155.582 40.000 160.000 40.000 L 200.000 40.000 C 204.418 40.000 208.000 43.582 208.000 48.000 ZM 96.000 40.000 L 56.000 40.000 C 51.582 40.000 48.000 43.582 48.000 48.000 L 48.000 208.000 C 48.000 212.418 51.582 216.000 56.000 216.000 L 96.000 216.000 C 100.418 216.000 104.000 212.418 104.000 208.000 L 104.000 48.000 C 104.000 43.582 100.418 40.000 96.000 40.000 Z"),
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
        pathData = parseSvgPathData("M 200.000 32.000 L 160.000 32.000 C 151.163 32.000 144.000 39.163 144.000 48.000 L 144.000 208.000 C 144.000 216.837 151.163 224.000 160.000 224.000 L 200.000 224.000 C 208.837 224.000 216.000 216.837 216.000 208.000 L 216.000 48.000 C 216.000 39.163 208.837 32.000 200.000 32.000 ZM 200.000 208.000 L 160.000 208.000 L 160.000 48.000 L 200.000 48.000 ZM 96.000 32.000 L 56.000 32.000 C 47.163 32.000 40.000 39.163 40.000 48.000 L 40.000 208.000 C 40.000 216.837 47.163 224.000 56.000 224.000 L 96.000 224.000 C 104.837 224.000 112.000 216.837 112.000 208.000 L 112.000 48.000 C 112.000 39.163 104.837 32.000 96.000 32.000 ZM 96.000 208.000 L 56.000 208.000 L 56.000 48.000 L 96.000 48.000 Z"),
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
        return _pause!!
    }

private var _pause: ImageVector? = null
