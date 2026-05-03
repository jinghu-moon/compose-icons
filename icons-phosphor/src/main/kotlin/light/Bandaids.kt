package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Bandaids: ImageVector
    get() {
        if (_bandaids != null) return _bandaids!!
        _bandaids = phosphorLightIcon(
            name = "Bandaids",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 181.740 128.000 L 210.870 98.870 C 220.503 89.277 224.277 75.269 220.768 62.135 C 217.258 49.001 206.999 38.742 193.865 35.232 C 180.731 31.723 166.723 35.497 157.130 45.130 L 128.000 74.260 L 98.870 45.130 C 89.277 35.497 75.269 31.723 62.135 35.232 C 49.001 38.742 38.742 49.001 35.232 62.135 C 31.723 75.269 35.497 89.277 45.130 98.870 L 74.260 128.000 L 45.130 157.130 C 35.497 166.723 31.723 180.731 35.232 193.865 C 38.742 206.999 49.001 217.258 62.135 220.768 C 75.269 224.277 89.277 220.503 98.870 210.870 L 128.000 181.740 L 157.130 210.870 C 166.723 220.503 180.731 224.277 193.865 220.768 C 206.999 217.258 217.258 206.999 220.768 193.865 C 224.277 180.731 220.503 166.723 210.870 157.130 ZM 165.620 53.620 L 165.620 53.620 C 172.153 46.880 181.811 44.185 190.890 46.568 C 199.969 48.951 207.059 56.042 209.439 65.122 C 211.820 74.201 209.122 83.859 202.380 90.390 L 173.250 119.520 L 136.490 82.750 ZM 164.770 128.000 L 128.000 164.770 L 91.230 128.000 L 128.000 91.230 ZM 53.620 90.380 C 46.802 83.866 44.045 74.170 46.416 65.043 C 48.788 55.916 55.916 48.788 65.043 46.416 C 74.170 44.045 83.866 46.802 90.380 53.620 L 119.510 82.750 L 82.750 119.520 ZM 90.380 202.380 C 83.866 209.198 74.170 211.955 65.043 209.584 C 55.916 207.212 48.788 200.084 46.416 190.957 C 44.045 181.830 46.802 172.134 53.620 165.620 L 82.750 136.490 L 119.510 173.250 ZM 202.380 202.380 C 192.227 212.527 175.773 212.527 165.620 202.380 L 136.480 173.250 L 173.250 136.480 L 202.380 165.620 C 212.527 175.773 212.527 192.227 202.380 202.380 ZM 118.000 128.000 C 118.000 122.477 122.477 118.000 128.000 118.000 C 133.523 118.000 138.000 122.477 138.000 128.000 C 138.000 133.523 133.523 138.000 128.000 138.000 C 122.477 138.000 118.000 133.523 118.000 128.000 Z"),
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
        return _bandaids!!
    }

private var _bandaids: ImageVector? = null
