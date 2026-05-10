package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.UnpinFill: ImageVector
    get() {
        if (_unpinFill != null) return _unpinFill!!
        _unpinFill = remixIcon(
            name = "UnpinFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.971 17.171l-1.414 1.414L16.022 15.051l-.074 .074-.707 3.535-1.414 1.414L9.585 15.832 4.635 20.782 3.221 19.368 8.17 14.418 3.928 10.175 5.342 8.761 8.878 8.054l.074-.074L5.415 4.444 6.829 3.029 20.971 17.171ZM18.851 12.223l1.34-1.34 .707 .707 1.414-1.414L13.827 1.69 12.413 3.104l.707 .707L11.78 5.152l7.071 7.071Z"),
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
        return _unpinFill!!
    }

private var _unpinFill: ImageVector? = null
