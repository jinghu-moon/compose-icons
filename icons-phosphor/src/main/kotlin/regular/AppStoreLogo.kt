package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.AppStoreLogo: ImageVector
    get() {
        if (_appStoreLogo != null) return _appStoreLogo!!
        _appStoreLogo = phosphorRegularIcon(
            name = "AppStoreLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 64.340 196.070 L 54.890 212.070 C 52.642 215.875 47.735 217.138 43.930 214.890 C 40.125 212.642 38.862 207.735 41.110 203.930 L 50.570 187.930 C 51.990 185.401 54.668 183.838 57.569 183.846 C 60.469 183.855 63.138 185.432 64.544 187.970 C 65.949 190.507 65.871 193.607 64.340 196.070 ZM 232.000 152.000 L 184.200 152.000 L 153.470 100.000 C 152.050 97.471 149.372 95.908 146.471 95.916 C 143.571 95.925 140.902 97.502 139.496 100.040 C 138.091 102.577 138.169 105.677 139.700 108.140 L 201.110 212.070 C 203.358 215.875 208.265 217.138 212.070 214.890 C 215.875 212.642 217.138 207.735 214.890 203.930 L 193.660 168.000 L 232.000 168.000 C 236.418 168.000 240.000 164.418 240.000 160.000 C 240.000 155.582 236.418 152.000 232.000 152.000 ZM 142.470 152.000 L 90.380 152.000 L 158.890 36.070 C 161.138 32.265 159.875 27.358 156.070 25.110 C 152.265 22.862 147.358 24.125 145.110 27.930 L 128.000 56.890 L 110.890 27.890 C 108.642 24.085 103.735 22.822 99.930 25.070 C 96.125 27.318 94.862 32.225 97.110 36.030 L 118.710 72.580 L 71.800 152.000 L 24.000 152.000 C 19.582 152.000 16.000 155.582 16.000 160.000 C 16.000 164.418 19.582 168.000 24.000 168.000 L 142.470 168.000 C 146.888 168.000 150.470 164.418 150.470 160.000 C 150.470 155.582 146.888 152.000 142.470 152.000 Z"),
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
        return _appStoreLogo!!
    }

private var _appStoreLogo: ImageVector? = null
