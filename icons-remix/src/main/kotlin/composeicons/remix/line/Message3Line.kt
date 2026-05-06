package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Message3Line: ImageVector
    get() {
        if (_message3Line != null) return _message3Line!!
        _message3Line = remixIcon(
            name = "Message3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 8.994C2 5.683 4.677 3 8.001 3h7.999C19.313 3 22 5.695 22 8.994v12.006h-13.999C4.687 21 2 18.305 2 15.006v-6.013ZM20 19v-10.006C20 6.795 18.205 5 15.999 5h-7.999C5.785 5 4 6.785 4 8.994v6.013C4 17.205 5.795 19 8.001 19h11.999ZM14 11h2v2h-2v-2ZM8 11h2v2h-2v-2Z"),
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
        return _message3Line!!
    }

private var _message3Line: ImageVector? = null
