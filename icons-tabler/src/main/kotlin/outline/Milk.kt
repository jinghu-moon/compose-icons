package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Milk: ImageVector
    get() {
        if (_milk != null) return _milk!!
        _milk = tablerOutlineIcon(
            name = "Milk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.000 6.000 L 16.000 6.000 L 16.000 4.000 C 16.000 3.448 15.552 3.000 15.000 3.000 L 9.000 3.000 C 8.448 3.000 8.000 3.448 8.000 4.000 L 8.000 6.000"),
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
                pathData = parseSvgPathData("M 16.000 6.000 L 17.094 7.759 C 17.686 8.710 18.000 9.808 18.000 10.929 L 18.000 19.000 C 18.000 20.105 17.105 21.000 16.000 21.000 L 8.000 21.000 C 6.895 21.000 6.000 20.105 6.000 19.000 L 6.000 10.929 C 6.000 9.808 6.314 8.710 6.906 7.759 L 8.000 6.000"),
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
                pathData = parseSvgPathData("M 10.000 16.000 C 10.000 17.105 10.895 18.000 12.000 18.000 C 13.105 18.000 14.000 17.105 14.000 16.000 C 14.000 14.895 13.105 14.000 12.000 14.000 C 10.895 14.000 10.000 14.895 10.000 16.000"),
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
                pathData = parseSvgPathData("M 10.000 10.000 L 14.000 10.000"),
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
        return _milk!!
    }

private var _milk: ImageVector? = null
