package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PhoneCameraLine: ImageVector
    get() {
        if (_phoneCameraLine != null) return _phoneCameraLine!!
        _phoneCameraLine = remixIcon(
            name = "PhoneCameraLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.803 4c-.351 .607-.599 1.282-.72 2h-11.083v12h18v-5.083c.718-.12 1.393-.368 2-.72v6.802C23 19.552 22.56 20 21.997 20h-19.995C1.449 20 1 19.555 1 18.999v-13.998C1 4.448 1.439 4 2.002 4h12.8ZM20 9c1.105 0 2-.895 2-2C22 5.895 21.105 5 20 5c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2ZM20 11C17.791 11 16 9.209 16 7 16 4.791 17.791 3 20 3c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4ZM18 13h2v3h-2v-3Z"),
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
        return _phoneCameraLine!!
    }

private var _phoneCameraLine: ImageVector? = null
