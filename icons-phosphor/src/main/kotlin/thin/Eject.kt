package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Eject: ImageVector
    get() {
        if (_eject != null) return _eject!!
        _eject = phosphorThinIcon(
            name = "Eject",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 156.000 L 48.000 156.000 C 41.373 156.000 36.000 161.373 36.000 168.000 L 36.000 192.000 C 36.000 198.627 41.373 204.000 48.000 204.000 L 208.000 204.000 C 214.627 204.000 220.000 198.627 220.000 192.000 L 220.000 168.000 C 220.000 161.373 214.627 156.000 208.000 156.000 ZM 212.000 192.000 C 212.000 194.209 210.209 196.000 208.000 196.000 L 48.000 196.000 C 45.791 196.000 44.000 194.209 44.000 192.000 L 44.000 168.000 C 44.000 165.791 45.791 164.000 48.000 164.000 L 208.000 164.000 C 210.209 164.000 212.000 165.791 212.000 168.000 ZM 48.230 132.000 L 207.770 132.000 C 212.657 132.071 217.099 129.172 219.000 124.670 C 220.892 120.326 219.971 115.269 216.670 111.870 L 143.000 34.370 C 139.088 30.300 133.686 27.999 128.040 27.999 C 122.394 27.999 116.992 30.300 113.080 34.370 L 39.300 111.870 C 36.009 115.276 35.101 120.332 37.000 124.670 C 38.901 129.172 43.343 132.071 48.230 132.000 ZM 45.100 117.390 L 118.830 39.880 C 121.237 37.401 124.545 36.002 128.000 36.002 C 131.455 36.002 134.763 37.401 137.170 39.880 L 210.900 117.390 C 211.995 118.466 212.303 120.111 211.670 121.510 C 211.007 123.064 209.459 124.053 207.770 124.000 L 48.230 124.000 C 46.541 124.053 44.993 123.064 44.330 121.510 C 43.697 120.111 44.005 118.466 45.100 117.390 Z"),
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
        return _eject!!
    }

private var _eject: ImageVector? = null
