package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Math1Divide3: ImageVector
    get() {
        if (_math1Divide3 != null) return _math1Divide3!!
        _math1Divide3 = tablerOutlineIcon(
            name = "Math1Divide3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.000 15.500 C 10.000 15.224 10.224 15.000 10.500 15.000 L 12.500 15.000 C 13.328 15.000 14.000 15.672 14.000 16.500 C 14.000 17.328 13.328 18.000 12.500 18.000 L 11.333 18.000 L 12.500 18.000 C 13.328 18.000 14.000 18.672 14.000 19.500 C 14.000 20.328 13.328 21.000 12.500 21.000 L 10.500 21.000 C 10.224 21.000 10.000 20.776 10.000 20.500"),
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
                pathData = parseSvgPathData("M 5.000 12.000 L 19.000 12.000"),
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
                pathData = parseSvgPathData("M 10.000 5.000 L 12.000 3.000 L 12.000 9.000"),
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
        return _math1Divide3!!
    }

private var _math1Divide3: ImageVector? = null
