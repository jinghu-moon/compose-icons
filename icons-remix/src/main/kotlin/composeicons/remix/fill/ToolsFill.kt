package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ToolsFill: ImageVector
    get() {
        if (_toolsFill != null) return _toolsFill!!
        _toolsFill = remixIcon(
            name = "ToolsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.329 3.272c1.233-.438 2.663-.164 3.65 .823 .987 .987 1.261 2.418 .823 3.651L20.646 18.59l-2.121 2.121L7.679 9.867c-1.233 .438-2.663 .164-3.65-.823C3.042 8.057 2.768 6.627 3.207 5.393L5.444 7.63c.586 .586 1.536 .586 2.121 0 .586-.586 .586-1.536 0-2.121L5.329 3.272ZM15.697 5.155 18.879 3.387l1.414 1.414L18.525 7.984l-1.768 .354-2.121 2.121L13.222 9.044 15.343 6.923l.354-1.768ZM8.626 12.933l2.121 2.121L5.797 20.004c-.586 .586-1.536 .586-2.121 0-.551-.551-.584-1.425-.097-2.014l.097-.107L8.626 12.933Z"),
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
        return _toolsFill!!
    }

private var _toolsFill: ImageVector? = null
