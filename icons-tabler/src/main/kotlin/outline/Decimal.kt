package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Decimal: ImageVector
    get() {
        if (_decimal != null) return _decimal!!
        _decimal = tablerOutlineIcon(
            name = "Decimal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 8.000 C 18.105 8.000 19.000 8.895 19.000 10.000 L 19.000 14.000 C 19.000 15.105 18.105 16.000 17.000 16.000 C 15.895 16.000 15.000 15.105 15.000 14.000 L 15.000 10.000 C 15.000 8.895 15.895 8.000 17.000 8.000"),
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
                pathData = parseSvgPathData("M 10.000 8.000 C 11.105 8.000 12.000 8.895 12.000 10.000 L 12.000 14.000 C 12.000 15.105 11.105 16.000 10.000 16.000 C 8.895 16.000 8.000 15.105 8.000 14.000 L 8.000 10.000 C 8.000 8.895 8.895 8.000 10.000 8.000"),
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
                pathData = parseSvgPathData("M 5.000 16.000 L 5.010 16.000"),
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
        return _decimal!!
    }

private var _decimal: ImageVector? = null
