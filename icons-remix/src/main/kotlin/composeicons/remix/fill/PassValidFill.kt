package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PassValidFill: ImageVector
    get() {
        if (_passValidFill != null) return _passValidFill!!
        _passValidFill = remixIcon(
            name = "PassValidFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 4C1.448 4 1 4.448 1 5v14c0 .552 .448 1 1 1h20c.552 0 1-.448 1-1v-14C23 4.448 22.552 4 22 4h-20ZM9 10c0-.552-.448-1-1-1-.552 0-1 .448-1 1 0 .552 .448 1 1 1 .552 0 1-.448 1-1ZM11 10c0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3 0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3ZM5.527 17.025 4.113 15.611C5.107 14.617 6.484 14 8.002 14c1.519 0 2.895 .617 3.889 1.611l-1.414 1.414C9.843 16.391 8.969 16 8.002 16c-.967 0-1.84 .391-2.475 1.025ZM20.207 10.707l-4 4-.707 .707-.707-.707L12.293 12.207l1.414-1.414 1.793 1.793L18.793 9.293l1.414 1.414Z"),
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
        return _passValidFill!!
    }

private var _passValidFill: ImageVector? = null
