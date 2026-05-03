package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LineVertical: ImageVector
    get() {
        if (_lineVertical != null) return _lineVertical!!
        _lineVertical = phosphorThinIcon(
            name = "LineVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 132.000 24.000 L 132.000 232.000 C 132.000 234.209 130.209 236.000 128.000 236.000 C 125.791 236.000 124.000 234.209 124.000 232.000 L 124.000 24.000 C 124.000 21.791 125.791 20.000 128.000 20.000 C 130.209 20.000 132.000 21.791 132.000 24.000 Z"),
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
        return _lineVertical!!
    }

private var _lineVertical: ImageVector? = null
