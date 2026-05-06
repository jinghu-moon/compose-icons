package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LinkSimpleBreak: ImageVector
    get() {
        if (_linkSimpleBreak != null) return _linkSimpleBreak!!
        _linkSimpleBreak = phosphorThinIcon(
            name = "LinkSimpleBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212.79 116.77l-30.07 30.06c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66l30.07-30.06c17.187-17.187 17.187-45.053 0-62.24-17.187-17.187-45.053-17.187-62.24 0L114.82 78.93c-1.574 1.493-4.051 1.459-5.583-.076-1.533-1.535-1.562-4.012-.067-5.584L139.23 43.21c20.313-20.313 53.247-20.313 73.56 0 20.313 20.313 20.313 53.247 0 73.56ZM141.17 177.06l-30.06 30.07c-17.187 17.187-45.053 17.187-62.24 0-17.187-17.187-17.187-45.053 0-62.24L78.93 114.83c1.563-1.563 1.563-4.097 0-5.66-1.563-1.563-4.097-1.563-5.66 0L43.21 139.23c-20.313 20.313-20.313 53.247 0 73.56 20.313 20.313 53.247 20.313 73.56 0l30.06-30.07c1.563-1.563 1.563-4.097 0-5.66-1.563-1.563-4.097-1.563-5.66 0Z"),
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
