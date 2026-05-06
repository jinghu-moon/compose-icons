package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BellZ: ImageVector
    get() {
        if (_bellZ != null) return _bellZ!!
        _bellZ = phosphorThinIcon(
            name = "BellZ",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M148 144c0 2.209-1.791 4-4 4h-32c-1.476 .001-2.832-.811-3.529-2.112-.697-1.301-.62-2.88 .199-4.108L136.53 100h-24.53c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h32c1.476-.001 2.832 .811 3.529 2.112 .697 1.301 .62 2.88-.199 4.108L119.47 140h24.53c2.209 0 4 1.791 4 4ZM218.38 190c-2.117 3.733-6.088 6.029-10.38 6h-44.23c-2.066 18.193-17.46 31.937-35.77 31.937C109.69 227.937 94.296 214.193 92.23 196h-44.23c-4.28-.015-8.227-2.308-10.361-6.018-2.133-3.71-2.129-8.275 .011-11.982C43.42 168 52 140.13 52 104 52 62.026 86.026 28 128 28c41.974 0 76 34.026 76 76 0 36.13 8.59 64 14.36 73.95 2.186 3.717 2.194 8.325 .02 12.05ZM155.71 196h-55.42c1.997 13.767 13.799 23.981 27.71 23.981 13.911 0 25.713-10.213 27.71-23.981ZM211.43 182C204 169.17 196 139.31 196 104 196 66.445 165.555 36 128 36 90.445 36 60 66.445 60 104c0 35.32-8 65.17-15.44 78-.715 1.238-.715 2.762 0 4 .696 1.244 2.014 2.01 3.44 2h160c1.426 .01 2.744-.756 3.44-2 .711-1.239 .708-2.764-.01-4Z"),
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
        return _bellZ!!
    }

private var _bellZ: ImageVector? = null
