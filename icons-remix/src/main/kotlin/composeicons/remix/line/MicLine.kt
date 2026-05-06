package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MicLine: ImageVector
    get() {
        if (_micLine != null) return _micLine!!
        _micLine = remixIcon(
            name = "MicLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 3C10.343 3 9 4.343 9 6v4c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3v-4c0-1.657-1.343-3-3-3ZM12 1c2.761 0 5 2.239 5 5v4c0 2.761-2.239 5-5 5C9.238 15 7 12.761 7 10v-4c0-2.761 2.239-5 5-5ZM3.055 11h2.016c.485 3.392 3.403 6 6.929 6 3.526 0 6.444-2.608 6.929-6h2.016c-.461 4.172-3.773 7.484-7.945 7.945v4.055h-2v-4.055C6.828 18.484 3.516 15.172 3.055 11Z"),
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
        return _micLine!!
    }

private var _micLine: ImageVector? = null
