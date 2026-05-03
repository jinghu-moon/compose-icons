package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BugBeetle: ImageVector
    get() {
        if (_bugBeetle != null) return _bugBeetle!!
        _bugBeetle = phosphorLightIcon(
            name = "BugBeetle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 206.000 150.000 L 224.000 150.000 C 227.314 150.000 230.000 147.314 230.000 144.000 C 230.000 140.686 227.314 138.000 224.000 138.000 L 206.000 138.000 L 206.000 118.000 L 224.000 118.000 C 227.314 118.000 230.000 115.314 230.000 112.000 C 230.000 108.686 227.314 106.000 224.000 106.000 L 205.750 106.000 C 204.334 87.565 196.400 70.237 183.370 57.120 L 204.240 36.240 C 205.845 34.744 206.506 32.492 205.963 30.366 C 205.420 28.240 203.760 26.580 201.634 26.037 C 199.508 25.494 197.256 26.155 195.760 27.760 L 174.270 49.250 C 146.778 28.915 109.232 28.915 81.740 49.250 L 60.240 27.760 C 57.876 25.557 54.192 25.622 51.907 27.907 C 49.622 30.192 49.557 33.876 51.760 36.240 L 72.640 57.120 C 59.602 70.233 51.664 87.563 50.250 106.000 L 32.000 106.000 C 28.686 106.000 26.000 108.686 26.000 112.000 C 26.000 115.314 28.686 118.000 32.000 118.000 L 50.000 118.000 L 50.000 138.000 L 32.000 138.000 C 28.686 138.000 26.000 140.686 26.000 144.000 C 26.000 147.314 28.686 150.000 32.000 150.000 L 50.000 150.000 L 50.000 160.000 C 50.007 163.344 50.228 166.684 50.660 170.000 L 32.000 170.000 C 28.686 170.000 26.000 172.686 26.000 176.000 C 26.000 179.314 28.686 182.000 32.000 182.000 L 53.180 182.000 C 62.955 215.178 93.412 237.955 128.000 237.955 C 162.588 237.955 193.045 215.178 202.820 182.000 L 224.000 182.000 C 227.314 182.000 230.000 179.314 230.000 176.000 C 230.000 172.686 227.314 170.000 224.000 170.000 L 205.340 170.000 C 205.772 166.684 205.993 163.344 206.000 160.000 ZM 128.000 46.000 C 162.107 46.042 190.577 72.037 193.710 106.000 L 62.290 106.000 C 65.423 72.037 93.893 46.042 128.000 46.000 ZM 134.000 225.710 L 134.000 144.000 C 134.000 140.686 131.314 138.000 128.000 138.000 C 124.686 138.000 122.000 140.686 122.000 144.000 L 122.000 225.710 C 88.037 222.577 62.042 194.107 62.000 160.000 L 62.000 118.000 L 194.000 118.000 L 194.000 160.000 C 193.958 194.107 167.963 222.577 134.000 225.710 Z"),
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
        return _bugBeetle!!
    }

private var _bugBeetle: ImageVector? = null
