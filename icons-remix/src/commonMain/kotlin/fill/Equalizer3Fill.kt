package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Equalizer3Fill: ImageVector
    get() {
        if (_equalizer3Fill != null) return _equalizer3Fill!!
        _equalizer3Fill = remixIcon(
            name = "Equalizer3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.000 3.000 L 7.000 6.000 L 3.000 6.000 L 3.000 8.000 L 7.000 8.000 L 7.000 11.000 L 10.000 11.000 L 10.000 3.000 L 7.000 3.000 ZM 12.000 8.000 L 21.000 8.000 L 21.000 6.000 L 12.000 6.000 L 12.000 8.000 ZM 17.000 13.000 L 17.000 16.000 L 21.000 16.000 L 21.000 18.000 L 17.000 18.000 L 17.000 21.000 L 14.000 21.000 L 14.000 13.000 L 17.000 13.000 ZM 12.000 18.000 L 3.000 18.000 L 3.000 16.000 L 12.000 16.000 L 12.000 18.000 Z"),
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
        return _equalizer3Fill!!
    }

private var _equalizer3Fill: ImageVector? = null
