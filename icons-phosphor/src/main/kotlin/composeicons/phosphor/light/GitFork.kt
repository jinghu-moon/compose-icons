package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GitFork: ImageVector
    get() {
        if (_gitFork != null) return _gitFork!!
        _gitFork = phosphorLightIcon(
            name = "GitFork",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222 64C221.997 48.213 209.759 35.13 194.008 34.073 178.257 33.017 164.381 44.348 162.27 59.993c-2.112 15.645 8.263 30.25 23.73 33.407v18.6c0 5.523-4.477 10-10 10h-96c-5.523 0-10-4.477-10-10v-18.6C85.09 90.32 95.396 76.314 93.848 60.991 92.3 45.668 79.401 34.006 64 34.006c-15.401 0-28.3 11.662-29.848 26.985C32.604 76.314 42.91 90.32 58 93.4v18.6c0 12.15 9.85 22 22 22h42v28.6c-15.09 3.08-25.396 17.086-23.848 32.409 1.548 15.323 14.447 26.985 29.848 26.985 15.401 0 28.3-11.662 29.848-26.985C159.396 179.686 149.09 165.68 134 162.6v-28.6h42c12.15 0 22-9.85 22-22v-18.6C211.959 90.531 221.984 78.251 222 64ZM46 64C46 54.059 54.059 46 64 46c9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18C54.059 82 46 73.941 46 64ZM146 192c0 9.941-8.059 18-18 18-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18ZM192 82c-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18Z"),
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
        return _gitFork!!
    }

private var _gitFork: ImageVector? = null
