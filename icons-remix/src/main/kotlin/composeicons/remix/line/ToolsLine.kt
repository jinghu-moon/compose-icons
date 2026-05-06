package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ToolsLine: ImageVector
    get() {
        if (_toolsLine != null) return _toolsLine!!
        _toolsLine = remixIcon(
            name = "ToolsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.329 3.272c1.233-.438 2.663-.164 3.65 .823 1.121 1.121 1.323 2.813 .605 4.139L20.293 18.944l-1.414 1.414L8.17 9.649c-1.327 .718-3.019 .517-4.14-.605C3.042 8.057 2.768 6.627 3.207 5.393L5.444 7.63c.586 .586 1.536 .586 2.121 0 .586-.586 .586-1.536 0-2.121L5.329 3.272ZM15.697 5.155 18.879 3.387l1.414 1.414L18.525 7.984l-1.768 .354-2.121 2.121L13.222 9.044 15.343 6.923l.354-1.768ZM8.979 13.287l1.414 1.414L5.09 20.004c-.391 .39-1.024 .39-1.414 0-.363-.363-.389-.934-.078-1.327l.078-.087L8.979 13.287Z"),
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
        return _toolsLine!!
    }

private var _toolsLine: ImageVector? = null
