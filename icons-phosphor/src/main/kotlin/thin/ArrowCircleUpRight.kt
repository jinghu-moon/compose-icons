package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowCircleUpRight: ImageVector
    get() {
        if (_arrowCircleUpRight != null) return _arrowCircleUpRight!!
        _arrowCircleUpRight = phosphorThinIcon(
            name = "ArrowCircleUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.810 36.000 220.000 77.190 220.000 128.000 C 219.945 178.787 178.787 219.945 128.000 220.000 ZM 164.000 96.000 L 164.000 144.000 C 164.000 146.209 162.209 148.000 160.000 148.000 C 157.791 148.000 156.000 146.209 156.000 144.000 L 156.000 105.660 L 98.830 162.830 C 97.267 164.393 94.733 164.393 93.170 162.830 C 91.607 161.267 91.607 158.733 93.170 157.170 L 150.340 100.000 L 112.000 100.000 C 109.791 100.000 108.000 98.209 108.000 96.000 C 108.000 93.791 109.791 92.000 112.000 92.000 L 160.000 92.000 C 162.209 92.000 164.000 93.791 164.000 96.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _arrowCircleUpRight!!
    }

private var _arrowCircleUpRight: ImageVector? = null
