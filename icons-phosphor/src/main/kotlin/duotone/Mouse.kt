package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Mouse: ImageVector
    get() {
        if (_mouse != null) return _mouse!!
        _mouse = phosphorDuotoneIcon(
            name = "Mouse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 200.000 112.000 L 200.000 176.000 C 200.000 206.928 174.928 232.000 144.000 232.000 L 112.000 232.000 C 81.072 232.000 56.000 206.928 56.000 176.000 L 56.000 112.000 Z"),
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
        pathData = parseSvgPathData("M 144.000 16.000 L 112.000 16.000 C 76.670 16.039 48.039 44.670 48.000 80.000 L 48.000 176.000 C 48.039 211.330 76.670 239.961 112.000 240.000 L 144.000 240.000 C 179.330 239.961 207.961 211.330 208.000 176.000 L 208.000 80.000 C 207.961 44.670 179.330 16.039 144.000 16.000 ZM 192.000 80.000 L 192.000 104.000 L 136.000 104.000 L 136.000 32.000 L 144.000 32.000 C 170.498 32.028 191.972 53.502 192.000 80.000 ZM 112.000 32.000 L 120.000 32.000 L 120.000 104.000 L 64.000 104.000 L 64.000 80.000 C 64.028 53.502 85.502 32.028 112.000 32.000 ZM 144.000 224.000 L 112.000 224.000 C 85.502 223.972 64.028 202.498 64.000 176.000 L 64.000 120.000 L 192.000 120.000 L 192.000 176.000 C 191.972 202.498 170.498 223.972 144.000 224.000 Z"),
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
        return _mouse!!
    }

private var _mouse: ImageVector? = null
