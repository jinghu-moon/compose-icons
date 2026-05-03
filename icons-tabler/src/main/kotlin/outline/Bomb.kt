package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bomb: ImageVector
    get() {
        if (_bomb != null) return _bomb!!
        _bomb = tablerOutlineIcon(
            name = "Bomb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.349 5.349 L 18.650 8.650 C 18.875 8.875 19.002 9.181 19.002 9.499 C 19.002 9.817 18.875 10.123 18.650 10.348 L 17.678 11.320 C 18.677 14.612 17.307 18.161 14.357 19.930 C 11.406 21.699 7.630 21.233 5.198 18.800 C 2.765 16.368 2.299 12.592 4.068 9.641 C 5.837 6.691 9.386 5.321 12.678 6.320 L 13.650 5.348 C 13.875 5.123 14.181 4.996 14.499 4.996 C 14.817 4.996 15.123 5.123 15.348 5.348 L 15.349 5.349"),
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
        pathData = parseSvgPathData("M 17.000 7.000 L 18.293 5.707 C 18.746 5.254 19.000 4.640 19.000 4.000 C 19.000 3.448 19.448 3.000 20.000 3.000 L 21.000 3.000"),
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
        pathData = parseSvgPathData("M 7.000 13.000 C 7.000 11.343 8.343 10.000 10.000 10.000"),
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
        return _bomb!!
    }

private var _bomb: ImageVector? = null
