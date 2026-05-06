package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Pill: ImageVector
    get() {
        if (_pill != null) return _pill!!
        _pill = phosphorRegularIcon(
            name = "Pill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216.42 39.6c-20.799-20.799-54.521-20.799-75.32 0L39.6 141.09c-20.35 20.874-20.137 54.23 .478 74.842 20.615 20.612 53.971 20.821 74.842 .468h0L216.43 114.91c20.762-20.812 20.757-54.503-.01-75.31ZM103.61 205.09h0c-14.55 14.553-38.142 14.555-52.695 .005C36.362 190.545 36.36 166.953 50.91 152.4L96 107.31 148.7 160ZM205.11 103.6 160 148.69 107.32 96 152.42 50.91c14.598-14.261 37.953-14.125 52.384 .306 14.431 14.431 14.567 37.785 .306 52.384ZM189.68 82.34c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66l-24 24c-3.126 3.123-8.192 3.121-11.315-.005-3.123-3.126-3.121-8.192 .005-11.315l24-24c3.124-3.122 8.186-3.122 11.31 0Z"),
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
