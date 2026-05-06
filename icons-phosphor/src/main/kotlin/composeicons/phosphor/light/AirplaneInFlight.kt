package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AirplaneInFlight: ImageVector
    get() {
        if (_airplaneInFlight != null) return _airplaneInFlight!!
        _airplaneInFlight = phosphorLightIcon(
            name = "AirplaneInFlight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222 216c0 3.314-2.686 6-6 6h-144c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h144c3.314 0 6 2.686 6 6ZM246 136v24c0 3.314-2.686 6-6 6h-178.93C44.263 166.078 29.427 155.04 24.67 138.92L10.6 92C9.338 87.766 10.148 83.184 12.787 79.64 15.425 76.096 19.582 74.005 24 74h8c1.591 .001 3.116 .634 4.24 1.76L58.49 98h26.1L74.73 68.43c-1.424-4.268-.709-8.959 1.919-12.61C79.278 52.169 83.501 50.003 88 50h8c1.594-.001 3.123 .632 4.25 1.76L146.49 98h61.51c20.987 0 38 17.013 38 38ZM234 136c0-14.359-11.641-26-26-26h-64c-1.591-.001-3.116-.634-4.24-1.76L93.52 62h-5.52c-.643-.001-1.247 .308-1.623 .829-.376 .521-.479 1.191-.277 1.801l12.5 37.47c.611 1.83 .305 3.841-.823 5.407-1.127 1.565-2.938 2.493-4.867 2.493h-36.91c-1.591-.001-3.116-.634-4.24-1.76L29.52 86h-5.52c-.634-.009-1.232 .294-1.6 .81-.388 .499-.504 1.158-.31 1.76l14.06 46.9c3.261 11.032 13.416 18.584 24.92 18.53h172.93Z"),
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
        return _airplaneInFlight!!
    }

private var _airplaneInFlight: ImageVector? = null
