package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BellSlash: ImageVector
    get() {
        if (_bellSlash != null) return _bellSlash!!
        _bellSlash = phosphorBoldIcon(
            name = "BellSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216.88 207.93 56.88 31.93C54.012 28.697 49.628 27.256 45.401 28.157c-4.226 .901-7.642 4.005-8.942 8.126-1.3 4.121-.284 8.623 2.661 11.786L53.92 64.36C47.385 76.549 43.976 90.169 44 104c0 25.58-4.59 47-13.27 61.93-3.599 6.201-3.618 13.851-.05 20.07 3.534 6.226 10.161 10.052 17.32 10h36.19c2.109 22.62 21.092 39.915 43.81 39.915 22.718 0 41.701-17.295 43.81-39.915h1.79l25.52 28.07c4.478 4.81 11.991 5.124 16.854 .704 4.863-4.42 5.267-11.928 .906-16.844ZM68 104c-.008-6.916 1.183-13.781 3.52-20.29L151.78 172h-97.1C63.52 154 68 131.14 68 104ZM128 212c-9.505 .002-17.699-6.687-19.6-16h39.2c-1.901 9.313-10.095 16.002-19.6 16ZM88.89 42.35c-1.241-2.931-1.267-6.234-.073-9.184 1.195-2.95 3.512-5.305 6.443-6.546 25.945-10.981 55.667-8.224 79.149 7.341C197.892 49.527 212.008 75.827 212 104c0 18.68 2.38 34.93 7.07 48.28 2.209 6.252-1.068 13.111-7.32 15.32-6.252 2.209-13.111-1.068-15.32-7.32C190.83 144.32 188 125.4 188 104 188.008 83.877 177.927 65.089 161.155 53.97 144.382 42.85 123.153 40.879 104.62 48.72c-2.931 1.241-6.234 1.267-9.184 .073C92.486 47.598 90.131 45.281 88.89 42.35Z"),
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
        return _bellSlash!!
    }

private var _bellSlash: ImageVector? = null
