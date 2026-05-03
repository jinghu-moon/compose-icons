package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DisqusFill: ImageVector
    get() {
        if (_disqusFill != null) return _disqusFill!!
        _disqusFill = remixIcon(
            name = "DisqusFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 9.470 22.000 7.160 21.061 5.399 19.512 L 1.500 20.000 L 2.924 16.203 C 2.331 14.925 2.000 13.501 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 8.000 7.000 L 8.000 17.000 L 11.733 17.000 L 11.996 16.996 C 15.371 16.893 17.333 14.785 17.333 11.971 L 17.333 11.944 L 17.330 11.729 C 17.231 8.956 15.211 7.000 11.790 7.000 L 8.000 7.000 ZM 11.831 9.458 C 13.459 9.458 14.540 10.386 14.540 11.987 L 14.540 12.015 L 14.535 12.198 C 14.456 13.698 13.397 14.543 11.831 14.543 L 10.723 14.543 L 10.723 9.458 L 11.831 9.458 Z"),
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
        return _disqusFill!!
    }

private var _disqusFill: ImageVector? = null
