package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandBunpo: ImageVector
    get() {
        if (_brandBunpo != null) return _brandBunpo!!
        _brandBunpo = tablerOutlineIcon(
            name = "BrandBunpo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.900 7.205 C 5.103 8.302 6.452 9.228 7.908 9.958 C 9.342 10.596 10.932 10.793 12.478 10.525 C 13.978 10.195 15.385 9.525 16.599 8.569 C 17.721 7.773 18.699 6.791 19.491 5.666 C 20.094 4.726 20.236 3.900 19.975 3.435 C 19.714 2.970 19.048 2.867 18.255 3.178 C 17.246 3.655 16.356 4.350 15.647 5.212 C 14.623 6.392 13.754 7.697 13.059 9.096 C 12.229 10.729 11.530 12.426 10.966 14.169 C 10.578 15.304 10.350 16.487 10.289 17.684 C 10.219 18.436 10.359 19.194 10.694 19.868 C 11.017 20.430 11.754 21.000 13.037 21.000 C 16.511 21.000 18.130 17.470 18.500 15.380 C 18.740 14.015 18.415 12.183 17.318 11.370"),
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
        return _brandBunpo!!
    }

private var _brandBunpo: ImageVector? = null
