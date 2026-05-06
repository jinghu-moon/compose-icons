package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MicroscopeLine: ImageVector
    get() {
        if (_microscopeLine != null) return _microscopeLine!!
        _microscopeLine = remixIcon(
            name = "MicroscopeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.196 2.268l3.25 5.629c.276 .478 .112 1.09-.366 1.366l-1.299 .749 1.001 1.733-1.732 1L13.049 11.012l-1.299 .751c-.478 .276-1.09 .112-1.366-.366L8.546 8.215C6.494 8.837 5 10.744 5 13c0 .625 .115 1.224 .324 1.776C6.099 14.284 7.016 14 8 14c1.684 0 3.174 .833 4.08 2.109l7.688-4.438 1 1.732-7.878 4.549c.072 .338 .11 .689 .11 1.049 0 .343-.035 .677-.1 1.001L21 20v2L4.001 22.001C3.372 21.165 3 20.126 3 19c0-1.007 .298-1.945 .81-2.73C3.293 15.295 3 14.182 3 13 3 10.005 4.881 7.449 7.527 6.449L7.134 5.768C6.582 4.811 6.909 3.588 7.866 3.036L10.464 1.536c.957-.552 2.18-.225 2.732 .732ZM8 16C6.343 16 5 17.343 5 19c0 .351 .06 .687 .171 1h5.659C10.94 19.687 11 19.351 11 19 11 17.343 9.657 16 8 16ZM11.464 3.268 8.866 4.768l2.75 4.763L14.214 8.031 11.464 3.268Z"),
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
        return _microscopeLine!!
    }

private var _microscopeLine: ImageVector? = null
