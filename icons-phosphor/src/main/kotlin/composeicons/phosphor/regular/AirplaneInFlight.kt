package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.AirplaneInFlight: ImageVector
    get() {
        if (_airplaneInFlight != null) return _airplaneInFlight!!
        _airplaneInFlight = phosphorRegularIcon(
            name = "AirplaneInFlight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 216c0 4.418-3.582 8-8 8h-144c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h144c4.418 0 8 3.582 8 8ZM248 136v24c0 4.418-3.582 8-8 8h-178.93C43.378 168.081 27.762 156.46 22.76 139.49L8.69 92.6C7.237 87.758 8.157 82.514 11.173 78.456 14.188 74.398 18.944 72.005 24 72h8c2.119 .001 4.151 .843 5.65 2.34L59.32 96h22.49l-9-26.94C71.183 64.179 72.002 58.813 75.012 54.64 78.022 50.467 82.855 47.996 88 48h8c2.122-.002 4.158 .84 5.66 2.34L147.32 96h60.68c22.091 0 40 17.909 40 40ZM232 136c0-13.255-10.745-24-24-24h-64c-2.119-.001-4.151-.843-5.65-2.34L92.69 64h-4.69l12.49 37.47c.813 2.438 .405 5.118-1.097 7.204-1.501 2.086-3.913 3.323-6.483 3.326h-36.91c-2.122 .002-4.158-.84-5.66-2.34L28.69 88h-4.69l14.07 46.9c3.005 10.185 12.382 17.156 23 17.1h170.93Z"),
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
