package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TriangleDashed: ImageVector
    get() {
        if (_triangleDashed != null) return _triangleDashed!!
        _triangleDashed = phosphorThinIcon(
            name = "TriangleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M156 216c0 2.209-1.791 4-4 4h-48c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h48c2.209 0 4 1.791 4 4ZM233.34 190.09 228.68 182c-1.105-1.914-3.551-2.57-5.465-1.465-1.914 1.105-2.57 3.551-1.465 5.465l4.65 8.08c2.151 3.611 2.151 8.109 0 11.72-2.261 3.889-6.442 6.258-10.94 6.2h-23.46c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h23.46c7.359 .078 14.188-3.822 17.86-10.2 3.567-6.084 3.574-13.619 .02-19.71ZM64 212h-23.46c-4.498 .058-8.679-2.311-10.94-6.2-2.151-3.611-2.151-8.109 0-11.72L34.25 186c1.105-1.914 .449-4.36-1.465-5.465-1.914-1.105-4.36-.449-5.465 1.465l-4.66 8.09c-3.561 6.088-3.561 13.622 0 19.71 3.676 6.384 10.514 10.285 17.88 10.2h23.46c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM202.18 148c1.43 .002 2.753-.759 3.469-1.997 .716-1.238 .717-2.764 .001-4.003l-23-40c-1.105-1.914-3.551-2.57-5.465-1.465-1.914 1.105-2.57 3.551-1.465 5.465l23 40c.714 1.236 2.032 1.999 3.46 2ZM145.88 38.22C142.151 31.887 135.349 27.999 128 27.999c-7.349 0-14.151 3.888-17.88 10.221L96.42 62c-1.105 1.916-.446 4.365 1.47 5.47 1.916 1.105 4.365 .446 5.47-1.47L117.05 42.21c2.304-3.851 6.462-6.209 10.95-6.209 4.488 0 8.646 2.358 10.95 6.209L152.64 66c1.105 1.916 3.554 2.575 5.47 1.47 1.916-1.105 2.575-3.554 1.47-5.47ZM78.88 100.53c-.922-.538-2.02-.686-3.051-.41-1.031 .276-1.909 .953-2.439 1.88l-23 40c-1.105 1.916-.446 4.365 1.47 5.47 1.916 1.105 4.365 .446 5.47-1.47l23-40c.531-.921 .673-2.016 .396-3.042-.278-1.026-.953-1.9-1.876-2.428Z"),
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
        return _triangleDashed!!
    }

private var _triangleDashed: ImageVector? = null
