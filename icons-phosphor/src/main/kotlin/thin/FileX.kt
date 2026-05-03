package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FileX: ImageVector
    get() {
        if (_fileX != null) return _fileX!!
        _fileX = phosphorThinIcon(
            name = "FileX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 210.830 85.170 L 154.830 29.170 C 154.079 28.420 153.061 27.999 152.000 28.000 L 56.000 28.000 C 49.373 28.000 44.000 33.373 44.000 40.000 L 44.000 216.000 C 44.000 222.627 49.373 228.000 56.000 228.000 L 200.000 228.000 C 206.627 228.000 212.000 222.627 212.000 216.000 L 212.000 88.000 C 212.001 86.939 211.580 85.921 210.830 85.170 ZM 156.000 41.650 L 198.340 84.000 L 156.000 84.000 ZM 200.000 220.000 L 56.000 220.000 C 53.791 220.000 52.000 218.209 52.000 216.000 L 52.000 40.000 C 52.000 37.791 53.791 36.000 56.000 36.000 L 148.000 36.000 L 148.000 88.000 C 148.000 90.209 149.791 92.000 152.000 92.000 L 204.000 92.000 L 204.000 216.000 C 204.000 218.209 202.209 220.000 200.000 220.000 ZM 154.830 130.830 L 133.660 152.000 L 154.830 173.170 C 156.393 174.733 156.393 177.267 154.830 178.830 C 153.267 180.393 150.733 180.393 149.170 178.830 L 128.000 157.660 L 106.830 178.830 C 105.267 180.393 102.733 180.393 101.170 178.830 C 99.607 177.267 99.607 174.733 101.170 173.170 L 122.340 152.000 L 101.170 130.830 C 99.607 129.267 99.607 126.733 101.170 125.170 C 102.733 123.607 105.267 123.607 106.830 125.170 L 128.000 146.340 L 149.170 125.170 C 150.733 123.607 153.267 123.607 154.830 125.170 C 156.393 126.733 156.393 129.267 154.830 130.830 Z"),
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
        return _fileX!!
    }

private var _fileX: ImageVector? = null
