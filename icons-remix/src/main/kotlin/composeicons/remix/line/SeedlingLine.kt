package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SeedlingLine: ImageVector
    get() {
        if (_seedlingLine != null) return _seedlingLine!!
        _seedlingLine = remixIcon(
            name = "SeedlingLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.998 3c3.49 0 6.383 2.554 6.913 5.894C14.086 7.724 15.708 7 17.498 7h4.5v2.5c0 3.59-2.91 6.5-6.5 6.5h-2.5v5h-2v-8h-2C5.132 13 1.998 9.866 1.998 6v-3h4ZM19.998 9h-2.5c-2.485 0-4.5 2.015-4.5 4.5v.5h2.5c2.485 0 4.5-2.015 4.5-4.5v-.5ZM5.998 5h-2v1c0 2.761 2.239 5 5 5h2v-1C10.998 7.239 8.759 5 5.998 5Z"),
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
        return _seedlingLine!!
    }

private var _seedlingLine: ImageVector? = null
