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
                pathData = parseSvgPathData("M 8.149 15.304 L 12.000 20.600 L 15.851 15.304 L 12.000 17.674 L 8.149 15.304 ZM 17.137 12.164 L 12.000 3.816 L 6.863 12.164 L 12.000 15.326 L 17.137 12.164 ZM 4.000 13.000 L 12.000 0.000 L 20.000 13.000 L 12.000 24.000 L 4.000 13.000 Z"),
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
