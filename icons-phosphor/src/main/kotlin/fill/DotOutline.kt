package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.DotOutline: ImageVector
    get() {
        if (_dotOutline != null) return _dotOutline!!
        _dotOutline = phosphorFillIcon(
            name = "DotOutline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 156.000 128.000 C 156.000 143.464 143.464 156.000 128.000 156.000 C 112.536 156.000 100.000 143.464 100.000 128.000 C 100.000 112.536 112.536 100.000 128.000 100.000 C 143.464 100.000 156.000 112.536 156.000 128.000 Z"),
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
        return _dotOutline!!
    }

private var _dotOutline: ImageVector? = null
