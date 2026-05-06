package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Basket: ImageVector
    get() {
        if (_basket != null) return _basket!!
        _basket = phosphorThinIcon(
            name = "Basket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M132 120v56c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-56c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM181.2 116c-1.056-.106-2.11 .211-2.931 .883-.821 .671-1.342 1.642-1.449 2.697l-5.6 56c-.117 1.062 .195 2.127 .867 2.957 .673 .83 1.649 1.357 2.713 1.463h.41c2.062 .01 3.794-1.548 4-3.6l5.6-56c.111-1.064-.208-2.127-.886-2.954-.678-.827-1.659-1.347-2.724-1.446ZM74.8 116c-1.056 .106-2.026 .627-2.697 1.449-.671 .821-.989 1.876-.883 2.931l5.6 56c.206 2.052 1.938 3.61 4 3.6h.41c1.056-.106 2.026-.627 2.697-1.449 .671-.821 .989-1.876 .883-2.931L79.21 119.6c-.101-1.065-.624-2.045-1.453-2.722-.829-.676-1.894-.993-2.957-.878ZM236 88.53 220.89 201.59c-.796 5.958-5.879 10.408-11.89 10.41h-162c-6.011-.002-11.094-4.452-11.89-10.41L20 88.53c-.139-1.148 .225-2.301 1-3.16 .756-.867 1.85-1.366 3-1.37h46.18L125 21.37c.759-.861 1.852-1.354 3-1.354 1.148 0 2.241 .493 3 1.354L185.82 84h46.18c1.15 .004 2.244 .503 3 1.37 .775 .859 1.139 2.012 1 3.16ZM80.82 84h94.36L128 30.07ZM227.43 92h-198.86L43 200.53c.267 2 1.982 3.488 4 3.47h162c2.018 .018 3.733-1.47 4-3.47Z"),
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
        return _basket!!
    }

private var _basket: ImageVector? = null
