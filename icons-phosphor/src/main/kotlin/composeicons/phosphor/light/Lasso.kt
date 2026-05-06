package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Lasso: ImageVector
    get() {
        if (_lasso != null) return _lasso!!
        _lasso = phosphorLightIcon(
            name = "Lasso",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204.68 61.63C184.11 49 156.88 42 128 42 99.12 42 71.89 49 51.32 61.63 29.83 74.85 18 92.73 18 112c0 19.27 11.83 37.13 33.32 50.35C70.45 174.1 95.35 181 122 181.85c0 .64 0 1.28 0 1.94 0 14.76-6.94 27.1-19.54 34.73-15.22 9.22-36 9.9-51.68 1.71-1.905-1.058-4.234-.999-6.084 .153-1.85 1.152-2.93 3.216-2.821 5.393 .109 2.177 1.389 4.123 3.345 5.084 9.209 4.738 19.424 7.187 29.78 7.14 11.863 .048 23.514-3.14 33.7-9.22 16.34-9.89 25.33-25.87 25.33-45 0-.65 0-1.29 0-1.94 26.65-.89 51.57-7.74 70.72-19.52C226.17 149.11 238 131.23 238 112 238 92.77 226.17 74.85 204.68 61.63ZM64.68 156.09c5.32-12 17.2-15.07 26.48-13.87 12.28 1.6 24.64 10.67 29.08 27.55C99.73 168.81 80.48 164.08 64.72 156.09ZM198.35 152.09c-17.62 10.85-40.83 17.1-65.77 17.79-1.69-8.776-5.582-16.979-11.31-23.84-7.234-8.611-17.416-14.219-28.56-15.73-16.89-2.2-31.49 5.54-38.41 19.68C38.61 139.37 30 126 30 112 30 97.07 39.8 82.82 57.61 71.87 76.32 60.34 101.32 54 128 54c26.68 0 51.68 6.34 70.39 17.85C216.2 82.8 226 97.05 226 112c0 14.95-9.8 29.16-27.61 40.11Z"),
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
        return _lasso!!
    }

private var _lasso: ImageVector? = null
