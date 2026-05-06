package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ProjectorScreenChart: ImageVector
    get() {
        if (_projectorScreenChart != null) return _projectorScreenChart!!
        _projectorScreenChart = phosphorLightIcon(
            name = "ProjectorScreenChart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M90 144v-16c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v16c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6ZM128 150c3.314 0 6-2.686 6-6v-24c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v24c0 3.314 2.686 6 6 6ZM160 150c3.314 0 6-2.686 6-6v-32c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v32c0 3.314 2.686 6 6 6ZM214 78v100h10c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-90v20.84c10.564 2.995 17.302 13.319 15.791 24.195-1.512 10.875-10.811 18.971-21.791 18.971-10.98 0-20.279-8.096-21.791-18.971-1.512-10.875 5.227-21.2 15.791-24.195v-20.84h-90c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h10v-100h-2C32.268 78 26 71.732 26 64v-16C26 40.268 32.268 34 40 34h176c7.732 0 14 6.268 14 14v16c0 7.732-6.268 14-14 14ZM128 222c-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10ZM40 66h176c1.105 0 2-.895 2-2v-16c0-1.105-.895-2-2-2h-176c-1.105 0-2 .895-2 2v16c0 1.105 .895 2 2 2ZM202 78h-148v100h148Z"),
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
