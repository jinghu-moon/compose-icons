package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ProjectorScreenChart: ImageVector
    get() {
        if (_projectorScreenChart != null) return _projectorScreenChart!!
        _projectorScreenChart = phosphorBoldIcon(
            name = "ProjectorScreenChart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M104 128v8c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-8c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM128 112c-6.627 0-12 5.373-12 12v12c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-12c0-6.627-5.373-12-12-12ZM164 108c-6.627 0-12 5.373-12 12v16c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-16c0-6.627-5.373-12-12-12ZM220 91.6v72.4h4c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-84v23.22c9.407 5.431 13.994 16.504 11.182 26.996-2.811 10.492-12.32 17.788-23.182 17.788-10.863 0-20.371-7.296-23.182-17.788-2.811-10.492 1.775-21.565 11.182-26.996v-23.22h-84c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h4v-72.4C26.687 89.699 19.998 81.505 20 72v-24C20 36.954 28.954 28 40 28h176c11.046 0 20 8.954 20 20v24c.002 9.505-6.687 17.699-16 19.6ZM44 68h168v-16h-168ZM196 164v-72h-136v72Z"),
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
        return _projectorScreenChart!!
    }

private var _projectorScreenChart: ImageVector? = null
