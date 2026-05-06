package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Dice6Line: ImageVector
    get() {
        if (_dice6Line != null) return _dice6Line!!
        _dice6Line = remixIcon(
            name = "Dice6Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 5v14h-14v-14h14ZM5 3C3.895 3 3 3.895 3 5v14c0 1.105 .895 2 2 2h14c1.105 0 2-.895 2-2v-14C21 3.895 20.105 3 19 3h-14ZM9 9.5c.828 0 1.5-.672 1.5-1.5C10.5 7.172 9.828 6.5 9 6.5 8.172 6.5 7.5 7.172 7.5 8c0 .828 .672 1.5 1.5 1.5ZM10.5 12c0 .828-.672 1.5-1.5 1.5C8.172 13.5 7.5 12.828 7.5 12c0-.828 .672-1.5 1.5-1.5 .828 0 1.5 .672 1.5 1.5ZM10.5 16c0 .828-.672 1.5-1.5 1.5C8.172 17.5 7.5 16.828 7.5 16c0-.828 .672-1.5 1.5-1.5 .828 0 1.5 .672 1.5 1.5ZM16.5 8c0 .828-.672 1.5-1.5 1.5C14.172 9.5 13.5 8.828 13.5 8c0-.828 .672-1.5 1.5-1.5 .828 0 1.5 .672 1.5 1.5ZM15 13.5c.828 0 1.5-.672 1.5-1.5 0-.828-.672-1.5-1.5-1.5-.828 0-1.5 .672-1.5 1.5 0 .828 .672 1.5 1.5 1.5ZM15 17.5c.828 0 1.5-.672 1.5-1.5 0-.828-.672-1.5-1.5-1.5-.828 0-1.5 .672-1.5 1.5 0 .828 .672 1.5 1.5 1.5Z"),
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
        return _dice6Line!!
    }

private var _dice6Line: ImageVector? = null
