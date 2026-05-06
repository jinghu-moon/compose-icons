package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HeartStraight: ImageVector
    get() {
        if (_heartStraight != null) return _heartStraight!!
        _heartStraight = phosphorLightIcon(
            name = "HeartStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M221.6 58.38C199.748 36.572 164.376 36.536 142.48 58.3L128 71.78 113.52 58.3C91.636 36.443 56.177 36.466 34.32 58.35c-21.857 21.884-21.834 57.343 .05 79.2l89.36 90.66c1.127 1.142 2.665 1.785 4.27 1.785 1.605 0 3.143-.643 4.27-1.785l89.33-90.62c10.506-10.503 16.409-24.749 16.409-39.605 0-14.856-5.903-29.102-16.409-39.605ZM213.08 129.13 128 215.45 42.89 129.1C25.81 111.901 25.858 84.127 42.996 66.986 60.134 49.845 87.908 49.793 105.11 66.87c.049 .052 .102 .099 .16 .14l18.64 17.36c2.304 2.147 5.876 2.147 8.18 0L150.73 67c.058-.041 .111-.088 .16-.14C161.999 55.685 178.235 51.304 193.457 55.373c15.222 4.069 27.107 15.967 31.158 31.194 4.052 15.227-.348 31.458-11.535 42.554Z"),
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
        return _heartStraight!!
    }

private var _heartStraight: ImageVector? = null
