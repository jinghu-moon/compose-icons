package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LinkSimple: ImageVector
    get() {
        if (_linkSimple != null) return _linkSimple!!
        _linkSimple = phosphorThinIcon(
            name = "LinkSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M162.84 93.16c.751 .75 1.173 1.768 1.173 2.83 0 1.062-.422 2.08-1.173 2.83l-64 64c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66l64-64c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173ZM212.79 43.21c-20.326-20.283-53.234-20.283-73.56 0L109.17 73.27c-1.496 1.571-1.466 4.048 .067 5.584 1.533 1.535 4.01 1.569 5.583 .076L144.89 48.87c17.187-17.187 45.053-17.187 62.24 0 17.187 17.187 17.187 45.053 0 62.24l-30.07 30.06c-1.563 1.563-1.563 4.097 0 5.66 1.563 1.563 4.097 1.563 5.66 0l30.07-30.06c20.283-20.326 20.283-53.234 0-73.56ZM141.17 177.06l-30.06 30.07c-17.187 17.187-45.053 17.187-62.24 0-17.187-17.187-17.187-45.053 0-62.24L78.93 114.83c1.563-1.563 1.563-4.097 0-5.66-1.563-1.563-4.097-1.563-5.66 0L43.21 139.23c-20.313 20.313-20.313 53.247 0 73.56 20.313 20.313 53.247 20.313 73.56 0l30.06-30.07c1.563-1.563 1.563-4.097 0-5.66-1.563-1.563-4.097-1.563-5.66 0Z"),
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
        return _linkSimple!!
    }

private var _linkSimple: ImageVector? = null
