package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayerTrackNext: ImageVector
    get() {
        if (_playerTrackNext != null) return _playerTrackNext!!
        _playerTrackNext = tablerFilledIcon(
            name = "PlayerTrackNext",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.000 5.000 L 2.000 19.000 C 2.000 19.860 3.012 20.318 3.659 19.753 L 11.659 12.753 C 11.876 12.563 12.001 12.289 12.001 12.000 C 12.001 11.711 11.876 11.437 11.659 11.247 L 3.659 4.247 C 3.012 3.682 2.000 4.141 2.000 5.000 Z"),
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
        pathData = parseSvgPathData("M 13.000 5.000 L 13.000 19.000 C 13.000 19.860 14.012 20.318 14.659 19.753 L 22.659 12.753 C 22.876 12.563 23.001 12.289 23.001 12.000 C 23.001 11.711 22.876 11.437 22.659 11.247 L 14.659 4.247 C 14.012 3.682 13.000 4.141 13.000 5.000 Z"),
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
        return _playerTrackNext!!
    }

private var _playerTrackNext: ImageVector? = null
