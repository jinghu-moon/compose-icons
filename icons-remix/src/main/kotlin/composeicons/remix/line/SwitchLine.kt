package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SwitchLine: ImageVector
    get() {
        if (_switchLine != null) return _switchLine!!
        _switchLine = remixIcon(
            name = "SwitchLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.001 3v18h-4.4C5.06 21 3.001 18.941 3.001 16.4v-8.8C3.001 5.059 5.06 3 7.601 3h4.4ZM10.001 5h-2.4C6.165 5 5.001 6.164 5.001 7.6v8.8C5.001 17.836 6.165 19 7.601 19h2.4v-14ZM7.501 10C6.673 10 6.001 9.328 6.001 8.5 6.001 7.672 6.673 7 7.501 7c.828 0 1.5 .672 1.5 1.5C9.001 9.328 8.329 10 7.501 10ZM14.001 3h2.4c2.541 0 4.6 2.059 4.6 4.6v8.8c0 2.541-2.059 4.6-4.6 4.6h-2.4v-18ZM17.001 14.7c.994 0 1.8-.806 1.8-1.8 0-.994-.806-1.8-1.8-1.8-.994 0-1.8 .806-1.8 1.8 0 .994 .806 1.8 1.8 1.8Z"),
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
        return _switchLine!!
    }

private var _switchLine: ImageVector? = null
