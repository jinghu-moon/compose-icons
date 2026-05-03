package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FileIni: ImageVector
    get() {
        if (_fileIni != null) return _fileIni!!
        _fileIni = phosphorThinIcon(
            name = "FileIni",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 44.000 152.000 L 44.000 208.000 C 44.000 210.209 42.209 212.000 40.000 212.000 C 37.791 212.000 36.000 210.209 36.000 208.000 L 36.000 152.000 C 36.000 149.791 37.791 148.000 40.000 148.000 C 42.209 148.000 44.000 149.791 44.000 152.000 ZM 120.000 148.000 C 117.791 148.000 116.000 149.791 116.000 152.000 L 116.000 195.520 L 83.250 149.680 C 82.239 148.270 80.433 147.673 78.781 148.202 C 77.128 148.731 76.005 150.265 76.000 152.000 L 76.000 208.000 C 76.000 210.209 77.791 212.000 80.000 212.000 C 82.209 212.000 84.000 210.209 84.000 208.000 L 84.000 164.480 L 116.750 210.320 C 117.761 211.730 119.567 212.327 121.219 211.798 C 122.872 211.269 123.995 209.735 124.000 208.000 L 124.000 152.000 C 124.000 149.791 122.209 148.000 120.000 148.000 ZM 160.000 148.000 C 157.791 148.000 156.000 149.791 156.000 152.000 L 156.000 208.000 C 156.000 210.209 157.791 212.000 160.000 212.000 C 162.209 212.000 164.000 210.209 164.000 208.000 L 164.000 152.000 C 164.000 149.791 162.209 148.000 160.000 148.000 ZM 212.000 88.000 L 212.000 224.000 C 212.000 226.209 210.209 228.000 208.000 228.000 C 205.791 228.000 204.000 226.209 204.000 224.000 L 204.000 92.000 L 152.000 92.000 C 149.791 92.000 148.000 90.209 148.000 88.000 L 148.000 36.000 L 56.000 36.000 C 53.791 36.000 52.000 37.791 52.000 40.000 L 52.000 112.000 C 52.000 114.209 50.209 116.000 48.000 116.000 C 45.791 116.000 44.000 114.209 44.000 112.000 L 44.000 40.000 C 44.000 33.373 49.373 28.000 56.000 28.000 L 152.000 28.000 C 153.061 27.999 154.079 28.420 154.830 29.170 L 210.830 85.170 C 211.580 85.921 212.001 86.939 212.000 88.000 ZM 156.000 84.000 L 198.340 84.000 L 156.000 41.650 Z"),
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
        return _fileIni!!
    }

private var _fileIni: ImageVector? = null
