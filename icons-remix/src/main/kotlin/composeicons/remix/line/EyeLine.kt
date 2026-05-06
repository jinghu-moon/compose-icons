package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.EyeLine: ImageVector
    get() {
        if (_eyeLine != null) return _eyeLine!!
        _eyeLine = remixIcon(
            name = "EyeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 3c5.392 0 9.878 3.88 10.819 9-.94 5.12-5.426 9-10.819 9C6.608 21 2.122 17.12 1.182 12 2.122 6.88 6.608 3 12 3ZM12 19c4.236 0 7.86-2.948 8.777-7C19.86 7.948 16.236 5 12 5 7.765 5 4.14 7.948 3.223 12c.917 4.052 4.542 7 8.778 7ZM12 16.5C9.515 16.5 7.5 14.485 7.5 12c0-2.485 2.015-4.5 4.5-4.5 2.485 0 4.5 2.015 4.5 4.5 0 2.485-2.015 4.5-4.5 4.5ZM12 14.5c1.381 0 2.5-1.119 2.5-2.5 0-1.381-1.119-2.5-2.5-2.5C10.62 9.5 9.5 10.619 9.5 12c0 1.381 1.119 2.5 2.5 2.5Z"),
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
        return _eyeLine!!
    }

private var _eyeLine: ImageVector? = null
