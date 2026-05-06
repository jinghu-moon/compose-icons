package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Plus: ImageVector
    get() {
        if (_plus != null) return _plus!!
        _plus = phosphorDuotoneIcon(
            name = "Plus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 56v144c0 8.837-7.163 16-16 16h-144c-8.837 0-16-7.163-16-16v-144C40 47.163 47.163 40 56 40h144c8.837 0 16 7.163 16 16Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
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
