package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SupersetProperOf: ImageVector
    get() {
        if (_supersetProperOf != null) return _supersetProperOf!!
        _supersetProperOf = phosphorThinIcon(
            name = "SupersetProperOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.000 128.000 C 219.950 174.371 182.371 211.950 136.000 212.000 L 64.000 212.000 C 61.791 212.000 60.000 210.209 60.000 208.000 C 60.000 205.791 61.791 204.000 64.000 204.000 L 136.000 204.000 C 177.974 204.000 212.000 169.974 212.000 128.000 C 212.000 86.026 177.974 52.000 136.000 52.000 L 64.000 52.000 C 61.791 52.000 60.000 50.209 60.000 48.000 C 60.000 45.791 61.791 44.000 64.000 44.000 L 136.000 44.000 C 182.371 44.050 219.950 81.629 220.000 128.000 Z"),
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
