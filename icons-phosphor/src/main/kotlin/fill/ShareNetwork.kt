package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ShareNetwork: ImageVector
    get() {
        if (_shareNetwork != null) return _shareNetwork!!
        _shareNetwork = phosphorFillIcon(
            name = "ShareNetwork",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 212.000 200.000 C 212.002 214.363 203.466 227.353 190.281 233.051 C 177.096 238.749 161.786 236.064 151.326 226.219 C 140.867 216.375 137.261 201.256 142.150 187.750 L 89.150 153.700 C 75.021 167.560 52.353 167.414 38.403 153.374 C 24.453 139.334 24.453 116.666 38.403 102.626 C 52.353 88.586 75.021 88.440 89.150 102.300 L 142.150 68.300 C 135.866 51.034 143.558 31.803 160.016 23.632 C 176.474 15.462 196.443 20.961 206.398 36.405 C 216.353 51.848 213.116 72.306 198.879 83.922 C 184.642 95.537 163.951 94.602 150.820 81.750 L 97.820 115.800 C 100.684 123.715 100.684 132.385 97.820 140.300 L 150.820 174.350 C 161.166 164.225 176.569 161.281 189.919 166.878 C 203.269 172.475 211.968 185.524 212.000 200.000 Z"),
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
        return _shareNetwork!!
    }

private var _shareNetwork: ImageVector? = null
