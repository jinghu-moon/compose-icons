package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TextUnderline: ImageVector
    get() {
        if (_textUnderline != null) return _textUnderline!!
        _textUnderline = phosphorDuotoneIcon(
            name = "TextUnderline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 184.000 56.000 L 184.000 136.000 C 184.000 166.928 158.928 192.000 128.000 192.000 C 97.072 192.000 72.000 166.928 72.000 136.000 L 72.000 56.000 Z"),
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
        pathData = parseSvgPathData("M 200.000 224.000 C 200.000 228.418 196.418 232.000 192.000 232.000 L 64.000 232.000 C 59.582 232.000 56.000 228.418 56.000 224.000 C 56.000 219.582 59.582 216.000 64.000 216.000 L 192.000 216.000 C 196.418 216.000 200.000 219.582 200.000 224.000 ZM 128.000 200.000 C 163.330 199.961 191.961 171.330 192.000 136.000 L 192.000 56.000 C 192.000 51.582 188.418 48.000 184.000 48.000 C 179.582 48.000 176.000 51.582 176.000 56.000 L 176.000 136.000 C 176.000 162.510 154.510 184.000 128.000 184.000 C 101.490 184.000 80.000 162.510 80.000 136.000 L 80.000 56.000 C 80.000 51.582 76.418 48.000 72.000 48.000 C 67.582 48.000 64.000 51.582 64.000 56.000 L 64.000 136.000 C 64.039 171.330 92.670 199.961 128.000 200.000 Z"),
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
        return _textUnderline!!
    }

private var _textUnderline: ImageVector? = null
