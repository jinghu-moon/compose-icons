package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowSquareLeft: ImageVector
    get() {
        if (_arrowSquareLeft != null) return _arrowSquareLeft!!
        _arrowSquareLeft = phosphorThinIcon(
            name = "ArrowSquareLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 36.000 L 48.000 36.000 C 41.373 36.000 36.000 41.373 36.000 48.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 208.000 220.000 C 214.627 220.000 220.000 214.627 220.000 208.000 L 220.000 48.000 C 220.000 41.373 214.627 36.000 208.000 36.000 ZM 212.000 208.000 C 212.000 210.209 210.209 212.000 208.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 48.000 C 44.000 45.791 45.791 44.000 48.000 44.000 L 208.000 44.000 C 210.209 44.000 212.000 45.791 212.000 48.000 ZM 172.000 128.000 C 172.000 130.209 170.209 132.000 168.000 132.000 L 97.660 132.000 L 122.830 157.170 C 124.393 158.733 124.393 161.267 122.830 162.830 C 121.267 164.393 118.733 164.393 117.170 162.830 L 85.170 130.830 C 84.419 130.080 83.997 129.062 83.997 128.000 C 83.997 126.938 84.419 125.920 85.170 125.170 L 117.170 93.170 C 118.733 91.607 121.267 91.607 122.830 93.170 C 124.393 94.733 124.393 97.267 122.830 98.830 L 97.660 124.000 L 168.000 124.000 C 170.209 124.000 172.000 125.791 172.000 128.000 Z"),
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
        return _arrowSquareLeft!!
    }

private var _arrowSquareLeft: ImageVector? = null
