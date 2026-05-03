package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAmd: ImageVector
    get() {
        if (_brandAmd != null) return _brandAmd!!
        _brandAmd = tablerOutlineIcon(
            name = "BrandAmd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.000 16.000 L 16.000 9.000 C 16.000 8.434 15.566 8.000 15.000 8.000 L 8.000 8.000 L 3.000 3.000 L 20.000 3.000 C 20.566 3.000 21.000 3.434 21.000 4.000 L 21.000 21.000 L 16.000 16.000"),
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
                pathData = parseSvgPathData("M 11.293 20.707 L 16.000 16.000 L 9.000 16.000 C 8.448 16.000 8.000 15.552 8.000 15.000 L 8.000 8.000 L 3.293 12.707 C 3.105 12.894 3.000 13.149 3.000 13.414 L 3.000 20.000 C 3.000 20.552 3.448 21.000 4.000 21.000 L 10.586 21.000 C 10.851 21.000 11.106 20.895 11.293 20.707"),
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
        return _brandAmd!!
    }

private var _brandAmd: ImageVector? = null
