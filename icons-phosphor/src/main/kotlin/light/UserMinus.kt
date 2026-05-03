package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UserMinus: ImageVector
    get() {
        if (_userMinus != null) return _userMinus!!
        _userMinus = phosphorLightIcon(
            name = "UserMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 254.000 136.000 C 254.000 139.314 251.314 142.000 248.000 142.000 L 200.000 142.000 C 196.686 142.000 194.000 139.314 194.000 136.000 C 194.000 132.686 196.686 130.000 200.000 130.000 L 248.000 130.000 C 251.314 130.000 254.000 132.686 254.000 136.000 ZM 196.590 196.140 C 198.047 197.770 198.501 200.064 197.776 202.127 C 197.051 204.190 195.261 205.695 193.105 206.055 C 190.948 206.416 188.766 205.575 187.410 203.860 C 166.900 179.450 138.690 166.000 108.000 166.000 C 77.310 166.000 49.110 179.450 28.590 203.860 C 26.429 206.279 22.737 206.542 20.254 204.455 C 17.771 202.367 17.398 198.684 19.410 196.140 C 35.140 177.410 55.000 164.480 77.000 158.260 C 50.252 144.029 36.629 113.415 43.963 84.018 C 51.296 54.622 77.702 33.993 108.000 33.993 C 138.298 33.993 164.704 54.622 172.037 84.018 C 179.371 113.415 165.748 144.029 139.000 158.260 C 161.000 164.480 180.860 177.410 196.590 196.140 ZM 108.000 154.000 C 137.823 154.000 162.000 129.823 162.000 100.000 C 162.000 70.177 137.823 46.000 108.000 46.000 C 78.177 46.000 54.000 70.177 54.000 100.000 C 54.033 129.810 78.190 153.967 108.000 154.000 Z"),
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
        return _userMinus!!
    }

private var _userMinus: ImageVector? = null
