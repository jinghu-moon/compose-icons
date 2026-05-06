package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AiGenerate2Line: ImageVector
    get() {
        if (_aiGenerate2Line != null) return _aiGenerate2Line!!
        _aiGenerate2Line = remixIcon(
            name = "AiGenerate2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 3c2.209 0 4 1.791 4 4v10c0 2.209-1.791 4-4 4h-12C3.791 21 2 19.209 2 17v-10C2 4.791 3.791 3 6 3h12ZM6 5C4.895 5 4 5.895 4 7v10c0 1.105 .895 2 2 2h12c1.105 0 2-.895 2-2v-10C20 5.895 19.105 5 18 5h-12ZM11.412 7.399c.221-.532 .955-.532 1.176 0l.316 .764c.54 1.303 1.548 2.345 2.814 2.908l.896 .398c.513 .229 .513 .976 0 1.204l-.95 .422c-1.234 .549-2.224 1.553-2.773 2.813l-.308 .707c-.226 .518-.942 .518-1.168 0l-.308-.707C10.559 14.649 9.57 13.645 8.335 13.096l-.95-.422c-.513-.228-.513-.976 0-1.204l.896-.398c1.266-.563 2.274-1.605 2.813-2.908l.317-.764Z"),
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
        return _aiGenerate2Line!!
    }

private var _aiGenerate2Line: ImageVector? = null
