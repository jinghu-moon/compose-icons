package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NavigationArrow: ImageVector
    get() {
        if (_navigationArrow != null) return _navigationArrow!!
        _navigationArrow = phosphorLightIcon(
            name = "NavigationArrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236.65 108.1 60.72 42.83h-.13C55.535 41.088 49.929 42.377 46.143 46.153c-3.786 3.775-5.091 9.377-3.363 14.437 0 0 0 .09 0 .13l65.32 175.93c1.91 5.638 7.227 9.41 13.18 9.35h.26c6.078-.04 11.414-4.052 13.14-9.88v-.15l22.14-79.1L236 134.73h.15c5.77-1.781 9.749-7.061 9.869-13.098 .12-6.038-3.644-11.472-9.339-13.482ZM232.65 123.2l-82.26 23c-2.018 .565-3.595 2.142-4.16 4.16l-23 82.26c-.228 .831-.999 1.395-1.86 1.36-.883 .078-1.694-.492-1.92-1.35 .004-.04 .004-.08 0-.12L54.11 56.62c-.225-.712-.035-1.49 .493-2.017 .528-.528 1.306-.718 2.017-.493l175.91 65.26h.12c.813 .274 1.36 1.037 1.36 1.895 0 .858-.547 1.621-1.36 1.895Z"),
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
