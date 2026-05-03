package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.LadderSimple: ImageVector
    get() {
        if (_ladderSimple != null) return _ladderSimple!!
        _ladderSimple = phosphorDuotoneIcon(
            name = "LadderSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 192.000 32.000 L 192.000 224.000 L 64.000 224.000 L 64.000 32.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 192.000 24.000 C 187.582 24.000 184.000 27.582 184.000 32.000 L 184.000 64.000 L 72.000 64.000 L 72.000 32.000 C 72.000 27.582 68.418 24.000 64.000 24.000 C 59.582 24.000 56.000 27.582 56.000 32.000 L 56.000 224.000 C 56.000 228.418 59.582 232.000 64.000 232.000 C 68.418 232.000 72.000 228.418 72.000 224.000 L 72.000 192.000 L 184.000 192.000 L 184.000 224.000 C 184.000 228.418 187.582 232.000 192.000 232.000 C 196.418 232.000 200.000 228.418 200.000 224.000 L 200.000 32.000 C 200.000 27.582 196.418 24.000 192.000 24.000 ZM 184.000 80.000 L 184.000 120.000 L 72.000 120.000 L 72.000 80.000 ZM 72.000 176.000 L 72.000 136.000 L 184.000 136.000 L 184.000 176.000 Z"),
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
        return _ladderSimple!!
    }

private var _ladderSimple: ImageVector? = null
