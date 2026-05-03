package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MarkerCircle: ImageVector
    get() {
        if (_markerCircle != null) return _markerCircle!!
        _markerCircle = phosphorLightIcon(
            name = "MarkerCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.120 55.870 C 174.423 29.753 136.693 19.425 101.277 28.813 C 65.861 38.201 38.202 65.863 28.816 101.279 C 19.430 136.696 29.761 174.425 55.880 200.120 C 81.577 226.237 119.307 236.565 154.723 227.177 C 190.139 217.789 217.798 190.127 227.184 154.711 C 236.570 119.294 226.239 81.565 200.120 55.870 ZM 86.000 207.640 L 86.000 176.000 C 86.000 174.895 86.895 174.000 88.000 174.000 L 168.000 174.000 C 169.105 174.000 170.000 174.895 170.000 176.000 L 170.000 207.640 C 143.703 221.452 112.297 221.452 86.000 207.640 ZM 104.000 142.000 L 152.000 142.000 C 153.105 142.000 154.000 142.895 154.000 144.000 L 154.000 162.000 L 102.000 162.000 L 102.000 144.000 C 102.000 142.895 102.895 142.000 104.000 142.000 ZM 115.540 130.000 L 126.000 79.590 C 126.189 78.658 127.009 77.988 127.960 77.988 C 128.911 77.988 129.731 78.658 129.920 79.590 L 140.460 130.000 ZM 191.640 191.640 C 188.622 194.645 185.401 197.438 182.000 200.000 L 182.000 176.000 C 182.000 168.268 175.732 162.000 168.000 162.000 L 166.000 162.000 L 166.000 144.000 C 166.010 136.544 160.176 130.389 152.730 130.000 L 141.730 77.100 C 140.386 70.598 134.659 65.935 128.020 65.935 C 121.381 65.935 115.654 70.598 114.310 77.100 L 103.310 130.000 C 95.849 130.368 89.991 136.530 90.000 144.000 L 90.000 162.000 L 88.000 162.000 C 80.268 162.000 74.000 168.268 74.000 176.000 L 74.000 200.000 C 70.598 197.435 67.377 194.638 64.360 191.630 C 29.213 156.483 29.213 99.498 64.361 64.351 C 99.508 29.204 156.492 29.204 191.639 64.351 C 226.787 99.498 226.787 156.483 191.640 191.630 Z"),
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
        return _markerCircle!!
    }

private var _markerCircle: ImageVector? = null
