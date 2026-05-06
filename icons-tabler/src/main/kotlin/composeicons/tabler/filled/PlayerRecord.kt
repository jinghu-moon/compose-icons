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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8 5.072c3.113-1.797 7.042-1.298 9.606 1.221 2.564 2.519 3.133 6.439 1.392 9.583-1.742 3.144-5.366 4.741-8.862 3.904C6.641 18.943 4.133 15.877 4.005 12.285L4 12l.005-.285C4.103 8.96 5.613 6.45 8 5.072Z"),
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
        return _playerRecord!!
    }

private var _playerRecord: ImageVector? = null
