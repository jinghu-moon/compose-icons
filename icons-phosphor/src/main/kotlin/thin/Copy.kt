package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Copy: ImageVector
    get() {
        if (_copy != null) return _copy!!
        _copy = phosphorThinIcon(
            name = "Copy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 36.000 L 88.000 36.000 C 85.791 36.000 84.000 37.791 84.000 40.000 L 84.000 84.000 L 40.000 84.000 C 37.791 84.000 36.000 85.791 36.000 88.000 L 36.000 216.000 C 36.000 218.209 37.791 220.000 40.000 220.000 L 168.000 220.000 C 170.209 220.000 172.000 218.209 172.000 216.000 L 172.000 172.000 L 216.000 172.000 C 218.209 172.000 220.000 170.209 220.000 168.000 L 220.000 40.000 C 220.000 37.791 218.209 36.000 216.000 36.000 ZM 164.000 212.000 L 44.000 212.000 L 44.000 92.000 L 164.000 92.000 ZM 212.000 164.000 L 172.000 164.000 L 172.000 88.000 C 172.000 85.791 170.209 84.000 168.000 84.000 L 92.000 84.000 L 92.000 44.000 L 212.000 44.000 Z"),
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
        return _copy!!
    }

private var _copy: ImageVector? = null
