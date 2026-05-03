package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HexagonOff: ImageVector
    get() {
        if (_hexagonOff != null) return _hexagonOff!!
        _hexagonOff = tablerOutlineIcon(
            name = "HexagonOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.693 4.690 L 11.029 3.300 C 11.651 2.954 12.407 2.954 13.029 3.300 L 19.029 6.873 L 19.000 6.873 C 19.623 7.233 20.005 7.900 20.000 8.620 L 20.000 15.156 C 20.000 15.402 19.955 15.641 19.870 15.863M 17.710 17.710 L 12.971 20.737 C 12.367 21.072 11.633 21.072 11.029 20.737 L 5.029 16.904 C 4.394 16.552 4.001 15.883 4.000 15.157 L 4.000 8.620 C 4.000 7.894 4.394 7.225 5.029 6.872 L 6.183 6.185"),
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
                pathData = parseSvgPathData("M 3.000 3.000 L 21.000 21.000"),
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
        return _hexagonOff!!
    }

private var _hexagonOff: ImageVector? = null
