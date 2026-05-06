package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ImageBroken: ImageVector
    get() {
        if (_imageBroken != null) return _imageBroken!!
        _imageBroken = phosphorThinIcon(
            name = "ImageBroken",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 44h-176C33.373 44 28 49.373 28 56v144c0 6.627 5.373 12 12 12h64c1.721-.003 3.248-1.106 3.79-2.74L123.21 163l38.28-15.31c1.012-.407 1.813-1.208 2.22-2.22L179 107.21 225.24 91.79c1.642-.535 2.754-2.063 2.76-3.79v-32c0-6.627-5.373-12-12-12ZM118.51 156.29c-1.089 .439-1.93 1.335-2.3 2.45L101.12 204h-61.12c-2.209 0-4-1.791-4-4v-29.66L89.17 117.17c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173l34.71 34.71ZM220 85.12l-45.26 15.09c-1.115 .37-2.011 1.211-2.45 2.3l-15.37 38.41-19.3 7.73L100.49 111.51c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529L36 159v-103c0-2.209 1.791-4 4-4h176c2.209 0 4 1.791 4 4ZM226.34 118.49c-1.042-.751-2.381-.955-3.6-.55l-23.81 7.93c-1.113 .375-2.005 1.219-2.44 2.31l-15 37.36-37.36 15c-1.091 .435-1.936 1.327-2.31 2.44l-7.93 23.81c-.405 1.219-.201 2.558 .55 3.6 .751 1.041 1.956 1.659 3.24 1.66h78.32c6.627 0 12-5.373 12-12v-78.32c-.001-1.284-.619-2.489-1.66-3.24ZM220 200c0 2.209-1.791 4-4 4h-72.72l5.59-16.78 37.23-14.89c1.017-.407 1.823-1.213 2.23-2.23l14.89-37.23L220 127.28Z"),
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
        return _imageBroken!!
    }

private var _imageBroken: ImageVector? = null
