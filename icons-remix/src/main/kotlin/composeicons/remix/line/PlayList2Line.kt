package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PlayList2Line: ImageVector
    get() {
        if (_playList2Line != null) return _playList2Line!!
        _playList2Line = remixIcon(
            name = "PlayList2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 18v2h-20v-2h20ZM2 3.5l8 5-8 5v-10ZM22 11v2h-10v-2h10ZM4 7.109v2.783L6.226 8.5 4 7.109ZM22 4v2h-10v-2h10Z"),
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
        return _playList2Line!!
    }

private var _playList2Line: ImageVector? = null
