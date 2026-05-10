package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.WindowsFill: ImageVector
    get() {
        if (_windowsFill != null) return _windowsFill!!
        _windowsFill = remixIcon(
            name = "WindowsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.001 5.479 10.378 4.463v7.128h-7.377v-6.111ZM3.001 18.521l7.377 1.017v-7.039h-7.377v6.023ZM11.189 19.646 21.001 21v-8.502h-9.812v7.148ZM11.189 4.354v7.236h9.812v-8.59L11.189 4.354Z"),
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
        return _windowsFill!!
    }

private var _windowsFill: ImageVector? = null
