package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PatreonFill: ImageVector
    get() {
        if (_patreonFill != null) return _patreonFill!!
        _patreonFill = remixIcon(
            name = "PatreonFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.001 17C10.859 17 7.501 13.642 7.501 9.5 7.501 5.358 10.859 2 15.001 2c4.142 0 7.5 3.358 7.5 7.5 0 4.142-3.358 7.5-7.5 7.5ZM2.001 2h4v20h-4v-20Z"),
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
        return _patreonFill!!
    }

private var _patreonFill: ImageVector? = null
