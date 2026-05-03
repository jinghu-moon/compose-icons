package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PlayListFill: ImageVector
    get() {
        if (_playListFill != null) return _playListFill!!
        _playListFill = remixIcon(
            name = "PlayListFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.000 18.000 L 12.000 18.000 L 12.000 20.000 L 2.000 20.000 L 2.000 18.000 ZM 2.000 11.000 L 16.000 11.000 L 16.000 13.000 L 2.000 13.000 L 2.000 11.000 ZM 2.000 4.000 L 22.000 4.000 L 22.000 6.000 L 2.000 6.000 L 2.000 4.000 ZM 19.000 15.171 L 19.000 9.000 L 24.000 9.000 L 24.000 11.000 L 21.000 11.000 L 21.000 18.000 C 21.000 19.657 19.657 21.000 18.000 21.000 C 16.343 21.000 15.000 19.657 15.000 18.000 C 15.000 16.343 16.343 15.000 18.000 15.000 C 18.351 15.000 18.687 15.060 19.000 15.171 Z"),
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
        return _playListFill!!
    }

private var _playListFill: ImageVector? = null
