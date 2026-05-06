package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Html5Line: ImageVector
    get() {
        if (_html5Line != null) return _html5Line!!
        _html5Line = remixIcon(
            name = "Html5Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 18.178 7.381 16.922 7.052 13.378h2.27l.159 1.844L12 15.889l2.519-.667 .261-2.867h-7.82L6.325 5.678h11.349l-.227 2.211h-8.626l.204 2.256h8.217l-.624 6.778L12 18.178ZM3 2h18L19.377 20 12 22 4.623 20 3 2ZM5.188 4 6.49 18.434 12 19.928l5.51-1.494L18.812 4h-13.623Z"),
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
        return _html5Line!!
    }

private var _html5Line: ImageVector? = null
