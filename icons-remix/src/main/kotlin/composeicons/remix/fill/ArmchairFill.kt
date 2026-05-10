package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ArmchairFill: ImageVector
    get() {
        if (_armchairFill != null) return _armchairFill!!
        _armchairFill = remixIcon(
            name = "ArmchairFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 3h-8C5.791 3 4 4.791 4 7v1c2.761 0 5 2.239 5 5h6c0-2.761 2.239-5 5-5v-1C20 4.791 18.209 3 16 3ZM20 10c-1.657 0-3 1.343-3 3v3h-2v-1h-6v1h-2v-3C7 11.343 5.657 10 4 10 2.343 10 1 11.343 1 13c0 1.306 .835 2.417 2 2.829v5.171h2v-1h14v1h2v-5.171c1.165-.412 2-1.523 2-2.829 0-1.657-1.343-3-3-3Z"),
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
        return _armchairFill!!
    }

private var _armchairFill: ImageVector? = null
