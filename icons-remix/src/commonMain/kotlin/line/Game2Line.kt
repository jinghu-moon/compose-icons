package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Game2Line: ImageVector
    get() {
        if (_game2Line != null) return _game2Line!!
        _game2Line = remixIcon(
            name = "Game2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.000 4.000 L 9.000 4.000 L 9.000 6.000 L 15.000 6.000 L 15.000 4.000 L 17.000 4.000 L 17.000 2.000 L 19.000 2.000 L 19.000 6.000 L 17.000 6.000 L 17.000 8.000 L 19.000 8.000 L 19.000 10.000 L 23.000 10.000 L 23.000 16.000 L 21.000 16.000 L 21.000 12.000 L 20.000 12.000 L 20.000 18.000 L 17.000 18.000 L 17.000 20.000 L 19.000 20.000 L 19.000 22.000 L 15.000 22.000 L 15.000 18.000 L 9.000 18.000 L 9.000 22.000 L 5.000 22.000 L 5.000 20.000 L 7.000 20.000 L 7.000 18.000 L 4.000 18.000 L 4.000 12.000 L 3.000 12.000 L 3.000 16.000 L 1.000 16.000 L 1.000 10.000 L 5.000 10.000 L 5.000 8.000 L 7.000 8.000 L 7.000 6.000 L 5.000 6.000 L 5.000 2.000 L 7.000 2.000 L 7.000 4.000 ZM 9.000 10.000 L 7.000 10.000 L 7.000 12.000 L 6.000 12.000 L 6.000 16.000 L 18.000 16.000 L 18.000 12.000 L 17.000 12.000 L 17.000 10.000 L 15.000 10.000 L 15.000 8.000 L 9.000 8.000 L 9.000 10.000 ZM 11.000 14.000 L 9.000 14.000 L 9.000 11.000 L 11.000 11.000 L 11.000 14.000 ZM 15.000 14.000 L 13.000 14.000 L 13.000 11.000 L 15.000 11.000 L 15.000 14.000 Z"),
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
        return _game2Line!!
    }

private var _game2Line: ImageVector? = null
