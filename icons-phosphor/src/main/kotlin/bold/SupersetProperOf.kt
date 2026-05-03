package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SupersetProperOf: ImageVector
    get() {
        if (_supersetProperOf != null) return _supersetProperOf!!
        _supersetProperOf = phosphorBoldIcon(
            name = "SupersetProperOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.000 128.000 C 227.945 178.787 186.787 219.945 136.000 220.000 L 64.000 220.000 C 57.373 220.000 52.000 214.627 52.000 208.000 C 52.000 201.373 57.373 196.000 64.000 196.000 L 136.000 196.000 C 173.555 196.000 204.000 165.555 204.000 128.000 C 204.000 90.445 173.555 60.000 136.000 60.000 L 64.000 60.000 C 57.373 60.000 52.000 54.627 52.000 48.000 C 52.000 41.373 57.373 36.000 64.000 36.000 L 136.000 36.000 C 186.787 36.055 227.945 77.213 228.000 128.000 Z"),
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
        return _supersetProperOf!!
    }

private var _supersetProperOf: ImageVector? = null
