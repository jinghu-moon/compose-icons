package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BilibiliFill: ImageVector
    get() {
        if (_bilibiliFill != null) return _bilibiliFill!!
        _bilibiliFill = remixIcon(
            name = "BilibiliFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.223 3.086c.488 .488 .488 1.28 0 1.768L17.08 5.996l1.17 0C20.321 5.997 22 7.676 22 9.747v7.5c0 2.071-1.679 3.75-3.75 3.75h-12.5C3.679 20.997 2 19.318 2 17.247v-7.5C2 7.676 3.679 5.997 5.75 5.997L6.916 5.996 5.775 4.855c-.488-.488-.488-1.28 0-1.768 .488-.488 1.28-.488 1.768 0l2.652 2.652c.079 .079 .145 .166 .198 .258l3.212 0c.054-.093 .12-.18 .199-.259L16.455 3.086c.488-.488 1.28-.488 1.768 0ZM18.25 8.507h-12.5c-.659 0-1.199 .51-1.247 1.157l-.003 .093v7.5c0 .659 .51 1.199 1.157 1.247l.093 .003h12.5c.659 0 1.199-.51 1.247-1.157l.003-.093v-7.5c0-.69-.56-1.25-1.25-1.25ZM8.25 11.007c.69 0 1.25 .56 1.25 1.25v1.25c0 .69-.56 1.25-1.25 1.25C7.56 14.757 7 14.197 7 13.507v-1.25c0-.69 .56-1.25 1.25-1.25ZM15.75 11.007c.69 0 1.25 .56 1.25 1.25v1.25c0 .69-.56 1.25-1.25 1.25-.69 0-1.25-.56-1.25-1.25v-1.25c0-.69 .56-1.25 1.25-1.25Z"),
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
        return _bilibiliFill!!
    }

private var _bilibiliFill: ImageVector? = null
