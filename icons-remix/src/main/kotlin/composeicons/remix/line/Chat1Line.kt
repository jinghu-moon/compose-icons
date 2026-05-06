package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Chat1Line: ImageVector
    get() {
        if (_chat1Line != null) return _chat1Line!!
        _chat1Line = remixIcon(
            name = "Chat1Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10 3h4c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8v3.5C9 20.5 2 17.5 2 11 2 6.582 5.582 3 10 3ZM12 17h2c3.314 0 6-2.686 6-6C20 7.686 17.314 5 14 5h-4C6.686 5 4 7.686 4 11c0 3.61 2.462 5.966 8 8.48v-2.48Z"),
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
        return _chat1Line!!
    }

private var _chat1Line: ImageVector? = null
