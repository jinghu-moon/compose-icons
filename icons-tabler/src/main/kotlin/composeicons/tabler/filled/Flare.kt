package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Flare: ImageVector
    get() {
        if (_flare != null) return _flare!!
        _flare = tablerFilledIcon(
            name = "Flare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.106 2.553c.17-.338 .516-.552 .894-.552 .378 0 .724 .214 .894 .552l2.851 5.701 5.702 2.852c.318 .159 .528 .476 .551 .831 .023 .355-.145 .696-.441 .894l-.11 .063-5.702 2.851-2.85 5.702c-.159 .319-.476 .529-.831 .552-.356 .023-.696-.146-.895-.442l-.063-.11L8.254 15.745 2.553 12.895c-.319-.159-.529-.476-.552-.831-.023-.356 .146-.696 .442-.895l.11-.063L8.254 8.254Z"),
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
        return _flare!!
    }

private var _flare: ImageVector? = null
