package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Empathize: ImageVector
    get() {
        if (_empathize != null) return _empathize!!
        _empathize = tablerOutlineIcon(
            name = "Empathize",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.500 5.500 C 9.500 6.881 10.619 8.000 12.000 8.000 C 13.381 8.000 14.500 6.881 14.500 5.500 C 14.500 4.119 13.381 3.000 12.000 3.000 C 10.619 3.000 9.500 4.119 9.500 5.500"),
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
                pathData = parseSvgPathData("M 12.000 21.368 L 17.095 16.272 C 17.884 15.494 18.195 14.352 17.910 13.282 C 17.626 12.211 16.789 11.374 15.718 11.090 C 14.648 10.805 13.506 11.116 12.728 11.905 L 12.000 12.632 L 11.272 11.905 C 10.494 11.116 9.352 10.805 8.282 11.090 C 7.211 11.374 6.374 12.211 6.090 13.282 C 5.805 14.352 6.116 15.494 6.905 16.272 L 12.000 21.368"),
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
        return _empathize!!
    }

private var _empathize: ImageVector? = null
