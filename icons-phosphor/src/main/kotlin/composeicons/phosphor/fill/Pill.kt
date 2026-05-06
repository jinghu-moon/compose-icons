package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Pill: ImageVector
    get() {
        if (_pill != null) return _pill!!
        _pill = phosphorFillIcon(
            name = "Pill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216.43 39.6c-20.803-20.8-54.527-20.8-75.33 0L39.6 141.09c-20.35 20.874-20.137 54.23 .478 74.842 20.615 20.612 53.971 20.821 74.842 .468L216.43 114.91c20.759-20.812 20.759-54.498 0-75.31ZM205.11 103.6l-50.75 50.74L101.67 101.66 152.42 50.91c14.598-14.261 37.953-14.125 52.384 .306 14.431 14.431 14.567 37.785 .306 52.384ZM189.68 82.34c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66l-24 24c-3.126 3.123-8.192 3.121-11.315-.005-3.123-3.126-3.121-8.192 .005-11.315l24-24c3.124-3.122 8.186-3.122 11.31 0Z"),
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
        return _pill!!
    }

private var _pill: ImageVector? = null
