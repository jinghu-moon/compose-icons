package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SmileyAngry: ImageVector
    get() {
        if (_smileyAngry != null) return _smileyAngry!!
        _smileyAngry = phosphorLightIcon(
            name = "SmileyAngry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M92 150c-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10ZM164 130c-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10ZM230 128c0 56.333-45.667 102-102 102C71.667 230 26 184.333 26 128 26 71.667 71.667 26 128 26c56.306 .066 101.934 45.694 102 102ZM218 128C218 78.294 177.706 38 128 38 78.294 38 38 78.294 38 128c0 49.706 40.294 90 90 90 49.683-.055 89.945-40.317 90-90ZM172.67 83 128 112.79 83.33 83C80.569 81.161 76.839 81.909 75 84.67c-1.839 2.761-1.091 6.491 1.67 8.33l48 32c2.016 1.345 4.644 1.345 6.66 0l48-32c2.761-1.839 3.509-5.569 1.67-8.33C179.161 81.909 175.431 81.161 172.67 83ZM155.32 179c-8.13-5.4-15.88-9-27.32-9-11.44 0-19.19 3.6-27.32 9-2.761 1.834-3.514 5.559-1.68 8.32 1.834 2.761 5.559 3.514 8.32 1.68 6.67-4.43 12.19-7 20.68-7 8.49 0 14 2.57 20.68 7 .98 .654 2.132 1.002 3.31 1 2.649 .006 4.988-1.726 5.756-4.262 .768-2.535-.218-5.274-2.426-6.738Z"),
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
        return _smileyAngry!!
    }

private var _smileyAngry: ImageVector? = null
