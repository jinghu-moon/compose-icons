package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PersonSimpleSwim: ImageVector
    get() {
        if (_personSimpleSwim != null) return _personSimpleSwim!!
        _personSimpleSwim = phosphorLightIcon(
            name = "PersonSimpleSwim",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 102c16.569 0 30-13.431 30-30C206 55.431 192.569 42 176 42c-16.569 0-30 13.431-30 30 0 16.569 13.431 30 30 30ZM176 54c9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18ZM220.62 186.58c1.016 1.225 1.504 2.804 1.356 4.389-.148 1.585-.92 3.046-2.146 4.061-16.87 14-32 19-45.75 19-18.19 0-34.13-8.65-48.94-16.7-26-14.11-48.44-26.31-81.31 1-2.576 2.115-6.38 1.741-8.495-.835-2.115-2.576-1.741-6.38 .835-8.495 39.13-32.45 68.65-16.41 94.69-2.27 26.04 14.14 48.44 26.31 81.31-1 1.233-1.009 2.816-1.487 4.401-1.327 1.585 .159 3.042 .943 4.049 2.177ZM36.17 149c-2.552 2.115-2.905 5.898-.79 8.45 2.115 2.552 5.898 2.905 8.45 .79 32.87-27.26 55.32-15.07 81.31-1C140 165.34 155.89 174 174.08 174c13.79 0 28.88-5 45.75-19 2.552-2.115 2.905-5.898 .79-8.45-2.115-2.552-5.898-2.905-8.45-.79-7.48 6.2-14.43 10.36-21 12.92L136.36 103.86C117.273 84.673 91.303 73.921 64.24 74h-24.24c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h24.24c15.859-.032 31.442 4.154 45.15 12.13L77.29 130.23C64.77 131.26 51.18 136.57 36.17 149ZM127.88 112.36l49.54 49.55c-16.3 1.26-30.78-6.6-46.56-15.17-11.63-6.32-24-13-37.51-15.6L119.5 105c2.937 2.288 5.735 4.749 8.38 7.37Z"),
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
        return _personSimpleSwim!!
    }

private var _personSimpleSwim: ImageVector? = null
