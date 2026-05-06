package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HandHeart: ImageVector
    get() {
        if (_handHeart != null) return _handHeart!!
        _handHeart = phosphorThinIcon(
            name = "HandHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227.9 144.24c-5.068-3.902-11.669-5.208-17.84-3.53l-11.95 2.75C223.26 121.88 236 100.58 236 80 236 55.74 216.5 36 192.54 36 177.856 35.883 164.108 43.197 156 55.44 147.892 43.197 134.144 35.883 119.46 36 95.5 36 76 55.74 76 80c0 11.85 4.11 23.44 12.81 36-7.033 .262-13.705 3.182-18.67 8.17L46.34 148h-30.34C9.373 148 4 153.373 4 160v40c0 6.627 5.373 12 12 12h104c.337 .002 .673-.038 1-.12l64-16c.204-.053 .405-.12 .6-.2l38.82-16.54 .22-.1c6.358-3.178 10.629-9.41 11.298-16.487 .669-7.077-2.358-13.999-8.008-18.313ZM119.46 44c14.306-.179 27.293 8.332 32.84 21.52 .616 1.5 2.078 2.48 3.7 2.48 1.622 0 3.084-.98 3.7-2.48C165.247 52.332 178.234 43.821 192.54 44 211.76 44 228 60.49 228 80c0 21.27-16.13 44-47.94 67.61L160.75 152c2.129-3.641 3.251-7.782 3.25-12 0-13.255-10.745-24-24-24h-41.31C88.69 103 84 91.5 84 80 84 60.49 100.24 44 119.46 44ZM12 200v-40c0-2.209 1.791-4 4-4h28v48h-28c-2.209 0-4-1.791-4-4ZM221.13 171.83l-38.41 16.37L119.51 204h-67.51v-50.34L75.8 129.86c3.741-3.764 8.833-5.874 14.14-5.86h50.06c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16h-28c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h32c.303 .001 .605-.032 .9-.1l67-15.41h.16c6.217-1.648 12.678 1.65 14.988 7.653 2.311 6.002-.271 12.782-5.988 15.727Z"),
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
        return _handHeart!!
    }

private var _handHeart: ImageVector? = null
