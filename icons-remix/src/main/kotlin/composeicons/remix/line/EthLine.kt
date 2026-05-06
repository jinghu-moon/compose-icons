package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.EthLine: ImageVector
    get() {
        if (_ethLine != null) return _ethLine!!
        _ethLine = remixIcon(
            name = "EthLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.149 15.304 12 20.6l3.851-5.295L12 17.674 8.149 15.304ZM17.137 12.164 12 3.816 6.863 12.164 12 15.326l5.137-3.161ZM4 13 12 0l8 13L12 24 4 13Z"),
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
        return _ethLine!!
    }

private var _ethLine: ImageVector? = null
