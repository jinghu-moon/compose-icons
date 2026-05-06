package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SwimmingPool: ImageVector
    get() {
        if (_swimmingPool != null) return _swimmingPool!!
        _swimmingPool = phosphorBoldIcon(
            name = "SwimmingPool",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M88 149.39c6.627 0 12-5.373 12-12v-1.39h56v3.29c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-107.29c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v8h-56v-8C100 25.373 94.627 20 88 20 81.373 20 76 25.373 76 32v105.39c0 6.627 5.373 12 12 12ZM100 112v-12h56v12ZM156 64v12h-56v-12ZM20 164c0-6.627 5.373-12 12-12 15.63 0 24 5.55 30.66 10 5.4 3.6 9 6 17.34 6 8.34 0 11.93-2.38 17.34-6 6.69-4.47 15-10 30.65-10 15.65 0 24 5.55 30.66 10 5.41 3.6 9 6 17.35 6 8.35 0 11.94-2.38 17.34-6 6.7-4.47 15-10 30.66-10 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-8.37 0-11.94 2.38-17.35 6-6.69 4.47-15 10-30.65 10-15.65 0-24-5.55-30.66-10-5.41-3.6-9-6-17.35-6-8.35 0-11.93 2.38-17.34 6-6.69 4.47-15 10-30.65 10C64.35 192 56 186.45 49.34 182c-5.4-3.6-9-6-17.34-6-6.627 0-12-5.373-12-12ZM236 208c0 6.627-5.373 12-12 12-8.37 0-11.94 2.38-17.35 6-6.69 4.47-15 10-30.65 10-15.65 0-24-5.55-30.66-10-5.41-3.6-9-6-17.35-6-8.35 0-11.93 2.38-17.34 6-6.69 4.47-15 10-30.65 10C64.35 236 56 230.45 49.34 226c-5.4-3.6-9-6-17.34-6-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 15.63 0 24 5.55 30.66 10 5.4 3.6 9 6 17.34 6 8.34 0 11.93-2.38 17.34-6 6.69-4.47 15-10 30.65-10 15.65 0 24 5.55 30.66 10 5.41 3.6 9 6 17.35 6 8.35 0 11.94-2.38 17.34-6 6.7-4.47 15-10 30.66-10 6.627 0 12 5.373 12 12Z"),
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
        return _swimmingPool!!
    }

private var _swimmingPool: ImageVector? = null
