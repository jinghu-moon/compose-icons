package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SpeakerLow: ImageVector
    get() {
        if (_speakerLow != null) return _speakerLow!!
        _speakerLow = phosphorFillIcon(
            name = "SpeakerLow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 160.000 32.250 L 160.000 223.690 C 160.050 226.604 158.565 229.330 156.090 230.870 C 153.261 232.553 149.689 232.331 147.090 230.310 L 81.520 179.310 C 80.557 178.549 79.996 177.388 80.000 176.160 L 80.000 79.840 C 80.004 78.607 80.576 77.445 81.550 76.690 L 147.120 25.690 C 150.080 23.396 154.235 23.463 157.120 25.850 C 158.982 27.450 160.038 29.795 160.000 32.250 ZM 60.000 80.000 L 32.000 80.000 C 23.163 80.000 16.000 87.163 16.000 96.000 L 16.000 160.000 C 16.000 168.837 23.163 176.000 32.000 176.000 L 60.000 176.000 C 62.209 176.000 64.000 174.209 64.000 172.000 L 64.000 84.000 C 64.000 81.791 62.209 80.000 60.000 80.000 ZM 198.000 101.560 C 196.124 99.364 193.211 98.349 190.376 98.905 C 187.542 99.461 185.228 101.502 184.321 104.244 C 183.414 106.986 184.056 110.004 186.000 112.140 C 193.983 121.207 193.983 134.793 186.000 143.860 C 184.056 145.996 183.414 149.014 184.321 151.756 C 185.228 154.498 187.542 156.539 190.376 157.095 C 193.211 157.651 196.124 156.636 198.000 154.440 C 211.313 139.327 211.313 116.673 198.000 101.560 Z"),
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
        return _speakerLow!!
    }

private var _speakerLow: ImageVector? = null
