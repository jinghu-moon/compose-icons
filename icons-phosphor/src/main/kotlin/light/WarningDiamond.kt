package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.WarningDiamond: ImageVector
    get() {
        if (_warningDiamond != null) return _warningDiamond!!
        _warningDiamond = phosphorLightIcon(
            name = "WarningDiamond",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 122.000 136.000 L 122.000 80.000 C 122.000 76.686 124.686 74.000 128.000 74.000 C 131.314 74.000 134.000 76.686 134.000 80.000 L 134.000 136.000 C 134.000 139.314 131.314 142.000 128.000 142.000 C 124.686 142.000 122.000 139.314 122.000 136.000 ZM 128.000 162.000 C 122.477 162.000 118.000 166.477 118.000 172.000 C 118.000 177.523 122.477 182.000 128.000 182.000 C 133.523 182.000 138.000 177.523 138.000 172.000 C 138.000 166.477 133.523 162.000 128.000 162.000 ZM 238.000 128.000 C 238.012 131.702 236.539 135.254 233.910 137.860 L 137.910 233.920 C 132.452 239.335 123.648 239.335 118.190 233.920 L 118.190 233.920 L 22.190 137.860 C 19.571 135.247 18.100 131.699 18.100 128.000 C 18.100 124.301 19.571 120.753 22.190 118.140 L 118.240 22.080 C 123.698 16.665 132.502 16.665 137.960 22.080 L 233.960 118.140 C 236.571 120.755 238.025 124.305 238.000 128.000 ZM 226.000 128.000 C 226.002 127.482 225.796 126.986 225.430 126.620 L 129.380 30.560 C 128.607 29.823 127.393 29.823 126.620 30.560 L 30.570 126.620 C 29.833 127.393 29.833 128.607 30.570 129.380 L 126.620 225.440 L 126.620 225.440 C 127.393 226.177 128.607 226.177 129.380 225.440 L 225.430 129.380 C 225.796 129.014 226.002 128.518 226.000 128.000 Z"),
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
        return _warningDiamond!!
    }

private var _warningDiamond: ImageVector? = null
