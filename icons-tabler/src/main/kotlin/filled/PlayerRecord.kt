package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayerRecord: ImageVector
    get() {
        if (_playerRecord != null) return _playerRecord!!
        _playerRecord = tablerFilledIcon(
            name = "PlayerRecord",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.000 5.072 C 11.113 3.275 15.042 3.774 17.606 6.293 C 20.170 8.812 20.740 12.732 18.998 15.876 C 17.257 19.021 13.632 20.617 10.136 19.780 C 6.641 18.943 4.133 15.877 4.005 12.285 L 4.000 12.000 L 4.005 11.715 C 4.103 8.960 5.613 6.450 8.000 5.072 Z"),
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
        return _playerRecord!!
    }

private var _playerRecord: ImageVector? = null
