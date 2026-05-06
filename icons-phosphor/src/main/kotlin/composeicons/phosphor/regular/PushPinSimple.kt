package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PushPinSimple: ImageVector
    get() {
        if (_pushPinSimple != null) return _pushPinSimple!!
        _pushPinSimple = phosphorRegularIcon(
            name = "PushPinSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 168h-9.29L185.54 48h6.46c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-128c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h6.46L49.29 168h-9.29c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h80v56c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-56h80c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM86.71 48h82.58l21.17 120h-124.92Z"),
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
