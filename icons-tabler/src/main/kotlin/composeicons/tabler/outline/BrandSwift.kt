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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.547 15.828C21.877 11.702 19.163 6.307 14.5 3c-.135-.096 2.39 6.704 1.308 9.124C13.655 10.67 11.052 8.63 8 6L7.5 8 4 7c4.36 4.748 7.213 7.695 8.56 8.841C7.902 17.93 1.91 14.863 2 15c1.016 1.545 6 6 11 6 2 0 3.788-.502 4.742-1.389 .005-.005 .432-.446 1.378-.17 .504 .148 1.463 .667 2.88 1.559v-1.507c0-1.377-.515-2.67-1.453-3.665"),
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
        return _brandSwift!!
    }

private var _brandSwift: ImageVector? = null
