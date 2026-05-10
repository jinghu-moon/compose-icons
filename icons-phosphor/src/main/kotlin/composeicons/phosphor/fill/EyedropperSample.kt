package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.EyedropperSample: ImageVector
    get() {
        if (_eyedropperSample != null) return _eyedropperSample!!
        _eyedropperSample = phosphorFillIcon(
            name = "EyedropperSample",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 67.3c-.11-9.728-4.175-18.993-11.26-25.66-14-13.28-36.72-12.78-50.62 1.13L138.8 66.2c-9.478-8.639-24.073-8.3-33.14 .77l-5 5c-3.004 3.001-4.693 7.073-4.693 11.32 0 4.247 1.688 8.319 4.693 11.32l2 2.06-51 51c-9.988 9.91-13.993 24.362-10.53 38l-8 18.41c-2.288 5.175-1.147 11.225 2.87 15.21 4.637 4.681 11.681 6.018 17.71 3.36L71.24 215c13.377 3.022 27.368-1.038 37.05-10.75l51-51 2.06 2.06c6.248 6.243 16.372 6.243 22.62 0l5-5c9.086-9.08 9.412-23.704 .74-33.18L213.46 93.26C220.359 86.401 224.165 77.027 224 67.3ZM138 152h-67.93l44-44 33.94 34Z"),
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
        return _eyedropperSample!!
    }

private var _eyedropperSample: ImageVector? = null
