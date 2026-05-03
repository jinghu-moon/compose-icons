package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Eyes: ImageVector
    get() {
        if (_eyes != null) return _eyes!!
        _eyes = phosphorLightIcon(
            name = "Eyes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 176.000 34.000 C 154.850 34.000 136.900 54.150 128.000 84.260 C 119.100 54.150 101.150 34.000 80.000 34.000 C 49.720 34.000 26.000 75.290 26.000 128.000 C 26.000 180.710 49.720 222.000 80.000 222.000 C 101.150 222.000 119.100 201.850 128.000 171.740 C 136.900 201.850 154.850 222.000 176.000 222.000 C 206.280 222.000 230.000 180.710 230.000 128.000 C 230.000 75.290 206.280 34.000 176.000 34.000 ZM 80.000 210.000 C 61.760 210.000 45.810 185.900 40.170 153.470 C 52.743 161.295 69.145 158.775 78.789 147.536 C 88.433 136.297 88.433 119.703 78.789 108.464 C 69.145 97.225 52.743 94.705 40.170 102.530 C 45.810 70.100 61.760 46.000 80.000 46.000 C 102.770 46.000 122.000 83.550 122.000 128.000 C 122.000 172.450 102.770 210.000 80.000 210.000 ZM 38.000 128.000 C 38.000 118.059 46.059 110.000 56.000 110.000 C 65.941 110.000 74.000 118.059 74.000 128.000 C 74.000 137.941 65.941 146.000 56.000 146.000 C 46.059 146.000 38.000 137.941 38.000 128.000 ZM 176.000 210.000 C 157.760 210.000 141.810 185.900 136.170 153.470 C 148.743 161.295 165.145 158.775 174.789 147.536 C 184.433 136.297 184.433 119.703 174.789 108.464 C 165.145 97.225 148.743 94.705 136.170 102.530 C 141.810 70.100 157.760 46.000 176.000 46.000 C 198.770 46.000 218.000 83.550 218.000 128.000 C 218.000 172.450 198.770 210.000 176.000 210.000 ZM 134.000 128.000 C 134.000 118.059 142.059 110.000 152.000 110.000 C 161.941 110.000 170.000 118.059 170.000 128.000 C 170.000 137.941 161.941 146.000 152.000 146.000 C 142.059 146.000 134.000 137.941 134.000 128.000 Z"),
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
        return _eyes!!
    }

private var _eyes: ImageVector? = null
