package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CursorLine: ImageVector
    get() {
        if (_cursorLine != null) return _cursorLine!!
        _cursorLine = remixIcon(
            name = "CursorLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.387 13.498 L 17.940 20.512 L 13.242 22.222 L 10.689 15.208 L 6.790 17.653 L 8.409 1.633 L 19.946 12.865 L 15.387 13.498 ZM 15.377 19.316 L 12.662 11.857 L 15.621 11.446 L 9.982 5.956 L 9.191 13.786 L 11.722 12.199 L 14.437 19.658 L 15.377 19.316 Z"),
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
        return _cursorLine!!
    }

private var _cursorLine: ImageVector? = null
