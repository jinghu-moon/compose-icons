package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SurroundSoundLine: ImageVector
    get() {
        if (_surroundSoundLine != null) return _surroundSoundLine!!
        _surroundSoundLine = remixIcon(
            name = "SurroundSoundLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 5.000 L 4.000 19.000 L 20.000 19.000 L 20.000 5.000 L 4.000 5.000 ZM 3.000 3.000 L 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 ZM 7.050 7.121 L 8.464 8.536 C 7.560 9.440 7.000 10.690 7.000 12.071 C 7.000 13.452 7.560 14.702 8.464 15.607 L 7.050 17.021 C 5.784 15.754 5.000 14.004 5.000 12.071 C 5.000 10.138 5.784 8.388 7.050 7.121 ZM 16.950 7.121 C 18.216 8.388 19.000 10.138 19.000 12.071 C 19.000 14.004 18.216 15.754 16.950 17.021 L 15.535 15.607 C 16.440 14.702 17.000 13.452 17.000 12.071 C 17.000 10.690 16.440 9.440 15.535 8.536 L 16.950 7.121 ZM 12.000 13.071 C 12.552 13.071 13.000 12.623 13.000 12.071 C 13.000 11.519 12.552 11.071 12.000 11.071 C 11.448 11.071 11.000 11.519 11.000 12.071 C 11.000 12.623 11.448 13.071 12.000 13.071 ZM 12.000 15.071 C 10.343 15.071 9.000 13.728 9.000 12.071 C 9.000 10.414 10.343 9.071 12.000 9.071 C 13.657 9.071 15.000 10.414 15.000 12.071 C 15.000 13.728 13.657 15.071 12.000 15.071 Z"),
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
        return _surroundSoundLine!!
    }

private var _surroundSoundLine: ImageVector? = null
