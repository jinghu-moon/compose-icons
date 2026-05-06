package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FlyingSaucer: ImageVector
    get() {
        if (_flyingSaucer != null) return _flyingSaucer!!
        _flyingSaucer = phosphorBoldIcon(
            name = "FlyingSaucer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M187.77 213.65c.624 3.122-.018 6.363-1.785 9.011-1.767 2.648-4.513 4.486-7.635 5.109-.774 .155-1.561 .232-2.35 .23-5.719-.004-10.64-4.042-11.76-9.65l-4-20c-1.298-6.5 2.92-12.822 9.42-14.12 6.5-1.298 12.822 2.92 14.12 9.42ZM128 188c-6.627 0-12 5.373-12 12v24c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-24c0-6.627-5.373-12-12-12ZM86.35 184.23c-3.122-.624-6.363 .018-9.011 1.785-2.648 1.767-4.486 4.513-5.109 7.635l-4 20c-.624 3.122 .018 6.363 1.785 9.011 1.767 2.648 4.513 4.486 7.635 5.109 .774 .155 1.561 .232 2.35 .23 5.719-.004 10.64-4.042 11.76-9.65l4-20c1.3-6.497-2.913-12.819-9.41-14.12ZM252 112c0 17.92-14.23 33.89-40.08 45-22.61 9.69-52.42 15-83.92 15C96.5 172 66.69 166.66 44.08 157 18.23 145.89 4 129.92 4 112 4 87.94 29.28 68 71.91 58.11 83.117 41.297 101.257 30.379 121.36 28.344c20.103-2.034 40.062 5.029 54.41 19.256 3.277 3.238 6.222 6.796 8.79 10.62C226.9 68.14 252 88.05 252 112ZM84 96.83v3c.001 1.823 1.235 3.414 3 3.87 13.463 2.962 27.216 4.404 41 4.3 13.783 .114 27.536-1.318 41-4.27 1.765-.456 2.999-2.047 3-3.87v-3.86C172 71.699 152.301 52 128 52h-.59C103.47 52.31 84 72.43 84 96.83ZM228 112c0-6.64-7.65-12.76-12.21-15.83-6.39-4.13-13.27-7.449-20.48-9.88 .457 3.217 .687 6.461 .69 9.71v3.93c.021 13.011-8.973 24.302-21.66 27.19C159.125 130.478 143.581 132.115 128 132c-15.577 .114-31.118-1.523-46.33-4.88C68.983 124.237 59.985 112.951 60 99.94h0v-3.07c.004-3.559 .278-7.113 .82-10.63-7.225 2.434-14.121 5.752-20.53 9.88C35.7 99.19 28 105.34 28 112c0 14.68 39 36 100 36 61 0 100-21.32 100-36Z"),
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
        return _flyingSaucer!!
    }

private var _flyingSaucer: ImageVector? = null
