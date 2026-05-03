package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NotEquals: ImageVector
    get() {
        if (_notEquals != null) return _notEquals!!
        _notEquals = phosphorThinIcon(
            name = "NotEquals",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.000 160.000 C 220.000 162.209 218.209 164.000 216.000 164.000 L 100.680 164.000 L 51.000 218.690 C 49.514 220.347 46.967 220.486 45.310 219.000 C 43.653 217.514 43.514 214.967 45.000 213.310 L 89.870 164.000 L 40.000 164.000 C 37.791 164.000 36.000 162.209 36.000 160.000 C 36.000 157.791 37.791 156.000 40.000 156.000 L 97.140 156.000 L 148.050 100.000 L 40.000 100.000 C 37.791 100.000 36.000 98.209 36.000 96.000 C 36.000 93.791 37.791 92.000 40.000 92.000 L 155.320 92.000 L 205.000 37.310 C 206.486 35.653 209.033 35.514 210.690 37.000 C 212.347 38.486 212.486 41.033 211.000 42.690 L 166.130 92.000 L 216.000 92.000 C 218.209 92.000 220.000 93.791 220.000 96.000 C 220.000 98.209 218.209 100.000 216.000 100.000 L 158.860 100.000 L 108.000 156.000 L 216.000 156.000 C 218.209 156.000 220.000 157.791 220.000 160.000 Z"),
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
        return _notEquals!!
    }

private var _notEquals: ImageVector? = null
