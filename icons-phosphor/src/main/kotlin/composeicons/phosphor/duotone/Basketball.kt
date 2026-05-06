package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Basketball: ImageVector
    get() {
        if (_basketball != null) return _basketball!!
        _basketball = phosphorDuotoneIcon(
            name = "Basketball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M60 195.88h0l.12 .12ZM60 60h0C22.669 97.601 22.669 158.279 60 195.88 77.966 177.838 88.037 153.402 88 127.94 88.037 102.478 77.966 78.042 60 60ZM196 60h0c-37.331 37.601-37.331 98.279 0 135.88C233.331 158.279 233.331 97.601 196 60ZM196 195.88l.12 .12-.12-.12Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM40.37 136h39.26C78.072 153.561 71.228 170.238 60 183.83 48.79 170.227 41.949 153.556 40.37 136ZM136 120v-79.63c17.935 1.624 34.933 8.737 48.68 20.37C170.463 77.401 161.923 98.158 160.3 120ZM120 120h-24.3C94.077 98.158 85.537 77.401 71.32 60.74 85.067 49.107 102.065 41.994 120 40.37ZM79.63 120h-39.26C41.949 102.444 48.79 85.773 60 72.17 71.228 85.762 78.072 102.439 79.63 120ZM95.7 136h24.3v79.63C102.065 214.006 85.067 206.893 71.32 195.26 85.535 178.598 94.075 157.842 95.7 136ZM136 136h24.3c1.625 21.842 10.165 42.598 24.38 59.26C170.933 206.893 153.935 214.006 136 215.63ZM176.37 136h39.26c-1.579 17.556-8.42 34.227-19.63 47.83C184.772 170.238 177.928 153.561 176.37 136ZM176.37 120C177.928 102.439 184.772 85.762 196 72.17c11.21 13.603 18.051 30.274 19.63 47.83Z"),
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
