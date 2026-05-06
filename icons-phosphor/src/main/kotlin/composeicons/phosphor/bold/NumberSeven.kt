package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberSeven: ImageVector
    get() {
        if (_numberSeven != null) return _numberSeven!!
        _numberSeven = phosphorBoldIcon(
            name = "NumberSeven",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M179.49 51.45l-48 160c-1.523 5.074-6.193 8.549-11.49 8.55-1.169 .002-2.332-.17-3.45-.51-6.328-1.924-9.907-8.606-8-14.94L151.87 60h-63.87C81.373 60 76 54.627 76 48 76 41.373 81.373 36 88 36h80c3.793 .001 7.362 1.795 9.626 4.839 2.264 3.044 2.955 6.978 1.864 10.611Z"),
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
