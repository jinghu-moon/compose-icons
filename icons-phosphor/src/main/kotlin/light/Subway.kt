package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Subway: ImageVector
    get() {
        if (_subway != null) return _subway!!
        _subway = phosphorLightIcon(
            name = "Subway",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 222.000 96.000 L 222.000 208.000 C 222.000 211.314 219.314 214.000 216.000 214.000 C 212.686 214.000 210.000 211.314 210.000 208.000 L 210.000 96.000 C 209.961 63.983 184.017 38.039 152.000 38.000 L 104.000 38.000 C 71.983 38.039 46.039 63.983 46.000 96.000 L 46.000 208.000 C 46.000 211.314 43.314 214.000 40.000 214.000 C 36.686 214.000 34.000 211.314 34.000 208.000 L 34.000 96.000 C 34.044 57.358 65.358 26.044 104.000 26.000 L 152.000 26.000 C 190.642 26.044 221.956 57.358 222.000 96.000 ZM 182.000 96.000 L 182.000 168.000 C 181.997 179.500 173.137 189.057 161.670 189.930 L 165.370 197.320 C 166.850 200.286 165.646 203.890 162.680 205.370 C 159.714 206.850 156.110 205.646 154.630 202.680 L 148.290 190.000 L 107.710 190.000 L 101.370 202.680 C 99.890 205.646 96.286 206.850 93.320 205.370 C 90.354 203.890 89.150 200.286 90.630 197.320 L 94.330 189.930 C 82.863 189.057 74.003 179.500 74.000 168.000 L 74.000 96.000 C 74.000 83.850 83.850 74.000 96.000 74.000 L 160.000 74.000 C 172.150 74.000 182.000 83.850 182.000 96.000 ZM 86.000 96.000 L 86.000 146.000 L 170.000 146.000 L 170.000 96.000 C 170.000 90.477 165.523 86.000 160.000 86.000 L 96.000 86.000 C 90.477 86.000 86.000 90.477 86.000 96.000 ZM 118.000 158.000 L 118.000 178.000 L 138.000 178.000 L 138.000 158.000 ZM 96.000 178.000 L 106.000 178.000 L 106.000 158.000 L 86.000 158.000 L 86.000 168.000 C 86.000 173.523 90.477 178.000 96.000 178.000 ZM 170.000 168.000 L 170.000 158.000 L 150.000 158.000 L 150.000 178.000 L 160.000 178.000 C 165.523 178.000 170.000 173.523 170.000 168.000 Z"),
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
        return _subway!!
    }

private var _subway: ImageVector? = null
