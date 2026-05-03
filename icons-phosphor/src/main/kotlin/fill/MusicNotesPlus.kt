package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MusicNotesPlus: ImageVector
    get() {
        if (_musicNotesPlus != null) return _musicNotesPlus!!
        _musicNotesPlus = phosphorFillIcon(
            name = "MusicNotesPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 48.000 C 232.000 52.418 228.418 56.000 224.000 56.000 L 208.000 56.000 L 208.000 72.000 C 208.000 76.418 204.418 80.000 200.000 80.000 C 195.582 80.000 192.000 76.418 192.000 72.000 L 192.000 56.000 L 176.000 56.000 C 171.582 56.000 168.000 52.418 168.000 48.000 C 168.000 43.582 171.582 40.000 176.000 40.000 L 192.000 40.000 L 192.000 24.000 C 192.000 19.582 195.582 16.000 200.000 16.000 C 204.418 16.000 208.000 19.582 208.000 24.000 L 208.000 40.000 L 224.000 40.000 C 228.418 40.000 232.000 43.582 232.000 48.000 ZM 160.600 77.860 L 153.840 71.100 C 147.944 65.336 144.431 57.564 144.000 49.330 C 143.827 45.373 144.394 41.419 145.670 37.670 C 146.128 36.287 145.798 34.764 144.808 33.695 C 143.818 32.625 142.324 32.179 140.910 32.530 L 78.060 48.250 C 74.503 49.139 72.005 52.333 72.000 56.000 L 72.000 166.100 C 59.136 157.477 42.200 158.047 29.945 167.515 C 17.690 176.983 12.864 193.228 17.960 207.851 C 23.057 222.475 36.935 232.200 52.420 232.000 C 72.250 231.770 88.000 215.130 88.000 195.300 L 88.000 102.250 L 158.740 84.560 C 160.135 84.209 161.234 83.137 161.618 81.751 C 162.003 80.365 161.614 78.880 160.600 77.860 ZM 210.710 102.170 C 208.400 102.986 206.005 103.532 203.570 103.800 C 201.530 104.021 199.988 105.748 200.000 107.800 L 200.000 134.100 C 187.136 125.477 170.200 126.047 157.945 135.515 C 145.690 144.983 140.864 161.228 145.960 175.851 C 151.057 190.475 164.935 200.200 180.420 200.000 C 200.250 199.770 216.000 183.140 216.000 163.300 L 216.000 106.000 C 216.014 104.702 215.398 103.478 214.346 102.716 C 213.294 101.955 211.939 101.751 210.710 102.170 Z"),
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
        return _musicNotesPlus!!
    }

private var _musicNotesPlus: ImageVector? = null
