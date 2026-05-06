package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PinterestLogo: ImageVector
    get() {
        if (_pinterestLogo != null) return _pinterestLogo!!
        _pinterestLogo = phosphorLightIcon(
            name = "PinterestLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222 112c0 22.05-7.7 42.19-21.68 56.73C187.32 182.25 169.71 190 152 190c-19.42 0-31.55-7.07-38.63-13.64l-11.53 49c-.632 2.716-3.052 4.638-5.84 4.64-.461 .001-.921-.053-1.37-.16-3.225-.757-5.226-3.985-4.47-7.21l32-136c.45-2.128 2.016-3.846 4.094-4.49 2.078-.644 4.341-.113 5.916 1.388 1.575 1.501 2.214 3.736 1.67 5.842L116.75 162c2.8 4.33 12.46 16 35.25 16 28.51 0 58-24.69 58-66C209.99 80.897 190.531 53.12 161.303 42.485 132.075 31.85 99.316 40.627 79.32 64.45 59.323 88.273 56.359 122.058 71.9 149c1.119 1.859 1.148 4.177 .074 6.063-1.073 1.886-3.081 3.045-5.25 3.032-2.17-.013-4.163-1.196-5.214-3.095C43.444 123.689 46.887 84.423 70.126 56.734 93.365 29.045 131.439 18.844 165.408 31.205 199.378 43.566 221.991 75.851 222 112Z"),
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
        return _pinterestLogo!!
    }

private var _pinterestLogo: ImageVector? = null
