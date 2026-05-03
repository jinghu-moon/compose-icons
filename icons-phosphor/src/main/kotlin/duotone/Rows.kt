package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Rows: ImageVector
    get() {
        if (_rows != null) return _rows!!
        _rows = phosphorDuotoneIcon(
            name = "Rows",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 216.000 152.000 L 216.000 192.000 C 216.000 196.418 212.418 200.000 208.000 200.000 L 48.000 200.000 C 43.582 200.000 40.000 196.418 40.000 192.000 L 40.000 152.000 C 40.000 147.582 43.582 144.000 48.000 144.000 L 208.000 144.000 C 212.418 144.000 216.000 147.582 216.000 152.000 ZM 208.000 56.000 L 48.000 56.000 C 43.582 56.000 40.000 59.582 40.000 64.000 L 40.000 104.000 C 40.000 108.418 43.582 112.000 48.000 112.000 L 208.000 112.000 C 212.418 112.000 216.000 108.418 216.000 104.000 L 216.000 64.000 C 216.000 59.582 212.418 56.000 208.000 56.000 Z"),
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
        pathData = parseSvgPathData("M 208.000 136.000 L 48.000 136.000 C 39.163 136.000 32.000 143.163 32.000 152.000 L 32.000 192.000 C 32.000 200.837 39.163 208.000 48.000 208.000 L 208.000 208.000 C 216.837 208.000 224.000 200.837 224.000 192.000 L 224.000 152.000 C 224.000 143.163 216.837 136.000 208.000 136.000 ZM 208.000 192.000 L 48.000 192.000 L 48.000 152.000 L 208.000 152.000 L 208.000 192.000 ZM 208.000 48.000 L 48.000 48.000 C 39.163 48.000 32.000 55.163 32.000 64.000 L 32.000 104.000 C 32.000 112.837 39.163 120.000 48.000 120.000 L 208.000 120.000 C 216.837 120.000 224.000 112.837 224.000 104.000 L 224.000 64.000 C 224.000 55.163 216.837 48.000 208.000 48.000 ZM 208.000 104.000 L 48.000 104.000 L 48.000 64.000 L 208.000 64.000 L 208.000 104.000 Z"),
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
        return _rows!!
    }

private var _rows: ImageVector? = null
