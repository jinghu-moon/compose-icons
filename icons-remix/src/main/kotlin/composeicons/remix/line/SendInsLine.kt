package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SendInsLine: ImageVector
    get() {
        if (_sendInsLine != null) return _sendInsLine!!
        _sendInsLine = remixIcon(
            name = "SendInsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.5 2c.595-0 1.199 .151 1.75 .469 1.674 .967 2.248 3.107 1.281 4.781L15.031 20.24c-.967 1.674-3.107 2.248-4.781 1.281C9.414 21.039 8.852 20.261 8.62 19.397L6.853 12.804 2.025 7.975C.658 6.608 .659 4.392 2.025 3.025 2.658 2.393 3.534 2 4.5 2h15ZM4.5 4c-.414 0-.788 .167-1.061 .439-.586 .586-.586 1.535 0 2.121l4.475 4.475L14.891 7.007c.478-.276 1.09-.112 1.366 .366 .276 .478 .112 1.09-.366 1.366L8.914 12.768l1.638 6.111c.1 .372 .34 .703 .698 .91 .717 .414 1.635 .168 2.049-.549L20.799 6.25c.414-.717 .169-1.635-.549-2.049C20.013 4.064 19.756 4 19.501 4h-15.001Z"),
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
        return _sendInsLine!!
    }

private var _sendInsLine: ImageVector? = null
