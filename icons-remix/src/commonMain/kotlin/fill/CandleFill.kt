package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CandleFill: ImageVector
    get() {
        if (_candleFill != null) return _candleFill!!
        _candleFill = remixIcon(
            name = "CandleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.172 9.331 C 7.609 7.769 7.609 5.237 9.172 3.675 L 12.000 0.846 L 14.828 3.675 C 16.390 5.237 16.390 7.769 14.828 9.331 C 14.304 9.856 13.670 10.204 13.000 10.377 L 13.000 12.000 L 18.000 12.000 C 18.552 12.000 19.000 12.448 19.000 13.000 L 19.000 20.000 L 21.000 20.000 L 21.000 22.000 L 3.000 22.000 L 3.000 20.000 L 5.000 20.000 L 5.000 13.000 C 5.000 12.448 5.448 12.000 6.000 12.000 L 11.000 12.000 L 11.000 10.377 C 10.330 10.204 9.696 9.856 9.172 9.331 ZM 10.586 5.089 C 9.805 5.870 9.805 7.136 10.586 7.917 C 11.367 8.698 12.633 8.698 13.414 7.917 C 14.195 7.136 14.195 5.870 13.414 5.089 L 12.000 3.675 L 10.586 5.089 Z"),
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
        return _candleFill!!
    }

private var _candleFill: ImageVector? = null
