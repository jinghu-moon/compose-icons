package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Basketball: ImageVector
    get() {
        if (_basketball != null) return _basketball!!
        _basketball = phosphorRegularIcon(
            name = "Basketball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM60 72.17C71.228 85.762 78.072 102.439 79.63 120h-39.26C41.949 102.444 48.79 85.773 60 72.17ZM136 120v-79.63c17.935 1.624 34.933 8.737 48.68 20.37C170.463 77.401 161.923 98.158 160.3 120ZM120 120h-24.3C94.077 98.158 85.537 77.401 71.32 60.74 85.067 49.107 102.065 41.994 120 40.37ZM79.63 136C78.072 153.561 71.228 170.238 60 183.83 48.79 170.227 41.949 153.556 40.37 136ZM95.7 136h24.3v79.63C102.065 214.006 85.067 206.893 71.32 195.26 85.535 178.598 94.075 157.842 95.7 136ZM136 136h24.3c1.625 21.842 10.165 42.598 24.38 59.26C170.933 206.893 153.935 214.006 136 215.63ZM176.37 136h39.26c-1.579 17.556-8.42 34.227-19.63 47.83C184.772 170.238 177.928 153.561 176.37 136ZM176.37 120C177.928 102.439 184.772 85.762 196 72.17c11.21 13.603 18.051 30.274 19.63 47.83Z"),
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
        return _basketball!!
    }

private var _basketball: ImageVector? = null
