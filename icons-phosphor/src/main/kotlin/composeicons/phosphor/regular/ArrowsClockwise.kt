package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowsClockwise: ImageVector
    get() {
        if (_arrowsClockwise != null) return _arrowsClockwise!!
        _arrowsClockwise = phosphorRegularIcon(
            name = "ArrowsClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 48v48c0 4.418-3.582 8-8 8h-48c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h28.69L182.06 73.37C167.192 58.434 147.005 50.008 125.93 49.94h-.45C104.582 49.891 84.504 58.071 69.59 72.71c-3.178 2.966-8.142 2.852-11.181-.256-3.038-3.109-3.038-8.075 .001-11.184 37.617-36.766 97.816-36.413 135 .79L208 76.69v-28.69c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM186.41 183.29c-31.345 30.618-81.487 30.323-112.47-.66L59.31 168h28.69c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-48c-4.418 0-8 3.582-8 8v48c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-28.69l14.63 14.63c17.842 17.932 42.074 28.046 67.37 28.12h.53c25.081 .065 49.177-9.754 67.07-27.33 3.039-3.109 3.039-8.075 .001-11.184-3.038-3.109-8.003-3.223-11.181-.256Z"),
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
        return _arrowsClockwise!!
    }

private var _arrowsClockwise: ImageVector? = null
