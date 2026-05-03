package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayerSkipForward: ImageVector
    get() {
        if (_playerSkipForward != null) return _playerSkipForward!!
        _playerSkipForward = tablerFilledIcon(
            name = "PlayerSkipForward",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 5.000 L 3.000 19.000 C 3.000 19.358 3.191 19.689 3.502 19.867 C 3.812 20.046 4.195 20.045 4.504 19.864 L 16.504 12.864 C 16.811 12.685 17.001 12.356 17.001 12.000 C 17.001 11.644 16.811 11.315 16.504 11.136 L 4.504 4.136 C 4.195 3.955 3.812 3.954 3.502 4.133 C 3.191 4.311 3.000 4.642 3.000 5.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 20.000 4.000 C 20.507 4.000 20.934 4.380 20.993 4.883 L 21.000 5.000 L 21.000 19.000 C 20.999 19.529 20.587 19.966 20.059 19.997 C 19.530 20.028 19.069 19.642 19.007 19.117 L 19.000 19.000 L 19.000 5.000 C 19.000 4.448 19.448 4.000 20.000 4.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _playerSkipForward!!
    }

private var _playerSkipForward: ImageVector? = null
