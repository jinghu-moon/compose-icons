package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlayerStop: ImageVector
    get() {
        if (_playerStop != null) return _playerStop!!
        _playerStop = tablerOutlineIcon(
            name = "PlayerStop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.000 7.000 C 5.000 5.895 5.895 5.000 7.000 5.000 L 17.000 5.000 C 18.105 5.000 19.000 5.895 19.000 7.000 L 19.000 17.000 C 19.000 18.105 18.105 19.000 17.000 19.000 L 7.000 19.000 C 5.895 19.000 5.000 18.105 5.000 17.000 L 5.000 7.000"),
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
        return _playerStop!!
    }

private var _playerStop: ImageVector? = null
