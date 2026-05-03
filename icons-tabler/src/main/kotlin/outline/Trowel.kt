package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Trowel: ImageVector
    get() {
        if (_trowel != null) return _trowel!!
        _trowel = tablerOutlineIcon(
            name = "Trowel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.420 9.058 L 9.058 14.421 C 8.573 14.906 7.872 15.105 7.205 14.947 C 6.538 14.790 6.000 14.298 5.783 13.648 L 3.101 5.604 C 2.864 4.893 3.049 4.110 3.579 3.580 C 4.109 3.050 4.892 2.865 5.603 3.102 L 13.648 5.784 C 14.298 6.001 14.789 6.539 14.947 7.206 C 15.104 7.872 14.905 8.573 14.421 9.058"),
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
                pathData = parseSvgPathData("M 10.000 10.000 L 16.500 16.500"),
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
                pathData = parseSvgPathData("M 19.347 16.575 L 20.427 17.654 C 21.192 18.420 21.192 19.661 20.427 20.427 C 19.661 21.192 18.419 21.192 17.654 20.426 L 16.574 19.347 C 15.809 18.581 15.809 17.340 16.574 16.574 C 17.340 15.809 18.582 15.809 19.347 16.575"),
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
        return _trowel!!
    }

private var _trowel: ImageVector? = null
