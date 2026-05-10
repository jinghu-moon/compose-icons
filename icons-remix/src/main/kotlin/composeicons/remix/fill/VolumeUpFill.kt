package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.VolumeUpFill: ImageVector
    get() {
        if (_volumeUpFill != null) return _volumeUpFill!!
        _volumeUpFill = remixIcon(
            name = "VolumeUpFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 16h3.889l5.295 4.332c.089 .073 .201 .113 .317 .113 .276 0 .5-.224 .5-.5v-15.89c0-.115-.04-.227-.113-.317-.175-.214-.49-.245-.704-.07L5.889 8h-3.889c-.552 0-1 .448-1 1v6c0 .552 .448 1 1 1ZM23 12c0 3.292-1.446 6.246-3.738 8.262L17.844 18.844C19.776 17.194 21 14.74 21 12 21 9.26 19.776 6.806 17.844 5.156L19.262 3.738C21.554 5.754 23 8.708 23 12ZM18 12C18 10.088 17.106 8.385 15.713 7.287L14.284 8.716C15.321 9.439 16 10.64 16 12c0 1.36-.679 2.561-1.716 3.284l1.429 1.429C17.106 15.615 18 13.912 18 12Z"),
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
        return _volumeUpFill!!
    }

private var _volumeUpFill: ImageVector? = null
