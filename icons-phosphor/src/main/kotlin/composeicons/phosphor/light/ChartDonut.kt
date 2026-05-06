package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChartDonut: ImageVector
    get() {
        if (_chartDonut != null) return _chartDonut!!
        _chartDonut = phosphorLightIcon(
            name = "ChartDonut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26c-3.314 0-6 2.686-6 6v56c0 3.314 2.686 6 6 6 15.388 .002 28.856 10.34 32.837 25.204 3.981 14.864-2.518 30.549-15.845 38.242-13.327 7.693-30.16 5.476-41.04-5.405C93.072 141.159 90.856 124.326 98.55 111c.797-1.379 1.012-3.018 .6-4.556-.413-1.538-1.42-2.849-2.8-3.644l-48.5-28c-1.379-.797-3.018-1.012-4.556-.6-1.538 .413-2.849 1.42-3.644 2.8C16.568 116.979 23.215 167.478 55.857 200.122c32.642 32.644 83.14 39.295 123.121 16.216 39.981-23.079 59.477-70.134 47.534-114.727C214.569 57.019 174.164 26.007 128 26ZM47.21 88.29l38.29 22.1C83.188 115.973 81.999 121.957 82 128c.007 2.006 .14 4.01 .4 6L39.7 145.45C35.888 126.088 38.526 106.01 47.21 88.29ZM42.81 157 85.51 145.56c6.309 15.165 20.208 25.83 36.49 28v44.2C85.781 215.288 54.574 191.344 42.81 157ZM134 217.8v-44.2c22.882-3.018 39.985-22.525 39.985-45.605C173.985 104.915 156.882 85.408 134 82.39v-44.19c47.273 3.157 84.003 42.422 84.003 89.8 0 47.378-36.731 86.643-84.003 89.8Z"),
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
        return _chartDonut!!
    }

private var _chartDonut: ImageVector? = null
