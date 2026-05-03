package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Invoice: ImageVector
    get() {
        if (_invoice != null) return _invoice!!
        _invoice = tablerOutlineIcon(
            name = "Invoice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 3.000 L 14.000 7.000 C 14.000 7.552 14.448 8.000 15.000 8.000 L 19.000 8.000"),
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
                pathData = parseSvgPathData("M 19.000 12.000 L 19.000 19.000 C 19.097 19.775 18.678 20.522 17.966 20.844 C 17.255 21.165 16.417 20.985 15.900 20.400 C 15.587 20.000 15.108 19.766 14.600 19.766 C 14.092 19.766 13.613 20.000 13.300 20.400 C 12.987 20.800 12.508 21.034 12.000 21.034 C 11.492 21.034 11.013 20.800 10.700 20.400 C 10.387 20.000 9.908 19.766 9.400 19.766 C 8.892 19.766 8.413 20.000 8.100 20.400 C 7.583 20.985 6.745 21.165 6.034 20.844 C 5.322 20.522 4.903 19.775 5.000 19.000 L 5.000 5.000 C 5.000 3.895 5.895 3.000 7.000 3.000 L 14.000 3.000 L 19.000 8.000 L 19.000 12.250"),
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
        return _invoice!!
    }

private var _invoice: ImageVector? = null
