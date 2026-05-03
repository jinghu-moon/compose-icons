package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LadderSimple: ImageVector
    get() {
        if (_ladderSimple != null) return _ladderSimple!!
        _ladderSimple = phosphorFillIcon(
            name = "LadderSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 192.000 24.000 C 187.582 24.000 184.000 27.582 184.000 32.000 L 184.000 40.000 L 72.000 40.000 L 72.000 32.000 C 72.000 27.582 68.418 24.000 64.000 24.000 C 59.582 24.000 56.000 27.582 56.000 32.000 L 56.000 224.000 C 56.000 228.418 59.582 232.000 64.000 232.000 C 68.418 232.000 72.000 228.418 72.000 224.000 L 72.000 216.000 L 184.000 216.000 L 184.000 224.000 C 184.000 228.418 187.582 232.000 192.000 232.000 C 196.418 232.000 200.000 228.418 200.000 224.000 L 200.000 32.000 C 200.000 27.582 196.418 24.000 192.000 24.000 ZM 176.000 184.000 L 80.000 184.000 C 75.582 184.000 72.000 180.418 72.000 176.000 C 72.000 171.582 75.582 168.000 80.000 168.000 L 176.000 168.000 C 180.418 168.000 184.000 171.582 184.000 176.000 C 184.000 180.418 180.418 184.000 176.000 184.000 ZM 176.000 136.000 L 80.000 136.000 C 75.582 136.000 72.000 132.418 72.000 128.000 C 72.000 123.582 75.582 120.000 80.000 120.000 L 176.000 120.000 C 180.418 120.000 184.000 123.582 184.000 128.000 C 184.000 132.418 180.418 136.000 176.000 136.000 ZM 176.000 88.000 L 80.000 88.000 C 75.582 88.000 72.000 84.418 72.000 80.000 C 72.000 75.582 75.582 72.000 80.000 72.000 L 176.000 72.000 C 180.418 72.000 184.000 75.582 184.000 80.000 C 184.000 84.418 180.418 88.000 176.000 88.000 Z"),
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
        return _ladderSimple!!
    }

private var _ladderSimple: ImageVector? = null
