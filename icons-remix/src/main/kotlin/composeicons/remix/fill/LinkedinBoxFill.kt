package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.LinkedinBoxFill: ImageVector
    get() {
        if (_linkedinBoxFill != null) return _linkedinBoxFill!!
        _linkedinBoxFill = remixIcon(
            name = "LinkedinBoxFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.336 18.339h-2.666v-4.177c0-.996-.02-2.278-1.389-2.278-1.39 0-1.602 1.084-1.602 2.204v4.25h-2.665v-8.589h2.561v1.171h.034c.358-.675 1.228-1.387 2.528-1.387 2.701 0 3.2 1.778 3.2 4.091v4.715h-.001ZM7.004 8.575C6.146 8.575 5.456 7.88 5.456 7.026c0-.853 .69-1.547 1.547-1.547 .855 0 1.548 .694 1.548 1.547 0 .854-.694 1.549-1.548 1.549ZM8.34 18.339h-2.673v-8.589h2.673v8.589ZM19.67 3h-15.34C3.595 3 3.001 3.58 3.001 4.297v15.407c0 .717 .594 1.297 1.328 1.297h15.338c.733 0 1.333-.58 1.333-1.297v-15.407C21.001 3.58 20.401 3 19.667 3h.002Z"),
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
        return _linkedinBoxFill!!
    }

private var _linkedinBoxFill: ImageVector? = null
