package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Triangles: ImageVector
    get() {
        if (_triangles != null) return _triangles!!
        _triangles = tablerOutlineIcon(
            name = "Triangles",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.974 21.000 L 18.026 21.000 C 18.386 21.000 18.716 20.802 18.886 20.484 C 19.055 20.167 19.036 19.782 18.836 19.483 L 14.811 13.435 C 14.631 13.163 14.326 13.000 14.000 13.000 C 13.674 13.000 13.369 13.163 13.189 13.435 L 9.164 19.483 C 8.965 19.782 8.947 20.166 9.116 20.483 C 9.286 20.800 9.615 20.998 9.974 21.000"),
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
                pathData = parseSvgPathData("M 4.980 16.000 L 19.020 16.000 C 19.562 16.000 20.000 15.557 20.000 15.011 C 20.000 14.822 19.945 14.637 19.844 14.477 L 12.824 3.454 C 12.646 3.171 12.335 2.999 12.000 2.999 C 11.665 2.999 11.354 3.171 11.176 3.454 L 4.156 14.477 C 3.867 14.937 3.997 15.543 4.450 15.843 C 4.608 15.945 4.792 16.000 4.980 16.000"),
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
        return _triangles!!
    }

private var _triangles: ImageVector? = null
