package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SupersetProperOf: ImageVector
    get() {
        if (_supersetProperOf != null) return _supersetProperOf!!
        _supersetProperOf = phosphorRegularIcon(
            name = "SupersetProperOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 128.000 C 223.945 176.578 184.578 215.945 136.000 216.000 L 64.000 216.000 C 59.582 216.000 56.000 212.418 56.000 208.000 C 56.000 203.582 59.582 200.000 64.000 200.000 L 136.000 200.000 C 175.764 200.000 208.000 167.764 208.000 128.000 C 208.000 88.235 175.764 56.000 136.000 56.000 L 64.000 56.000 C 59.582 56.000 56.000 52.418 56.000 48.000 C 56.000 43.582 59.582 40.000 64.000 40.000 L 136.000 40.000 C 184.578 40.055 223.945 79.422 224.000 128.000 Z"),
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
        return _supersetProperOf!!
    }

private var _supersetProperOf: ImageVector? = null
