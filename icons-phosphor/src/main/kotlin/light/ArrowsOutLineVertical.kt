package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsOutLineVertical: ImageVector
    get() {
        if (_arrowsOutLineVertical != null) return _arrowsOutLineVertical!!
        _arrowsOutLineVertical = phosphorLightIcon(
            name = "ArrowsOutLineVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 222.000 128.000 C 222.000 131.314 219.314 134.000 216.000 134.000 L 40.000 134.000 C 36.686 134.000 34.000 131.314 34.000 128.000 C 34.000 124.686 36.686 122.000 40.000 122.000 L 216.000 122.000 C 219.314 122.000 222.000 124.686 222.000 128.000 ZM 100.240 52.240 L 122.000 30.490 L 122.000 96.000 C 122.000 99.314 124.686 102.000 128.000 102.000 C 131.314 102.000 134.000 99.314 134.000 96.000 L 134.000 30.490 L 155.760 52.240 C 158.124 54.443 161.808 54.378 164.093 52.093 C 166.378 49.808 166.443 46.124 164.240 43.760 L 132.240 11.760 C 129.897 9.420 126.103 9.420 123.760 11.760 L 91.760 43.760 C 89.557 46.124 89.622 49.808 91.907 52.093 C 94.192 54.378 97.876 54.443 100.240 52.240 ZM 155.760 203.760 L 134.000 225.510 L 134.000 160.000 C 134.000 156.686 131.314 154.000 128.000 154.000 C 124.686 154.000 122.000 156.686 122.000 160.000 L 122.000 225.510 L 100.240 203.760 C 97.876 201.557 94.192 201.622 91.907 203.907 C 89.622 206.192 89.557 209.876 91.760 212.240 L 123.760 244.240 C 126.103 246.580 129.897 246.580 132.240 244.240 L 164.240 212.240 C 166.443 209.876 166.378 206.192 164.093 203.907 C 161.808 201.622 158.124 201.557 155.760 203.760 Z"),
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
        return _arrowsOutLineVertical!!
    }

private var _arrowsOutLineVertical: ImageVector? = null
