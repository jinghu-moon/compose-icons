package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CaretCircleLeft: ImageVector
    get() {
        if (_caretCircleLeft != null) return _caretCircleLeft!!
        _caretCircleLeft = phosphorThinIcon(
            name = "CaretCircleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.810 36.000 220.000 77.190 220.000 128.000 C 219.945 178.787 178.787 219.945 128.000 220.000 ZM 146.830 90.830 L 109.660 128.000 L 146.830 165.170 C 148.393 166.733 148.393 169.267 146.830 170.830 C 145.267 172.393 142.733 172.393 141.170 170.830 L 101.170 130.830 C 100.419 130.080 99.997 129.062 99.997 128.000 C 99.997 126.938 100.419 125.920 101.170 125.170 L 141.170 85.170 C 142.733 83.607 145.267 83.607 146.830 85.170 C 148.393 86.733 148.393 89.267 146.830 90.830 Z"),
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
        return _caretCircleLeft!!
    }

private var _caretCircleLeft: ImageVector? = null
