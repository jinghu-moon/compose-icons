package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MathOperations: ImageVector
    get() {
        if (_mathOperations != null) return _mathOperations!!
        _mathOperations = phosphorLightIcon(
            name = "MathOperations",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 110.000 72.000 C 110.000 75.314 107.314 78.000 104.000 78.000 L 40.000 78.000 C 36.686 78.000 34.000 75.314 34.000 72.000 C 34.000 68.686 36.686 66.000 40.000 66.000 L 104.000 66.000 C 107.314 66.000 110.000 68.686 110.000 72.000 ZM 104.000 178.000 L 78.000 178.000 L 78.000 152.000 C 78.000 148.686 75.314 146.000 72.000 146.000 C 68.686 146.000 66.000 148.686 66.000 152.000 L 66.000 178.000 L 40.000 178.000 C 36.686 178.000 34.000 180.686 34.000 184.000 C 34.000 187.314 36.686 190.000 40.000 190.000 L 66.000 190.000 L 66.000 216.000 C 66.000 219.314 68.686 222.000 72.000 222.000 C 75.314 222.000 78.000 219.314 78.000 216.000 L 78.000 190.000 L 104.000 190.000 C 107.314 190.000 110.000 187.314 110.000 184.000 C 110.000 180.686 107.314 178.000 104.000 178.000 ZM 152.000 174.000 L 216.000 174.000 C 219.314 174.000 222.000 171.314 222.000 168.000 C 222.000 164.686 219.314 162.000 216.000 162.000 L 152.000 162.000 C 148.686 162.000 146.000 164.686 146.000 168.000 C 146.000 171.314 148.686 174.000 152.000 174.000 ZM 216.000 194.000 L 152.000 194.000 C 148.686 194.000 146.000 196.686 146.000 200.000 C 146.000 203.314 148.686 206.000 152.000 206.000 L 216.000 206.000 C 219.314 206.000 222.000 203.314 222.000 200.000 C 222.000 196.686 219.314 194.000 216.000 194.000 ZM 155.760 100.240 C 158.103 102.580 161.897 102.580 164.240 100.240 L 184.000 80.490 L 203.760 100.240 C 206.124 102.443 209.808 102.378 212.093 100.093 C 214.378 97.808 214.443 94.124 212.240 91.760 L 192.490 72.000 L 212.240 52.240 C 214.443 49.876 214.378 46.192 212.093 43.907 C 209.808 41.622 206.124 41.557 203.760 43.760 L 184.000 63.510 L 164.240 43.760 C 161.876 41.557 158.192 41.622 155.907 43.907 C 153.622 46.192 153.557 49.876 155.760 52.240 L 175.510 72.000 L 155.760 91.760 C 153.420 94.103 153.420 97.897 155.760 100.240 Z"),
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
        return _mathOperations!!
    }

private var _mathOperations: ImageVector? = null
