package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CompassTool: ImageVector
    get() {
        if (_compassTool != null) return _compassTool!!
        _compassTool = phosphorLightIcon(
            name = "CompassTool",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M213.34 122.73c1.052-1.916 .979-4.253-.191-6.099-1.17-1.847-3.251-2.911-5.433-2.778-2.182 .133-4.119 1.442-5.056 3.417-7.924 15.257-20.454 27.63-35.81 35.36L148.71 111.83c13.154-8.575 19.679-24.358 16.421-39.718C161.873 56.751 149.503 44.977 134 42.48v-18.48c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v18.48C106.497 44.977 94.127 56.751 90.869 72.112c-3.258 15.361 3.267 31.143 16.421 39.718L58.52 221.56c-1.348 3.038 .022 6.592 3.06 7.94 3.038 1.348 6.592-.022 7.94-3.06L95.42 168.18c10.427 3.865 21.46 5.836 32.58 5.82 11.139-.006 22.194-1.931 32.68-5.69l25.84 58.13c1.348 3.038 4.902 4.408 7.94 3.06 3.038-1.348 4.408-4.902 3.06-7.94l-25.77-58c17.842-8.855 32.407-23.154 41.59-40.83ZM128 54c14.359 0 26 11.641 26 26 0 14.359-11.641 26-26 26C113.641 106 102 94.359 102 80c0-14.359 11.641-26 26-26ZM128 162c-9.453 .01-18.837-1.624-27.73-4.83l18-40.45c6.395 1.707 13.125 1.707 19.52 0l18 40.6c-8.94 3.089-18.331 4.671-27.79 4.68Z"),
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
        return _compassTool!!
    }

private var _compassTool: ImageVector? = null
