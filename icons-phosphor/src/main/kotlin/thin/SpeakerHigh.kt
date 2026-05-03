package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SpeakerHigh: ImageVector
    get() {
        if (_speakerHigh != null) return _speakerHigh!!
        _speakerHigh = phosphorThinIcon(
            name = "SpeakerHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 153.760 28.410 C 152.387 27.734 150.749 27.901 149.540 28.840 L 78.630 84.000 L 32.000 84.000 C 25.373 84.000 20.000 89.373 20.000 96.000 L 20.000 160.000 C 20.000 166.627 25.373 172.000 32.000 172.000 L 78.630 172.000 L 149.540 227.160 C 150.246 227.701 151.110 227.996 152.000 228.000 C 152.611 228.002 153.213 227.862 153.760 227.590 C 155.130 226.919 155.999 225.526 156.000 224.000 L 156.000 32.000 C 155.999 30.474 155.130 29.081 153.760 28.410 ZM 28.000 160.000 L 28.000 96.000 C 28.000 93.791 29.791 92.000 32.000 92.000 L 76.000 92.000 L 76.000 164.000 L 32.000 164.000 C 29.791 164.000 28.000 162.209 28.000 160.000 ZM 148.000 215.820 L 84.000 166.000 L 84.000 90.000 L 148.000 40.220 ZM 195.000 104.210 C 206.980 117.811 206.980 138.199 195.000 151.800 C 193.536 153.457 191.007 153.614 189.350 152.150 C 187.693 150.686 187.536 148.157 189.000 146.500 C 198.310 135.923 198.310 120.077 189.000 109.500 C 187.657 107.832 187.865 105.403 189.473 103.988 C 191.080 102.573 193.517 102.676 195.000 104.220 ZM 244.000 128.000 C 244.013 146.697 237.122 164.741 224.650 178.670 C 223.175 180.327 220.637 180.475 218.980 179.000 C 217.323 177.525 217.175 174.987 218.650 173.330 C 241.734 147.518 241.734 108.482 218.650 82.670 C 217.175 81.013 217.323 78.475 218.980 77.000 C 220.637 75.525 223.175 75.673 224.650 77.330 C 237.122 91.259 244.013 109.303 244.000 128.000 Z"),
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
        return _speakerHigh!!
    }

private var _speakerHigh: ImageVector? = null
