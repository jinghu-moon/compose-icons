package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BezierCurve: ImageVector
    get() {
        if (_bezierCurve != null) return _bezierCurve!!
        _bezierCurve = phosphorBoldIcon(
            name = "BezierCurve",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224.28 141C218.869 121.93 207.945 104.883 192.88 92h47.12c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-78.06C156.854 53.618 143.255 44.003 128 44.003 112.745 44.003 99.146 53.618 94.06 68h-78.06C9.373 68 4 73.373 4 80c0 6.627 5.373 12 12 12h47.12C48.055 104.883 37.131 121.93 31.72 141 14.706 145.053 3.067 160.748 4.129 178.205c1.062 17.458 14.517 31.626 31.897 33.587 17.379 1.961 33.654-8.852 38.58-25.634C79.531 169.377 71.683 151.483 56 143.74 62.854 123.616 77.758 107.242 97.15 98.53c6.511 10.825 18.218 17.445 30.85 17.445 12.632 0 24.339-6.621 30.85-17.445 19.392 8.712 34.296 25.086 41.15 45.21-15.683 7.743-23.531 25.637-18.605 42.419 4.926 16.782 21.2 27.595 38.58 25.634 17.379-1.961 30.835-16.13 31.897-33.587C252.933 160.748 241.294 145.053 224.28 141ZM40 188c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM128 92c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM216 188c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12Z"),
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
        return _bezierCurve!!
    }

private var _bezierCurve: ImageVector? = null
