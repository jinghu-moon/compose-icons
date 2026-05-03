package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Tram: ImageVector
    get() {
        if (_tram != null) return _tram!!
        _tram = phosphorLightIcon(
            name = "Tram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 184.000 50.000 L 134.000 50.000 L 134.000 22.000 L 168.000 22.000 C 171.314 22.000 174.000 19.314 174.000 16.000 C 174.000 12.686 171.314 10.000 168.000 10.000 L 88.000 10.000 C 84.686 10.000 82.000 12.686 82.000 16.000 C 82.000 19.314 84.686 22.000 88.000 22.000 L 122.000 22.000 L 122.000 50.000 L 72.000 50.000 C 55.431 50.000 42.000 63.431 42.000 80.000 L 42.000 184.000 C 42.000 200.569 55.431 214.000 72.000 214.000 L 84.000 214.000 L 67.200 236.400 C 65.212 239.051 65.749 242.812 68.400 244.800 C 71.051 246.788 74.812 246.251 76.800 243.600 L 99.000 214.000 L 157.000 214.000 L 179.200 243.600 C 181.188 246.251 184.949 246.788 187.600 244.800 C 190.251 242.812 190.788 239.051 188.800 236.400 L 172.000 214.000 L 184.000 214.000 C 200.569 214.000 214.000 200.569 214.000 184.000 L 214.000 80.000 C 214.000 63.431 200.569 50.000 184.000 50.000 ZM 72.000 62.000 L 184.000 62.000 C 193.941 62.000 202.000 70.059 202.000 80.000 L 202.000 122.000 L 54.000 122.000 L 54.000 80.000 C 54.000 70.059 62.059 62.000 72.000 62.000 ZM 184.000 202.000 L 72.000 202.000 C 62.059 202.000 54.000 193.941 54.000 184.000 L 54.000 134.000 L 202.000 134.000 L 202.000 184.000 C 202.000 193.941 193.941 202.000 184.000 202.000 ZM 94.000 172.000 C 94.000 177.523 89.523 182.000 84.000 182.000 C 78.477 182.000 74.000 177.523 74.000 172.000 C 74.000 166.477 78.477 162.000 84.000 162.000 C 89.523 162.000 94.000 166.477 94.000 172.000 ZM 182.000 172.000 C 182.000 177.523 177.523 182.000 172.000 182.000 C 166.477 182.000 162.000 177.523 162.000 172.000 C 162.000 166.477 166.477 162.000 172.000 162.000 C 177.523 162.000 182.000 166.477 182.000 172.000 Z"),
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
        return _tram!!
    }

private var _tram: ImageVector? = null
