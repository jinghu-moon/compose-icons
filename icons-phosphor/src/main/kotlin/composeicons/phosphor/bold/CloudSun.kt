package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CloudSun: ImageVector
    get() {
        if (_cloudSun != null) return _cloudSun!!
        _cloudSun = phosphorBoldIcon(
            name = "CloudSun",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M164 68c-6.216 .001-12.41 .722-18.46 2.15-1.799-2.629-3.806-5.11-6-7.42l7.57-10.82c3.802-5.429 2.484-12.913-2.945-16.715-5.429-3.802-12.913-2.484-16.715 2.945L119.87 49C112.839 45.921 105.282 44.224 97.61 44L95.31 31C94.045 24.591 87.885 20.371 81.452 21.506c-6.434 1.135-10.777 7.209-9.772 13.664l2.3 13C66.849 51.004 60.328 55.179 54.77 60.47L43.91 52.86C38.481 49.058 30.997 50.376 27.195 55.805c-3.802 5.429-2.484 12.913 2.945 16.715L41 80.11c-3.087 7.025-4.785 14.58-5 22.25l-13 2.3c-6.131 1.074-10.423 6.658-9.884 12.859 .539 6.201 5.73 10.961 11.954 10.961 .704-.001 1.406-.061 2.1-.18L40.17 126c.982 2.492 2.131 4.914 3.44 7.25C28.091 149.441 23.729 173.329 32.523 193.96 41.318 214.591 61.573 227.985 84 228h80c44.183 0 80-35.817 80-80C244 103.817 208.183 68 164 68ZM96 68c10.051 .008 19.641 4.217 26.45 11.61-14.235 8.634-25.438 21.475-32.06 36.75C88.269 116.119 86.135 115.999 84 116c-6.956-.001-13.851 1.298-20.33 3.83C58.207 108.673 58.883 95.487 65.458 84.947 72.033 74.407 83.577 68.001 96 68ZM164 204h-80C66.327 204 52 189.673 52 172c0-17.673 14.327-32 32-32h.28c-.11 1.1-.2 2.2-.26 3.3-.387 6.627 4.673 12.313 11.3 12.7 6.627 .387 12.313-4.673 12.7-11.3 .212-3.716 .795-7.401 1.74-11l.15-.55c7.658-28 35.424-45.522 63.994-40.385 28.57 5.137 48.493 31.233 45.919 60.147C217.249 181.826 193.028 203.992 164 204Z"),
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
        return _cloudSun!!
    }

private var _cloudSun: ImageVector? = null
