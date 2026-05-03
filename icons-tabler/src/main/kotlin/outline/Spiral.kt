package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Spiral: ImageVector
    get() {
        if (_spiral != null) return _spiral!!
        _spiral = tablerOutlineIcon(
            name = "Spiral",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.000 12.057 C 10.137 12.353 10.349 12.609 10.614 12.800 C 11.674 13.513 13.086 12.912 13.657 11.881 C 14.496 10.368 13.635 8.513 12.132 7.801 C 10.132 6.851 7.761 7.955 6.892 9.887 C 5.797 12.319 7.182 15.135 9.602 16.133 C 12.533 17.341 15.885 15.715 17.040 12.878 C 18.400 9.535 16.483 5.744 13.144 4.468 C 9.289 2.994 4.944 5.148 3.508 8.890 C 1.878 13.143 4.331 17.914 8.590 19.466 C 13.368 21.206 18.708 18.525 20.423 13.876 C 20.759 12.974 20.954 12.025 21.000 11.063"),
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
        return _spiral!!
    }

private var _spiral: ImageVector? = null
