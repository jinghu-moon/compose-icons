package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayerSkipBack: ImageVector
    get() {
        if (_playerSkipBack != null) return _playerSkipBack!!
        _playerSkipBack = tablerFilledIcon(
            name = "PlayerSkipBack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.496 4.136 L 7.496 11.136 C 7.189 11.315 6.999 11.644 6.999 12.000 C 6.999 12.356 7.189 12.685 7.496 12.864 L 19.496 19.864 C 19.805 20.045 20.188 20.046 20.498 19.867 C 20.809 19.689 21.000 19.358 21.000 19.000 L 21.000 5.000 C 21.000 4.642 20.809 4.311 20.498 4.133 C 20.188 3.954 19.805 3.955 19.496 4.136 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 4.000 4.000 C 4.507 4.000 4.934 4.380 4.993 4.883 L 5.000 5.000 L 5.000 19.000 C 4.999 19.529 4.587 19.966 4.059 19.997 C 3.530 20.028 3.069 19.642 3.007 19.117 L 3.000 19.000 L 3.000 5.000 C 3.000 4.448 3.448 4.000 4.000 4.000 Z"),
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
        return _playerSkipBack!!
    }

private var _playerSkipBack: ImageVector? = null
