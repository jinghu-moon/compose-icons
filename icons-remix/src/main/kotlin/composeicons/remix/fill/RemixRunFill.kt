package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RemixRunFill: ImageVector
    get() {
        if (_remixRunFill != null) return _remixRunFill!!
        _remixRunFill = remixIcon(
            name = "RemixRunFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.115 20c0-1.064 0-2.039-.162-4.119-.2-2.089-1.288-3.148-3.149-3.52 2.204-.286 3.836-2.003 3.836-4.637C19.641 4.204 17.322 2 12.656 2h-8.656v3.669h7.797c2.061 0 3.092 .885 3.092 2.344 0 1.66-1.031 2.287-3.092 2.287h-7.797v3.749h7.568c1.632 0 2.519 .458 2.662 2.519 .108 1.407 .095 2.104 .082 2.773v.003c-.004 .214-.008 .425-.008 .656h4.812ZM4 17.205v2.795h6.122v-1.789c0-.376-.185-1.006-1.034-1.006h-5.088Z"),
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
        return _remixRunFill!!
    }

private var _remixRunFill: ImageVector? = null
