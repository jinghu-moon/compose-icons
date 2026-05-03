package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Feather: ImageVector
    get() {
        if (_feather != null) return _feather!!
        _feather = tablerOutlineIcon(
            name = "Feather",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 20.000 L 14.000 10.000M 14.000 5.000 L 14.000 10.000 L 19.000 10.000M 10.000 9.000 L 10.000 14.000 L 15.000 14.000M 6.000 13.000 L 6.000 18.000 L 11.000 18.000M 6.000 13.000 L 10.000 9.000 L 14.000 5.000"),
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
                pathData = parseSvgPathData("M 19.000 10.000 C 19.638 9.364 20.000 8.485 20.000 7.514 C 20.000 6.582 19.629 5.687 18.969 5.028 C 18.310 4.369 17.415 3.999 16.483 4.000 C 15.513 4.000 14.636 4.367 14.000 5.000M 11.000 18.000 L 15.000 14.000 L 19.000 10.000"),
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
        return _feather!!
    }

private var _feather: ImageVector? = null
