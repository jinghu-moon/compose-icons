package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DropletCancel: ImageVector
    get() {
        if (_dropletCancel != null) return _dropletCancel!!
        _dropletCancel = tablerOutlineIcon(
            name = "DropletCancel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.606 12.014 C 18.462 11.619 18.280 11.238 18.064 10.877 L 13.174 3.617 C 12.754 2.992 11.887 2.814 11.238 3.220 C 11.075 3.322 10.935 3.457 10.828 3.617 L 5.935 10.877 C 4.240 13.715 4.900 17.318 7.502 19.423 C 8.864 20.519 10.581 21.078 12.328 20.995"),
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
        pathData = parseSvgPathData("M 16.000 19.000 C 16.000 20.657 17.343 22.000 19.000 22.000 C 20.657 22.000 22.000 20.657 22.000 19.000 C 22.000 17.343 20.657 16.000 19.000 16.000 C 17.343 16.000 16.000 17.343 16.000 19.000"),
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
        pathData = parseSvgPathData("M 17.000 21.000 L 21.000 17.000"),
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
        return _dropletCancel!!
    }

private var _dropletCancel: ImageVector? = null
