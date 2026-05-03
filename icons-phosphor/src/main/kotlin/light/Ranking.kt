package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Ranking: ImageVector
    get() {
        if (_ranking != null) return _ranking!!
        _ranking = phosphorLightIcon(
            name = "Ranking",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 114.310 101.900 C 113.261 98.758 114.958 95.360 118.100 94.310 L 130.100 90.310 C 131.930 89.699 133.941 90.005 135.507 91.133 C 137.072 92.260 138.000 94.071 138.000 96.000 L 138.000 136.000 C 138.000 139.314 135.314 142.000 132.000 142.000 C 128.686 142.000 126.000 139.314 126.000 136.000 L 126.000 104.320 L 121.900 105.690 C 118.758 106.739 115.360 105.042 114.310 101.900 ZM 246.000 208.000 C 246.000 211.314 243.314 214.000 240.000 214.000 L 16.000 214.000 C 12.686 214.000 10.000 211.314 10.000 208.000 C 10.000 204.686 12.686 202.000 16.000 202.000 L 26.000 202.000 L 26.000 104.000 C 26.000 96.268 32.268 90.000 40.000 90.000 L 82.000 90.000 L 82.000 56.000 C 82.000 48.268 88.268 42.000 96.000 42.000 L 160.000 42.000 C 167.732 42.000 174.000 48.268 174.000 56.000 L 174.000 130.000 L 216.000 130.000 C 223.732 130.000 230.000 136.268 230.000 144.000 L 230.000 202.000 L 240.000 202.000 C 243.314 202.000 246.000 204.686 246.000 208.000 ZM 174.000 142.000 L 174.000 202.000 L 218.000 202.000 L 218.000 144.000 C 218.000 142.895 217.105 142.000 216.000 142.000 ZM 94.000 202.000 L 162.000 202.000 L 162.000 56.000 C 162.000 54.895 161.105 54.000 160.000 54.000 L 96.000 54.000 C 94.895 54.000 94.000 54.895 94.000 56.000 ZM 38.000 202.000 L 82.000 202.000 L 82.000 102.000 L 40.000 102.000 C 38.895 102.000 38.000 102.895 38.000 104.000 Z"),
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
        return _ranking!!
    }

private var _ranking: ImageVector? = null
