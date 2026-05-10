package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.StarOffFill: ImageVector
    get() {
        if (_starOffFill != null) return _starOffFill!!
        _starOffFill = remixIcon(
            name = "StarOffFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M23.413 8.792l-5.392 4.987L9.71 5.467 12.001 .5l3.386 7.34 8.027 .952ZM18.622 20.036l2.571 2.571 1.414-1.414L2.808 1.393 1.394 2.808 6.658 8.072 .588 8.792l5.935 5.488L4.947 22.208l7.053-3.948 7.053 3.948-.432-2.172Z"),
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
        return _starOffFill!!
    }

private var _starOffFill: ImageVector? = null
