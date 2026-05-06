package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TriangleInverted: ImageVector
    get() {
        if (_triangleInverted != null) return _triangleInverted!!
        _triangleInverted = tablerOutlineIcon(
            name = "TriangleInverted",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.363 20.405 2.257 6.871C1.917 6.282 1.915 5.557 2.252 4.966 2.588 4.375 3.213 4.008 3.893 4h16.214c.68 .008 1.305 .375 1.641 .966 .337 .591 .335 1.316-.005 1.905L13.637 20.405c-.347 .573-.968 .922-1.637 .922-.669 0-1.29-.35-1.637-.922"),
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
        return _triangleInverted!!
    }

private var _triangleInverted: ImageVector? = null
