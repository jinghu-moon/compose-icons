package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayerStop: ImageVector
    get() {
        if (_playerStop != null) return _playerStop!!
        _playerStop = tablerFilledIcon(
            name = "PlayerStop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 4.000 L 7.000 4.000 C 5.343 4.000 4.000 5.343 4.000 7.000 L 4.000 17.000 C 4.000 18.657 5.343 20.000 7.000 20.000 L 17.000 20.000 C 18.657 20.000 20.000 18.657 20.000 17.000 L 20.000 7.000 C 20.000 5.343 18.657 4.000 17.000 4.000 Z"),
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
        return _playerStop!!
    }

private var _playerStop: ImageVector? = null
