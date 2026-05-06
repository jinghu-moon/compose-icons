package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BearSmileLine: ImageVector
    get() {
        if (_bearSmileLine != null) return _bearSmileLine!!
        _bearSmileLine = remixIcon(
            name = "BearSmileLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 17c2.209 0 4-1.791 4-4h-2c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2h-2c0 2.209 1.791 4 4 4ZM6.5 2C4.015 2 2 4.015 2 6.5c0 1.357 .601 2.573 1.549 3.398C3.194 10.866 3 11.911 3 13c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9 0-1.089-.194-2.134-.549-3.102C21.399 9.073 22 7.857 22 6.5 22 4.015 19.985 2 17.5 2c-1.626 0-3.05 .862-3.84 2.153C13.122 4.052 12.566 4 12 4c-.566 0-1.122 .052-1.66 .153C9.55 2.862 8.126 2 6.5 2ZM4 6.5C4 5.119 5.119 4 6.5 4c1.08 0 2.003 .686 2.352 1.649l.318 .878 .898-.257C10.68 6.094 11.328 6 12 6c.672 0 1.32 .094 1.932 .27l.898 .257 .318-.878C15.497 4.686 16.42 4 17.5 4 18.881 4 20 5.119 20 6.5c0 .933-.511 1.748-1.272 2.179l-.813 .46 .403 .843c.437 .913 .682 1.936 .682 3.019 0 3.866-3.134 7-7 7C8.134 20 5 16.866 5 13c0-1.083 .245-2.106 .682-3.019l.404-.843L5.272 8.679C4.511 8.248 4 7.433 4 6.5Z"),
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
        return _bearSmileLine!!
    }

private var _bearSmileLine: ImageVector? = null
