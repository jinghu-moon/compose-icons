package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SurroundSoundFill: ImageVector
    get() {
        if (_surroundSoundFill != null) return _surroundSoundFill!!
        _surroundSoundFill = remixIcon(
            name = "SurroundSoundFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.000 3.000 L 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 ZM 7.050 7.121 C 5.784 8.388 5.000 10.138 5.000 12.071 C 5.000 14.004 5.784 15.754 7.050 17.021 L 8.464 15.607 C 7.560 14.702 7.000 13.452 7.000 12.071 C 7.000 10.690 7.560 9.440 8.464 8.536 L 7.050 7.121 ZM 16.950 7.121 L 15.535 8.536 C 16.440 9.440 17.000 10.690 17.000 12.071 C 17.000 13.452 16.440 14.702 15.535 15.607 L 16.950 17.021 C 18.216 15.754 19.000 14.004 19.000 12.071 C 19.000 10.138 18.216 8.388 16.950 7.121 ZM 12.000 15.071 C 13.657 15.071 15.000 13.728 15.000 12.071 C 15.000 10.414 13.657 9.071 12.000 9.071 C 10.343 9.071 9.000 10.414 9.000 12.071 C 9.000 13.728 10.343 15.071 12.000 15.071 ZM 12.000 13.071 C 11.448 13.071 11.000 12.623 11.000 12.071 C 11.000 11.519 11.448 11.071 12.000 11.071 C 12.552 11.071 13.000 11.519 13.000 12.071 C 13.000 12.623 12.552 13.071 12.000 13.071 Z"),
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
        return _surroundSoundFill!!
    }

private var _surroundSoundFill: ImageVector? = null
