package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Rocket: ImageVector
    get() {
        if (_rocket != null) return _rocket!!
        _rocket = phosphorBoldIcon(
            name = "Rocket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M156 228c0 6.627-5.373 12-12 12h-32c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h32c6.627 0 12 5.373 12 12ZM128 116c8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16ZM227.53 156.7l-12.36 55.63c-1.479 6.751-6.355 12.252-12.88 14.53-2.15 .755-4.412 1.141-6.69 1.14-4.46-.004-8.789-1.508-12.29-4.27L157.17 204h-58.34L72.69 223.74c-3.503 2.759-7.831 4.259-12.29 4.26-2.279-.002-4.541-.391-6.69-1.15C47.185 224.572 42.309 219.071 40.83 212.32L28.47 156.7c-1.328-6.049 .207-12.373 4.16-17.14L60.46 106.16C61.525 93.646 64.44 81.359 69.11 69.7c13.27-33.25 37-54.1 46.64-61.52 7.211-5.587 17.289-5.587 24.5 0 9.6 7.42 33.37 28.27 46.64 61.52 4.67 11.659 7.585 23.946 8.65 36.46l27.83 33.4c3.953 4.767 5.488 11.091 4.16 17.14ZM101.79 180h52.42c19.51-35.7 23-69.78 10.39-101.4C154.4 53 136.2 35.9 128 29.12 119.8 35.9 101.6 53 91.4 78.6 78.78 110.22 82.28 144.3 101.79 180ZM79.24 188.72C71.261 173.89 65.558 157.946 62.32 141.42l-10 12 10.58 47.64ZM203.67 153.41l-10-12c-3.238 16.526-8.941 32.47-16.92 47.3l16.33 12.33Z"),
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
        return _rocket!!
    }

private var _rocket: ImageVector? = null
