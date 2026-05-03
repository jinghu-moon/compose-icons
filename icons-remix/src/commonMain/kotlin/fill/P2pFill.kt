package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.P2pFill: ImageVector
    get() {
        if (_p2pFill != null) return _p2pFill!!
        _p2pFill = remixIcon(
            name = "P2pFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.000 5.000 C 20.000 6.657 18.657 8.000 17.000 8.000 C 15.343 8.000 14.000 6.657 14.000 5.000 C 14.000 3.343 15.343 2.000 17.000 2.000 C 18.657 2.000 20.000 3.343 20.000 5.000 ZM 7.000 3.000 C 4.791 3.000 3.000 4.791 3.000 7.000 L 3.000 9.000 L 5.000 9.000 L 5.000 7.000 C 5.000 5.895 5.895 5.000 7.000 5.000 L 10.000 5.000 L 10.000 3.000 L 7.000 3.000 ZM 17.000 21.000 C 19.209 21.000 21.000 19.209 21.000 17.000 L 21.000 15.000 L 19.000 15.000 L 19.000 17.000 C 19.000 18.105 18.105 19.000 17.000 19.000 L 14.000 19.000 L 14.000 21.000 L 17.000 21.000 ZM 7.000 16.000 C 8.657 16.000 10.000 14.657 10.000 13.000 C 10.000 11.343 8.657 10.000 7.000 10.000 C 5.343 10.000 4.000 11.343 4.000 13.000 C 4.000 14.657 5.343 16.000 7.000 16.000 ZM 17.000 9.000 C 14.791 9.000 13.000 10.791 13.000 13.000 L 21.000 13.000 C 21.000 10.791 19.209 9.000 17.000 9.000 ZM 3.000 21.000 C 3.000 18.791 4.791 17.000 7.000 17.000 C 9.209 17.000 11.000 18.791 11.000 21.000 L 3.000 21.000 Z"),
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
        return _p2pFill!!
    }

private var _p2pFill: ImageVector? = null
