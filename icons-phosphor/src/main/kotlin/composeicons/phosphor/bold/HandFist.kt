package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HandFist: ImageVector
    get() {
        if (_handFist != null) return _handFist!!
        _handFist = phosphorBoldIcon(
            name = "HandFist",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 76h-12v-12C187.987 49.809 179.639 36.95 166.682 31.163 153.725 25.375 138.577 27.74 128 37.2 118.704 28.883 105.765 25.971 93.803 29.503 81.84 33.035 72.558 42.508 69.27 54.54 58.184 50.144 45.641 51.523 35.775 58.223 25.909 64.923 20.002 76.074 20 88v40c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108v-16C236 92.118 219.882 76 200 76ZM140 64c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v12h-24ZM92 64c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v40c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM44 88C44 81.373 49.373 76 56 76c6.627 0 12 5.373 12 12v16c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM212 128c.024 44.435-34.562 81.202-78.916 83.891C88.731 214.581 49.955 182.262 44.61 138.15c12.26 4.094 25.774 1.287 35.39-7.35 12.108 10.886 30.027 12.257 43.65 3.34 1.844 2.375 3.978 4.512 6.35 6.36-9.012 9.622-14.019 22.317-14 35.5 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-15.464 12.536-28 28-28 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-16c-6.627 0-12-5.373-12-12v-12h60c6.627 0 12 5.373 12 12Z"),
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
