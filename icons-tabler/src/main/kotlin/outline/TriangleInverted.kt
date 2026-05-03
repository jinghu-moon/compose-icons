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
                pathData = parseSvgPathData("M 10.363 20.405 L 2.257 6.871 C 1.917 6.282 1.915 5.557 2.252 4.966 C 2.588 4.375 3.213 4.008 3.893 4.000 L 20.107 4.000 C 20.787 4.008 21.412 4.375 21.748 4.966 C 22.085 5.557 22.083 6.282 21.743 6.871 L 13.637 20.405 C 13.290 20.978 12.669 21.327 12.000 21.327 C 11.331 21.327 10.710 20.978 10.363 20.405"),
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
