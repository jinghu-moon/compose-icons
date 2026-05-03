package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
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
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 5.072f),
                    PathNode.CurveTo(11.112849f, 3.274837f, 15.042137f, 3.774394f, 17.606255f, 6.293307f),
                    PathNode.CurveTo(20.170374f, 8.812221f, 20.739733f, 12.732002f, 18.998217f, 15.876322f),
                    PathNode.CurveTo(17.2567f, 19.020641f, 13.631916f, 20.61745f, 10.136406f, 19.78017f),
                    PathNode.CurveTo(6.640896f, 18.942892f, 4.132941f, 15.87711f, 4.005f, 12.285f),
                    PathNode.LineTo(4.0f, 12.0f),
                    PathNode.LineTo(4.005f, 11.715f),
                    PathNode.CurveTo(4.103287f, 8.960285f, 5.612812f, 6.450204f, 8.0f, 5.072f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _playerRecord!!
    }

private var _playerRecord: ImageVector? = null
