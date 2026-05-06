package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberSeven: ImageVector
    get() {
        if (_numberSeven != null) return _numberSeven!!
        _numberSeven = phosphorThinIcon(
            name = "NumberSeven",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M171.83 49.15l-48 160c-.508 1.691-2.064 2.85-3.83 2.85-.39 .002-.778-.055-1.15-.17-1.02-.305-1.877-1.004-2.38-1.943-.503-.939-.611-2.039-.3-3.057L162.62 52h-74.62c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h80c1.264 0 2.454 .598 3.209 1.613 .755 1.015 .985 2.326 .621 3.537Z"),
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
        return _numberSeven!!
    }

private var _numberSeven: ImageVector? = null
