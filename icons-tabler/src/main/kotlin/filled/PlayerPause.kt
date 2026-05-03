package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayerPause: ImageVector
    get() {
        if (_playerPause != null) return _playerPause!!
        _playerPause = tablerFilledIcon(
            name = "PlayerPause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.000 4.000 L 7.000 4.000 C 5.895 4.000 5.000 4.895 5.000 6.000 L 5.000 18.000 C 5.000 19.105 5.895 20.000 7.000 20.000 L 9.000 20.000 C 10.105 20.000 11.000 19.105 11.000 18.000 L 11.000 6.000 C 11.000 4.895 10.105 4.000 9.000 4.000 Z"),
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
        pathData = parseSvgPathData("M 17.000 4.000 L 15.000 4.000 C 13.895 4.000 13.000 4.895 13.000 6.000 L 13.000 18.000 C 13.000 19.105 13.895 20.000 15.000 20.000 L 17.000 20.000 C 18.105 20.000 19.000 19.105 19.000 18.000 L 19.000 6.000 C 19.000 4.895 18.105 4.000 17.000 4.000 Z"),
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
        return _playerPause!!
    }

private var _playerPause: ImageVector? = null
