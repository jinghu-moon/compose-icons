package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Plus: ImageVector
    get() {
        if (_plus != null) return _plus!!
        _plus = phosphorRegularIcon(
            name = "Plus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 128c0 4.418-3.582 8-8 8h-80v80c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-80h-80c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h80v-80c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v80h80c4.418 0 8 3.582 8 8Z"),
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
        return _plus!!
    }

private var _plus: ImageVector? = null
