package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandPhp: ImageVector
    get() {
        if (_brandPhp != null) return _brandPhp!!
        _brandPhp = tablerOutlineIcon(
            name = "BrandPhp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.000 12.000 C 2.000 16.971 6.477 21.000 12.000 21.000 C 17.523 21.000 22.000 16.971 22.000 12.000 C 22.000 7.029 17.523 3.000 12.000 3.000 C 6.477 3.000 2.000 7.029 2.000 12.000"),
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
                pathData = parseSvgPathData("M 5.500 15.000 L 5.895 13.026 L 6.500 10.000 L 7.820 10.000 C 8.114 10.000 8.393 10.129 8.583 10.354 C 8.772 10.578 8.854 10.874 8.806 11.164 L 8.639 12.164 C 8.559 12.646 8.142 13.000 7.653 13.000 L 6.000 13.000"),
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
                pathData = parseSvgPathData("M 15.500 15.000 L 15.895 13.026 L 16.500 10.000 L 17.820 10.000 C 18.114 10.000 18.393 10.129 18.583 10.354 C 18.772 10.578 18.854 10.874 18.806 11.164 L 18.639 12.164 C 18.559 12.646 18.142 13.000 17.653 13.000 L 16.000 13.000"),
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
                pathData = parseSvgPathData("M 12.000 7.500 L 11.000 13.000"),
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
                pathData = parseSvgPathData("M 11.600 10.000 L 14.000 10.000 L 13.500 13.000"),
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
        return _brandPhp!!
    }

private var _brandPhp: ImageVector? = null
