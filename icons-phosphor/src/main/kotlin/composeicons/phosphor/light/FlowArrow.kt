package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FlowArrow: ImageVector
    get() {
        if (_flowArrow != null) return _flowArrow!!
        _flowArrow = phosphorLightIcon(
            name = "FlowArrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244.24 75.76l-32-32c-2.364-2.203-6.048-2.138-8.333 .147-2.285 2.285-2.35 5.969-.147 8.333L225.51 74h-17.51c-48 0-59.44 27.46-69.54 51.69-9.43 22.64-17.66 42.33-53 44.16C82.233 150.295 64.518 136.504 44.768 138.173 25.019 139.841 9.869 156.408 9.968 176.228c.099 19.819 15.414 36.234 35.179 37.705 19.765 1.471 37.341-12.496 40.373-32.083 43.34-2.06 54.29-28.29 64-51.55C159.44 106.53 168 86 208 86h17.51l-21.75 21.76c-1.605 1.496-2.266 3.748-1.723 5.874 .543 2.126 2.203 3.786 4.329 4.329 2.126 .543 4.379-.118 5.874-1.723l32-32c2.34-2.343 2.34-6.137 0-8.48ZM48 202C33.641 202 22 190.359 22 176c0-14.359 11.641-26 26-26 14.359 0 26 11.641 26 26 0 14.359-11.641 26-26 26Z"),
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
        return _flowArrow!!
    }

private var _flowArrow: ImageVector? = null
