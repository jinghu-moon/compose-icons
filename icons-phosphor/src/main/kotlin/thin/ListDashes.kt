package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ListDashes: ImageVector
    get() {
        if (_listDashes != null) return _listDashes!!
        _listDashes = phosphorThinIcon(
            name = "ListDashes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 92.000 64.000 C 92.000 61.791 93.791 60.000 96.000 60.000 L 216.000 60.000 C 218.209 60.000 220.000 61.791 220.000 64.000 C 220.000 66.209 218.209 68.000 216.000 68.000 L 96.000 68.000 C 93.791 68.000 92.000 66.209 92.000 64.000 ZM 216.000 124.000 L 96.000 124.000 C 93.791 124.000 92.000 125.791 92.000 128.000 C 92.000 130.209 93.791 132.000 96.000 132.000 L 216.000 132.000 C 218.209 132.000 220.000 130.209 220.000 128.000 C 220.000 125.791 218.209 124.000 216.000 124.000 ZM 216.000 188.000 L 96.000 188.000 C 93.791 188.000 92.000 189.791 92.000 192.000 C 92.000 194.209 93.791 196.000 96.000 196.000 L 216.000 196.000 C 218.209 196.000 220.000 194.209 220.000 192.000 C 220.000 189.791 218.209 188.000 216.000 188.000 ZM 56.000 60.000 L 40.000 60.000 C 37.791 60.000 36.000 61.791 36.000 64.000 C 36.000 66.209 37.791 68.000 40.000 68.000 L 56.000 68.000 C 58.209 68.000 60.000 66.209 60.000 64.000 C 60.000 61.791 58.209 60.000 56.000 60.000 ZM 56.000 124.000 L 40.000 124.000 C 37.791 124.000 36.000 125.791 36.000 128.000 C 36.000 130.209 37.791 132.000 40.000 132.000 L 56.000 132.000 C 58.209 132.000 60.000 130.209 60.000 128.000 C 60.000 125.791 58.209 124.000 56.000 124.000 ZM 56.000 188.000 L 40.000 188.000 C 37.791 188.000 36.000 189.791 36.000 192.000 C 36.000 194.209 37.791 196.000 40.000 196.000 L 56.000 196.000 C 58.209 196.000 60.000 194.209 60.000 192.000 C 60.000 189.791 58.209 188.000 56.000 188.000 Z"),
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
        return _listDashes!!
    }

private var _listDashes: ImageVector? = null
