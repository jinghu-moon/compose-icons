package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Coffee: ImageVector
    get() {
        if (_coffee != null) return _coffee!!
        _coffee = phosphorThinIcon(
            name = "Coffee",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M84 56v-32c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v32c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4ZM120 60c2.209 0 4-1.791 4-4v-32c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v32c0 2.209 1.791 4 4 4ZM152 60c2.209 0 4-1.791 4-4v-32c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v32c0 2.209 1.791 4 4 4ZM244 120v8c0 19.882-16.118 36-36 36h-.41c-6.273 19.52-18.851 36.404-35.76 48h36.17c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-176c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h36.17C43.086 194.824 28.063 166.401 28 136v-48c0-2.209 1.791-4 4-4h176c19.882 0 36 16.118 36 36ZM204 136v-44h-168v44c.066 32.511 18.826 62.086 48.21 76h71.58C185.174 198.086 203.934 168.511 204 136ZM236 120C235.999 106.082 225.775 94.278 212 92.29v43.71c-.002 6.707-.74 13.394-2.2 19.94C224.534 154.991 235.999 142.764 236 128Z"),
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
        return _coffee!!
    }

private var _coffee: ImageVector? = null
