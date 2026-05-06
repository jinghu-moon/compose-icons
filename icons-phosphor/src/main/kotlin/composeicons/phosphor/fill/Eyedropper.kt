package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Eyedropper: ImageVector
    get() {
        if (_eyedropper != null) return _eyedropper!!
        _eyedropper = phosphorFillIcon(
            name = "Eyedropper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 67.3c-.11-9.728-4.175-18.993-11.26-25.66-14-13.28-36.72-12.78-50.62 1.13L138.8 66.2c-9.478-8.639-24.073-8.3-33.14 .77l-5 5c-3.004 3.001-4.693 7.073-4.693 11.32 0 4.247 1.688 8.319 4.693 11.32l2 2.06-51 51c-9.988 9.91-13.993 24.362-10.53 38l-8 18.41c-2.284 5.179-1.143 11.229 2.87 15.22 4.642 4.673 11.682 6.004 17.71 3.35L71.23 215c13.38 3.028 27.377-1.033 37.06-10.75l51-51 2.06 2.06c6.248 6.243 16.372 6.243 22.62 0l5-5c9.086-9.08 9.412-23.704 .74-33.18L213.46 93.26C220.359 86.401 224.165 77.027 224 67.3ZM97 193c-6.274 6.287-15.506 8.595-24 6-1.828-.563-3.797-.453-5.55 .31l-18.1 7.91L57 189.41c.794-1.819 .883-3.869 .25-5.75C54.292 175.017 56.524 165.443 63 159l51-51 33.94 34Z"),
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
