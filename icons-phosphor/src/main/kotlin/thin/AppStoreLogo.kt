package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AppStoreLogo: ImageVector
    get() {
        if (_appStoreLogo != null) return _appStoreLogo!!
        _appStoreLogo = phosphorThinIcon(
            name = "AppStoreLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 60.900 194.000 L 51.440 210.000 C 50.811 211.391 49.445 212.303 47.919 212.351 C 46.393 212.398 44.973 211.573 44.259 210.223 C 43.545 208.873 43.662 207.235 44.560 206.000 L 54.000 190.000 C 55.185 188.281 57.493 187.762 59.300 188.810 C 61.106 189.857 61.803 192.117 60.900 194.000 ZM 232.000 156.000 L 181.920 156.000 L 150.000 102.000 C 148.876 100.097 146.423 99.466 144.520 100.590 C 142.617 101.714 141.986 104.167 143.110 106.070 L 204.560 210.000 C 205.256 211.291 206.603 212.098 208.070 212.102 C 209.537 212.105 210.889 211.306 211.592 210.018 C 212.295 208.731 212.236 207.162 211.440 205.930 L 186.650 163.930 L 232.000 163.930 C 234.209 163.930 236.000 162.139 236.000 159.930 C 236.000 157.721 234.209 155.930 232.000 155.930 ZM 142.470 156.000 L 83.370 156.000 L 155.440 34.000 C 156.338 32.765 156.455 31.127 155.741 29.777 C 155.027 28.427 153.607 27.602 152.081 27.649 C 150.555 27.697 149.189 28.609 148.560 30.000 L 128.000 64.750 L 107.440 30.000 C 106.811 28.609 105.445 27.697 103.919 27.649 C 102.393 27.602 100.973 28.427 100.259 29.777 C 99.545 31.127 99.662 32.765 100.560 34.000 L 123.350 72.580 L 74.080 156.000 L 24.000 156.000 C 21.791 156.000 20.000 157.791 20.000 160.000 C 20.000 162.209 21.791 164.000 24.000 164.000 L 142.470 164.000 C 144.679 164.000 146.470 162.209 146.470 160.000 C 146.470 157.791 144.679 156.000 142.470 156.000 Z"),
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
