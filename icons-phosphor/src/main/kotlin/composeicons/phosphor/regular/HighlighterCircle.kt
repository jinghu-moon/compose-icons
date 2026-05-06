package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.HighlighterCircle: ImageVector
    get() {
        if (_highlighterCircle != null) return _highlighterCircle!!
        _highlighterCircle = phosphorRegularIcon(
            name = "HighlighterCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M201.54 54.46C160.925 13.845 95.075 13.845 54.46 54.46c-40.615 40.615-40.615 106.465 0 147.08 40.615 40.615 106.465 40.615 147.08 0 40.615-40.615 40.615-106.465 0-147.08ZM96 210v-58h64v58c-20.583 8-43.417 8-64 0ZM144 136h-32v-35.06l32-16ZM190.22 190.22c-4.326 4.334-9.091 8.205-14.22 11.55v-49.77c0-8.837-7.163-16-16-16v-64c.002-2.774-1.433-5.351-3.793-6.81-2.359-1.459-5.306-1.591-7.787-.35l-48 24C97.709 90.197 95.998 92.969 96 96v40c-8.837 0-16 7.163-16 16v49.77C48.759 181.448 33.708 143.649 42.428 107.415 51.148 71.18 81.748 44.367 118.814 40.483c37.066-3.884 72.56 16.002 88.602 49.642 16.042 33.64 9.154 73.737-17.196 100.095Z"),
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
        return _highlighterCircle!!
    }

private var _highlighterCircle: ImageVector? = null
