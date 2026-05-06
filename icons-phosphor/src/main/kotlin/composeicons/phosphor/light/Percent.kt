package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Percent: ImageVector
    get() {
        if (_percent != null) return _percent!!
        _percent = phosphorLightIcon(
            name = "Percent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204.24 60.23 60.24 204.23c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333l144-144c1.512-1.535 3.732-2.142 5.815-1.588 2.083 .553 3.709 2.181 4.26 4.265 .551 2.084-.058 4.303-1.595 5.813ZM52 100C40.549 88.509 38.811 70.528 47.85 57.057 56.888 43.585 74.185 38.376 89.16 44.615c14.975 6.24 23.456 22.19 20.255 38.093C106.214 98.613 92.223 110.04 76 110c-9.014 .002-17.655-3.598-24-10ZM54 76c.003 10.495 7.42 19.527 17.715 21.571C82.009 99.616 92.314 94.104 96.328 84.406c4.014-9.698 .618-20.88-8.11-26.709C79.49 51.869 67.86 53.017 60.44 60.44 56.302 64.559 53.983 70.161 54 76ZM214 180c.04 16.223-11.387 30.214-27.291 33.415-15.904 3.201-31.854-5.28-38.093-20.255-6.24-14.975-1.03-32.272 12.441-41.311 13.472-9.039 31.452-7.301 42.943 4.15 6.402 6.345 10.002 14.986 10 24ZM202 180c.016-5.838-2.302-11.441-6.44-15.56h0c-7.42-7.423-19.05-8.571-27.778-2.743-8.728 5.829-12.124 17.011-8.11 26.709 4.014 9.698 14.319 15.21 24.613 13.165C194.58 199.527 201.997 190.495 202 180Z"),
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
        return _percent!!
    }

private var _percent: ImageVector? = null
