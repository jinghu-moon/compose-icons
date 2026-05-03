package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.NumbersFill: ImageVector
    get() {
        if (_numbersFill != null) return _numbersFill!!
        _numbersFill = remixIcon(
            name = "NumbersFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.000 18.000 L 4.000 18.000 L 4.000 10.000 L 9.000 10.000 L 9.000 18.000 ZM 15.000 18.000 L 10.000 18.000 L 10.000 6.000 L 15.000 6.000 L 15.000 18.000 ZM 21.000 18.000 L 16.000 18.000 L 16.000 2.000 L 21.000 2.000 L 21.000 18.000 ZM 22.000 22.000 L 3.000 22.000 L 3.000 20.000 L 22.000 20.000 L 22.000 22.000 Z"),
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
        return _numbersFill!!
    }

private var _numbersFill: ImageVector? = null
