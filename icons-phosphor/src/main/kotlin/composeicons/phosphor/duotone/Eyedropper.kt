package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Eyedropper: ImageVector
    get() {
        if (_eyedropper != null) return _eyedropper!!
        _eyedropper = phosphorDuotoneIcon(
            name = "Eyedropper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M207.8 87.6l-25.37 25.53 4.89 4.88c3.004 3.001 4.693 7.073 4.693 11.32 0 4.247-1.688 8.319-4.693 11.32l-9 9c-1.501 1.502-3.537 2.346-5.66 2.346-2.123 0-4.159-.844-5.66-2.346L106.32 88.95c-1.502-1.501-2.346-3.537-2.346-5.66 0-2.123 .844-4.159 2.346-5.66l9-9c3.001-3.001 7.071-4.688 11.315-4.688 4.244 0 8.314 1.686 11.315 4.688l4.88 4.89 25-25.11c10.79-10.79 28.37-11.45 39.45-1 5.503 5.203 8.665 12.412 8.763 19.985 .098 7.573-2.876 14.862-8.243 20.205Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M224 67.3c-.11-9.728-4.175-18.993-11.26-25.66-14-13.28-36.72-12.78-50.62 1.13L142.8 62.2c-9.478-8.639-24.073-8.3-33.14 .77l-9 9c-3.004 3.001-4.693 7.073-4.693 11.32 0 4.247 1.688 8.319 4.693 11.32l2 2.06-51 51c-9.988 9.91-13.993 24.362-10.53 38l-8 18.41c-2.284 5.179-1.143 11.229 2.87 15.22 4.642 4.673 11.682 6.004 17.71 3.35L71.23 215c13.38 3.028 27.377-1.033 37.06-10.75l51-51 2.06 2.06c6.248 6.243 16.372 6.243 22.62 0l9-9c9.086-9.08 9.412-23.704 .74-33.18L213.46 93.26C220.359 86.401 224.165 77.027 224 67.3ZM97 193c-6.274 6.287-15.506 8.595-24 6-1.828-.563-3.797-.453-5.55 .31l-18.1 7.91L57 189.41c.794-1.819 .883-3.869 .25-5.75C54.292 175.017 56.524 165.443 63 159l51-51 33.94 34ZM202.13 82l-25.37 25.52c-3.115 3.123-3.115 8.177 0 11.3l4.89 4.89c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66l-9 9L112 83.26l9-9c3.124-3.122 8.186-3.122 11.31 0l4.89 4.89c1.499 1.497 3.531 2.339 5.65 2.34h0c2.125-.004 4.162-.853 5.66-2.36L173.45 54.04c7.81-7.82 20.5-8.18 28.29-.81 3.931 3.713 6.191 8.86 6.265 14.268 .073 5.407-2.046 10.614-5.875 14.432Z"),
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
        return _eyedropper!!
    }

private var _eyedropper: ImageVector? = null
