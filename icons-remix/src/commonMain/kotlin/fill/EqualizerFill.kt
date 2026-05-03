package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.EqualizerFill: ImageVector
    get() {
        if (_equalizerFill != null) return _equalizerFill!!
        _equalizerFill = remixIcon(
            name = "EqualizerFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.171 18.000 C 6.583 16.835 7.694 16.000 9.000 16.000 C 10.306 16.000 11.417 16.835 11.829 18.000 L 22.000 18.000 L 22.000 20.000 L 11.829 20.000 C 11.417 21.165 10.306 22.000 9.000 22.000 C 7.694 22.000 6.583 21.165 6.171 20.000 L 2.000 20.000 L 2.000 18.000 L 6.171 18.000 ZM 12.171 11.000 C 12.583 9.835 13.694 9.000 15.000 9.000 C 16.306 9.000 17.417 9.835 17.829 11.000 L 22.000 11.000 L 22.000 13.000 L 17.829 13.000 C 17.417 14.165 16.306 15.000 15.000 15.000 C 13.694 15.000 12.583 14.165 12.171 13.000 L 2.000 13.000 L 2.000 11.000 L 12.171 11.000 ZM 6.171 4.000 C 6.583 2.835 7.694 2.000 9.000 2.000 C 10.306 2.000 11.417 2.835 11.829 4.000 L 22.000 4.000 L 22.000 6.000 L 11.829 6.000 C 11.417 7.165 10.306 8.000 9.000 8.000 C 7.694 8.000 6.583 7.165 6.171 6.000 L 2.000 6.000 L 2.000 4.000 L 6.171 4.000 Z"),
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
        return _equalizerFill!!
    }

private var _equalizerFill: ImageVector? = null
