package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AiGenerate2Fill: ImageVector
    get() {
        if (_aiGenerate2Fill != null) return _aiGenerate2Fill!!
        _aiGenerate2Fill = remixIcon(
            name = "AiGenerate2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 3c2.209 0 4 1.791 4 4v10c0 2.209-1.791 4-4 4h-12C3.791 21 2 19.209 2 17v-10C2 4.791 3.791 3 6 3h12ZM12.588 7.399c-.221-.532-.955-.532-1.176 0l-.317 .764c-.54 1.303-1.547 2.345-2.813 2.908l-.896 .398c-.513 .229-.513 .976 0 1.204l.95 .422c1.235 .549 2.224 1.553 2.773 2.813l.308 .707c.226 .518 .942 .518 1.168 0l.308-.707c.549-1.261 1.539-2.264 2.773-2.813l.95-.422c.513-.228 .513-.976 0-1.204l-.896-.398C14.452 10.508 13.444 9.467 12.904 8.163l-.316-.764Z"),
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
        return _aiGenerate2Fill!!
    }

private var _aiGenerate2Fill: ImageVector? = null
