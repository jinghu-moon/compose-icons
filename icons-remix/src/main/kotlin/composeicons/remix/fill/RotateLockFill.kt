package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RotateLockFill: ImageVector
    get() {
        if (_rotateLockFill != null) return _rotateLockFill!!
        _rotateLockFill = remixIcon(
            name = "RotateLockFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 2.136-.67 4.116-1.811 5.741L17 12h3C20 7.582 16.418 4 12 4 7.582 4 4 7.582 4 12c0 4.418 3.582 8 8 8 2.15 0 4.102-.848 5.54-2.228l.998 1.795C16.785 21.083 14.5 22 12 22 6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM12 7c1.657 0 3 1.343 3 3v1h1v5h-8v-5h1v-1C9 8.343 10.343 7 12 7ZM12 9c-.513 0-.936 .386-.993 .883L11 10v1h2v-1c0-.513-.386-.936-.883-.993L12 9Z"),
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
        return _rotateLockFill!!
    }

private var _rotateLockFill: ImageVector? = null
