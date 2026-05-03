package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MicrosoftWordLogo: ImageVector
    get() {
        if (_microsoftWordLogo != null) return _microsoftWordLogo!!
        _microsoftWordLogo = phosphorLightIcon(
            name = "MicrosoftWordLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 26.000 L 72.000 26.000 C 64.268 26.000 58.000 32.268 58.000 40.000 L 58.000 66.000 L 40.000 66.000 C 32.268 66.000 26.000 72.268 26.000 80.000 L 26.000 176.000 C 26.000 183.732 32.268 190.000 40.000 190.000 L 58.000 190.000 L 58.000 216.000 C 58.000 223.732 64.268 230.000 72.000 230.000 L 200.000 230.000 C 207.732 230.000 214.000 223.732 214.000 216.000 L 214.000 40.000 C 214.000 32.268 207.732 26.000 200.000 26.000 ZM 158.000 102.000 L 202.000 102.000 L 202.000 154.000 L 158.000 154.000 ZM 70.000 40.000 C 70.000 38.895 70.895 38.000 72.000 38.000 L 200.000 38.000 C 201.105 38.000 202.000 38.895 202.000 40.000 L 202.000 90.000 L 158.000 90.000 L 158.000 80.000 C 158.000 72.268 151.732 66.000 144.000 66.000 L 70.000 66.000 ZM 38.000 176.000 L 38.000 80.000 C 38.000 78.895 38.895 78.000 40.000 78.000 L 144.000 78.000 C 145.105 78.000 146.000 78.895 146.000 80.000 L 146.000 176.000 C 146.000 177.105 145.105 178.000 144.000 178.000 L 40.000 178.000 C 38.895 178.000 38.000 177.105 38.000 176.000 ZM 200.000 218.000 L 72.000 218.000 C 70.895 218.000 70.000 217.105 70.000 216.000 L 70.000 190.000 L 144.000 190.000 C 151.732 190.000 158.000 183.732 158.000 176.000 L 158.000 166.000 L 202.000 166.000 L 202.000 216.000 C 202.000 217.105 201.105 218.000 200.000 218.000 ZM 70.180 153.460 L 58.180 105.460 C 57.374 102.246 59.326 98.986 62.540 98.180 C 65.754 97.374 69.014 99.326 69.820 102.540 L 77.890 134.810 L 86.630 117.320 C 87.645 115.284 89.725 113.996 92.000 113.996 C 94.275 113.996 96.355 115.284 97.370 117.320 L 106.110 134.810 L 114.180 102.540 C 114.986 99.326 118.246 97.374 121.460 98.180 C 124.674 98.986 126.626 102.246 125.820 105.460 L 113.820 153.460 C 113.207 155.894 111.145 157.689 108.650 157.960 C 108.434 157.975 108.216 157.975 108.000 157.960 C 105.725 157.961 103.646 156.675 102.630 154.640 L 92.000 133.420 L 81.370 154.680 C 80.249 156.928 77.847 158.240 75.350 157.968 C 72.853 157.695 70.790 155.897 70.180 153.460 Z"),
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
        return _microsoftWordLogo!!
    }

private var _microsoftWordLogo: ImageVector? = null
