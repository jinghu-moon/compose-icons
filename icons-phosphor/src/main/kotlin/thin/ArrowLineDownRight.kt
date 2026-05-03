package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowLineDownRight: ImageVector
    get() {
        if (_arrowLineDownRight != null) return _arrowLineDownRight!!
        _arrowLineDownRight = phosphorThinIcon(
            name = "ArrowLineDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.000 40.000 C 220.000 42.209 218.209 44.000 216.000 44.000 L 40.000 44.000 C 37.791 44.000 36.000 42.209 36.000 40.000 C 36.000 37.791 37.791 36.000 40.000 36.000 L 216.000 36.000 C 218.209 36.000 220.000 37.791 220.000 40.000 ZM 192.000 100.000 C 189.791 100.000 188.000 101.791 188.000 104.000 L 188.000 190.340 L 82.830 85.170 C 81.267 83.607 78.733 83.607 77.170 85.170 C 75.607 86.733 75.607 89.267 77.170 90.830 L 182.340 196.000 L 96.000 196.000 C 93.791 196.000 92.000 197.791 92.000 200.000 C 92.000 202.209 93.791 204.000 96.000 204.000 L 192.000 204.000 C 194.209 204.000 196.000 202.209 196.000 200.000 L 196.000 104.000 C 196.000 101.791 194.209 100.000 192.000 100.000 Z"),
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
        return _arrowLineDownRight!!
    }

private var _arrowLineDownRight: ImageVector? = null
