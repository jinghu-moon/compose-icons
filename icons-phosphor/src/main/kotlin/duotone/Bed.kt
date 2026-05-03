package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Bed: ImageVector
    get() {
        if (_bed != null) return _bed!!
        _bed = phosphorDuotoneIcon(
            name = "Bed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 248.000 112.000 L 248.000 168.000 L 112.000 168.000 L 112.000 80.000 L 216.000 80.000 C 233.673 80.000 248.000 94.327 248.000 112.000 Z"),
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
        pathData = parseSvgPathData("M 216.000 72.000 L 32.000 72.000 L 32.000 48.000 C 32.000 43.582 28.418 40.000 24.000 40.000 C 19.582 40.000 16.000 43.582 16.000 48.000 L 16.000 208.000 C 16.000 212.418 19.582 216.000 24.000 216.000 C 28.418 216.000 32.000 212.418 32.000 208.000 L 32.000 176.000 L 240.000 176.000 L 240.000 208.000 C 240.000 212.418 243.582 216.000 248.000 216.000 C 252.418 216.000 256.000 212.418 256.000 208.000 L 256.000 112.000 C 256.000 89.909 238.091 72.000 216.000 72.000 ZM 32.000 88.000 L 104.000 88.000 L 104.000 160.000 L 32.000 160.000 ZM 120.000 160.000 L 120.000 88.000 L 216.000 88.000 C 229.255 88.000 240.000 98.745 240.000 112.000 L 240.000 160.000 Z"),
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
        return _bed!!
    }

private var _bed: ImageVector? = null
