package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSlack: ImageVector
    get() {
        if (_brandSlack != null) return _brandSlack!!
        _brandSlack = tablerOutlineIcon(
            name = "BrandSlack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 12.000 L 12.000 6.000 C 12.000 4.895 12.895 4.000 14.000 4.000 C 15.105 4.000 16.000 4.895 16.000 6.000 L 16.000 12.000M 16.000 10.000 C 16.000 8.895 16.895 8.000 18.000 8.000 C 19.105 8.000 20.000 8.895 20.000 10.000 C 20.000 11.105 19.105 12.000 18.000 12.000 L 12.000 12.000"),
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
                pathData = parseSvgPathData("M 12.000 12.000 L 18.000 12.000 C 19.105 12.000 20.000 12.895 20.000 14.000 C 20.000 15.105 19.105 16.000 18.000 16.000 L 12.000 16.000M 14.000 16.000 C 15.105 16.000 16.000 16.895 16.000 18.000 C 16.000 19.105 15.105 20.000 14.000 20.000 C 12.895 20.000 12.000 19.105 12.000 18.000 L 12.000 12.000"),
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
                pathData = parseSvgPathData("M 12.000 12.000 L 12.000 18.000 C 12.000 19.105 11.105 20.000 10.000 20.000 C 8.895 20.000 8.000 19.105 8.000 18.000 L 8.000 12.000M 8.000 14.000 C 8.000 15.105 7.105 16.000 6.000 16.000 C 4.895 16.000 4.000 15.105 4.000 14.000 C 4.000 12.895 4.895 12.000 6.000 12.000 L 12.000 12.000"),
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
                pathData = parseSvgPathData("M 12.000 12.000 L 6.000 12.000 C 4.895 12.000 4.000 11.105 4.000 10.000 C 4.000 8.895 4.895 8.000 6.000 8.000 L 12.000 8.000M 10.000 8.000 C 8.895 8.000 8.000 7.105 8.000 6.000 C 8.000 4.895 8.895 4.000 10.000 4.000 C 11.105 4.000 12.000 4.895 12.000 6.000 L 12.000 12.000"),
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
        return _brandSlack!!
    }

private var _brandSlack: ImageVector? = null
