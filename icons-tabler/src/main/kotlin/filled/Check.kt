package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Check: ImageVector
    get() {
        if (_check != null) return _check!!
        _check = tablerFilledIcon(
            name = "Check",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.707 6.293 C 21.097 6.683 21.097 7.317 20.707 7.707 L 10.707 17.707 C 10.316 18.097 9.684 18.097 9.293 17.707 L 4.293 12.707 C 3.914 12.315 3.919 11.691 4.305 11.305 C 4.691 10.919 5.315 10.914 5.707 11.293 L 10.000 15.586 L 19.293 6.293 C 19.684 5.903 20.316 5.903 20.707 6.293"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _check!!
    }

private var _check: ImageVector? = null
