package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.NewsFill: ImageVector
    get() {
        if (_newsFill != null) return _newsFill!!
        _newsFill = remixIcon(
            name = "NewsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 3.000 C 2.448 3.000 2.000 3.448 2.000 4.000 L 2.000 20.000 C 2.000 20.552 2.448 21.000 3.000 21.000 L 21.000 21.000 C 21.552 21.000 22.000 20.552 22.000 20.000 L 22.000 4.000 C 22.000 3.448 21.552 3.000 21.000 3.000 L 3.000 3.000 ZM 6.000 7.000 L 12.000 7.000 L 12.000 13.000 L 6.000 13.000 L 6.000 7.000 ZM 8.000 9.000 L 8.000 11.000 L 10.000 11.000 L 10.000 9.000 L 8.000 9.000 ZM 18.000 9.000 L 14.000 9.000 L 14.000 7.000 L 18.000 7.000 L 18.000 9.000 ZM 14.000 13.000 L 14.000 11.000 L 18.000 11.000 L 18.000 13.000 L 14.000 13.000 ZM 6.000 17.000 L 6.000 15.000 L 18.000 15.000 L 18.000 17.000 L 6.000 17.000 Z"),
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
        return _newsFill!!
    }

private var _newsFill: ImageVector? = null
