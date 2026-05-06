package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HailLine: ImageVector
    get() {
        if (_hailLine != null) return _hailLine!!
        _hailLine = remixIcon(
            name = "HailLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6 17.419C3.068 16.232 1 13.357 1 10 1 5.582 4.582 2 9 2c3.395 0 6.296 2.115 7.458 5.099C16.795 7.034 17.144 7 17.5 7 20.538 7 23 9.462 23 12.5c0 2.518-1.691 4.64-4 5.293v-2.13c1.183-.562 2-1.767 2-3.163C21 10.567 19.433 9 17.5 9c-.979 0-1.865 .402-2.5 1.051C15 10.034 15 10.017 15 10 15 6.686 12.314 4 9 4 5.686 4 3 6.686 3 10c0 2.221 1.207 4.16 3 5.197v2.221ZM10 17C8.895 17 8 16.105 8 15c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 0 1.105-.895 2-2 2ZM15 20c-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 0 1.105-.895 2-2 2ZM10 23C8.895 23 8 22.105 8 21c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 0 1.105-.895 2-2 2Z"),
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
        return _hailLine!!
    }

private var _hailLine: ImageVector? = null
