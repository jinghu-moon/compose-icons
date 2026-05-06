package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.WheelchairMotion: ImageVector
    get() {
        if (_wheelchairMotion != null) return _wheelchairMotion!!
        _wheelchairMotion = phosphorLightIcon(
            name = "WheelchairMotion",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 78c16.569 0 30-13.431 30-30C206 31.431 192.569 18 176 18c-16.569 0-30 13.431-30 30 0 16.569 13.431 30 30 30ZM176 30c9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18ZM166 168c0 34.242-27.758 62-62 62C69.758 230 42 202.242 42 168c0-34.242 27.758-62 62-62 3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6-27.614 0-50 22.386-50 50 0 27.614 22.386 50 50 50 27.614 0 50-22.386 50-50 0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM204.64 132.2c1.144 1.395 1.6 3.232 1.24 5l-16 80c-.57 2.794-3.028 4.801-5.88 4.8-.4-.001-.798-.041-1.19-.12-3.247-.653-5.35-3.813-4.7-7.06L192.68 142h-64.68c-2.144 .001-4.126-1.142-5.199-2.998-1.073-1.857-1.073-4.145-.001-6.002L143.87 96.32C114.376 79.929 77.855 83.266 51.82 104.73c-1.646 1.421-3.932 1.84-5.976 1.095-2.043-.745-3.523-2.537-3.869-4.684-.345-2.147 .498-4.313 2.204-5.661C75.863 69.337 120.852 66.794 155.28 89.2c2.655 1.739 3.497 5.245 1.92 8L138.37 130h61.63c1.798 .001 3.501 .808 4.64 2.2Z"),
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
        return _wheelchairMotion!!
    }

private var _wheelchairMotion: ImageVector? = null
