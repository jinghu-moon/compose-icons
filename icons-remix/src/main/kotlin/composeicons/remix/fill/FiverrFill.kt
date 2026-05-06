package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FiverrFill: ImageVector
    get() {
        if (_fiverrFill != null) return _fiverrFill!!
        _fiverrFill = remixIcon(
            name = "FiverrFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM11.793 5.784C9.95 5.784 8.707 6.941 8.707 8.612v.644h-1.457v2.143h1.457v5.743h2.528v-5.743h2.443v5.743h2.528v-7.886h-4.972v-.472c0-.514 .386-.857 .943-.857h1.5v-2.143h-1.886Z"),
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
        return _fiverrFill!!
    }

private var _fiverrFill: ImageVector? = null
