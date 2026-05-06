package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PlaystationLine: ImageVector
    get() {
        if (_playstationLine != null) return _playstationLine!!
        _playstationLine = remixIcon(
            name = "PlaystationLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22.585 17.011c-.43 .543-1.483 .93-1.483 .93l-7.832 2.817v-2.077l5.764-2.056c.654-.235 .755-.566 .223-.74-.531-.175-1.492-.125-2.146 .111l-3.841 1.354v-2.156l.221-.075c0 0 1.11-.393 2.67-.566 1.561-.172 3.472 .023 4.972 .593 1.691 .535 1.881 1.323 1.452 1.866ZM14.015 13.474v-5.312c0-.624-.115-1.198-.7-1.361-.448-.144-.726 .273-.726 .896v13.303L9.007 19.861v-15.861c1.524 .283 3.743 .953 4.937 1.355 3.035 1.043 4.063 2.341 4.063 5.267 0 2.851-1.758 3.932-3.992 2.852ZM2.432 18.463C.696 17.974 .407 16.955 1.198 16.367c.731-.542 1.974-.951 1.974-.951L8.311 13.588v2.085L4.613 16.998c-.653 .235-.754 .567-.223 .741 .531 .174 1.493 .125 2.147-.111l1.773-.644v1.866c-.112 .02-.238 .04-.354 .06-1.774 .29-3.663 .169-5.525-.445Z"),
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
        return _playstationLine!!
    }

private var _playstationLine: ImageVector? = null
