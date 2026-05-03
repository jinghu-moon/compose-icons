package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DraftFill: ImageVector
    get() {
        if (_draftFill != null) return _draftFill!!
        _draftFill = remixIcon(
            name = "DraftFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.000 2.000 C 20.552 2.000 21.000 2.448 21.000 3.000 L 21.000 6.757 L 12.001 15.756 L 11.995 19.995 L 16.241 20.001 L 21.000 15.242 L 21.000 21.000 C 21.000 21.552 20.552 22.000 20.000 22.000 L 4.000 22.000 C 3.448 22.000 3.000 21.552 3.000 21.000 L 3.000 3.000 C 3.000 2.448 3.448 2.000 4.000 2.000 L 20.000 2.000 ZM 21.778 8.808 L 23.192 10.222 L 15.414 18.000 L 13.998 17.998 L 14.000 16.586 L 21.778 8.808 ZM 12.000 12.000 L 7.000 12.000 L 7.000 14.000 L 12.000 14.000 L 12.000 12.000 ZM 15.000 8.000 L 7.000 8.000 L 7.000 10.000 L 15.000 10.000 L 15.000 8.000 Z"),
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
        return _draftFill!!
    }

private var _draftFill: ImageVector? = null
