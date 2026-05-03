package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlaneDeparture: ImageVector
    get() {
        if (_planeDeparture != null) return _planeDeparture!!
        _planeDeparture = tablerOutlineIcon(
            name = "PlaneDeparture",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.639 10.258 L 19.469 8.964 C 20.164 8.763 20.914 8.954 21.429 9.462 C 21.944 9.971 22.144 10.718 21.952 11.416 C 21.761 12.113 21.207 12.653 20.504 12.827 L 6.015 16.710 L 1.565 11.690 L 4.462 10.914 L 6.912 12.328 L 9.809 11.552 L 6.066 5.308 L 8.964 4.531 L 14.639 10.258"),
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
                pathData = parseSvgPathData("M 3.000 21.000 L 21.000 21.000"),
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
        return _planeDeparture!!
    }

private var _planeDeparture: ImageVector? = null
