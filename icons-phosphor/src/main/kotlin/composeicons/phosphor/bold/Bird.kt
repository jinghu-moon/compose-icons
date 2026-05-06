package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Bird: ImageVector
    get() {
        if (_bird != null) return _bird!!
        _bird = phosphorBoldIcon(
            name = "Bird",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 72c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM244 80c.006 4.017-1.998 7.771-5.34 10L220 102.42v17.58c-.066 59.619-48.381 107.934-108 108h-88C16.315 227.991 9.314 223.58 5.99 216.65 2.666 209.721 3.607 201.499 8.41 195.5l.15-.18L92 95.18v-18.29C92 41.28 120.57 12.17 155.69 12h.31c27.379-.028 51.738 17.378 60.58 43.29L238.66 70c3.342 2.229 5.346 5.983 5.34 10ZM210.37 80 199.68 72.87c-2.474-1.635-4.256-4.129-5-7C190.075 48.279 174.184 36.007 156 36h-.19c-21.95 .11-39.8 18.45-39.8 40.89v22.63c-.001 2.811-.988 5.533-2.79 7.69L32.57 204h20.48l69.74-83.68c2.703-3.425 7.053-5.112 11.358-4.407 4.306 .705 7.889 3.692 9.359 7.8 1.47 4.108 .594 8.69-2.288 11.967L84.29 204h27.71c46.371-.05 83.95-37.629 84-84v-24c-.004-4.019 2.005-7.773 5.35-10Z"),
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
        return _bird!!
    }

private var _bird: ImageVector? = null
