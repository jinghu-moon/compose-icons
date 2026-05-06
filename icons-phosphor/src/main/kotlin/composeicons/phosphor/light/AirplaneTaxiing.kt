package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AirplaneTaxiing: ImageVector
    get() {
        if (_airplaneTaxiing != null) return _airplaneTaxiing!!
        _airplaneTaxiing = phosphorLightIcon(
            name = "AirplaneTaxiing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 98h-61.51L100.25 51.76C99.123 50.632 97.594 49.999 96 50h-8c-4.499 .003-8.722 2.169-11.351 5.82-2.629 3.651-3.343 8.343-1.919 12.61L84.59 98h-26.1L36.25 75.76C35.123 74.632 33.594 73.999 32 74h-8c-4.418 .005-8.575 2.096-11.213 5.64C10.148 83.184 9.338 87.766 10.6 92l14.07 46.9c4.749 16.128 19.587 27.175 36.4 27.1h178.93c3.314 0 6-2.686 6-6v-24C246 115.013 228.987 98 208 98ZM234 154h-172.93c-11.5 .049-21.65-7.502-24.91-18.53L22.1 88.57c-.194-.602-.078-1.261 .31-1.76 .366-.514 .96-.816 1.59-.81h5.51l22.24 22.24c1.127 1.128 2.656 1.761 4.25 1.76h36.91c1.929-0 3.74-.928 4.867-2.493 1.127-1.565 1.433-3.577 .823-5.407L86.11 64.63c-.202-.608-.1-1.277 .274-1.797 .374-.521 .975-.83 1.616-.833h5.51l46.24 46.24c1.127 1.128 2.656 1.761 4.25 1.76h64c14.359 0 26 11.641 26 26ZM222 200c0 7.732-6.268 14-14 14-7.732 0-14-6.268-14-14 0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14ZM126 200c0 7.732-6.268 14-14 14-7.732 0-14-6.268-14-14 0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14Z"),
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
        return _airplaneTaxiing!!
    }

private var _airplaneTaxiing: ImageVector? = null
