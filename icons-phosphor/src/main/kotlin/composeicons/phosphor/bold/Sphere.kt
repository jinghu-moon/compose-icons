package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Sphere: ImageVector
    get() {
        if (_sphere != null) return _sphere!!
        _sphere = phosphorBoldIcon(
            name = "Sphere",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM212 127.86c-.56 1.41-5.7 7.11-22.88 12.33-5.772 1.719-11.639 3.104-17.57 4.15 .3-5.44 .45-10.91 .45-16.34 0-27.85-3.95-56.83-12.25-77.75 31.522 12.907 52.15 43.548 52.25 77.61ZM127.86 44c1.41 .56 7.11 5.7 12.33 22.88 5 16.6 7.81 38.31 7.81 61.12 0 6.56-.24 13-.68 19.32-6.29 .44-12.76 .68-19.32 .68-22.81 0-44.52-2.78-61.12-7.81C49.7 135 44.56 129.27 44 127.86 44.132 81.6 81.6 44.132 127.86 44ZM50.25 159.75C71.17 168.05 100.15 172 128 172c5.43 0 10.9-.15 16.34-.46-1.045 5.935-2.43 11.805-4.15 17.58C135 206.3 129.27 211.44 127.86 212 93.798 211.9 63.157 191.272 50.25 159.75ZM159.75 205.75c4.19-10.57 7.28-23.2 9.3-36.7 13.5-2 26.13-5.11 36.7-9.3-8.572 20.863-25.137 37.428-46 46Z"),
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
        return _sphere!!
    }

private var _sphere: ImageVector? = null
