package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Play: ImageVector
    get() {
        if (_play != null) return _play!!
        _play = phosphorRegularIcon(
            name = "Play",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232.4 114.49 88.32 26.35C83.374 23.321 77.175 23.206 72.12 26.05 67.113 28.849 64.008 34.134 64 39.87v176.26c.039 8.8 7.2 15.903 16 15.87 2.95-.001 5.842-.814 8.36-2.35L232.4 141.51c4.709-2.87 7.582-7.986 7.582-13.5 0-5.514-2.873-10.63-7.582-13.5ZM80 215.94v-175.94l143.83 88Z"),
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
        return _play!!
    }

private var _play: ImageVector? = null
