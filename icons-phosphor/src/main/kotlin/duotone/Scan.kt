package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Scan: ImageVector
    get() {
        if (_scan != null) return _scan!!
        _scan = phosphorDuotoneIcon(
            name = "Scan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 176.000 80.000 L 176.000 176.000 L 80.000 176.000 L 80.000 80.000 Z"),
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
        pathData = parseSvgPathData("M 224.000 40.000 L 224.000 80.000 C 224.000 84.418 220.418 88.000 216.000 88.000 C 211.582 88.000 208.000 84.418 208.000 80.000 L 208.000 48.000 L 176.000 48.000 C 171.582 48.000 168.000 44.418 168.000 40.000 C 168.000 35.582 171.582 32.000 176.000 32.000 L 216.000 32.000 C 220.418 32.000 224.000 35.582 224.000 40.000 ZM 80.000 208.000 L 48.000 208.000 L 48.000 176.000 C 48.000 171.582 44.418 168.000 40.000 168.000 C 35.582 168.000 32.000 171.582 32.000 176.000 L 32.000 216.000 C 32.000 220.418 35.582 224.000 40.000 224.000 L 80.000 224.000 C 84.418 224.000 88.000 220.418 88.000 216.000 C 88.000 211.582 84.418 208.000 80.000 208.000 ZM 216.000 168.000 C 211.582 168.000 208.000 171.582 208.000 176.000 L 208.000 208.000 L 176.000 208.000 C 171.582 208.000 168.000 211.582 168.000 216.000 C 168.000 220.418 171.582 224.000 176.000 224.000 L 216.000 224.000 C 220.418 224.000 224.000 220.418 224.000 216.000 L 224.000 176.000 C 224.000 171.582 220.418 168.000 216.000 168.000 ZM 40.000 88.000 C 44.418 88.000 48.000 84.418 48.000 80.000 L 48.000 48.000 L 80.000 48.000 C 84.418 48.000 88.000 44.418 88.000 40.000 C 88.000 35.582 84.418 32.000 80.000 32.000 L 40.000 32.000 C 35.582 32.000 32.000 35.582 32.000 40.000 L 32.000 80.000 C 32.000 84.418 35.582 88.000 40.000 88.000 ZM 80.000 72.000 L 176.000 72.000 C 180.418 72.000 184.000 75.582 184.000 80.000 L 184.000 176.000 C 184.000 180.418 180.418 184.000 176.000 184.000 L 80.000 184.000 C 75.582 184.000 72.000 180.418 72.000 176.000 L 72.000 80.000 C 72.000 75.582 75.582 72.000 80.000 72.000 ZM 88.000 168.000 L 168.000 168.000 L 168.000 88.000 L 88.000 88.000 Z"),
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
        return _scan!!
    }

private var _scan: ImageVector? = null
