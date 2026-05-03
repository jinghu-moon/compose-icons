package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.RoadHorizon: ImageVector
    get() {
        if (_roadHorizon != null) return _roadHorizon!!
        _roadHorizon = phosphorLightIcon(
            name = "RoadHorizon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 234.940 197.230 C 232.052 198.854 228.394 197.828 226.770 194.940 L 156.490 70.000 L 134.000 70.000 L 134.000 80.000 C 134.000 83.314 131.314 86.000 128.000 86.000 C 124.686 86.000 122.000 83.314 122.000 80.000 L 122.000 70.000 L 99.510 70.000 L 29.230 194.940 C 28.191 196.831 26.217 198.019 24.060 198.051 C 21.902 198.083 19.894 196.954 18.800 195.094 C 17.705 193.234 17.694 190.930 18.770 189.060 L 85.740 70.000 L 24.000 70.000 C 20.686 70.000 18.000 67.314 18.000 64.000 C 18.000 60.686 20.686 58.000 24.000 58.000 L 232.000 58.000 C 235.314 58.000 238.000 60.686 238.000 64.000 C 238.000 67.314 235.314 70.000 232.000 70.000 L 170.260 70.000 L 237.260 189.060 C 238.037 190.451 238.229 192.094 237.794 193.626 C 237.359 195.159 236.332 196.455 234.940 197.230 ZM 128.000 114.000 C 124.686 114.000 122.000 116.686 122.000 120.000 L 122.000 136.000 C 122.000 139.314 124.686 142.000 128.000 142.000 C 131.314 142.000 134.000 139.314 134.000 136.000 L 134.000 120.000 C 134.000 116.686 131.314 114.000 128.000 114.000 ZM 128.000 170.000 C 124.686 170.000 122.000 172.686 122.000 176.000 L 122.000 192.000 C 122.000 195.314 124.686 198.000 128.000 198.000 C 131.314 198.000 134.000 195.314 134.000 192.000 L 134.000 176.000 C 134.000 172.686 131.314 170.000 128.000 170.000 Z"),
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
        return _roadHorizon!!
    }

private var _roadHorizon: ImageVector? = null
