package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.More2Line: ImageVector
    get() {
        if (_more2Line != null) return _more2Line!!
        _more2Line = remixIcon(
            name = "More2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 3c-.825 0-1.5 .675-1.5 1.5C10.5 5.325 11.175 6 12 6c.825 0 1.5-.675 1.5-1.5C13.5 3.675 12.825 3 12 3ZM12 18c-.825 0-1.5 .675-1.5 1.5 0 .825 .675 1.5 1.5 1.5 .825 0 1.5-.675 1.5-1.5C13.5 18.675 12.825 18 12 18ZM12 10.5c-.825 0-1.5 .675-1.5 1.5 0 .825 .675 1.5 1.5 1.5 .825 0 1.5-.675 1.5-1.5 0-.825-.675-1.5-1.5-1.5Z"),
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
        return _more2Line!!
    }

private var _more2Line: ImageVector? = null
