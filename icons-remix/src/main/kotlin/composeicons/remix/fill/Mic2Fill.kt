package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Mic2Fill: ImageVector
    get() {
        if (_mic2Fill != null) return _mic2Fill!!
        _mic2Fill = remixIcon(
            name = "Mic2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 1c2.761 0 5 2.239 5 5v6c0 2.761-2.239 5-5 5C9.239 17 7 14.761 7 12v-6c0-2.761 2.239-5 5-5ZM2.192 13.962l1.962-.392C4.883 17.236 8.119 20 12 20c3.881 0 7.117-2.764 7.846-6.431l1.962 .392C20.896 18.545 16.852 22 12 22 7.149 22 3.104 18.545 2.192 13.962Z"),
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
        return _mic2Fill!!
    }

private var _mic2Fill: ImageVector? = null
