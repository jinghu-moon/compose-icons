package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MichelinStarGreen: ImageVector
    get() {
        if (_michelinStarGreen != null) return _michelinStarGreen!!
        _michelinStarGreen = tablerOutlineIcon(
            name = "MichelinStarGreen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.432 17.949 C 13.295 19.493 15.021 19.925 16.562 19.061 C 18.102 18.196 18.534 16.467 17.610 14.923 C 17.425 14.614 17.301 14.367 17.116 14.183 C 17.363 14.243 17.671 14.243 18.041 14.243 C 19.767 14.243 21.000 13.009 21.000 11.280 C 21.000 9.550 19.767 8.315 17.980 8.315 C 17.610 8.315 17.363 8.315 17.055 8.377 C 17.240 8.192 17.363 7.945 17.548 7.637 C 18.411 6.092 17.979 4.363 16.500 3.499 C 14.959 2.634 13.295 3.066 12.370 4.610 C 12.185 4.919 12.062 5.166 11.938 5.413 C 11.815 5.166 11.692 4.919 11.507 4.610 C 10.705 3.005 8.979 2.572 7.500 3.437 C 5.959 4.302 5.527 6.031 6.452 7.574 C 6.637 7.884 6.760 8.130 6.945 8.315 C 6.699 8.254 6.390 8.254 6.021 8.254 C 4.233 8.254 3.000 9.489 3.000 11.218 C 3.000 12.947 4.233 14.182 6.020 14.182"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 4.073 21.000 C 8.359 18.244 9.973 15.746 12.000 12.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _michelinStarGreen!!
    }

private var _michelinStarGreen: ImageVector? = null
