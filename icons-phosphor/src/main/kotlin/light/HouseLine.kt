package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HouseLine: ImageVector
    get() {
        if (_houseLine != null) return _houseLine!!
        _houseLine = phosphorLightIcon(
            name = "HouseLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.000 210.000 L 222.000 210.000 L 222.000 131.170 L 227.760 136.930 C 230.110 139.239 233.882 139.222 236.211 136.891 C 238.539 134.560 238.552 130.787 236.240 128.440 L 137.900 30.090 C 135.274 27.464 131.713 25.989 128.000 25.989 C 124.287 25.989 120.726 27.464 118.100 30.090 L 19.760 128.440 C 17.448 130.787 17.461 134.560 19.789 136.891 C 22.118 139.222 25.890 139.239 28.240 136.930 L 34.000 131.170 L 34.000 210.000 L 16.000 210.000 C 12.686 210.000 10.000 212.686 10.000 216.000 C 10.000 219.314 12.686 222.000 16.000 222.000 L 240.000 222.000 C 243.314 222.000 246.000 219.314 246.000 216.000 C 246.000 212.686 243.314 210.000 240.000 210.000 ZM 46.000 119.170 L 126.580 38.580 C 126.956 38.201 127.467 37.988 128.000 37.988 C 128.533 37.988 129.044 38.201 129.420 38.580 L 210.000 119.170 L 210.000 210.000 L 158.000 210.000 L 158.000 152.000 C 158.000 148.686 155.314 146.000 152.000 146.000 L 104.000 146.000 C 100.686 146.000 98.000 148.686 98.000 152.000 L 98.000 210.000 L 46.000 210.000 ZM 146.000 210.000 L 110.000 210.000 L 110.000 158.000 L 146.000 158.000 Z"),
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
        return _houseLine!!
    }

private var _houseLine: ImageVector? = null
