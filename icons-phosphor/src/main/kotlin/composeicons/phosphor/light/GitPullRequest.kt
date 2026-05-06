package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GitPullRequest: ImageVector
    get() {
        if (_gitPullRequest != null) return _gitPullRequest!!
        _gitPullRequest = phosphorLightIcon(
            name = "GitPullRequest",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M102 64C101.997 48.213 89.759 35.13 74.008 34.073 58.257 33.017 44.381 44.348 42.27 59.993 40.158 75.638 50.532 90.243 66 93.4v69.2c-15.09 3.08-25.396 17.086-23.848 32.409 1.548 15.323 14.447 26.985 29.848 26.985 15.401 0 28.3-11.662 29.848-26.985C103.396 179.686 93.09 165.68 78 162.6v-69.2C91.959 90.531 101.984 78.251 102 64ZM54 64C54 54.059 62.059 46 72 46c9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18C62.059 82 54 73.941 54 64ZM90 192c0 9.941-8.059 18-18 18-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18ZM206 162.6v-52c.015-5.838-2.303-11.44-6.44-15.56L158.48 54h33.52c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-48c-3.314 0-6 2.686-6 6v48c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-33.52l41.07 41.08c1.884 1.869 2.939 4.416 2.93 7.07v52c-15.09 3.08-25.396 17.086-23.848 32.409 1.548 15.323 14.447 26.985 29.848 26.985 15.401 0 28.3-11.662 29.848-26.985C231.396 179.716 221.09 165.71 206 162.63ZM200 210c-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18Z"),
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
        return _gitPullRequest!!
    }

private var _gitPullRequest: ImageVector? = null
