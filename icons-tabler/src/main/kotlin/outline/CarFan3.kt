package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CarFan3: ImageVector
    get() {
        if (_carFan3 != null) return _carFan3!!
        _carFan3 = tablerOutlineIcon(
            name = "CarFan3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 12.000 L 12.000 3.000 L 16.912 4.914 C 17.482 5.136 17.889 5.647 17.977 6.252 C 18.066 6.857 17.822 7.463 17.340 7.839 L 12.000 12.000"),
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
        pathData = parseSvgPathData("M 14.044 14.624 L 12.000 12.000 L 16.000 12.000"),
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
        pathData = parseSvgPathData("M 12.000 12.000 L 3.000 12.000 L 4.914 7.088 C 5.136 6.518 5.647 6.111 6.252 6.023 C 6.857 5.934 7.463 6.178 7.839 6.660 L 12.000 12.000"),
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
        pathData = parseSvgPathData("M 12.000 12.000 L 12.000 21.000 L 7.088 19.086 C 6.518 18.864 6.111 18.353 6.023 17.748 C 5.934 17.143 6.178 16.537 6.660 16.161 L 12.000 12.000"),
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
        pathData = parseSvgPathData("M 18.000 15.500 C 18.000 15.224 18.224 15.000 18.500 15.000 L 19.500 15.000 C 20.328 15.000 21.000 15.672 21.000 16.500 C 21.000 17.328 20.328 18.000 19.500 18.000 L 19.000 18.000 L 19.500 18.000 C 20.328 18.000 21.000 18.672 21.000 19.500 C 21.000 20.328 20.328 21.000 19.500 21.000 L 18.500 21.000 C 18.224 21.000 18.000 20.776 18.000 20.500"),
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
        return _carFan3!!
    }

private var _carFan3: ImageVector? = null
