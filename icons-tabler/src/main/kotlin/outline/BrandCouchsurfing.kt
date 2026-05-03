package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandCouchsurfing: ImageVector
    get() {
        if (_brandCouchsurfing != null) return _brandCouchsurfing!!
        _brandCouchsurfing = tablerOutlineIcon(
            name = "BrandCouchsurfing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.100 13.000 C 6.367 13.000 9.000 12.833 11.000 12.500 C 14.000 12.000 15.000 10.500 15.000 9.000 C 15.000 7.343 13.657 6.000 12.000 6.000 C 10.343 6.000 9.000 7.343 9.000 9.000 C 9.000 10.554 10.807 12.000 12.000 13.000 C 13.193 14.000 14.000 15.500 14.000 16.500 C 14.000 17.328 13.328 18.000 12.500 18.000 C 11.672 18.000 11.000 17.328 11.000 16.500 C 11.000 14.500 15.000 13.000 18.000 13.000 L 20.900 13.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 3.000 12.000 C 3.000 16.971 7.029 21.000 12.000 21.000 C 16.971 21.000 21.000 16.971 21.000 12.000 C 21.000 7.029 16.971 3.000 12.000 3.000 C 7.029 3.000 3.000 7.029 3.000 12.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _brandCouchsurfing!!
    }

private var _brandCouchsurfing: ImageVector? = null
