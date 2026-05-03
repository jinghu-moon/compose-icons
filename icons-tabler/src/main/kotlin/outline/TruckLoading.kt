package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TruckLoading: ImageVector
    get() {
        if (_truckLoading != null) return _truckLoading!!
        _truckLoading = tablerOutlineIcon(
            name = "TruckLoading",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.000 3.000 L 3.000 3.000 C 4.105 3.000 5.000 3.895 5.000 5.000 L 5.000 15.000 C 5.000 16.105 5.895 17.000 7.000 17.000 L 22.000 17.000"),
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
        pathData = parseSvgPathData("M 9.000 9.000 C 9.000 7.343 10.343 6.000 12.000 6.000 L 16.000 6.000 C 17.657 6.000 19.000 7.343 19.000 9.000 L 19.000 11.000 C 19.000 12.657 17.657 14.000 16.000 14.000 L 12.000 14.000 C 10.343 14.000 9.000 12.657 9.000 11.000 L 9.000 9.000"),
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
        pathData = parseSvgPathData("M 7.000 19.000 C 7.000 20.105 7.895 21.000 9.000 21.000 C 10.105 21.000 11.000 20.105 11.000 19.000 C 11.000 17.895 10.105 17.000 9.000 17.000 C 7.895 17.000 7.000 17.895 7.000 19.000"),
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
        pathData = parseSvgPathData("M 16.000 19.000 C 16.000 20.105 16.895 21.000 18.000 21.000 C 19.105 21.000 20.000 20.105 20.000 19.000 C 20.000 17.895 19.105 17.000 18.000 17.000 C 16.895 17.000 16.000 17.895 16.000 19.000"),
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
        return _truckLoading!!
    }

private var _truckLoading: ImageVector? = null
