package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Fish: ImageVector
    get() {
        if (_fish != null) return _fish!!
        _fish = phosphorLightIcon(
            name = "Fish",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M166 76c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM215 142.67c-19.17 34.54-55.11 53.08-106.85 55.14L85.62 250.36c-.945 2.209-3.117 3.641-5.52 3.64h-.38c-2.534-.16-4.693-1.899-5.39-4.34L59.22 196.77 6.35 181.63c-2.445-.696-4.186-2.857-4.345-5.394-.16-2.537 1.297-4.899 3.635-5.896L58.2 147.85C60.28 96.13 78.81 60.2 113.33 41 159.56 15.34 219 30 222.09 31.78c.873 .513 1.603 1.239 2.12 2.11C226 36.94 240.67 96.38 215 142.65ZM167 172.31C145.871 166.619 130.886 147.864 130 126 108.147 125.096 89.407 110.117 83.71 89c-8.46 16.93-13 38-13.63 63-.054 2.352-1.477 4.455-3.64 5.38L25.88 174.74l39.85 11.41c1.993 .57 3.55 2.127 4.12 4.12l11.38 39.85L98.62 189.56c.923-2.16 3.022-3.582 5.37-3.64C129 185.33 150.05 180.76 167 172.29ZM218 77.78c-.015-12.076-1.309-24.116-3.86-35.92C202.347 39.309 190.316 38.015 178.25 38h-.25c-18.52 0-45 3.22-66.67 18.47-6.45 4.527-12.228 9.944-17.16 16.09-1.019 11.261 3.031 22.391 11.047 30.365 8.016 7.974 19.168 11.964 30.423 10.885 1.783-.169 3.548 .466 4.814 1.734 1.265 1.267 1.899 3.034 1.726 4.816-1.077 11.259 2.918 22.413 10.899 30.429 7.981 8.015 19.117 12.059 30.381 11.031 6.136-4.902 11.547-10.649 16.07-17.07C214.87 123 218.05 96.31 218 77.76Z"),
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
        return _fish!!
    }

private var _fish: ImageVector? = null
