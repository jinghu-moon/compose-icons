package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Dresser: ImageVector
    get() {
        if (_dresser != null) return _dresser!!
        _dresser = phosphorDuotoneIcon(
            name = "Dresser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 208.000 40.000 L 208.000 216.000 C 208.000 220.418 204.418 224.000 200.000 224.000 L 56.000 224.000 C 51.582 224.000 48.000 220.418 48.000 216.000 L 48.000 40.000 C 48.000 35.582 51.582 32.000 56.000 32.000 L 200.000 32.000 C 204.418 32.000 208.000 35.582 208.000 40.000 Z"),
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
        pathData = parseSvgPathData("M 144.000 192.000 C 144.000 196.418 140.418 200.000 136.000 200.000 L 120.000 200.000 C 115.582 200.000 112.000 196.418 112.000 192.000 C 112.000 187.582 115.582 184.000 120.000 184.000 L 136.000 184.000 C 140.418 184.000 144.000 187.582 144.000 192.000 ZM 120.000 72.000 L 136.000 72.000 C 140.418 72.000 144.000 68.418 144.000 64.000 C 144.000 59.582 140.418 56.000 136.000 56.000 L 120.000 56.000 C 115.582 56.000 112.000 59.582 112.000 64.000 C 112.000 68.418 115.582 72.000 120.000 72.000 ZM 136.000 120.000 L 120.000 120.000 C 115.582 120.000 112.000 123.582 112.000 128.000 C 112.000 132.418 115.582 136.000 120.000 136.000 L 136.000 136.000 C 140.418 136.000 144.000 132.418 144.000 128.000 C 144.000 123.582 140.418 120.000 136.000 120.000 ZM 216.000 40.000 L 216.000 216.000 C 216.000 224.837 208.837 232.000 200.000 232.000 L 56.000 232.000 C 47.163 232.000 40.000 224.837 40.000 216.000 L 40.000 40.000 C 40.000 31.163 47.163 24.000 56.000 24.000 L 200.000 24.000 C 208.837 24.000 216.000 31.163 216.000 40.000 ZM 56.000 152.000 L 200.000 152.000 L 200.000 104.000 L 56.000 104.000 ZM 56.000 40.000 L 56.000 88.000 L 200.000 88.000 L 200.000 40.000 ZM 200.000 216.000 L 200.000 168.000 L 56.000 168.000 L 56.000 216.000 L 200.000 216.000 Z"),
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
        return _dresser!!
    }

private var _dresser: ImageVector? = null
