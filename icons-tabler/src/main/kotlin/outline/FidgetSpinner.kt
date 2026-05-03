package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FidgetSpinner: ImageVector
    get() {
        if (_fidgetSpinner != null) return _fidgetSpinner!!
        _fidgetSpinner = tablerOutlineIcon(
            name = "FidgetSpinner",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.000 16.000 L 18.000 16.010"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 6.000 16.000 L 6.000 16.010"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 12.000 5.000 L 12.000 5.010"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 12.000 12.000 L 12.000 12.010"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 12.000 1.000 C 13.811 1.000 15.396 2.215 15.864 3.964 C 16.333 5.713 15.569 7.559 14.001 8.464 L 14.002 8.536 C 15.331 9.304 16.103 10.764 15.989 12.294 L 16.209 12.422 C 16.704 12.174 17.246 12.032 17.800 12.005 L 18.000 12.000 C 19.639 12.000 21.112 13.000 21.717 14.523 C 22.322 16.046 21.937 17.784 20.745 18.909 C 19.553 20.034 17.796 20.318 16.311 19.626 C 14.825 18.934 13.912 17.406 14.006 15.770 L 13.726 15.610 C 13.204 15.860 12.618 16.000 12.000 16.000 C 11.381 16.000 10.795 15.860 10.272 15.609 L 9.993 15.769 L 10.000 16.000 C 10.000 17.788 8.813 19.359 7.093 19.847 C 5.373 20.335 3.537 19.623 2.597 18.102 C 1.657 16.581 1.841 14.621 3.047 13.301 C 4.253 11.981 6.189 11.622 7.788 12.421 L 8.010 12.292 C 7.897 10.762 8.670 9.303 9.998 8.536 L 10.000 8.465 C 8.824 7.786 8.073 6.556 8.005 5.200 L 8.000 5.000 C 8.000 2.791 9.791 1.000 12.000 1.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _fidgetSpinner!!
    }

private var _fidgetSpinner: ImageVector? = null
