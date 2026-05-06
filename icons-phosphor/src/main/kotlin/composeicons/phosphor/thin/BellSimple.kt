package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BellSimple: ImageVector
    get() {
        if (_bellSimple != null) return _bellSimple!!
        _bellSimple = phosphorThinIcon(
            name = "BellSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M164 224c0 2.209-1.791 4-4 4h-64c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h64c2.209 0 4 1.791 4 4ZM218.38 190c-2.117 3.733-6.088 6.029-10.38 6h-160c-4.28-.015-8.227-2.308-10.361-6.018-2.133-3.71-2.129-8.275 .011-11.982C43.42 168 52 140.13 52 104 52 62.026 86.026 28 128 28c41.974 0 76 34.026 76 76 0 36.13 8.59 64 14.36 73.95 2.186 3.717 2.194 8.325 .02 12.05ZM211.43 182C204 169.17 196 139.31 196 104 196 66.445 165.555 36 128 36 90.445 36 60 66.445 60 104c0 35.32-8 65.17-15.44 78-.715 1.238-.715 2.762 0 4 .696 1.244 2.014 2.01 3.44 2h160c1.426 .01 2.744-.756 3.44-2 .711-1.239 .708-2.764-.01-4Z"),
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
        return _bellSimple!!
    }

private var _bellSimple: ImageVector? = null
