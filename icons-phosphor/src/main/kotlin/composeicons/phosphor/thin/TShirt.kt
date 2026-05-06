package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TShirt: ImageVector
    get() {
        if (_tShirt != null) return _tShirt!!
        _tShirt = phosphorThinIcon(
            name = "TShirt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M245.68 64.73 193.91 36.49h0c-.586-.32-1.242-.489-1.91-.49h-32c-2.209 0-4 1.791-4 4 0 15.464-12.536 28-28 28C112.536 68 100 55.464 100 40c0-2.209-1.791-4-4-4h-32c-.665 .006-1.318 .178-1.9 .5h0L10.32 64.73C4.556 67.741 2.319 74.851 5.32 80.62l19.28 36.81c2.158 4.066 6.396 6.598 11 6.57h24.4v84c0 6.627 5.373 12 12 12h112c6.627 0 12-5.373 12-12v-84h24.33c4.604 .028 8.842-2.504 11-6.57L250.61 80.62c3.011-5.751 .808-12.854-4.93-15.89ZM35.67 116c-1.653 .04-3.192-.837-4-2.28L12.44 76.91c-.469-.907-.552-1.966-.231-2.935 .322-.97 1.022-1.768 1.941-2.215L60 46.74v69.26ZM188 208c0 2.209-1.791 4-4 4h-112c-2.209 0-4-1.791-4-4v-164h24.22C94.245 62.232 109.656 76.026 128 76.026c18.344 0 33.755-13.794 35.78-32.026h24.22ZM243.56 76.91l-19.27 36.81c-.808 1.443-2.347 2.32-4 2.28h-24.29v-69.26l45.85 25c.924 .446 1.628 1.248 1.95 2.223 .322 .974 .236 2.038-.24 2.947Z"),
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
        return _tShirt!!
    }

private var _tShirt: ImageVector? = null
