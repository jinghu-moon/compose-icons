package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SplitVertical: ImageVector
    get() {
        if (_splitVertical != null) return _splitVertical!!
        _splitVertical = phosphorLightIcon(
            name = "SplitVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 214.000 152.000 C 214.000 155.314 211.314 158.000 208.000 158.000 L 134.000 158.000 L 134.000 217.510 L 155.760 195.760 C 158.124 193.557 161.808 193.622 164.093 195.907 C 166.378 198.192 166.443 201.876 164.240 204.240 L 132.240 236.240 C 129.897 238.580 126.103 238.580 123.760 236.240 L 91.760 204.240 C 89.557 201.876 89.622 198.192 91.907 195.907 C 94.192 193.622 97.876 193.557 100.240 195.760 L 122.000 217.510 L 122.000 158.000 L 48.000 158.000 C 44.686 158.000 42.000 155.314 42.000 152.000 C 42.000 148.686 44.686 146.000 48.000 146.000 L 208.000 146.000 C 211.314 146.000 214.000 148.686 214.000 152.000 ZM 48.000 110.000 L 208.000 110.000 C 211.314 110.000 214.000 107.314 214.000 104.000 C 214.000 100.686 211.314 98.000 208.000 98.000 L 134.000 98.000 L 134.000 38.490 L 155.760 60.240 C 158.124 62.443 161.808 62.378 164.093 60.093 C 166.378 57.808 166.443 54.124 164.240 51.760 L 132.240 19.760 C 129.897 17.420 126.103 17.420 123.760 19.760 L 91.760 51.760 C 89.557 54.124 89.622 57.808 91.907 60.093 C 94.192 62.378 97.876 62.443 100.240 60.240 L 122.000 38.490 L 122.000 98.000 L 48.000 98.000 C 44.686 98.000 42.000 100.686 42.000 104.000 C 42.000 107.314 44.686 110.000 48.000 110.000 Z"),
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
        return _splitVertical!!
    }

private var _splitVertical: ImageVector? = null
