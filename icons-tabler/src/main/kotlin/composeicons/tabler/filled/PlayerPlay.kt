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
                pathData = parseSvgPathData("M6 4v16c-0 .362 .196 .696 .512 .873 .316 .177 .703 .169 1.012-.021l13-8c.296-.182 .476-.505 .476-.852 0-.347-.18-.67-.476-.852L7.524 3.148C7.215 2.958 6.828 2.95 6.512 3.127 6.196 3.304 6 3.638 6 4Z"),
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
