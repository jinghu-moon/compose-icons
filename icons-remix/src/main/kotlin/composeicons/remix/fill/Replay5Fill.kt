package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Replay5Fill: ImageVector
    get() {
        if (_replay5Fill != null) return _replay5Fill!!
        _replay5Fill = remixIcon(
            name = "Replay5Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 12C22 6.477 17.523 2 12 2 8.984 2 6.28 3.335 4.447 5.446L2 3v6h6L5.865 6.865C7.332 5.114 9.536 4 12 4c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8C7.582 20 4 16.418 4 12h-2c0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10ZM14.5 10v-1.5h-5v4.25h3.125c.345 0 .625 .28 .625 .625 0 .345-.28 .625-.625 .625h-3.125v1.5h3.125c1.174 0 2.125-.951 2.125-2.125 0-1.174-.951-2.125-2.125-2.125h-1.625v-1.25h3.5Z"),
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
        return _replay5Fill!!
    }

private var _replay5Fill: ImageVector? = null
