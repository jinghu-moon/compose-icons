package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GoogleDriveLogo: ImageVector
    get() {
        if (_googleDriveLogo != null) return _googleDriveLogo!!
        _googleDriveLogo = phosphorLightIcon(
            name = "GoogleDriveLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 235.900 144.820 L 167.430 32.580 C 164.884 28.474 160.391 25.983 155.560 26.000 L 100.430 26.000 C 95.600 25.985 91.107 28.476 88.560 32.580 L 88.560 32.630 L 20.130 144.760 C 17.397 149.133 17.290 154.654 19.850 159.130 L 47.170 207.000 C 49.675 211.340 54.309 214.009 59.320 214.000 L 196.670 214.000 C 201.684 214.013 206.323 211.343 208.830 207.000 L 236.150 159.180 C 238.715 154.712 238.619 149.196 235.900 144.820 ZM 222.560 146.000 L 171.390 146.000 L 135.000 85.330 L 160.080 43.540 ZM 98.560 146.000 L 128.000 97.000 L 157.400 146.000 ZM 164.560 158.000 L 191.000 202.000 L 65.000 202.000 L 91.400 158.000 ZM 128.000 73.670 L 106.600 38.000 L 149.400 38.000 ZM 95.930 43.540 L 121.000 85.330 L 84.600 146.000 L 33.430 146.000 ZM 33.000 158.000 L 77.400 158.000 L 54.670 195.890 ZM 201.300 195.890 L 178.590 158.000 L 223.000 158.000 Z"),
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
        return _googleDriveLogo!!
    }

private var _googleDriveLogo: ImageVector? = null
