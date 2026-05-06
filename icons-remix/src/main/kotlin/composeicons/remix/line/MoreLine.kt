package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MoreLine: ImageVector
    get() {
        if (_moreLine != null) return _moreLine!!
        _moreLine = remixIcon(
            name = "MoreLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.5 10.5C3.675 10.5 3 11.175 3 12c0 .825 .675 1.5 1.5 1.5C5.325 13.5 6 12.825 6 12 6 11.175 5.325 10.5 4.5 10.5ZM19.5 10.5C18.675 10.5 18 11.175 18 12c0 .825 .675 1.5 1.5 1.5C20.325 13.5 21 12.825 21 12c0-.825-.675-1.5-1.5-1.5ZM12 10.5c-.825 0-1.5 .675-1.5 1.5 0 .825 .675 1.5 1.5 1.5 .825 0 1.5-.675 1.5-1.5 0-.825-.675-1.5-1.5-1.5Z"),
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
        return _moreLine!!
    }

private var _moreLine: ImageVector? = null
