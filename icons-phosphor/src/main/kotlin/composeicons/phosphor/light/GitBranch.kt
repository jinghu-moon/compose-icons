package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GitBranch: ImageVector
    get() {
        if (_gitBranch != null) return _gitBranch!!
        _gitBranch = phosphorLightIcon(
            name = "GitBranch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230 64C229.997 48.213 217.759 35.13 202.008 34.073 186.257 33.017 172.381 44.348 170.27 59.993c-2.112 15.645 8.263 30.25 23.73 33.407v18.6c0 5.523-4.477 10-10 10h-88c-3.478-.001-6.907 .828-10 2.42v-31c15.09-3.08 25.396-17.086 23.848-32.409C108.3 45.688 95.401 34.026 80 34.026c-15.401 0-28.3 11.662-29.848 26.985C48.604 76.334 58.91 90.34 74 93.42v69.2c-15.09 3.08-25.396 17.086-23.848 32.409 1.548 15.323 14.447 26.985 29.848 26.985 15.401 0 28.3-11.662 29.848-26.985C111.396 179.706 101.09 165.7 86 162.62v-18.62c0-5.523 4.477-10 10-10h88c12.15 0 22-9.85 22-22v-18.6C219.959 90.531 229.984 78.251 230 64ZM62 64C62 54.059 70.059 46 80 46c9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18C70.059 82 62 73.941 62 64ZM98 192c0 9.941-8.059 18-18 18-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18ZM200 82c-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18Z"),
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
        return _gitBranch!!
    }

private var _gitBranch: ImageVector? = null
