package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GpsSlash: ImageVector
    get() {
        if (_gpsSlash != null) return _gpsSlash!!
        _gpsSlash = phosphorThinIcon(
            name = "GpsSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 128c0 2.209-1.791 4-4 4h-28.1c-.471 10.493-2.928 20.802-7.24 30.38-.643 1.441-2.072 2.369-3.65 2.37-.563-.002-1.119-.125-1.63-.36-2.007-.909-2.901-3.27-2-5.28 12.334-27.586 7.167-59.858-13.163-82.215C163.888 54.538 132.251 46.336 103.62 56c-1.373 .537-2.929 .276-4.052-.679-1.122-.956-1.628-2.451-1.316-3.892 .312-1.441 1.391-2.593 2.808-2.999 7.406-2.51 15.128-3.967 22.94-4.33v-28.1c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v28.1c43.222 2.114 77.786 36.678 79.9 79.9h28.1c2.209 0 4 1.791 4 4ZM211 213.31c.982 1.054 1.32 2.555 .887 3.929-.433 1.374-1.572 2.408-2.981 2.709-1.409 .3-2.87-.18-3.826-1.258L181.52 192.78C167.521 204.351 150.142 211.061 132 211.9v28.1c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-28.1C80.778 209.786 46.214 175.222 44.1 132h-28.1c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h28.1C45.117 103.138 53.849 83.398 68.6 68.61L45 42.69C43.514 41.033 43.653 38.486 45.31 37c1.657-1.486 4.204-1.347 5.69 .31L184.77 184.5h0ZM176.13 186.84 74 74.53C45.606 103.262 44.649 149.185 71.821 179.075c27.172 29.89 72.979 33.301 104.279 7.765Z"),
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
        return _gpsSlash!!
    }

private var _gpsSlash: ImageVector? = null
