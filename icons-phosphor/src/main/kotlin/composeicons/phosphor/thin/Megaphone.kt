package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Megaphone: ImageVector
    get() {
        if (_megaphone != null) return _megaphone!!
        _megaphone = phosphorThinIcon(
            name = "Megaphone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 76h-39.9C157.91 75.89 105.55 72.62 55.72 30.83 52.151 27.831 47.168 27.17 42.94 29.136 38.713 31.102 36.007 35.338 36 40v160c-.029 4.668 2.678 8.921 6.92 10.87 1.592 .738 3.325 1.124 5.08 1.13 2.817-.006 5.541-1.008 7.69-2.83 42.46-35.62 86.76-43.25 100.28-44.8v36.29c-.006 4.017 1.998 7.771 5.34 10l11 7.33c3.236 2.157 7.316 2.613 10.948 1.222 3.632-1.391 6.365-4.455 7.332-8.222l12.49-47.09c23.693-1.599 41.842-21.709 41.011-45.441C243.259 94.727 223.746 75.937 200 76ZM156 156.3c-13.53 1.35-60 8.62-105.42 46.75-1.189 1.003-2.851 1.226-4.262 .572C44.907 202.968 44.003 201.555 44 200v-160c0-1.55 .897-2.961 2.3-3.62 .55-.248 1.147-.377 1.75-.38 .936 .017 1.835 .372 2.53 1C96 75.09 142.47 82.36 156 83.71ZM182.87 209c-.315 1.262-1.224 2.293-2.438 2.762-1.214 .469-2.58 .319-3.662-.402l-11-7.33c-1.113-.742-1.781-1.992-1.78-3.33v-36.7h30.8ZM200 156h-36v-72h36c19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36Z"),
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
        return _megaphone!!
    }

private var _megaphone: ImageVector? = null
