package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Mug: ImageVector
    get() {
        if (_mug != null) return _mug!!
        _mug = tablerOutlineIcon(
            name = "Mug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.083 5.000 L 14.917 5.000 C 15.203 4.999 15.478 5.112 15.682 5.314 C 15.885 5.516 15.999 5.791 16.000 6.077 L 16.000 14.692 C 16.000 17.072 14.060 19.000 11.667 19.000 L 7.333 19.000 C 4.940 19.000 3.000 17.071 3.000 14.692 L 3.000 6.077 C 3.001 5.791 3.115 5.516 3.318 5.314 C 3.522 5.112 3.797 4.999 4.083 5.000"),
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
                pathData = parseSvgPathData("M 16.000 8.000 L 18.500 8.000 C 19.880 8.000 21.000 9.045 21.000 10.333 L 21.000 12.667 C 21.000 13.955 19.880 15.000 18.500 15.000 L 16.000 15.000"),
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
        return _mug!!
    }

private var _mug: ImageVector? = null
