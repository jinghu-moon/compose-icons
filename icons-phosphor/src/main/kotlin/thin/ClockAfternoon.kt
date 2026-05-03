package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ClockAfternoon: ImageVector
    get() {
        if (_clockAfternoon != null) return _clockAfternoon!!
        _clockAfternoon = phosphorThinIcon(
            name = "ClockAfternoon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.810 36.000 220.000 77.190 220.000 128.000 C 219.945 178.787 178.787 219.945 128.000 220.000 ZM 188.000 128.000 C 188.000 130.209 186.209 132.000 184.000 132.000 L 137.660 132.000 L 170.830 165.170 C 172.393 166.733 172.393 169.267 170.830 170.830 C 169.267 172.393 166.733 172.393 165.170 170.830 L 125.170 130.830 C 124.025 129.686 123.682 127.964 124.302 126.469 C 124.921 124.973 126.381 123.999 128.000 124.000 L 184.000 124.000 C 186.209 124.000 188.000 125.791 188.000 128.000 Z"),
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
        return _clockAfternoon!!
    }

private var _clockAfternoon: ImageVector? = null
