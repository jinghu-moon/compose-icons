package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TaxPound: ImageVector
    get() {
        if (_taxPound != null) return _taxPound!!
        _taxPound = tablerOutlineIcon(
            name = "TaxPound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.487 21.000 L 15.513 21.000 C 16.791 21.000 17.992 20.389 18.745 19.356 C 19.498 18.323 19.712 16.993 19.321 15.776 L 17.615 10.470 C 16.950 8.402 15.027 7.000 12.855 7.000 L 11.145 7.000 C 8.973 7.000 7.050 8.402 6.385 10.470 L 4.679 15.776 C 4.288 16.993 4.502 18.323 5.255 19.356 C 6.008 20.389 7.209 21.000 8.487 21.000"),
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
                pathData = parseSvgPathData("M 15.000 3.000 Q 14.000 7.000 12.000 7.000 Q 10.000 7.000 9.000 3.000 L 15.000 3.000"),
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
                pathData = parseSvgPathData("M 14.000 11.000 L 13.000 11.000 C 11.895 11.000 11.000 11.895 11.000 13.000 L 11.000 15.000 C 11.000 16.105 10.605 17.000 9.500 17.000 L 14.000 17.000"),
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
                pathData = parseSvgPathData("M 10.000 14.000 L 13.000 14.000"),
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
        return _taxPound!!
    }

private var _taxPound: ImageVector? = null
