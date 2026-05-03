package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowCircleDownRight: ImageVector
    get() {
        if (_arrowCircleDownRight != null) return _arrowCircleDownRight!!
        _arrowCircleDownRight = phosphorThinIcon(
            name = "ArrowCircleDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.810 36.000 220.000 77.190 220.000 128.000 C 219.945 178.787 178.787 219.945 128.000 220.000 ZM 164.000 112.000 L 164.000 160.000 C 164.000 162.209 162.209 164.000 160.000 164.000 L 112.000 164.000 C 109.791 164.000 108.000 162.209 108.000 160.000 C 108.000 157.791 109.791 156.000 112.000 156.000 L 150.340 156.000 L 93.170 98.830 C 91.607 97.267 91.607 94.733 93.170 93.170 C 94.733 91.607 97.267 91.607 98.830 93.170 L 156.000 150.340 L 156.000 112.000 C 156.000 109.791 157.791 108.000 160.000 108.000 C 162.209 108.000 164.000 109.791 164.000 112.000 Z"),
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
        return _arrowCircleDownRight!!
    }

private var _arrowCircleDownRight: ImageVector? = null
