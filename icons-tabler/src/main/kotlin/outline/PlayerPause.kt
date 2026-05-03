package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlayerPause: ImageVector
    get() {
        if (_playerPause != null) return _playerPause!!
        _playerPause = tablerOutlineIcon(
            name = "PlayerPause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.000 6.000 C 6.000 5.448 6.448 5.000 7.000 5.000 L 9.000 5.000 C 9.552 5.000 10.000 5.448 10.000 6.000 L 10.000 18.000 C 10.000 18.552 9.552 19.000 9.000 19.000 L 7.000 19.000 C 6.448 19.000 6.000 18.552 6.000 18.000 L 6.000 6.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 14.000 6.000 C 14.000 5.448 14.448 5.000 15.000 5.000 L 17.000 5.000 C 17.552 5.000 18.000 5.448 18.000 6.000 L 18.000 18.000 C 18.000 18.552 17.552 19.000 17.000 19.000 L 15.000 19.000 C 14.448 19.000 14.000 18.552 14.000 18.000 L 14.000 6.000"),
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
        return _playerPause!!
    }

private var _playerPause: ImageVector? = null
