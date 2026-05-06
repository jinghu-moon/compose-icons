package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Apps2Line: ImageVector
    get() {
        if (_apps2Line != null) return _apps2Line!!
        _apps2Line = remixIcon(
            name = "Apps2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 11.5C4.515 11.5 2.5 9.485 2.5 7 2.5 4.515 4.515 2.5 7 2.5c2.485 0 4.5 2.015 4.5 4.5 0 2.485-2.015 4.5-4.5 4.5ZM7 21.5C4.515 21.5 2.5 19.485 2.5 17 2.5 14.515 4.515 12.5 7 12.5c2.485 0 4.5 2.015 4.5 4.5 0 2.485-2.015 4.5-4.5 4.5ZM17 11.5C14.515 11.5 12.5 9.485 12.5 7 12.5 4.515 14.515 2.5 17 2.5c2.485 0 4.5 2.015 4.5 4.5 0 2.485-2.015 4.5-4.5 4.5ZM17 21.5c-2.485 0-4.5-2.015-4.5-4.5 0-2.485 2.015-4.5 4.5-4.5 2.485 0 4.5 2.015 4.5 4.5 0 2.485-2.015 4.5-4.5 4.5ZM7 9.5C8.381 9.5 9.5 8.381 9.5 7 9.5 5.619 8.381 4.5 7 4.5 5.619 4.5 4.5 5.619 4.5 7 4.5 8.381 5.619 9.5 7 9.5ZM7 19.5c1.381 0 2.5-1.119 2.5-2.5C9.5 15.619 8.381 14.5 7 14.5 5.619 14.5 4.5 15.619 4.5 17c0 1.381 1.119 2.5 2.5 2.5ZM17 9.5c1.381 0 2.5-1.119 2.5-2.5C19.5 5.619 18.381 4.5 17 4.5 15.619 4.5 14.5 5.619 14.5 7c0 1.381 1.119 2.5 2.5 2.5ZM17 19.5c1.381 0 2.5-1.119 2.5-2.5 0-1.381-1.119-2.5-2.5-2.5-1.381 0-2.5 1.119-2.5 2.5 0 1.381 1.119 2.5 2.5 2.5Z"),
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
        return _apps2Line!!
    }

private var _apps2Line: ImageVector? = null
