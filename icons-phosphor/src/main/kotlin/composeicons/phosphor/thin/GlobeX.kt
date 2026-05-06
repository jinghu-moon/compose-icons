package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GlobeX: ImageVector
    get() {
        if (_globeX != null) return _globeX!!
        _globeX = phosphorThinIcon(
            name = "GlobeX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28h0C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 1.69-.011 3.191-1.083 3.75-2.678 .559-1.595 .054-3.369-1.26-4.432h0c-.3-.24-23.57-19.41-33.78-56.88h31.29c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-33.18c-3.76-18.477-3.76-37.523 0-56h66.36c1.892 9.209 2.837 18.588 2.82 27.99 0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4 .02-9.394-.847-18.769-2.59-28h46.23c2.897 9.051 4.368 18.497 4.36 28 0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4C227.939 72.797 183.203 28.061 128 28ZM117.54 36.6C103.421 52.398 93.397 71.422 88.35 92h-45C56.351 61.561 84.662 40.42 117.54 36.6ZM117.54 219.4C84.658 215.584 56.342 194.442 43.34 164h45c5.05 20.579 15.077 39.603 29.2 55.4ZM86.59 156h-46.23c-5.813-18.214-5.813-37.786 0-56h46.23c-3.453 18.507-3.453 37.493 0 56ZM96.73 92C105 61.8 121.67 43.48 128 37.39c6.33 6.09 23 24.41 31.27 54.61ZM167.65 92C162.603 71.422 152.579 52.398 138.46 36.6c32.882 3.816 61.198 24.958 74.2 55.4ZM218.83 170.83 197.66 192l21.17 21.17c1.563 1.563 1.563 4.097 0 5.66-1.563 1.563-4.097 1.563-5.66 0L192 197.66l-21.17 21.17c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66L186.34 192 165.17 170.83c-1.563-1.563-1.563-4.097 0-5.66 1.563-1.563 4.097-1.563 5.66 0L192 186.34l21.17-21.17c1.563-1.563 4.097-1.563 5.66 0 1.563 1.563 1.563 4.097 0 5.66Z"),
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
        return _globeX!!
    }

private var _globeX: ImageVector? = null
