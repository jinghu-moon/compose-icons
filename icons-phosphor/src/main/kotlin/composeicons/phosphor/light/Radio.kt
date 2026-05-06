package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Radio: ImageVector
    get() {
        if (_radio != null) return _radio!!
        _radio = phosphorLightIcon(
            name = "Radio",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M102 104c0 3.314-2.686 6-6 6h-32c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h32c3.314 0 6 2.686 6 6ZM96 130h-32c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h32c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM96 162h-32c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h32c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM230 80v112c0 7.732-6.268 14-14 14h-176c-7.732 0-14-6.268-14-14v-120c-.001-2.652 1.739-4.99 4.28-5.75l160-48c3.176-.95 6.52 .854 7.47 4.03 .95 3.176-.854 6.52-4.03 7.47L72.88 66h143.12c7.732 0 14 6.268 14 14ZM218 80c0-1.105-.895-2-2-2h-178v114c0 1.105 .895 2 2 2h176c1.105 0 2-.895 2-2ZM198 136c0 20.987-17.013 38-38 38-20.987 0-38-17.013-38-38 0-20.987 17.013-38 38-38 20.987 0 38 17.013 38 38ZM186 136c0-14.359-11.641-26-26-26-14.359 0-26 11.641-26 26 0 14.359 11.641 26 26 26 14.359 0 26-11.641 26-26Z"),
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
        return _radio!!
    }

private var _radio: ImageVector? = null
