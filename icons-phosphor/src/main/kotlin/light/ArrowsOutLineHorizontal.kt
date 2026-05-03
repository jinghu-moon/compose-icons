package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsOutLineHorizontal: ImageVector
    get() {
        if (_arrowsOutLineHorizontal != null) return _arrowsOutLineHorizontal!!
        _arrowsOutLineHorizontal = phosphorLightIcon(
            name = "ArrowsOutLineHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 134.000 40.000 L 134.000 216.000 C 134.000 219.314 131.314 222.000 128.000 222.000 C 124.686 222.000 122.000 219.314 122.000 216.000 L 122.000 40.000 C 122.000 36.686 124.686 34.000 128.000 34.000 C 131.314 34.000 134.000 36.686 134.000 40.000 ZM 96.000 122.000 L 30.490 122.000 L 52.240 100.240 C 54.443 97.876 54.378 94.192 52.093 91.907 C 49.808 89.622 46.124 89.557 43.760 91.760 L 11.760 123.760 C 9.420 126.103 9.420 129.897 11.760 132.240 L 43.760 164.240 C 46.124 166.443 49.808 166.378 52.093 164.093 C 54.378 161.808 54.443 158.124 52.240 155.760 L 30.490 134.000 L 96.000 134.000 C 99.314 134.000 102.000 131.314 102.000 128.000 C 102.000 124.686 99.314 122.000 96.000 122.000 ZM 244.240 123.760 L 212.240 91.760 C 209.876 89.557 206.192 89.622 203.907 91.907 C 201.622 94.192 201.557 97.876 203.760 100.240 L 225.510 122.000 L 160.000 122.000 C 156.686 122.000 154.000 124.686 154.000 128.000 C 154.000 131.314 156.686 134.000 160.000 134.000 L 225.510 134.000 L 203.760 155.760 C 202.155 157.256 201.494 159.508 202.037 161.634 C 202.580 163.760 204.240 165.420 206.366 165.963 C 208.492 166.506 210.744 165.845 212.240 164.240 L 244.240 132.240 C 246.580 129.897 246.580 126.103 244.240 123.760 Z"),
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
        return _arrowsOutLineHorizontal!!
    }

private var _arrowsOutLineHorizontal: ImageVector? = null
