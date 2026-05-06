package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CrownSimple: ImageVector
    get() {
        if (_crownSimple != null) return _crownSimple!!
        _crownSimple = phosphorFillIcon(
            name = "CrownSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M239.75 90.81c0 .11 0 .21-.07 .32L217 195c-1.44 7.545-8.039 13.002-15.72 13h-146.57C47.033 207.997 40.44 202.541 39 195L16.32 91.13c0-.11-.05-.21-.07-.32C14.974 83.742 18.564 76.691 25.03 73.564 31.495 70.437 39.252 72.002 44 77.39l33.67 36.29L113.47 33.39c.002-.033 .002-.067 0-.1 2.614-5.67 8.287-9.301 14.53-9.301 6.243 0 11.916 3.631 14.53 9.301-.002 .033-.002 .067 0 .1l35.8 80.29L212 77.39c4.757-5.347 12.487-6.885 18.928-3.766 6.441 3.12 10.028 10.138 8.782 17.186Z"),
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
        return _crownSimple!!
    }

private var _crownSimple: ImageVector? = null
