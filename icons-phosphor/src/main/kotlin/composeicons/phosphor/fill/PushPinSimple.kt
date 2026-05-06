package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PushPinSimple: ImageVector
    get() {
        if (_pushPinSimple != null) return _pushPinSimple!!
        _pushPinSimple = phosphorFillIcon(
            name = "PushPinSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 176c0 4.418-3.582 8-8 8h-80v56c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-56h-80c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h9.29L70.46 48h-6.46c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h128c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-6.46l21.17 120h9.29c4.418 0 8 3.582 8 8Z"),
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
        return _pushPinSimple!!
    }

private var _pushPinSimple: ImageVector? = null
