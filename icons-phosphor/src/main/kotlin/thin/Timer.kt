package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Timer: ImageVector
    get() {
        if (_timer != null) return _timer!!
        _timer = phosphorThinIcon(
            name = "Timer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 44.000 C 77.190 44.000 36.000 85.190 36.000 136.000 C 36.000 186.810 77.190 228.000 128.000 228.000 C 178.810 228.000 220.000 186.810 220.000 136.000 C 219.945 85.213 178.787 44.055 128.000 44.000 ZM 128.000 220.000 C 81.608 220.000 44.000 182.392 44.000 136.000 C 44.000 89.608 81.608 52.000 128.000 52.000 C 174.392 52.000 212.000 89.608 212.000 136.000 C 211.950 182.371 174.371 219.950 128.000 220.000 ZM 170.830 93.170 C 171.581 93.920 172.003 94.938 172.003 96.000 C 172.003 97.062 171.581 98.080 170.830 98.830 L 130.830 138.830 C 129.267 140.393 126.733 140.393 125.170 138.830 C 123.607 137.267 123.607 134.733 125.170 133.170 L 165.170 93.170 C 165.920 92.419 166.938 91.997 168.000 91.997 C 169.062 91.997 170.080 92.419 170.830 93.170 ZM 100.000 16.000 C 100.000 13.791 101.791 12.000 104.000 12.000 L 152.000 12.000 C 154.209 12.000 156.000 13.791 156.000 16.000 C 156.000 18.209 154.209 20.000 152.000 20.000 L 104.000 20.000 C 101.791 20.000 100.000 18.209 100.000 16.000 Z"),
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
        return _timer!!
    }

private var _timer: ImageVector? = null
