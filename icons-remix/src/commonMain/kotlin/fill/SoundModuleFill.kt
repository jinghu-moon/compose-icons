package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SoundModuleFill: ImageVector
    get() {
        if (_soundModuleFill != null) return _soundModuleFill!!
        _soundModuleFill = remixIcon(
            name = "SoundModuleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 18.000 L 21.000 21.000 L 19.000 21.000 L 19.000 18.000 L 17.000 18.000 L 17.000 15.000 L 23.000 15.000 L 23.000 18.000 L 21.000 18.000 ZM 5.000 18.000 L 5.000 21.000 L 3.000 21.000 L 3.000 18.000 L 1.000 18.000 L 1.000 15.000 L 7.000 15.000 L 7.000 18.000 L 5.000 18.000 ZM 11.000 6.000 L 11.000 3.000 L 13.000 3.000 L 13.000 6.000 L 15.000 6.000 L 15.000 9.000 L 9.000 9.000 L 9.000 6.000 L 11.000 6.000 ZM 11.000 11.000 L 13.000 11.000 L 13.000 21.000 L 11.000 21.000 L 11.000 11.000 ZM 3.000 13.000 L 3.000 3.000 L 5.000 3.000 L 5.000 13.000 L 3.000 13.000 ZM 19.000 13.000 L 19.000 3.000 L 21.000 3.000 L 21.000 13.000 L 19.000 13.000 Z"),
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
        return _soundModuleFill!!
    }

private var _soundModuleFill: ImageVector? = null
