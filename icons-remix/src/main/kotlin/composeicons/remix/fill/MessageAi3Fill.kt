package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MessageAi3Fill: ImageVector
    get() {
        if (_messageAi3Fill != null) return _messageAi3Fill!!
        _messageAi3Fill = remixIcon(
            name = "MessageAi3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.999 3C19.313 3 22 5.695 22 8.994v12.006h-13.999C4.687 21 2 18.305 2 15.006v-4.349c.626 .221 1.299 .343 2 .343C7.314 11 10 8.314 10 5c0-.701-.122-1.374-.343-2h6.342ZM8 13h2v-2h-2v2ZM14 13h2v-2h-2v2ZM3.529 1.319c.177-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.718 .319c.41 .183 .41 .78 0 .963l-.76 .338C5.945 6.316 5.153 7.119 4.714 8.128l-.247 .565c-.18 .414-.753 .414-.934 0L3.286 8.128C2.847 7.119 2.055 6.316 1.067 5.877L.308 5.539c-.41-.183-.41-.78 0-.963l.718-.319C2.038 3.806 2.844 2.973 3.276 1.931l.253-.611Z"),
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
        return _messageAi3Fill!!
    }

private var _messageAi3Fill: ImageVector? = null
