package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CompassTool: ImageVector
    get() {
        if (_compassTool != null) return _compassTool!!
        _compassTool = phosphorBoldIcon(
            name = "CompassTool",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M218.68 125.46c2.01-3.824 1.809-8.433-.525-12.068-2.335-3.635-6.443-5.734-10.757-5.497-4.314 .238-8.167 2.776-10.088 6.645-6.331 12.227-15.899 22.48-27.66 29.64L156.15 113.79c12.525-10.448 18.242-26.966 14.857-42.921C167.621 54.914 155.688 42.141 140 37.68v-13.68c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v13.68C100.312 42.141 88.379 54.914 84.993 70.869c-3.385 15.955 2.332 32.473 14.857 42.921L53 219.12c-1.303 2.917-1.389 6.234-.238 9.215 1.151 2.981 3.443 5.38 6.368 6.665 1.534 .674 3.194 1.014 4.87 1 4.756 .013 9.07-2.784 11-7.13L98.67 175.61c9.503 2.92 19.389 4.4 29.33 4.39 9.954-.01 19.854-1.465 29.39-4.32L181 228.87c1.93 4.346 6.244 7.143 11 7.13 1.672 .013 3.329-.327 4.86-1 2.927-1.283 5.221-3.681 6.374-6.663 1.153-2.981 1.068-6.299-.234-9.217L179.49 166.22c16.734-9.506 30.348-23.666 39.19-40.76ZM128 60c11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20ZM128 156c-6.589 .009-13.151-.842-19.52-2.53l13.3-29.92c4.125 .6 8.315 .6 12.44 0l13.33 30c-6.389 1.628-12.957 2.451-19.55 2.45Z"),
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
        return _compassTool!!
    }

private var _compassTool: ImageVector? = null
