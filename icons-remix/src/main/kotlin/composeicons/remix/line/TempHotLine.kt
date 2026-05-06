package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TempHotLine: ImageVector
    get() {
        if (_tempHotLine != null) return _tempHotLine!!
        _tempHotLine = remixIcon(
            name = "TempHotLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8 5C8 2.791 9.791 1 12 1c2.209 0 4 1.791 4 4v5.255c1.813 1.265 3 3.367 3 5.745 0 3.866-3.134 7-7 7C8.134 23 5 19.866 5 16 5 13.621 6.187 11.52 8 10.255v-5.255ZM9.144 11.895C7.809 12.826 7 14.343 7 16c0 2.761 2.239 5 5 5 2.761 0 5-2.239 5-5 0-1.657-.809-3.174-2.144-4.105L14 11.298v-6.298C14 3.895 13.105 3 12 3c-1.105 0-2 .895-2 2v6.298l-.856 .597ZM11 12.126v-7.126h2v7.126c1.725 .444 3 2.01 3 3.874 0 2.209-1.791 4-4 4C9.791 20 8 18.209 8 16c0-1.864 1.275-3.43 3-3.874ZM12 18c1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2Z"),
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
        return _tempHotLine!!
    }

private var _tempHotLine: ImageVector? = null
