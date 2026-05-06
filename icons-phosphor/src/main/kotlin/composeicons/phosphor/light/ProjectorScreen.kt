package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ProjectorScreen: ImageVector
    get() {
        if (_projectorScreen != null) return _projectorScreen!!
        _projectorScreen = phosphorLightIcon(
            name = "ProjectorScreen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 78c7.732 0 14-6.268 14-14v-16c0-7.732-6.268-14-14-14h-176C32.268 34 26 40.268 26 48v16c0 7.732 6.268 14 14 14h2v100h-10c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h90v20.84c-10.564 2.995-17.302 13.319-15.791 24.195 1.512 10.875 10.811 18.971 21.791 18.971 10.98 0 20.279-8.096 21.791-18.971C151.302 224.159 144.564 213.835 134 210.84v-20.84h90c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-10v-100ZM138 232c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM38 64v-16c0-1.105 .895-2 2-2h176c1.105 0 2 .895 2 2v16c0 1.105-.895 2-2 2h-176c-1.105 0-2-.895-2-2ZM202 178h-148v-100h148Z"),
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
        return _projectorScreen!!
    }

private var _projectorScreen: ImageVector? = null
