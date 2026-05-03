package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BarricadeFill: ImageVector
    get() {
        if (_barricadeFill != null) return _barricadeFill!!
        _barricadeFill = remixIcon(
            name = "BarricadeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.556 19.000 L 21.000 19.000 L 21.000 21.000 L 3.000 21.000 L 3.000 19.000 L 4.444 19.000 L 5.333 15.000 L 18.667 15.000 L 19.556 19.000 ZM 17.333 9.000 L 18.222 13.000 L 5.778 13.000 L 6.667 9.000 L 17.333 9.000 ZM 16.889 7.000 L 7.111 7.000 L 7.826 3.783 C 7.928 3.326 8.333 3.000 8.802 3.000 L 15.198 3.000 C 15.667 3.000 16.072 3.326 16.174 3.783 L 16.889 7.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _barricadeFill!!
    }

private var _barricadeFill: ImageVector? = null
