package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSupernova: ImageVector
    get() {
        if (_brandSupernova != null) return _brandSupernova!!
        _brandSupernova = tablerOutlineIcon(
            name = "BrandSupernova",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 12.000 C 10.000 13.105 10.895 14.000 12.000 14.000 C 13.105 14.000 14.000 13.105 14.000 12.000 C 14.000 10.895 13.105 10.000 12.000 10.000 C 10.895 10.000 10.000 10.895 10.000 12.000"),
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
        pathData = parseSvgPathData("M 15.000 15.000 L 15.500 15.000 C 18.538 15.000 21.000 13.657 21.000 12.000 C 21.000 10.343 18.538 9.000 15.500 9.000 C 13.664 9.000 12.038 9.490 11.040 10.245"),
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
        pathData = parseSvgPathData("M 9.000 9.000 L 8.500 9.000 C 5.462 9.000 3.000 10.343 3.000 12.000 C 3.000 13.657 5.462 15.000 8.500 15.000 C 10.344 15.000 11.976 14.505 12.974 13.745"),
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
        pathData = parseSvgPathData("M 15.000 9.000 L 15.000 8.500 C 15.000 5.462 13.657 3.000 12.000 3.000 C 10.343 3.000 9.000 5.462 9.000 8.500 C 9.000 10.333 9.490 11.957 10.241 12.956"),
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
        pathData = parseSvgPathData("M 9.000 15.000 L 9.000 15.500 C 9.000 18.538 10.343 21.000 12.000 21.000 C 13.657 21.000 15.000 18.538 15.000 15.500 C 15.000 13.658 14.506 12.028 13.748 11.030"),
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
        return _brandSupernova!!
    }

private var _brandSupernova: ImageVector? = null
