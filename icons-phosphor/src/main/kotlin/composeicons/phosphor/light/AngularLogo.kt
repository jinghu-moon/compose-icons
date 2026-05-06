package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AngularLogo: ImageVector
    get() {
        if (_angularLogo != null) return _angularLogo!!
        _angularLogo = phosphorLightIcon(
            name = "AngularLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M226.31 66.46l-96-40c-1.48-.61-3.14-.61-4.62 0l-96 40c-2.505 1.044-3.998 3.64-3.64 6.33l16 120c.262 1.975 1.487 3.691 3.27 4.58l80 40c1.687 .842 3.673 .842 5.36 0l80-40c1.783-.889 3.008-2.605 3.27-4.58l16-120c.358-2.69-1.135-5.286-3.64-6.33ZM202.47 188.06 128 225.29 53.53 188.06 38.53 75.77 128 38.5l89.44 37.27ZM122.75 85.06l-40 72c-1.607 2.899-.559 6.553 2.34 8.16 2.899 1.607 6.553 .559 8.16-2.34L104.86 142h46.28l11.61 20.91c1.058 1.908 3.068 3.091 5.25 3.09 1.016 .001 2.015-.26 2.9-.76 2.895-1.606 3.942-5.253 2.34-8.15l-40-72c-1.057-1.91-3.067-3.095-5.25-3.095-2.183 0-4.193 1.185-5.25 3.095ZM144.47 130h-32.94L128 100.35Z"),
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
        return _angularLogo!!
    }

private var _angularLogo: ImageVector? = null
