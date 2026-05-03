package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAo3: ImageVector
    get() {
        if (_brandAo3 != null) return _brandAo3!!
        _brandAo3 = tablerOutlineIcon(
            name = "BrandAo3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.000 5.000 C 9.109 9.100 12.956 15.131 14.000 19.000 C 15.074 14.330 18.490 10.060 22.000 8.000"),
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
        pathData = parseSvgPathData("M 12.000 8.000 C 12.000 9.105 12.895 10.000 14.000 10.000 C 15.105 10.000 16.000 9.105 16.000 8.000 C 16.000 6.895 15.105 6.000 14.000 6.000 C 12.895 6.000 12.000 6.895 12.000 8.000"),
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
        pathData = parseSvgPathData("M 7.000 9.000 C 6.722 14.494 4.663 16.330 3.000 19.000 C 7.013 17.000 9.020 14.000 18.050 14.000 C 22.062 14.000 21.560 16.500 19.050 17.000 C 21.050 17.500 21.558 22.000 17.043 19.000"),
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
        return _brandAo3!!
    }

private var _brandAo3: ImageVector? = null
