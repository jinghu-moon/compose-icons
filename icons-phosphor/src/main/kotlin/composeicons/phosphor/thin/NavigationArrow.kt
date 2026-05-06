package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NavigationArrow: ImageVector
    get() {
        if (_navigationArrow != null) return _navigationArrow!!
        _navigationArrow = phosphorThinIcon(
            name = "NavigationArrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 110 59.93 44.67c-4.354-1.506-9.185-.386-12.433 2.881C44.25 50.818 43.159 55.655 44.69 60L110 235.93c1.623 4.843 6.172 8.097 11.28 8.07h.22c5.21-.033 9.784-3.474 11.26-8.47v-.1l22.45-80.19 80.19-22.44h.1c4.963-1.508 8.396-6.033 8.509-11.219 .114-5.186-3.117-9.857-8.009-11.581ZM233.21 125.12l-82.3 23c-1.347 .374-2.401 1.424-2.78 2.77l-23 82.3c-.489 1.655-2.014 2.789-3.74 2.78-1.762 .032-3.338-1.093-3.88-2.77L52.22 57.32c-.508-1.457-.117-3.076 1-4.14C53.957 52.439 54.955 52.015 56 52c.425 .001 .848 .072 1.25 .21l176.08 65.32c1.628 .563 2.712 2.105 2.691 3.827-.02 1.722-1.141 3.238-2.781 3.763Z"),
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
        return _navigationArrow!!
    }

private var _navigationArrow: ImageVector? = null
