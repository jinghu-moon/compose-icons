package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.KeyOff: ImageVector
    get() {
        if (_keyOff != null) return _keyOff!!
        _keyOff = tablerOutlineIcon(
            name = "KeyOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.170 6.159 L 12.486 3.843 C 13.026 3.303 13.757 3.000 14.521 3.000 C 15.284 3.000 16.015 3.303 16.555 3.843 L 20.157 7.445 C 20.697 7.985 21.000 8.716 21.000 9.479 C 21.000 10.243 20.697 10.974 20.157 11.514 L 17.827 13.844"),
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
        pathData = parseSvgPathData("M 14.931 14.948 C 14.368 14.839 13.850 14.564 13.445 14.158 L 13.144 13.856 L 6.586 20.414 C 6.254 20.746 5.815 20.951 5.347 20.992 L 5.172 21.000 L 4.000 21.000 C 3.493 21.000 3.066 20.620 3.007 20.117 L 3.000 20.000 L 3.000 18.828 C 3.000 18.358 3.165 17.904 3.467 17.544 L 3.586 17.414 L 4.000 17.000 L 6.000 17.000 L 6.000 15.000 L 8.000 15.000 L 8.000 13.000 L 10.144 10.856 L 9.843 10.555 C 9.432 10.146 9.155 9.621 9.049 9.051"),
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
        pathData = parseSvgPathData("M 15.000 9.000 L 15.010 9.000"),
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
        pathData = parseSvgPathData("M 3.000 3.000 L 21.000 21.000"),
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
        return _keyOff!!
    }

private var _keyOff: ImageVector? = null
