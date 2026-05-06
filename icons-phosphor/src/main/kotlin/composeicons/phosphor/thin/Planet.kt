package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Planet: ImageVector
    get() {
        if (_planet != null) return _planet!!
        _planet = phosphorThinIcon(
            name = "Planet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M241.66 62.68c-6.73-11.58-26.58-13.8-56-6.3C156.134 32.62 115.058 29.397 82.188 48.263 49.317 67.128 31.379 104.22 37 141.7c-21.38 21.69-29.44 40-22.68 51.62 4.13 7.11 13 10.71 26 10.71 8.316-.15 16.59-1.199 24.68-3.13 1.74-.39 3.52-.82 5.32-1.28 27.582 22.197 65.453 26.597 97.389 11.316C199.645 195.655 219.98 163.404 220 128c.007-4.595-.327-9.184-1-13.73 12.77-13 21.31-25.28 24-35.47 1.69-6.26 1.23-11.68-1.34-16.12ZM128 44c40.038 .049 74.494 28.307 82.38 67.56-16.17 15.69-38.8 32.48-64.49 47.24-27.31 15.69-52.81 26.25-73.61 32C46.212 167.643 37.16 130.79 49.534 98.192 61.907 65.593 93.132 44.028 128 44ZM21.25 189.3C17 182 23.75 167.7 39 151.24c4.135 15.837 12.42 30.283 24 41.85C40.86 198 25.47 196.58 21.25 189.3ZM128 212c-17.171 .017-33.931-5.255-48-15.1 21.58-6.58 45.83-17.37 69.85-31.16 24.25-13.94 45.61-29.46 61.83-44.44 .18 2.21 .3 4.44 .3 6.7-.055 46.361-37.619 83.934-83.98 84ZM235.28 76.73c-2.13 8-8.58 17.65-18.25 28.06C212.869 88.917 204.542 74.444 192.91 62.87c21.85-4.82 37.59-3.46 41.83 3.83 1.46 2.53 1.65 5.9 .54 10.03Z"),
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
        return _planet!!
    }

private var _planet: ImageVector? = null
