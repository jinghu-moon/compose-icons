package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayerTrackPrev: ImageVector
    get() {
        if (_playerTrackPrev != null) return _playerTrackPrev!!
        _playerTrackPrev = tablerFilledIcon(
            name = "PlayerTrackPrev",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.341 4.247 L 12.341 11.247 C 12.124 11.437 11.999 11.711 11.999 12.000 C 11.999 12.289 12.124 12.563 12.341 12.753 L 20.341 19.753 C 20.988 20.318 22.000 19.859 22.000 19.000 L 22.000 5.000 C 22.000 4.140 20.988 3.682 20.341 4.247 Z"),
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
                pathData = parseSvgPathData("M 9.341 4.247 L 1.341 11.247 C 1.124 11.437 0.999 11.711 0.999 12.000 C 0.999 12.289 1.124 12.563 1.341 12.753 L 9.341 19.753 C 9.988 20.318 11.000 19.859 11.000 19.000 L 11.000 5.000 C 11.000 4.140 9.988 3.682 9.341 4.247 Z"),
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
        return _playerTrackPrev!!
    }

private var _playerTrackPrev: ImageVector? = null
