package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Wheelchair: ImageVector
    get() {
        if (_wheelchair != null) return _wheelchair!!
        _wheelchair = phosphorLightIcon(
            name = "Wheelchair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M253.69 190.1c-1.05-3.142-4.448-4.839-7.59-3.79L227 192.66 197.32 133.32C196.312 131.301 194.257 130.018 192 130h-82v-27.95c.66 0 1.33 0 2 0h56c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-56c-.67 0-1.33 0-2 0v-12.65c15.09-3.08 25.396-17.086 23.848-32.409C132.3 29.668 119.401 18.006 104 18.006c-15.401 0-28.3 11.662-29.848 26.985C72.604 60.314 82.91 74.32 98 77.4v14C62.757 98.556 38.67 131.254 42.284 167.035 45.898 202.816 76.037 230.036 112 230c32.62 0 62-22.08 69.81-52.5 .828-3.209-1.101-6.482-4.31-7.31-3.209-.828-6.482 1.101-7.31 4.31C163.7 199.71 139.19 218 112 218 82.703 217.99 58.013 196.133 54.45 167.053 50.888 137.973 69.571 110.802 98 103.72v32.28c0 3.314 2.686 6 6 6h84.29l30.34 60.68c1.339 2.67 4.438 3.949 7.27 3l24-8c3.137-1.05 4.832-4.441 3.79-7.58ZM86 48c0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18C94.059 66 86 57.941 86 48Z"),
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
        return _wheelchair!!
    }

private var _wheelchair: ImageVector? = null
