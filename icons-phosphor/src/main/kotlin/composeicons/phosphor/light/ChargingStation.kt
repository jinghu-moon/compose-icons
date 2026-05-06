package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChargingStation: ImageVector
    get() {
        if (_chargingStation != null) return _chargingStation!!
        _chargingStation = phosphorLightIcon(
            name = "ChargingStation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M133 124.64c1.115 1.649 1.339 3.742 .6 5.59l-16 40c-.785 2.007-2.586 3.438-4.718 3.75-2.132 .312-4.268-.543-5.595-2.24-1.328-1.697-1.643-3.976-.827-5.97L119.14 134h-23.14c-1.991-0-3.853-.988-4.969-2.637-1.116-1.649-1.341-3.744-.601-5.593l16-40c1.249-3.05 4.723-4.521 7.783-3.297 3.059 1.225 4.558 4.688 3.357 7.757L104.86 122h23.14c2.003-.01 3.878 .981 5 2.64ZM246 86.64v81.36c0 12.15-9.85 22-22 22-12.15 0-22-9.85-22-22v-40c0-5.523-4.477-10-10-10h-18v92h18c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-160c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h18v-154C50 43.85 59.85 34 72 34h80c12.15 0 22 9.85 22 22v50h18c12.15 0 22 9.85 22 22v40c0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10v-81.37c.007-2.653-1.048-5.199-2.93-7.07L211.76 60.24c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147l19.32 19.31c4.137 4.12 6.455 9.722 6.44 15.56ZM162 210v-154c0-5.523-4.477-10-10-10h-80C66.477 46 62 50.477 62 56v154Z"),
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
        return _chargingStation!!
    }

private var _chargingStation: ImageVector? = null
