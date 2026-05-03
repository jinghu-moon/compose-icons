package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayerPlay: ImageVector
    get() {
        if (_playerPlay != null) return _playerPlay!!
        _playerPlay = tablerFilledIcon(
            name = "PlayerPlay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.000 4.000 L 6.000 20.000 C 6.000 20.362 6.196 20.696 6.512 20.873 C 6.828 21.050 7.215 21.042 7.524 20.852 L 20.524 12.852 C 20.820 12.670 21.000 12.347 21.000 12.000 C 21.000 11.653 20.820 11.330 20.524 11.148 L 7.524 3.148 C 7.215 2.958 6.828 2.950 6.512 3.127 C 6.196 3.304 6.000 3.638 6.000 4.000 Z"),
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
        return _playerPlay!!
    }

private var _playerPlay: ImageVector? = null
