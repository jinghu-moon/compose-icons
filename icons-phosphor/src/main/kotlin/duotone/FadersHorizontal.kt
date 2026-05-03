package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FadersHorizontal: ImageVector
    get() {
        if (_fadersHorizontal != null) return _fadersHorizontal!!
        _fadersHorizontal = phosphorDuotoneIcon(
            name = "FadersHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 216.000 80.000 L 216.000 176.000 L 40.000 176.000 L 40.000 80.000 Z"),
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
        pathData = parseSvgPathData("M 176.000 80.000 C 176.000 75.582 179.582 72.000 184.000 72.000 L 216.000 72.000 C 220.418 72.000 224.000 75.582 224.000 80.000 C 224.000 84.418 220.418 88.000 216.000 88.000 L 184.000 88.000 C 179.582 88.000 176.000 84.418 176.000 80.000 ZM 40.000 88.000 L 144.000 88.000 L 144.000 104.000 C 144.000 108.418 147.582 112.000 152.000 112.000 C 156.418 112.000 160.000 108.418 160.000 104.000 L 160.000 56.000 C 160.000 51.582 156.418 48.000 152.000 48.000 C 147.582 48.000 144.000 51.582 144.000 56.000 L 144.000 72.000 L 40.000 72.000 C 35.582 72.000 32.000 75.582 32.000 80.000 C 32.000 84.418 35.582 88.000 40.000 88.000 ZM 216.000 168.000 L 120.000 168.000 C 115.582 168.000 112.000 171.582 112.000 176.000 C 112.000 180.418 115.582 184.000 120.000 184.000 L 216.000 184.000 C 220.418 184.000 224.000 180.418 224.000 176.000 C 224.000 171.582 220.418 168.000 216.000 168.000 ZM 88.000 144.000 C 83.582 144.000 80.000 147.582 80.000 152.000 L 80.000 168.000 L 40.000 168.000 C 35.582 168.000 32.000 171.582 32.000 176.000 C 32.000 180.418 35.582 184.000 40.000 184.000 L 80.000 184.000 L 80.000 200.000 C 80.000 204.418 83.582 208.000 88.000 208.000 C 92.418 208.000 96.000 204.418 96.000 200.000 L 96.000 152.000 C 96.000 147.582 92.418 144.000 88.000 144.000 Z"),
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
        return _fadersHorizontal!!
    }

private var _fadersHorizontal: ImageVector? = null
