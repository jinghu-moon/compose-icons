package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CaretCircleUpDown: ImageVector
    get() {
        if (_caretCircleUpDown != null) return _caretCircleUpDown!!
        _caretCircleUpDown = phosphorThinIcon(
            name = "CaretCircleUpDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.810 36.000 220.000 77.190 220.000 128.000 C 219.945 178.787 178.787 219.945 128.000 220.000 ZM 162.830 101.170 C 164.393 102.733 164.393 105.267 162.830 106.830 C 161.267 108.393 158.733 108.393 157.170 106.830 L 128.000 77.660 L 98.830 106.830 C 97.267 108.393 94.733 108.393 93.170 106.830 C 91.607 105.267 91.607 102.733 93.170 101.170 L 125.170 69.170 C 125.920 68.419 126.938 67.997 128.000 67.997 C 129.062 67.997 130.080 68.419 130.830 69.170 ZM 162.830 149.170 C 163.581 149.920 164.003 150.938 164.003 152.000 C 164.003 153.062 163.581 154.080 162.830 154.830 L 130.830 186.830 C 130.080 187.581 129.062 188.003 128.000 188.003 C 126.938 188.003 125.920 187.581 125.170 186.830 L 93.170 154.830 C 91.607 153.267 91.607 150.733 93.170 149.170 C 94.733 147.607 97.267 147.607 98.830 149.170 L 128.000 178.340 L 157.170 149.170 C 157.920 148.419 158.938 147.997 160.000 147.997 C 161.062 147.997 162.080 148.419 162.830 149.170 Z"),
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
        return _caretCircleUpDown!!
    }

private var _caretCircleUpDown: ImageVector? = null
