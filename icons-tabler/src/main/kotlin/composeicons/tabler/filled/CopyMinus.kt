package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CopyMinus: ImageVector
    get() {
        if (_copyMinus != null) return _copyMinus!!
        _copyMinus = tablerFilledIcon(
            name = "CopyMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.333 6C20.358 6 22 7.642 22 9.667v8.666C22 20.358 20.358 22 18.333 22h-8.666C7.642 22 6 20.358 6 18.333v-8.666C6 7.642 7.642 6 9.667 6ZM15 2c1.094 0 1.828 .533 2.374 1.514 .268 .483 .095 1.092-.388 1.36-.483 .268-1.092 .095-1.36-.388C15.405 4.088 15.284 4 15 4h-10C4.452 4 4 4.452 4 5v9.998c0 .32 .154 .618 .407 .805l.1 .065c.48 .273 .647 .884 .374 1.364-.273 .48-.884 .647-1.364 .374C2.58 17.073 2.001 16.078 2 15v-10C2 3.348 3.348 2 5 2ZM17 13h-6c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h6c.552 0 1-.448 1-1 0-.552-.448-1-1-1"),
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
        return _copyMinus!!
    }

private var _copyMinus: ImageVector? = null
