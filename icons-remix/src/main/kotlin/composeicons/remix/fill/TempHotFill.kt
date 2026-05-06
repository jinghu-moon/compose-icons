package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TempHotFill: ImageVector
    get() {
        if (_tempHotFill != null) return _tempHotFill!!
        _tempHotFill = remixIcon(
            name = "TempHotFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8 10.255v-5.255C8 2.791 9.791 1 12 1c2.209 0 4 1.791 4 4v5.255c1.813 1.265 3 3.367 3 5.745 0 3.866-3.134 7-7 7C8.134 23 5 19.866 5 16 5 13.621 6.187 11.52 8 10.255ZM11 12.126C9.275 12.57 8 14.136 8 16c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4 0-1.864-1.275-3.43-3-3.874v-7.126h-2v7.126Z"),
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
        return _tempHotFill!!
    }

private var _tempHotFill: ImageVector? = null
