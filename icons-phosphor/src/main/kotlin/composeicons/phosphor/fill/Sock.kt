package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Sock: ImageVector
    get() {
        if (_sock != null) return _sock!!
        _sock = phosphorFillIcon(
            name = "Sock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 16h-88C95.163 16 88 23.163 88 32v76.69L49.25 147.43c-22.561 23.083-22.349 60.022 .474 82.846 22.824 22.824 59.762 23.035 82.846 .474L201 162.34c4.511-4.503 7.032-10.626 7-17v-113.34c0-8.837-7.163-16-16-16ZM192 32h0v24h-88v-24ZM189.66 151l-31.86 31.88c-7.382-13.621-7.736-29.967-.951-43.894 6.785-13.927 19.875-23.724 35.151-26.306v32.69c-.006 2.112-.847 4.136-2.34 5.63Z"),
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
        return _sock!!
    }

private var _sock: ImageVector? = null
