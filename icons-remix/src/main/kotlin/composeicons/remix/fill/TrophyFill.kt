package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TrophyFill: ImageVector
    get() {
        if (_trophyFill != null) return _trophyFill!!
        _trophyFill = remixIcon(
            name = "TrophyFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.005 16.941v2.062h5v2h-12v-2h5v-2.062C7.059 16.449 4.005 13.082 4.005 9.003v-6h16v6c0 4.08-3.054 7.446-7 7.938ZM1.005 5.003h2v4h-2v-4ZM21.005 5.003h2v4h-2v-4Z"),
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
        return _trophyFill!!
    }

private var _trophyFill: ImageVector? = null
