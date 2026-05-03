package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextStrikethrough: ImageVector
    get() {
        if (_textStrikethrough != null) return _textStrikethrough!!
        _textStrikethrough = phosphorLightIcon(
            name = "TextStrikethrough",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 222.000 128.000 C 222.000 131.314 219.314 134.000 216.000 134.000 L 169.450 134.000 C 180.730 140.920 190.000 151.380 190.000 168.000 C 190.000 193.360 162.190 214.000 128.000 214.000 C 93.810 214.000 66.000 193.360 66.000 168.000 C 66.000 164.686 68.686 162.000 72.000 162.000 C 75.314 162.000 78.000 164.686 78.000 168.000 C 78.000 186.750 100.430 202.000 128.000 202.000 C 155.570 202.000 178.000 186.750 178.000 168.000 C 178.000 149.770 162.540 141.410 137.530 134.000 L 40.000 134.000 C 36.686 134.000 34.000 131.314 34.000 128.000 C 34.000 124.686 36.686 122.000 40.000 122.000 L 216.000 122.000 C 219.314 122.000 222.000 124.686 222.000 128.000 ZM 76.330 102.000 C 76.968 101.997 77.603 101.896 78.210 101.700 C 81.342 100.650 83.036 97.266 82.000 94.130 C 81.383 92.146 81.082 90.077 81.110 88.000 C 81.110 68.620 101.270 54.000 128.000 54.000 C 147.580 54.000 163.560 61.810 170.740 74.890 C 172.336 77.795 175.985 78.856 178.890 77.260 C 181.795 75.664 182.856 72.015 181.260 69.110 C 171.940 52.130 152.000 42.000 128.000 42.000 C 94.430 42.000 69.110 61.770 69.110 88.000 C 69.091 91.350 69.604 94.681 70.630 97.870 C 71.438 100.334 73.737 102.000 76.330 102.000 Z"),
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
        return _textStrikethrough!!
    }

private var _textStrikethrough: ImageVector? = null
