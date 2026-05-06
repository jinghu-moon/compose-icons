package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LinkSimpleBreak: ImageVector
    get() {
        if (_linkSimpleBreak != null) return _linkSimpleBreak!!
        _linkSimpleBreak = phosphorLightIcon(
            name = "LinkSimpleBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M214.2 118.18l-30.07 30.07c-2.344 2.344-6.146 2.344-8.49 0-2.344-2.344-2.344-6.146 0-8.49l30.08-30.07c16.406-16.406 16.406-43.004 0-59.41-16.406-16.406-43.004-16.406-59.41 0L116.24 80.34c-2.344 2.344-6.146 2.344-8.49 0-2.344-2.344-2.344-6.146 0-8.49l30.07-30c21.092-21.092 55.288-21.092 76.38 0 21.092 21.092 21.092 55.288 0 76.38ZM139.76 175.64l-30.07 30.08c-16.406 16.406-43.004 16.406-59.41 0-16.406-16.406-16.406-43.004 0-59.41L80.34 116.24c2.344-2.344 2.344-6.146 0-8.49-2.344-2.344-6.146-2.344-8.49 0l-30 30.07c-21.095 21.092-21.097 55.29-.005 76.385 21.092 21.095 55.29 21.097 76.385 .005l30.07-30.08c2.344-2.344 2.344-6.146 0-8.49-2.344-2.344-6.146-2.344-8.49 0Z"),
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
        return _linkSimpleBreak!!
    }

private var _linkSimpleBreak: ImageVector? = null
