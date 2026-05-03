package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowCircleRight: ImageVector
    get() {
        if (_arrowCircleRight != null) return _arrowCircleRight!!
        _arrowCircleRight = phosphorThinIcon(
            name = "ArrowCircleRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.810 36.000 220.000 77.190 220.000 128.000 C 219.945 178.787 178.787 219.945 128.000 220.000 ZM 170.830 125.170 C 171.581 125.920 172.003 126.938 172.003 128.000 C 172.003 129.062 171.581 130.080 170.830 130.830 L 138.830 162.830 C 137.267 164.393 134.733 164.393 133.170 162.830 C 131.607 161.267 131.607 158.733 133.170 157.170 L 158.340 132.000 L 88.000 132.000 C 85.791 132.000 84.000 130.209 84.000 128.000 C 84.000 125.791 85.791 124.000 88.000 124.000 L 158.340 124.000 L 133.170 98.830 C 131.607 97.267 131.607 94.733 133.170 93.170 C 134.733 91.607 137.267 91.607 138.830 93.170 Z"),
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
        return _arrowCircleRight!!
    }

private var _arrowCircleRight: ImageVector? = null
