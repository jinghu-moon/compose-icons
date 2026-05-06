package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UserSound: ImageVector
    get() {
        if (_userSound != null) return _userSound!!
        _userSound = phosphorFillIcon(
            name = "UserSound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M198.13 202.85c2.004 2.382 2.444 5.709 1.129 8.53-1.315 2.821-4.147 4.623-7.259 4.62h-168c-3.111-.001-5.939-1.804-7.251-4.624-1.312-2.82-.871-6.145 1.131-8.526C32.82 185.07 51.4 172.44 72.05 165.68 46.284 149.632 34.275 118.45 42.62 89.265 50.966 60.079 77.645 39.96 108 39.96c30.355 0 57.034 20.119 65.38 49.305 8.346 29.185-3.663 60.367-29.43 76.415 20.65 6.76 39.23 19.39 54.18 37.17ZM196.86 61.39c-1.952 .832-3.494 2.406-4.285 4.376-.791 1.969-.768 4.172 .065 6.124 9.814 23.073 9.814 49.147 0 72.22-1.737 4.065 .15 8.768 4.215 10.505 4.065 1.737 8.768-.15 10.505-4.215 11.52-27.093 11.52-57.707 0-84.8-1.737-4.062-6.438-5.946-10.5-4.21ZM236.71 52.85c-1.069-2.711-3.527-4.626-6.417-5-2.89-.373-5.755 .854-7.477 3.205-1.723 2.35-2.031 5.451-.805 8.095 13.32 31.205 13.32 66.495 0 97.7-1.226 2.644-.917 5.745 .805 8.095 1.723 2.35 4.587 3.578 7.477 3.205 2.89-.373 5.348-2.289 6.417-5 15.054-35.226 15.054-75.074 0-110.3Z"),
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
        return _userSound!!
    }

private var _userSound: ImageVector? = null
