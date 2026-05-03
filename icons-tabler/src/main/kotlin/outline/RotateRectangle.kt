package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RotateRectangle: ImageVector
    get() {
        if (_rotateRectangle != null) return _rotateRectangle!!
        _rotateRectangle = tablerOutlineIcon(
            name = "RotateRectangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.090 4.010 L 10.586 3.515 C 11.367 2.734 12.633 2.734 13.414 3.515 L 20.485 10.585 C 20.861 10.960 21.072 11.469 21.072 12.000 C 21.072 12.531 20.861 13.040 20.485 13.415 L 13.415 20.485 C 13.040 20.861 12.531 21.072 12.000 21.072 C 11.469 21.072 10.960 20.861 10.585 20.485 L 3.515 13.415 C 3.139 13.040 2.928 12.531 2.928 12.000 C 2.928 11.469 3.139 10.960 3.515 10.585 L 7.050 7.050 L 3.062 7.050"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 7.050 11.038 L 7.050 7.050"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _rotateRectangle!!
    }

private var _rotateRectangle: ImageVector? = null
