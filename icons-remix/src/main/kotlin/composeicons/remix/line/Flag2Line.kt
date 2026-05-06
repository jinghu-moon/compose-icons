package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Flag2Line: ImageVector
    get() {
        if (_flag2Line != null) return _flag2Line!!
        _flag2Line = remixIcon(
            name = "Flag2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21.138 3c.276 0 .5 .224 .5 .5 0 .087-.023 .173-.066 .248L18 10l3.573 6.252c.137 .24 .054 .545-.186 .682-.076 .043-.161 .066-.248 .066h-17.138v5h-2v-19h19.138ZM18.554 5h-14.554v10h14.554L15.696 10 18.554 5Z"),
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
        return _flag2Line!!
    }

private var _flag2Line: ImageVector? = null
