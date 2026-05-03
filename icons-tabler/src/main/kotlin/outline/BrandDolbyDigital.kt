package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandDolbyDigital: ImageVector
    get() {
        if (_brandDolbyDigital != null) return _brandDolbyDigital!!
        _brandDolbyDigital = tablerOutlineIcon(
            name = "BrandDolbyDigital",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 6.000 L 21.000 18.000 L 20.110 18.000 C 16.770 18.000 14.063 15.314 14.063 12.000 C 14.063 8.686 16.770 6.000 20.109 6.000 L 21.000 6.000"),
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
        pathData = parseSvgPathData("M 3.063 6.000 L 3.063 18.000 L 3.954 18.000 C 7.294 18.000 10.000 15.314 10.000 12.000 C 10.000 8.686 7.293 6.000 3.954 6.000 L 3.064 6.000"),
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
        return _brandDolbyDigital!!
    }

private var _brandDolbyDigital: ImageVector? = null
