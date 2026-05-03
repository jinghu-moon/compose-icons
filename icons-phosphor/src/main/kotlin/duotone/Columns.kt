package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Columns: ImageVector
    get() {
        if (_columns != null) return _columns!!
        _columns = phosphorDuotoneIcon(
            name = "Columns",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 112.000 48.000 L 112.000 208.000 C 112.000 212.418 108.418 216.000 104.000 216.000 L 64.000 216.000 C 59.582 216.000 56.000 212.418 56.000 208.000 L 56.000 48.000 C 56.000 43.582 59.582 40.000 64.000 40.000 L 104.000 40.000 C 108.418 40.000 112.000 43.582 112.000 48.000 ZM 192.000 40.000 L 152.000 40.000 C 147.582 40.000 144.000 43.582 144.000 48.000 L 144.000 208.000 C 144.000 212.418 147.582 216.000 152.000 216.000 L 192.000 216.000 C 196.418 216.000 200.000 212.418 200.000 208.000 L 200.000 48.000 C 200.000 43.582 196.418 40.000 192.000 40.000 Z"),
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
        pathData = parseSvgPathData("M 104.000 32.000 L 64.000 32.000 C 55.163 32.000 48.000 39.163 48.000 48.000 L 48.000 208.000 C 48.000 216.837 55.163 224.000 64.000 224.000 L 104.000 224.000 C 112.837 224.000 120.000 216.837 120.000 208.000 L 120.000 48.000 C 120.000 39.163 112.837 32.000 104.000 32.000 ZM 104.000 208.000 L 64.000 208.000 L 64.000 48.000 L 104.000 48.000 ZM 192.000 32.000 L 152.000 32.000 C 143.163 32.000 136.000 39.163 136.000 48.000 L 136.000 208.000 C 136.000 216.837 143.163 224.000 152.000 224.000 L 192.000 224.000 C 200.837 224.000 208.000 216.837 208.000 208.000 L 208.000 48.000 C 208.000 39.163 200.837 32.000 192.000 32.000 ZM 192.000 208.000 L 152.000 208.000 L 152.000 48.000 L 192.000 48.000 Z"),
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
        return _columns!!
    }

private var _columns: ImageVector? = null
