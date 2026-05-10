package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BarricadeFill: ImageVector
    get() {
        if (_barricadeFill != null) return _barricadeFill!!
        _barricadeFill = remixIcon(
            name = "BarricadeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.556 19h1.444v2h-18v-2h1.444l.889-4h13.333l.889 4ZM17.333 9l.889 4h-12.444L6.667 9h10.667ZM16.889 7h-9.778L7.826 3.783C7.928 3.326 8.333 3 8.802 3h6.396c.469 0 .875 .326 .976 .783L16.889 7Z"),
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
        return _barricadeFill!!
    }

private var _barricadeFill: ImageVector? = null
