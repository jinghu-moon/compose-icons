package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Triangle: ImageVector
    get() {
        if (_triangle != null) return _triangle!!
        _triangle = phosphorBoldIcon(
            name = "Triangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240.26 186.1 152.81 34.23h0C147.656 25.415 138.211 19.997 128 19.997c-10.211 0-19.656 5.418-24.81 14.233L15.74 186.1c-5.004 8.559-5.004 19.151 0 27.71 5.1 8.864 14.584 14.288 24.81 14.19h174.9c10.219 .091 19.693-5.332 24.79-14.19 5.01-8.555 5.018-19.148 .02-27.71ZM219.46 201.8c-.829 1.412-2.364 2.256-4 2.2h-174.91c-1.636 .056-3.171-.788-4-2.2-.703-1.144-.703-2.586 0-3.73L124 46.2c.873-1.363 2.381-2.188 4-2.188 1.619 0 3.127 .825 4 2.188l87.45 151.87c.707 1.142 .71 2.584 .01 3.73Z"),
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
        return _triangle!!
    }

private var _triangle: ImageVector? = null
