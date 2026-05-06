package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MailOpenFill: ImageVector
    get() {
        if (_mailOpenFill != null) return _mailOpenFill!!
        _mailOpenFill = remixIcon(
            name = "MailOpenFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2.243 6.854 11.49 1.309c.317-.19 .712-.19 1.029 0l9.239 5.546c.151 .09 .243 .253 .243 .429v12.717c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-12.717c0-.176 .092-.338 .243-.429ZM18.346 8.244l-6.285 5.439L5.647 8.238 4.353 9.762l7.72 6.555L19.654 9.756 18.346 8.244Z"),
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
        return _mailOpenFill!!
    }

private var _mailOpenFill: ImageVector? = null
