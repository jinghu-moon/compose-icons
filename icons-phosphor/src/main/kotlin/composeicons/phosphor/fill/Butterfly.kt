package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Butterfly: ImageVector
    get() {
        if (_butterfly != null) return _butterfly!!
        _butterfly = phosphorFillIcon(
            name = "Butterfly",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 100.17c-2.372-4.392-5.046-8.616-8-12.64v-31.53c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v31.53c-2.954 4.024-5.628 8.248-8 12.64ZM232.7 50.48C229 45.7 221.84 40 209 40c-16.85 0-38.46 11.28-57.81 30.16C145.658 75.522 140.577 81.332 136 87.53v92.47c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-92.47C115.436 81.334 110.369 75.524 104.85 70.16 85.49 51.28 63.88 40 47 40 34.16 40 27 45.7 23.3 50.48c-6.82 8.77-12.18 24.08-.21 71.2 6.05 23.83 19.51 33 30.63 36.42-12.619 20.49-6.436 47.316 13.878 60.216 20.314 12.9 47.223 7.088 60.402-13.046 13.179 20.134 40.088 25.946 60.402 13.046 20.314-12.9 26.497-39.726 13.878-60.216 11.12-3.4 24.57-12.59 30.63-36.42 6.72-26.44 11.94-55.58-.21-71.2Z"),
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
        return _butterfly!!
    }

private var _butterfly: ImageVector? = null
