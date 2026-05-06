package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GlobeStand: ImageVector
    get() {
        if (_globeStand != null) return _globeStand!!
        _globeStand = phosphorThinIcon(
            name = "GlobeStand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M136 180c41.974 0 76-34.026 76-76C212 62.026 177.974 28 136 28 94.026 28 60 62.026 60 104c.044 41.955 34.045 75.956 76 76ZM136 36c37.555 0 68 30.445 68 68 0 37.555-30.445 68-68 68C98.445 172 68 141.555 68 104 68.039 66.461 98.461 36.039 136 36ZM210.89 176.28c1.525 1.594 1.471 4.122-.12 5.65-19.076 18.396-44.285 29.082-70.77 30v24.07h28c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-64c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h28v-24.08C89.481 210.345 51.849 183.952 35.887 144.512 19.924 105.072 28.606 59.935 58.06 29.23c.984-1.057 2.461-1.502 3.864-1.164 1.404 .338 2.516 1.406 2.911 2.795 .395 1.389 .01 2.883-1.006 3.909C26.062 74.028 26.665 136.294 65.187 174.813c38.522 38.519 100.788 39.118 140.043 1.347 .766-.735 1.793-1.136 2.855-1.114 1.062 .023 2.071 .466 2.805 1.234Z"),
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
        return _globeStand!!
    }

private var _globeStand: ImageVector? = null
