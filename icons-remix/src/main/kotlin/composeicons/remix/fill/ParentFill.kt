package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ParentFill: ImageVector
    get() {
        if (_parentFill != null) return _parentFill!!
        _parentFill = remixIcon(
            name = "ParentFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 11C4.515 11 2.5 8.985 2.5 6.5 2.5 4.015 4.515 2 7 2c2.485 0 4.5 2.015 4.5 4.5C11.5 8.985 9.485 11 7 11ZM17.5 15c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4ZM17.5 16C19.985 16 22 18.015 22 20.5v.5h-9v-.5C13 18.015 15.015 16 17.5 16ZM7 12c2.761 0 5 2.239 5 5v4h-10v-4C2 14.239 4.239 12 7 12Z"),
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
        return _parentFill!!
    }

private var _parentFill: ImageVector? = null
