package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Target: ImageVector
    get() {
        if (_target != null) return _target!!
        _target = phosphorLightIcon(
            name = "Target",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220.06 84c22.636 47.297 5.749 104.052-39.062 131.281C136.186 242.509 78.033 231.35 46.483 189.469 14.933 147.588 20.252 88.614 58.787 53.054 97.323 17.495 156.534 16.922 195.75 51.73l24-24c2.35-2.309 6.122-2.292 8.451 .039 2.328 2.331 2.341 6.104 .029 8.451l-96 96c-1.512 1.535-3.732 2.142-5.815 1.588-2.083-.553-3.709-2.181-4.26-4.265-.551-2.084 .058-4.303 1.595-5.813L153.14 94.33C137.365 82.534 115.512 83.286 100.585 96.138c-14.927 12.852-18.918 34.35-9.597 51.703 9.321 17.352 29.448 25.897 48.405 20.548 18.957-5.349 31.651-23.153 30.527-42.818-.188-3.314 2.346-6.152 5.66-6.34 3.314-.188 6.152 2.346 6.34 5.66 1.484 25.448-15.03 48.467-39.611 55.216-24.581 6.749-50.534-4.611-62.253-27.248C68.337 130.22 74.045 102.471 93.747 86.296c19.702-16.175 48.031-16.369 67.953-.466L187.24 60.28C152.48 29.97 100.422 30.876 66.738 62.377 33.053 93.879 28.666 145.759 56.583 182.469c27.917 36.71 79.083 46.345 118.439 22.302 39.356-24.043 54.139-73.966 34.218-115.561-1.439-2.988-.183-6.576 2.805-8.015 2.988-1.439 6.576-.183 8.015 2.805Z"),
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
        return _target!!
    }

private var _target: ImageVector? = null
