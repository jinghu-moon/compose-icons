package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileCloud: ImageVector
    get() {
        if (_fileCloud != null) return _fileCloud!!
        _fileCloud = phosphorBoldIcon(
            name = "FileCloud",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.490 79.520 L 160.490 23.520 C 158.239 21.266 155.185 20.000 152.000 20.000 L 56.000 20.000 C 44.954 20.000 36.000 28.954 36.000 40.000 L 36.000 124.000 C 36.000 130.627 41.373 136.000 48.000 136.000 C 54.627 136.000 60.000 130.627 60.000 124.000 L 60.000 44.000 L 136.000 44.000 L 136.000 92.000 C 136.000 98.627 141.373 104.000 148.000 104.000 L 196.000 104.000 L 196.000 212.000 L 180.000 212.000 C 173.373 212.000 168.000 217.373 168.000 224.000 C 168.000 230.627 173.373 236.000 180.000 236.000 L 200.000 236.000 C 211.046 236.000 220.000 227.046 220.000 216.000 L 220.000 88.000 C 220.000 84.820 218.737 81.770 216.490 79.520 ZM 160.000 57.000 L 183.000 80.000 L 160.000 80.000 ZM 108.000 124.000 C 86.330 123.996 66.602 136.494 57.350 156.090 C 35.835 157.536 19.339 175.775 20.054 197.326 C 20.768 218.877 38.437 235.983 60.000 236.000 L 108.000 236.000 C 138.928 236.000 164.000 210.928 164.000 180.000 C 164.000 149.072 138.928 124.000 108.000 124.000 ZM 108.000 212.000 L 60.000 212.000 C 52.454 211.998 45.936 206.723 44.359 199.344 C 42.781 191.965 46.574 184.487 53.460 181.400 C 55.870 186.186 61.161 188.795 66.425 187.792 C 71.689 186.789 75.649 182.417 76.130 177.080 C 76.291 175.291 76.599 173.518 77.050 171.780 C 77.170 171.420 77.270 171.060 77.360 170.690 C 82.147 154.949 98.089 145.403 114.225 148.616 C 130.361 151.829 141.431 166.754 139.823 183.128 C 138.214 199.501 124.452 211.988 108.000 212.000 Z"),
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
        return _fileCloud!!
    }

private var _fileCloud: ImageVector? = null
