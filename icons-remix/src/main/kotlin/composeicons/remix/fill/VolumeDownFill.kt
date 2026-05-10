package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.VolumeDownFill: ImageVector
    get() {
        if (_volumeDownFill != null) return _volumeDownFill!!
        _volumeDownFill = remixIcon(
            name = "VolumeDownFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.889 16h-3.889c-.552 0-1-.448-1-1v-6c0-.552 .448-1 1-1h3.889L14.183 3.668c.214-.175 .529-.143 .704 .07 .073 .089 .113 .201 .113 .317v15.89c0 .276-.224 .5-.5 .5-.115 0-.227-.04-.317-.113L8.889 16ZM18.863 16.591 17.441 15.169C18.389 14.438 19 13.29 19 12 19 10.57 18.249 9.315 17.12 8.608L18.559 7.169C20.04 8.262 21 10.019 21 12c0 1.842-.83 3.49-2.137 4.591Z"),
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
        return _volumeDownFill!!
    }

private var _volumeDownFill: ImageVector? = null
