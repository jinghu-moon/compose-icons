package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GatsbyFill: ImageVector
    get() {
        if (_gatsbyFill != null) return _gatsbyFill!!
        _gatsbyFill = remixIcon(
            name = "GatsbyFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.001 2C6.501 2 2.001 6.5 2.001 12c0 5.5 4.5 10 10 10 5.5 0 10-4.5 10-10C22.001 6.5 17.501 2 12.001 2ZM6.43 17.571C4.93 16.071 4.144 14.071 4.144 12.143l7.786 7.714C9.93 19.786 7.93 19.071 6.43 17.571ZM13.715 19.643 4.358 10.286C5.144 6.786 8.287 4.143 12.001 4.143c2.643 0 4.929 1.286 6.357 3.214l-1.071 .929C16.072 6.643 14.144 5.571 12.001 5.571 9.215 5.571 6.858 7.357 5.93 9.857l8.214 8.214c2.071-.714 3.643-2.5 4.143-4.643h-3.429v-1.429h5c0 3.714-2.643 6.857-6.143 7.643Z"),
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
        return _gatsbyFill!!
    }

private var _gatsbyFill: ImageVector? = null
