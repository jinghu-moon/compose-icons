package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SendInsFill: ImageVector
    get() {
        if (_sendInsFill != null) return _sendInsFill!!
        _sendInsFill = remixIcon(
            name = "SendInsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.5 2.001c.594-0 1.199 .15 1.75 .468 1.674 .967 2.248 3.107 1.281 4.781L15.031 20.24c-.967 1.674-3.107 2.248-4.781 1.281C9.414 21.039 8.852 20.26 8.62 19.397L7.121 13.803 15.891 8.739c.478-.276 .642-.888 .366-1.366-.276-.478-.888-.642-1.366-.366L6.121 12.071 2.025 7.975C.658 6.608 .659 4.392 2.025 3.025 2.657 2.393 3.534 2 4.5 2l15 .001Z"),
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
        return _sendInsFill!!
    }

private var _sendInsFill: ImageVector? = null
