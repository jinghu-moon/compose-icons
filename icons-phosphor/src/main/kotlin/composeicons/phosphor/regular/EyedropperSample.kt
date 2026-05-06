package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.EyedropperSample: ImageVector
    get() {
        if (_eyedropperSample != null) return _eyedropperSample!!
        _eyedropperSample = phosphorRegularIcon(
            name = "EyedropperSample",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 67.3c-.11-9.728-4.175-18.993-11.26-25.66-14-13.28-36.72-12.78-50.62 1.13L142.8 62.2c-9.478-8.639-24.073-8.3-33.14 .77l-9 9c-3.004 3.001-4.693 7.073-4.693 11.32 0 4.247 1.688 8.319 4.693 11.32l2 2.06-51 51c-9.988 9.91-13.993 24.362-10.53 38l-8 18.41c-2.288 5.175-1.147 11.225 2.87 15.21 4.637 4.681 11.681 6.018 17.71 3.36L71.24 215c13.377 3.022 27.368-1.038 37.05-10.75l51-51 2.06 2.06c6.248 6.243 16.372 6.243 22.62 0l9-9c9.086-9.08 9.412-23.704 .74-33.18L213.46 93.26C220.359 86.401 224.165 77.027 224 67.3ZM97 193c-6.274 6.287-15.506 8.595-24 6-1.828-.563-3.797-.453-5.55 .31l-18.1 7.9L57 189.41c.794-1.819 .883-3.869 .25-5.75-1.725-5.093-1.69-10.619 .1-15.69h64.65ZM138 152h-67.93l44-44 33.94 34ZM202.18 82l-25.37 25.52c-3.122 3.124-3.122 8.186 0 11.31l4.89 4.88c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66l-9 9L112 83.26l9-9c3.124-3.122 8.186-3.122 11.31 0l4.89 4.89c1.499 1.497 3.531 2.339 5.65 2.34h0c2.125-.004 4.162-.853 5.66-2.36L173.45 54.04c7.81-7.82 20.5-8.18 28.29-.81 3.931 3.713 6.191 8.86 6.265 14.268 .073 5.407-2.046 10.614-5.875 14.432Z"),
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
