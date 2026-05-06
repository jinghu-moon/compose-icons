package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.At: ImageVector
    get() {
        if (_at != null) return _at!!
        _at = phosphorLightIcon(
            name = "At",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 21.13 0 43.31-6.35 59.32-17 2.761-1.836 3.511-5.564 1.675-8.325-1.836-2.761-5.564-3.511-8.325-1.675-13.9 9.25-34.09 15-52.67 15C78.294 218 38 177.706 38 128 38 78.294 78.294 38 128 38c49.706 0 90 40.294 90 90 0 29.58-13.78 34-22 34-8.22 0-22-4.42-22-34v-40c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v9C148.779 82.462 127.782 77.928 109.74 85.716 91.698 93.503 80.595 111.891 82.105 131.484c1.51 19.593 15.299 36.063 34.321 40.994 19.022 4.931 39.076-2.766 49.914-19.158C171.76 166.6 182 174 196 174c21.29 0 34-17.2 34-46C229.934 71.694 184.306 26.066 128 26ZM128 162C109.222 162 94 146.778 94 128c0-18.778 15.222-34 34-34 18.778 0 34 15.222 34 34 0 18.778-15.222 34-34 34Z"),
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
        return _at!!
    }

private var _at: ImageVector? = null
