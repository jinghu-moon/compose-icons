package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SpamLine: ImageVector
    get() {
        if (_spamLine != null) return _spamLine!!
        _spamLine = remixIcon(
            name = "SpamLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.5 2.5 23 12l-5.5 9.5h-11L1 12 6.5 2.5h11ZM16.347 4.5h-8.694L3.311 12l4.342 7.5h8.694L20.689 12 16.347 4.5ZM11 15h2v2h-2v-2ZM11 7h2v6h-2v-6Z"),
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
        return _spamLine!!
    }

private var _spamLine: ImageVector? = null
