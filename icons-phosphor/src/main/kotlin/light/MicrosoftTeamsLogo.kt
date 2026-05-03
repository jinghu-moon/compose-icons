package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MicrosoftTeamsLogo: ImageVector
    get() {
        if (_microsoftTeamsLogo != null) return _microsoftTeamsLogo!!
        _microsoftTeamsLogo = phosphorLightIcon(
            name = "MicrosoftTeamsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 82.000 110.000 L 72.000 110.000 C 68.686 110.000 66.000 107.314 66.000 104.000 C 66.000 100.686 68.686 98.000 72.000 98.000 L 104.000 98.000 C 107.314 98.000 110.000 100.686 110.000 104.000 C 110.000 107.314 107.314 110.000 104.000 110.000 L 94.000 110.000 L 94.000 152.000 C 94.000 155.314 91.314 158.000 88.000 158.000 C 84.686 158.000 82.000 155.314 82.000 152.000 ZM 230.000 92.740 L 230.000 152.000 C 230.003 172.220 214.191 188.911 194.000 190.000 C 184.887 214.126 161.790 230.091 136.000 230.091 C 110.210 230.091 87.113 214.126 78.000 190.000 L 40.000 190.000 C 32.268 190.000 26.000 183.732 26.000 176.000 L 26.000 80.000 C 26.000 72.268 32.268 66.000 40.000 66.000 L 99.340 66.000 C 94.320 47.423 103.979 28.027 121.829 20.839 C 139.679 13.650 160.084 20.939 169.340 37.810 C 181.713 30.867 197.258 33.541 206.599 44.219 C 215.941 54.897 216.526 70.660 208.000 82.000 L 219.280 82.000 C 225.201 82.017 229.995 86.819 230.000 92.740 ZM 173.420 49.450 C 173.806 51.612 174.000 53.804 174.000 56.000 C 174.002 65.658 170.326 74.955 163.720 82.000 L 184.000 82.000 C 191.803 82.007 198.722 76.987 201.135 69.566 C 203.548 62.146 200.905 54.016 194.590 49.433 C 188.276 44.849 179.727 44.856 173.420 49.450 ZM 112.000 66.000 L 136.000 66.000 C 142.953 66.008 148.847 71.118 149.840 78.000 C 161.521 70.653 165.427 55.460 158.738 43.389 C 152.049 31.319 137.096 26.577 124.674 32.587 C 112.252 38.596 106.688 53.264 112.000 66.000 ZM 40.000 178.000 L 136.000 178.000 C 137.105 178.000 138.000 177.105 138.000 176.000 L 138.000 80.000 C 138.000 78.895 137.105 78.000 136.000 78.000 L 40.000 78.000 C 38.895 78.000 38.000 78.895 38.000 80.000 L 38.000 176.000 C 38.000 177.105 38.895 178.000 40.000 178.000 ZM 186.000 168.000 L 186.000 96.000 C 186.000 94.895 185.105 94.000 184.000 94.000 L 150.000 94.000 L 150.000 176.000 C 150.000 183.732 143.732 190.000 136.000 190.000 L 91.100 190.000 C 101.336 210.891 124.629 221.962 147.292 216.709 C 169.955 211.455 186.000 191.264 186.000 168.000 ZM 218.000 94.000 L 197.840 94.000 C 197.939 94.662 197.992 95.330 198.000 96.000 L 198.000 168.000 C 197.999 171.167 197.759 174.329 197.280 177.460 C 209.348 174.957 218.001 164.325 218.000 152.000 Z"),
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
        return _microsoftTeamsLogo!!
    }

private var _microsoftTeamsLogo: ImageVector? = null
