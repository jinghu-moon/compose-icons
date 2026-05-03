package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Equalizer3Line: ImageVector
    get() {
        if (_equalizer3Line != null) return _equalizer3Line!!
        _equalizer3Line = remixIcon(
            name = "Equalizer3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.000 3.000 L 7.000 6.000 L 3.000 6.000 L 3.000 8.000 L 7.000 8.000 L 7.000 11.000 L 9.000 11.000 L 9.000 3.000 L 7.000 3.000 ZM 11.000 8.000 L 21.000 8.000 L 21.000 6.000 L 11.000 6.000 L 11.000 8.000 ZM 17.000 13.000 L 17.000 16.000 L 21.000 16.000 L 21.000 18.000 L 17.000 18.000 L 17.000 21.000 L 15.000 21.000 L 15.000 13.000 L 17.000 13.000 ZM 13.000 18.000 L 3.000 18.000 L 3.000 16.000 L 13.000 16.000 L 13.000 18.000 Z"),
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
        return _equalizer3Line!!
    }

private var _equalizer3Line: ImageVector? = null
