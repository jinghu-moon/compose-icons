package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayerEject: ImageVector
    get() {
        if (_playerEject != null) return _playerEject!!
        _playerEject = tablerFilledIcon(
            name = "PlayerEject",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.247 3.341 L 4.247 11.341 C 3.682 11.988 4.141 13.000 5.000 13.000 L 19.000 13.000 C 19.860 13.000 20.318 11.988 19.753 11.341 L 12.753 3.341 C 12.563 3.124 12.289 2.999 12.000 2.999 C 11.711 2.999 11.437 3.124 11.247 3.341 Z"),
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
                pathData = parseSvgPathData("M 18.000 15.000 L 6.000 15.000 C 4.895 15.000 4.000 15.895 4.000 17.000 L 4.000 19.000 C 4.000 20.105 4.895 21.000 6.000 21.000 L 18.000 21.000 C 19.105 21.000 20.000 20.105 20.000 19.000 L 20.000 17.000 C 20.000 15.895 19.105 15.000 18.000 15.000 Z"),
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
        return _playerEject!!
    }

private var _playerEject: ImageVector? = null
