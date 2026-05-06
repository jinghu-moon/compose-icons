package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsClockwise: ImageVector
    get() {
        if (_arrowsClockwise != null) return _arrowsClockwise!!
        _arrowsClockwise = phosphorLightIcon(
            name = "ArrowsClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222 48v48c0 3.314-2.686 6-6 6h-48c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h33.52L183.47 72C168.231 56.694 147.539 48.062 125.94 48h-.46C104.067 47.932 83.487 56.295 68.19 71.28c-1.516 1.582-3.774 2.212-5.89 1.644-2.116-.569-3.754-2.246-4.273-4.375-.519-2.129 .165-4.371 1.782-5.849C77.33 45.492 100.923 35.878 125.48 35.94h.52c24.78 .063 48.52 9.966 66 27.53l18 18v-33.47c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM187.81 184.72c-15.287 15.007-35.868 23.392-57.29 23.34h-.46c-21.599-.062-42.291-8.694-57.53-24L54.48 166h33.52c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-48c-3.314 0-6 2.686-6 6v48c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-33.52l18 18.05c17.48 17.564 41.22 27.467 66 27.53h.52c24.557 .062 48.15-9.552 65.67-26.76 1.618-1.478 2.301-3.72 1.782-5.849-.519-2.129-2.156-3.806-4.273-4.375-2.116-.569-4.374 .062-5.89 1.644Z"),
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
