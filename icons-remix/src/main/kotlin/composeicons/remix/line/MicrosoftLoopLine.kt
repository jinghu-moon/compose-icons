package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MicrosoftLoopLine: ImageVector
    get() {
        if (_microsoftLoopLine != null) return _microsoftLoopLine!!
        _microsoftLoopLine = remixIcon(
            name = "MicrosoftLoopLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 4c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-4.31c.903-.941 1.525-2.152 1.733-3.5h2.576c2.485 0 4.5-2.015 4.5-4.5C16.5 9.515 14.485 7.5 12 7.5 9.515 7.5 7.5 9.515 7.5 12v3.5c0 2.142-1.496 3.934-3.5 4.389v-7.889C4 7.582 7.582 4 12 4ZM12 22c5.523 0 10-4.477 10-10C22 6.477 17.523 2 12 2 6.477 2 2 6.477 2 12v10h10ZM9.5 14.5v-2.5C9.5 10.619 10.619 9.5 12 9.5c1.381 0 2.5 1.119 2.5 2.5 0 1.381-1.119 2.5-2.5 2.5h-2.5Z"),
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
        return _microsoftLoopLine!!
    }

private var _microsoftLoopLine: ImageVector? = null
