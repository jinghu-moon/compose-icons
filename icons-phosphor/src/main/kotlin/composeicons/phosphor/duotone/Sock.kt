package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Sock: ImageVector
    get() {
        if (_sock != null) return _sock!!
        _sock = phosphorDuotoneIcon(
            name = "Sock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 112v33.37c.001 4.246-1.687 8.318-4.69 11.32l-33 33c-11.368-14.441-13.492-34.106-5.47-50.641C164.862 122.513 181.621 112.01 200 112ZM192 24h-88c-4.418 0-8 3.582-8 8v24h104v-24c0-4.418-3.582-8-8-8Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M192 16h-88C95.163 16 88 23.163 88 32v76.69L49.25 147.43c-22.561 23.083-22.349 60.022 .474 82.846 22.824 22.824 59.762 23.035 82.846 .474L201 162.34c4.511-4.503 7.032-10.626 7-17v-113.34c0-8.837-7.163-16-16-16ZM192 32h0v16h-88v-16ZM121.25 219.43c-10.798 11.045-26.698 15.435-41.633 11.494C64.682 226.982 53.018 215.318 49.076 200.383c-3.941-14.935 .448-30.836 11.494-41.633l41.09-41.09c1.5-1.502 2.342-3.538 2.34-5.66v-48h88v40.58c-27.53 4.013-47.959 27.599-48 55.42-.036 10.131 2.707 20.079 7.93 28.76ZM189.66 151l-25.91 25.91C161.267 171.619 159.987 165.844 160 160c.02-19 13.388-35.371 32-39.19v24.56c-.006 2.112-.847 4.136-2.34 5.63Z"),
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
