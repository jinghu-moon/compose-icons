package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.KickFill: ImageVector
    get() {
        if (_kickFill != null) return _kickFill!!
        _kickFill = remixIcon(
            name = "KickFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 3.000 L 21.000 3.000 L 21.000 21.000 L 3.000 21.000 L 3.000 3.000 ZM 10.564 5.536 L 6.255 5.536 L 6.255 18.463 L 10.564 18.463 L 10.564 15.591 L 12.000 15.591 L 12.000 17.027 L 13.436 17.027 L 13.436 18.463 L 17.746 18.463 L 17.746 14.154 L 16.309 14.154 L 16.309 12.718 L 14.873 12.718 L 14.873 11.282 L 16.309 11.282 L 16.309 9.845 L 17.746 9.845 L 17.746 5.536 L 13.436 5.536 L 13.436 6.972 L 12.000 6.972 L 12.000 8.409 L 10.564 8.409 L 10.564 5.536 Z"),
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
        return _kickFill!!
    }

private var _kickFill: ImageVector? = null
