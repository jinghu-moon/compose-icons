package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandOnedrive: ImageVector
    get() {
        if (_brandOnedrive != null) return _brandOnedrive!!
        _brandOnedrive = tablerOutlineIcon(
            name = "BrandOnedrive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.456 10.450 C 18.030 7.734 15.928 5.586 13.222 5.101 C 10.516 4.616 7.799 5.900 6.456 8.299 C 5.172 8.405 3.983 9.017 3.151 10.000 C 2.318 10.983 1.910 12.256 2.016 13.540 C 2.121 14.824 2.732 16.013 3.714 16.846 C 4.696 17.680 5.968 18.089 7.252 17.984 L 18.003 17.984 C 19.002 18.044 19.983 17.704 20.731 17.041 C 21.480 16.377 21.934 15.443 21.993 14.444 C 22.118 12.365 20.534 10.577 18.455 10.452 L 18.456 10.450"),
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
        return _brandOnedrive!!
    }

private var _brandOnedrive: ImageVector? = null
