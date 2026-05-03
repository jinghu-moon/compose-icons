package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Divide: ImageVector
    get() {
        if (_divide != null) return _divide!!
        _divide = phosphorDuotoneIcon(
            name = "Divide",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 216.000 56.000 L 216.000 200.000 C 216.000 208.837 208.837 216.000 200.000 216.000 L 56.000 216.000 C 47.163 216.000 40.000 208.837 40.000 200.000 L 40.000 56.000 C 40.000 47.163 47.163 40.000 56.000 40.000 L 200.000 40.000 C 208.837 40.000 216.000 47.163 216.000 56.000 Z"),
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
        pathData = parseSvgPathData("M 224.000 128.000 C 224.000 132.418 220.418 136.000 216.000 136.000 L 40.000 136.000 C 35.582 136.000 32.000 132.418 32.000 128.000 C 32.000 123.582 35.582 120.000 40.000 120.000 L 216.000 120.000 C 220.418 120.000 224.000 123.582 224.000 128.000 ZM 128.000 80.000 C 136.837 80.000 144.000 72.837 144.000 64.000 C 144.000 55.163 136.837 48.000 128.000 48.000 C 119.163 48.000 112.000 55.163 112.000 64.000 C 112.000 72.837 119.163 80.000 128.000 80.000 ZM 128.000 176.000 C 119.163 176.000 112.000 183.163 112.000 192.000 C 112.000 200.837 119.163 208.000 128.000 208.000 C 136.837 208.000 144.000 200.837 144.000 192.000 C 144.000 183.163 136.837 176.000 128.000 176.000 Z"),
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
        return _divide!!
    }

private var _divide: ImageVector? = null
