package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Loader2Line: ImageVector
    get() {
        if (_loader2Line != null) return _loader2Line!!
        _loader2Line = remixIcon(
            name = "Loader2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c.552 0 1 .448 1 1v3c0 .552-.448 1-1 1C11.448 7 11 6.552 11 6v-3c0-.552 .448-1 1-1ZM12 17c.552 0 1 .448 1 1v3c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-3c0-.552 .448-1 1-1ZM22 12c0 .552-.448 1-1 1h-3c-.552 0-1-.448-1-1 0-.552 .448-1 1-1h3c.552 0 1 .448 1 1ZM7 12c0 .552-.448 1-1 1h-3C2.448 13 2 12.552 2 12c0-.552 .448-1 1-1h3c.552 0 1 .448 1 1ZM19.071 19.071c-.391 .39-1.024 .39-1.414 0L15.535 16.95c-.39-.39-.39-1.024 0-1.414 .391-.39 1.024-.39 1.414 0l2.121 2.121c.39 .39 .39 1.024 0 1.414ZM8.464 8.464c-.391 .391-1.024 .391-1.414 0L4.929 6.343c-.391-.391-.391-1.024 0-1.414 .391-.391 1.024-.391 1.414 0L8.464 7.05c.391 .391 .391 1.024 0 1.414ZM4.929 19.071c-.391-.391-.391-1.024 0-1.414L7.05 15.535c.391-.39 1.024-.39 1.414 0 .391 .391 .391 1.024 0 1.414L6.343 19.071c-.391 .39-1.024 .39-1.414 0ZM15.535 8.464c-.39-.391-.39-1.024 0-1.414L17.657 4.929c.39-.391 1.024-.391 1.414 0 .39 .391 .39 1.024 0 1.414L16.95 8.464c-.39 .391-1.024 .391-1.414 0Z"),
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
        return _loader2Line!!
    }

private var _loader2Line: ImageVector? = null
