package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SwitchFill: ImageVector
    get() {
        if (_switchFill != null) return _switchFill!!
        _switchFill = remixIcon(
            name = "SwitchFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.62 21c-.085 0-.141-.057-.127-.127v-17.745c0-.057 .042-.113 .113-.113h2.786c2.545 0 4.61 2.064 4.61 4.61v8.767c0 2.545-2.064 4.61-4.61 4.61h-2.771ZM17.042 11.074c-1.004 0-1.824 .82-1.824 1.824 0 1.004 .82 1.824 1.824 1.824 1.004 0 1.824-.82 1.824-1.824 0-1.004-.82-1.824-1.824-1.824ZM5.801 8.401c0-.933 .764-1.697 1.697-1.697 .933 0 1.697 .764 1.697 1.697 0 .933-.764 1.697-1.697 1.697-.933 0-1.697-.764-1.697-1.697ZM11.541 3c.085 0 .141 .057 .127 .127v17.731c0 .071-.057 .127-.127 .127h-3.931c-2.545 0-4.61-2.065-4.61-4.61v-8.767C3.001 5.064 5.065 3 7.611 3h3.931ZM10.226 19.544v-15.101h-2.616c-.848 0-1.64 .339-2.234 .933-.608 .594-.933 1.386-.933 2.234v8.767c0 .848 .339 1.64 .933 2.234 .594 .608 1.386 .933 2.234 .933h2.616Z"),
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
        return _switchFill!!
    }

private var _switchFill: ImageVector? = null
