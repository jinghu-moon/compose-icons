package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MusicNotesMinus: ImageVector
    get() {
        if (_musicNotesMinus != null) return _musicNotesMinus!!
        _musicNotesMinus = phosphorFillIcon(
            name = "MusicNotesMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 40.000 L 176.000 40.000 C 171.582 40.000 168.000 43.582 168.000 48.000 C 168.000 52.418 171.582 56.000 176.000 56.000 L 224.000 56.000 C 228.418 56.000 232.000 52.418 232.000 48.000 C 232.000 43.582 228.418 40.000 224.000 40.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 162.130 76.500 C 147.577 69.654 140.497 52.961 145.690 37.740 C 146.170 36.362 145.861 34.833 144.885 33.748 C 143.909 32.664 142.420 32.197 141.000 32.530 L 78.060 48.250 C 74.503 49.139 72.005 52.333 72.000 56.000 L 72.000 166.100 C 59.136 157.477 42.200 158.047 29.945 167.515 C 17.690 176.983 12.864 193.228 17.960 207.851 C 23.057 222.475 36.935 232.200 52.420 232.000 C 72.250 231.770 88.000 215.130 88.000 195.300 L 88.000 102.250 L 161.260 83.940 C 162.879 83.540 164.079 82.178 164.273 80.521 C 164.467 78.865 163.613 77.263 162.130 76.500 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 212.000 80.000 L 204.000 80.000 C 201.791 80.000 200.000 81.791 200.000 84.000 L 200.000 134.100 C 187.136 125.477 170.200 126.047 157.945 135.515 C 145.690 144.983 140.864 161.228 145.960 175.851 C 151.057 190.475 164.935 200.200 180.420 200.000 C 200.250 199.770 216.000 183.140 216.000 163.300 L 216.000 84.000 C 216.000 81.791 214.209 80.000 212.000 80.000 Z"),
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
        return _musicNotesMinus!!
    }

private var _musicNotesMinus: ImageVector? = null
