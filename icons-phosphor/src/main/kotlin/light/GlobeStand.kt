package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GlobeStand: ImageVector
    get() {
        if (_globeStand != null) return _globeStand!!
        _globeStand = phosphorLightIcon(
            name = "GlobeStand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 136.000 182.000 C 179.078 182.000 214.000 147.078 214.000 104.000 C 214.000 60.922 179.078 26.000 136.000 26.000 C 92.922 26.000 58.000 60.922 58.000 104.000 C 58.050 147.058 92.942 181.950 136.000 182.000 ZM 136.000 38.000 C 172.451 38.000 202.000 67.549 202.000 104.000 C 202.000 140.451 172.451 170.000 136.000 170.000 C 99.549 170.000 70.000 140.451 70.000 104.000 C 70.044 67.567 99.567 38.044 136.000 38.000 ZM 212.330 174.890 C 214.623 177.279 214.547 181.075 212.160 183.370 C 193.210 201.649 168.294 212.466 142.000 213.830 L 142.000 234.000 L 168.000 234.000 C 171.314 234.000 174.000 236.686 174.000 240.000 C 174.000 243.314 171.314 246.000 168.000 246.000 L 104.000 246.000 C 100.686 246.000 98.000 243.314 98.000 240.000 C 98.000 236.686 100.686 234.000 104.000 234.000 L 130.000 234.000 L 130.000 213.830 C 87.071 211.490 49.440 184.354 33.663 144.362 C 17.885 104.369 26.852 58.850 56.620 27.830 C 58.918 25.439 62.719 25.362 65.110 27.660 C 67.501 29.958 67.578 33.759 65.280 36.150 C 28.314 74.628 28.924 135.607 66.652 173.338 C 104.380 211.068 165.360 211.683 203.840 174.720 C 204.988 173.616 206.528 173.013 208.120 173.045 C 209.713 173.077 211.227 173.741 212.330 174.890 Z"),
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
        return _globeStand!!
    }

private var _globeStand: ImageVector? = null
