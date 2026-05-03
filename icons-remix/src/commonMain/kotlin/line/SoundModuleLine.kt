package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SoundModuleLine: ImageVector
    get() {
        if (_soundModuleLine != null) return _soundModuleLine!!
        _soundModuleLine = remixIcon(
            name = "SoundModuleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 18.000 L 21.000 21.000 L 19.000 21.000 L 19.000 18.000 L 17.000 18.000 L 17.000 16.000 L 23.000 16.000 L 23.000 18.000 L 21.000 18.000 ZM 5.000 18.000 L 5.000 21.000 L 3.000 21.000 L 3.000 18.000 L 1.000 18.000 L 1.000 16.000 L 7.000 16.000 L 7.000 18.000 L 5.000 18.000 ZM 11.000 6.000 L 11.000 3.000 L 13.000 3.000 L 13.000 6.000 L 15.000 6.000 L 15.000 8.000 L 9.000 8.000 L 9.000 6.000 L 11.000 6.000 ZM 11.000 10.000 L 13.000 10.000 L 13.000 21.000 L 11.000 21.000 L 11.000 10.000 ZM 3.000 14.000 L 3.000 3.000 L 5.000 3.000 L 5.000 14.000 L 3.000 14.000 ZM 19.000 14.000 L 19.000 3.000 L 21.000 3.000 L 21.000 14.000 L 19.000 14.000 Z"),
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
        return _soundModuleLine!!
    }

private var _soundModuleLine: ImageVector? = null
