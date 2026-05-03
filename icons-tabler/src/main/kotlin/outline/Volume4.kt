package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Volume4: ImageVector
    get() {
        if (_volume4 != null) return _volume4!!
        _volume4 = tablerOutlineIcon(
            name = "Volume4",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.500 15.000 L 7.500 15.000 C 6.948 15.000 6.500 14.552 6.500 14.000 L 6.500 10.000 C 6.500 9.448 6.948 9.000 7.500 9.000 L 9.500 9.000 L 13.000 4.500 C 13.181 4.149 13.590 3.982 13.964 4.107 C 14.339 4.232 14.566 4.611 14.500 5.000 L 14.500 19.000 C 14.566 19.389 14.339 19.768 13.964 19.893 C 13.590 20.018 13.181 19.851 13.000 19.500 L 9.500 15.000"),
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
        return _volume4!!
    }

private var _volume4: ImageVector? = null
