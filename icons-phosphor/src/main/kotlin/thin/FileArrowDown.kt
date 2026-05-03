package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FileArrowDown: ImageVector
    get() {
        if (_fileArrowDown != null) return _fileArrowDown!!
        _fileArrowDown = phosphorThinIcon(
            name = "FileArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 210.830 85.170 L 154.830 29.170 C 154.079 28.420 153.061 27.999 152.000 28.000 L 56.000 28.000 C 49.373 28.000 44.000 33.373 44.000 40.000 L 44.000 216.000 C 44.000 222.627 49.373 228.000 56.000 228.000 L 200.000 228.000 C 206.627 228.000 212.000 222.627 212.000 216.000 L 212.000 88.000 C 212.001 86.939 211.580 85.921 210.830 85.170 ZM 156.000 41.650 L 198.340 84.000 L 156.000 84.000 ZM 200.000 220.000 L 56.000 220.000 C 53.791 220.000 52.000 218.209 52.000 216.000 L 52.000 40.000 C 52.000 37.791 53.791 36.000 56.000 36.000 L 148.000 36.000 L 148.000 88.000 C 148.000 90.209 149.791 92.000 152.000 92.000 L 204.000 92.000 L 204.000 216.000 C 204.000 218.209 202.209 220.000 200.000 220.000 ZM 154.830 157.170 C 155.581 157.920 156.003 158.938 156.003 160.000 C 156.003 161.062 155.581 162.080 154.830 162.830 L 130.830 186.830 C 130.080 187.581 129.062 188.003 128.000 188.003 C 126.938 188.003 125.920 187.581 125.170 186.830 L 101.170 162.830 C 99.607 161.267 99.607 158.733 101.170 157.170 C 102.733 155.607 105.267 155.607 106.830 157.170 L 124.000 174.340 L 124.000 120.000 C 124.000 117.791 125.791 116.000 128.000 116.000 C 130.209 116.000 132.000 117.791 132.000 120.000 L 132.000 174.340 L 149.170 157.170 C 149.920 156.419 150.938 155.997 152.000 155.997 C 153.062 155.997 154.080 156.419 154.830 157.170 Z"),
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
        return _fileArrowDown!!
    }

private var _fileArrowDown: ImageVector? = null
