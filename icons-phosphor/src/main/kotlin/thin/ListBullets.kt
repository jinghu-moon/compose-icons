package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ListBullets: ImageVector
    get() {
        if (_listBullets != null) return _listBullets!!
        _listBullets = phosphorThinIcon(
            name = "ListBullets",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 84.000 64.000 C 84.000 61.791 85.791 60.000 88.000 60.000 L 216.000 60.000 C 218.209 60.000 220.000 61.791 220.000 64.000 C 220.000 66.209 218.209 68.000 216.000 68.000 L 88.000 68.000 C 85.791 68.000 84.000 66.209 84.000 64.000 ZM 216.000 124.000 L 88.000 124.000 C 85.791 124.000 84.000 125.791 84.000 128.000 C 84.000 130.209 85.791 132.000 88.000 132.000 L 216.000 132.000 C 218.209 132.000 220.000 130.209 220.000 128.000 C 220.000 125.791 218.209 124.000 216.000 124.000 ZM 216.000 188.000 L 88.000 188.000 C 85.791 188.000 84.000 189.791 84.000 192.000 C 84.000 194.209 85.791 196.000 88.000 196.000 L 216.000 196.000 C 218.209 196.000 220.000 194.209 220.000 192.000 C 220.000 189.791 218.209 188.000 216.000 188.000 ZM 44.000 120.000 C 39.582 120.000 36.000 123.582 36.000 128.000 C 36.000 132.418 39.582 136.000 44.000 136.000 C 48.418 136.000 52.000 132.418 52.000 128.000 C 52.000 123.582 48.418 120.000 44.000 120.000 ZM 44.000 56.000 C 39.582 56.000 36.000 59.582 36.000 64.000 C 36.000 68.418 39.582 72.000 44.000 72.000 C 48.418 72.000 52.000 68.418 52.000 64.000 C 52.000 59.582 48.418 56.000 44.000 56.000 ZM 44.000 184.000 C 39.582 184.000 36.000 187.582 36.000 192.000 C 36.000 196.418 39.582 200.000 44.000 200.000 C 48.418 200.000 52.000 196.418 52.000 192.000 C 52.000 187.582 48.418 184.000 44.000 184.000 Z"),
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
        return _listBullets!!
    }

private var _listBullets: ImageVector? = null
