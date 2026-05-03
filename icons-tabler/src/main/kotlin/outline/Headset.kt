package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Headset: ImageVector
    get() {
        if (_headset != null) return _headset!!
        _headset = tablerOutlineIcon(
            name = "Headset",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 14.000 L 4.000 11.000 C 4.000 6.582 7.582 3.000 12.000 3.000 C 16.418 3.000 20.000 6.582 20.000 11.000 L 20.000 14.000"),
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
        pathData = parseSvgPathData("M 18.000 19.000 C 18.000 20.657 15.314 22.000 12.000 22.000"),
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
        pathData = parseSvgPathData("M 4.000 14.000 C 4.000 12.895 4.895 12.000 6.000 12.000 L 7.000 12.000 C 8.105 12.000 9.000 12.895 9.000 14.000 L 9.000 17.000 C 9.000 18.105 8.105 19.000 7.000 19.000 L 6.000 19.000 C 4.895 19.000 4.000 18.105 4.000 17.000 L 4.000 14.000"),
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
        pathData = parseSvgPathData("M 15.000 14.000 C 15.000 12.895 15.895 12.000 17.000 12.000 L 18.000 12.000 C 19.105 12.000 20.000 12.895 20.000 14.000 L 20.000 17.000 C 20.000 18.105 19.105 19.000 18.000 19.000 L 17.000 19.000 C 15.895 19.000 15.000 18.105 15.000 17.000 L 15.000 14.000"),
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
        return _headset!!
    }

private var _headset: ImageVector? = null
