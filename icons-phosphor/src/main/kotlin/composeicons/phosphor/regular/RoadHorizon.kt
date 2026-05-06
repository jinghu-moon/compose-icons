package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.RoadHorizon: ImageVector
    get() {
        if (_roadHorizon != null) return _roadHorizon!!
        _roadHorizon = phosphorRegularIcon(
            name = "RoadHorizon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.92 199c-1.855 1.046-4.051 1.309-6.1 .731-2.05-.578-3.784-1.95-4.82-3.811L155.32 72h-19.32v8c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-8h-19.32L31 195.92c-2.165 3.866-7.054 5.245-10.92 3.08C16.214 196.835 14.835 191.946 17 188.08L82.32 72h-58.32c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h208c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-58.32L239 188.08c1.046 1.855 1.309 4.051 .731 6.1-.578 2.05-1.95 3.784-3.811 4.82ZM128 112c-4.418 0-8 3.582-8 8v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16c0-4.418-3.582-8-8-8ZM128 168c-4.418 0-8 3.582-8 8v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16c0-4.418-3.582-8-8-8Z"),
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
        return _roadHorizon!!
    }

private var _roadHorizon: ImageVector? = null
