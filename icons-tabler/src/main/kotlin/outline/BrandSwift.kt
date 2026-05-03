package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSwift: ImageVector
    get() {
        if (_brandSwift != null) return _brandSwift!!
        _brandSwift = tablerOutlineIcon(
            name = "BrandSwift",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.547 15.828 C 21.877 11.702 19.163 6.307 14.500 3.000 C 14.365 2.904 16.890 9.704 15.808 12.124 C 13.655 10.670 11.052 8.630 8.000 6.000 L 7.500 8.000 L 4.000 7.000 C 8.360 11.748 11.213 14.695 12.560 15.841 C 7.902 17.930 1.910 14.863 2.000 15.000 C 3.016 16.545 8.000 21.000 13.000 21.000 C 15.000 21.000 16.788 20.498 17.742 19.611 C 17.747 19.606 18.174 19.165 19.120 19.441 C 19.624 19.589 20.583 20.108 22.000 21.000 L 22.000 19.493 C 22.000 18.116 21.485 16.823 20.547 15.828"),
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
        return _brandSwift!!
    }

private var _brandSwift: ImageVector? = null
