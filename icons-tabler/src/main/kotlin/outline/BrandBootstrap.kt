package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandBootstrap: ImageVector
    get() {
        if (_brandBootstrap != null) return _brandBootstrap!!
        _brandBootstrap = tablerOutlineIcon(
            name = "BrandBootstrap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.000 12.000 C 3.105 12.000 4.000 11.105 4.000 10.000 L 4.000 6.000 C 4.000 4.895 4.895 4.000 6.000 4.000 L 18.000 4.000 C 19.105 4.000 20.000 4.895 20.000 6.000 L 20.000 10.000 C 20.000 11.105 20.895 12.000 22.000 12.000"),
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
        pathData = parseSvgPathData("M 2.000 12.000 C 3.105 12.000 4.000 12.895 4.000 14.000 L 4.000 18.000 C 4.000 19.105 4.895 20.000 6.000 20.000 L 18.000 20.000 C 19.105 20.000 20.000 19.105 20.000 18.000 L 20.000 14.000 C 20.000 12.895 20.895 12.000 22.000 12.000"),
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
        pathData = parseSvgPathData("M 9.000 16.000 L 9.000 8.000 L 12.500 8.000 C 13.605 8.000 14.500 8.895 14.500 10.000 C 14.500 11.105 13.605 12.000 12.500 12.000 L 9.000 12.000 L 13.000 12.000 C 14.105 12.000 15.000 12.895 15.000 14.000 C 15.000 15.105 14.105 16.000 13.000 16.000 L 9.000 16.000"),
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
        return _brandBootstrap!!
    }

private var _brandBootstrap: ImageVector? = null
