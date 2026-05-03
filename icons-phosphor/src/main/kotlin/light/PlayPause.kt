package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PlayPause: ImageVector
    get() {
        if (_playPause != null) return _playPause!!
        _playPause = phosphorLightIcon(
            name = "PlayPause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 182.000 64.000 L 182.000 192.000 C 182.000 195.314 179.314 198.000 176.000 198.000 C 172.686 198.000 170.000 195.314 170.000 192.000 L 170.000 64.000 C 170.000 60.686 172.686 58.000 176.000 58.000 C 179.314 58.000 182.000 60.686 182.000 64.000 ZM 224.000 58.000 C 220.686 58.000 218.000 60.686 218.000 64.000 L 218.000 192.000 C 218.000 195.314 220.686 198.000 224.000 198.000 C 227.314 198.000 230.000 195.314 230.000 192.000 L 230.000 64.000 C 230.000 60.686 227.314 58.000 224.000 58.000 ZM 142.000 128.000 C 142.004 132.726 139.584 137.124 135.590 139.650 L 47.410 195.800 C 43.138 198.535 37.717 198.728 33.261 196.304 C 28.806 193.879 26.024 189.222 26.000 184.150 L 26.000 71.850 C 26.024 66.778 28.806 62.121 33.261 59.696 C 37.717 57.272 43.138 57.465 47.410 60.200 L 135.590 116.350 C 139.584 118.876 142.004 123.274 142.000 128.000 ZM 130.000 128.000 C 130.006 127.376 129.683 126.794 129.150 126.470 L 41.000 70.320 C 40.704 70.120 40.357 70.009 40.000 70.000 C 39.651 70.000 39.308 70.086 39.000 70.250 C 38.385 70.545 37.995 71.168 38.000 71.850 L 38.000 184.150 C 37.995 184.832 38.385 185.455 39.000 185.750 C 39.626 186.108 40.401 186.081 41.000 185.680 L 129.190 129.530 C 129.708 129.196 130.015 128.616 130.000 128.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _playPause!!
    }

private var _playPause: ImageVector? = null
