package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Apps2AiLine: ImageVector
    get() {
        if (_apps2AiLine != null) return _apps2AiLine!!
        _apps2AiLine = remixIcon(
            name = "Apps2AiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2.5 7c0 2.485 2.015 4.5 4.5 4.5 2.485 0 4.5-2.015 4.5-4.5C11.5 4.515 9.485 2.5 7 2.5 4.515 2.5 2.5 4.515 2.5 7ZM2.5 17c0 2.485 2.015 4.5 4.5 4.5 2.485 0 4.5-2.015 4.5-4.5C11.5 14.515 9.485 12.5 7 12.5 4.515 12.5 2.5 14.515 2.5 17ZM12.5 17c0 2.485 2.015 4.5 4.5 4.5 2.485 0 4.5-2.015 4.5-4.5 0-2.485-2.015-4.5-4.5-4.5-2.485 0-4.5 2.015-4.5 4.5ZM9.5 7C9.5 8.381 8.381 9.5 7 9.5 5.619 9.5 4.5 8.381 4.5 7 4.5 5.619 5.619 4.5 7 4.5 8.381 4.5 9.5 5.619 9.5 7ZM9.5 17c0 1.381-1.119 2.5-2.5 2.5C5.619 19.5 4.5 18.381 4.5 17 4.5 15.619 5.619 14.5 7 14.5c1.381 0 2.5 1.119 2.5 2.5ZM19.5 17c0 1.381-1.119 2.5-2.5 2.5-1.381 0-2.5-1.119-2.5-2.5 0-1.381 1.119-2.5 2.5-2.5 1.381 0 2.5 1.119 2.5 2.5ZM17.525 11.155l.277-.636c.494-1.135 1.385-2.038 2.496-2.532l.855-.38c.462-.206 .462-.878 0-1.083l-.807-.359C19.207 5.657 18.3 4.72 17.814 3.547l-.285-.688c-.199-.479-.86-.479-1.059 0l-.285 .688c-.486 1.173-1.392 2.11-2.532 2.617l-.807 .359c-.462 .206-.462 .878 0 1.083l.855 .38c1.111 .494 2.002 1.398 2.496 2.532l.277 .636c.203 .466 .847 .466 1.05 0Z"),
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
        return _apps2AiLine!!
    }

private var _apps2AiLine: ImageVector? = null
