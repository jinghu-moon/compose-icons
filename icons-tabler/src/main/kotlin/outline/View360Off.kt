package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.View360Off: ImageVector
    get() {
        if (_view360Off != null) return _view360Off!!
        _view360Off = tablerOutlineIcon(
            name = "View360Off",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.335 8.388 C 8.108 9.579 7.996 10.788 8.000 12.000 C 8.000 16.970 9.790 21.000 12.000 21.000 C 13.622 21.000 15.018 18.828 15.646 15.706M 16.000 12.000 C 16.000 7.030 14.210 3.000 12.000 3.000 C 10.965 3.000 10.021 3.885 9.311 5.337"),
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
                pathData = parseSvgPathData("M 5.650 5.623 C 3.343 7.887 2.427 11.215 3.251 14.341 C 4.075 17.466 6.512 19.910 9.636 20.743 C 12.759 21.575 16.089 20.669 18.360 18.368M 20.044 16.040 C 21.790 12.570 21.112 8.372 18.364 5.628 C 15.616 2.883 11.418 2.210 7.950 3.960"),
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
                pathData = parseSvgPathData("M 8.320 8.349 C 5.184 8.974 3.000 10.374 3.000 12.000 C 3.000 14.210 7.030 16.000 12.000 16.000 C 13.286 16.000 14.510 15.880 15.616 15.664M 18.675 14.684 C 20.120 13.973 21.000 13.031 21.000 12.000 C 21.000 9.790 16.970 8.000 12.000 8.000"),
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
                pathData = parseSvgPathData("M 3.000 3.000 L 21.000 21.000"),
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
        return _view360Off!!
    }

private var _view360Off: ImageVector? = null
