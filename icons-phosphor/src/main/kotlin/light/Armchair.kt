package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Armchair: ImageVector
    get() {
        if (_armchair != null) return _armchair!!
        _armchair = phosphorLightIcon(
            name = "Armchair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 214.000 90.480 L 214.000 72.000 C 214.000 51.013 196.987 34.000 176.000 34.000 L 80.000 34.000 C 59.013 34.000 42.000 51.013 42.000 72.000 L 42.000 90.480 C 23.559 93.423 9.990 109.330 9.990 128.005 C 9.990 146.680 23.559 162.587 42.000 165.530 L 42.000 200.000 C 42.000 207.732 48.268 214.000 56.000 214.000 L 200.000 214.000 C 207.732 214.000 214.000 207.732 214.000 200.000 L 214.000 165.530 C 232.370 162.520 245.856 146.645 245.856 128.030 C 245.856 109.415 232.370 93.540 214.000 90.530 ZM 80.000 46.000 L 176.000 46.000 C 190.359 46.000 202.000 57.641 202.000 72.000 L 202.000 90.480 C 183.576 93.447 170.023 109.338 170.000 128.000 L 170.000 130.000 L 86.000 130.000 L 86.000 128.000 C 85.977 109.338 72.424 93.447 54.000 90.480 L 54.000 72.000 C 54.000 57.641 65.641 46.000 80.000 46.000 ZM 208.350 154.000 L 208.000 154.000 C 204.686 154.000 202.000 156.686 202.000 160.000 L 202.000 200.000 C 202.000 201.105 201.105 202.000 200.000 202.000 L 56.000 202.000 C 54.895 202.000 54.000 201.105 54.000 200.000 L 54.000 160.000 L 54.000 160.000 C 54.000 156.686 51.314 154.000 48.000 154.000 L 47.650 154.000 C 33.338 153.807 21.873 142.083 22.001 127.770 C 22.129 113.457 33.802 101.939 48.115 102.003 C 62.429 102.066 73.999 113.686 74.000 128.000 L 74.000 168.000 C 74.000 171.314 76.686 174.000 80.000 174.000 C 83.314 174.000 86.000 171.314 86.000 168.000 L 86.000 142.000 L 170.000 142.000 L 170.000 168.000 C 170.000 171.314 172.686 174.000 176.000 174.000 C 179.314 174.000 182.000 171.314 182.000 168.000 L 182.000 128.000 C 182.001 113.686 193.571 102.066 207.885 102.003 C 222.198 101.939 233.871 113.457 233.999 127.770 C 234.127 142.083 222.662 153.807 208.350 154.000 Z"),
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
        return _armchair!!
    }

private var _armchair: ImageVector? = null
