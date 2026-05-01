package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Warehouse: ImageVector
    get() {
        if (_warehouse != null) return _warehouse!!
        _warehouse = phosphorBoldIcon(
            name = "Warehouse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 180.0f),
                    PathNode.LineTo(236.0f, 180.0f),
                    PathNode.LineTo(236.0f, 61.13f),
                    PathNode.LineTo(242.51f, 59.74f),
                    PathNode.CurveTo(246.764f, 58.907394f, 250.23833f, 55.845284f, 251.59875f, 51.729572f),
                    PathNode.CurveTo(252.95918f, 47.61386f, 251.99425f, 43.084377f, 249.07445f, 39.88051f),
                    PathNode.CurveTo(246.15468f, 36.676643f, 241.734f, 35.29647f, 237.51f, 36.27f),
                    PathNode.LineTo(13.51f, 84.27f),
                    PathNode.CurveTo(7.520847f, 85.56223f, 3.467028f, 91.15884f, 4.106424f, 97.25236f),
                    PathNode.CurveTo(4.74582f, 103.34588f, 9.87306f, 107.97912f, 16.0f, 108.0f),
                    PathNode.CurveTo(16.850084f, 108.00164f, 17.698017f, 107.914505f, 18.53f, 107.74f),
                    PathNode.LineTo(20.01f, 107.42f),
                    PathNode.LineTo(20.01f, 180.0f),
                    PathNode.LineTo(16.0f, 180.0f),
                    PathNode.CurveTo(9.372583f, 180.0f, 4.0f, 185.37259f, 4.0f, 192.0f),
                    PathNode.CurveTo(4.0f, 198.62741f, 9.372583f, 204.0f, 16.0f, 204.0f),
                    PathNode.LineTo(240.0f, 204.0f),
                    PathNode.CurveTo(246.62741f, 204.0f, 252.0f, 198.62741f, 252.0f, 192.0f),
                    PathNode.CurveTo(252.0f, 185.37259f, 246.62741f, 180.0f, 240.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 102.27f),
                    PathNode.LineTo(212.0f, 66.27f),
                    PathNode.LineTo(212.0f, 180.0f),
                    PathNode.LineTo(192.0f, 180.0f),
                    PathNode.LineTo(192.0f, 120.0f),
                    PathNode.CurveTo(192.0f, 113.37258f, 186.62741f, 108.0f, 180.0f, 108.0f),
                    PathNode.LineTo(76.0f, 108.0f),
                    PathNode.CurveTo(69.37258f, 108.0f, 64.0f, 113.37258f, 64.0f, 120.0f),
                    PathNode.LineTo(64.0f, 180.0f),
                    PathNode.LineTo(44.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 144.0f),
                    PathNode.LineTo(88.0f, 144.0f),
                    PathNode.LineTo(88.0f, 132.0f),
                    PathNode.LineTo(168.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 168.0f),
                    PathNode.LineTo(168.0f, 168.0f),
                    PathNode.LineTo(168.0f, 180.0f),
                    PathNode.LineTo(88.0f, 180.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _warehouse!!
    }

private var _warehouse: ImageVector? = null
