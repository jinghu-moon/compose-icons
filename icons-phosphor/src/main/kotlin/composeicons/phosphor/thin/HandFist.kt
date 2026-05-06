package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HandFist: ImageVector
    get() {
        if (_handFist != null) return _handFist!!
        _handFist = phosphorThinIcon(
            name = "HandFist",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 84h-20v-20C179.995 51.42 171.6 40.389 159.477 37.029 147.355 33.67 134.48 38.807 128 49.59 121.52 38.807 108.645 33.67 96.523 37.029 84.4 40.389 76.005 51.42 76 64v4.43C68.041 60.307 55.96 57.805 45.429 62.098 34.898 66.391 28.011 76.628 28 88v40c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100v-16C228 96.536 215.464 84 200 84ZM152 44c11.046 0 20 8.954 20 20v20h-36c-1.364 0-2.717 .237-4 .7v-20.7c0-11.046 8.954-20 20-20ZM84 64C84 52.954 92.954 44 104 44c11.046 0 20 8.954 20 20v40c0 11.046-8.954 20-20 20C92.954 124 84 115.046 84 104ZM36 88C36 76.954 44.954 68 56 68c11.046 0 20 8.954 20 20v16c0 11.046-8.954 20-20 20C44.954 124 36 115.046 36 104ZM220 128c0 50.81-41.19 92-92 92C77.19 220 36 178.81 36 128v-4.42c6.067 6.192 14.659 9.226 23.269 8.214C67.879 130.783 75.534 125.84 80 118.41c4.702 7.822 12.921 12.862 22.025 13.505 9.104 .643 17.95-3.191 23.705-10.275 3.093 8.393 9.995 14.813 18.59 17.29C131.666 147.01 124.005 160.986 124 176c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4 0-19.882 16.118-36 36-36 2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-16c-11.046 0-20-8.954-20-20v-16c0-2.209 1.791-4 4-4h64c11.046 0 20 8.954 20 20Z"),
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
        return _handFist!!
    }

private var _handFist: ImageVector? = null
