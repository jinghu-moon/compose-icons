package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FileCode: ImageVector
    get() {
        if (_fileCode != null) return _fileCode!!
        _fileCode = phosphorThinIcon(
            name = "FileCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 178.830 149.170 C 179.581 149.920 180.003 150.938 180.003 152.000 C 180.003 153.062 179.581 154.080 178.830 154.830 L 154.830 178.830 C 153.267 180.393 150.733 180.393 149.170 178.830 C 147.607 177.267 147.607 174.733 149.170 173.170 L 170.340 152.000 L 149.170 130.830 C 147.607 129.267 147.607 126.733 149.170 125.170 C 150.733 123.607 153.267 123.607 154.830 125.170 ZM 106.830 125.170 C 106.080 124.419 105.062 123.997 104.000 123.997 C 102.938 123.997 101.920 124.419 101.170 125.170 L 77.170 149.170 C 76.419 149.920 75.997 150.938 75.997 152.000 C 75.997 153.062 76.419 154.080 77.170 154.830 L 101.170 178.830 C 102.733 180.393 105.267 180.393 106.830 178.830 C 108.393 177.267 108.393 174.733 106.830 173.170 L 85.660 152.000 L 106.830 130.830 C 107.581 130.080 108.003 129.062 108.003 128.000 C 108.003 126.938 107.581 125.920 106.830 125.170 ZM 212.000 88.000 L 212.000 216.000 C 212.000 222.627 206.627 228.000 200.000 228.000 L 56.000 228.000 C 49.373 228.000 44.000 222.627 44.000 216.000 L 44.000 40.000 C 44.000 33.373 49.373 28.000 56.000 28.000 L 152.000 28.000 C 153.061 27.999 154.079 28.420 154.830 29.170 L 210.830 85.170 C 211.580 85.921 212.001 86.939 212.000 88.000 ZM 156.000 84.000 L 198.340 84.000 L 156.000 41.650 ZM 204.000 216.000 L 204.000 92.000 L 152.000 92.000 C 149.791 92.000 148.000 90.209 148.000 88.000 L 148.000 36.000 L 56.000 36.000 C 53.791 36.000 52.000 37.791 52.000 40.000 L 52.000 216.000 C 52.000 218.209 53.791 220.000 56.000 220.000 L 200.000 220.000 C 202.209 220.000 204.000 218.209 204.000 216.000 Z"),
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
        return _fileCode!!
    }

private var _fileCode: ImageVector? = null
