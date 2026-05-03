package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Diabolo: ImageVector
    get() {
        if (_diabolo != null) return _diabolo!!
        _diabolo = tablerOutlineIcon(
            name = "Diabolo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 6.000 C 4.000 7.657 7.582 9.000 12.000 9.000 C 16.418 9.000 20.000 7.657 20.000 6.000 C 20.000 4.343 16.418 3.000 12.000 3.000 C 7.582 3.000 4.000 4.343 4.000 6.000"),
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
        pathData = parseSvgPathData("M 4.000 6.000 L 4.000 6.143 C 4.000 6.247 4.016 6.351 4.048 6.450 L 6.000 12.000 L 4.036 17.670 C 4.012 17.756 4.000 17.845 4.000 17.935 L 4.000 18.000 C 4.000 19.657 7.582 21.000 12.000 21.000 C 16.418 21.000 20.000 19.657 20.000 18.000 L 20.000 17.935 C 20.000 17.845 19.988 17.756 19.964 17.670 L 18.000 12.000 L 19.952 6.450 C 19.984 6.351 20.000 6.247 20.000 6.143 L 20.000 6.000"),
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
        pathData = parseSvgPathData("M 6.000 12.000 C 6.000 13.105 8.686 14.000 12.000 14.000 C 15.314 14.000 18.000 13.105 18.000 12.000"),
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
        return _diabolo!!
    }

private var _diabolo: ImageVector? = null
