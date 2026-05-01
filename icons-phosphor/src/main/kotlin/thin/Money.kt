package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Money: ImageVector
    get() {
        if (_money != null) return _money!!
        _money = phosphorThinIcon(
            name = "Money",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 164.0f),
                    PathNode.CurveTo(147.88223f, 164.0f, 164.0f, 147.88223f, 164.0f, 128.0f),
                    PathNode.CurveTo(164.0f, 108.11775f, 147.88223f, 92.0f, 128.0f, 92.0f),
                    PathNode.CurveTo(108.11775f, 92.0f, 92.0f, 108.11775f, 92.0f, 128.0f),
                    PathNode.CurveTo(92.0f, 147.88223f, 108.11775f, 164.0f, 128.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 100.0f),
                    PathNode.CurveTo(143.46397f, 100.0f, 156.0f, 112.536026f, 156.0f, 128.0f),
                    PathNode.CurveTo(156.0f, 143.46397f, 143.46397f, 156.0f, 128.0f, 156.0f),
                    PathNode.CurveTo(112.536026f, 156.0f, 100.0f, 143.46397f, 100.0f, 128.0f),
                    PathNode.CurveTo(100.0f, 112.536026f, 112.536026f, 100.0f, 128.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 60.0f),
                    PathNode.LineTo(16.0f, 60.0f),
                    PathNode.CurveTo(13.790861f, 60.0f, 12.0f, 61.79086f, 12.0f, 64.0f),
                    PathNode.LineTo(12.0f, 192.0f),
                    PathNode.CurveTo(12.0f, 194.20914f, 13.790861f, 196.0f, 16.0f, 196.0f),
                    PathNode.LineTo(240.0f, 196.0f),
                    PathNode.CurveTo(242.20914f, 196.0f, 244.0f, 194.20914f, 244.0f, 192.0f),
                    PathNode.LineTo(244.0f, 64.0f),
                    PathNode.CurveTo(244.0f, 61.79086f, 242.20914f, 60.0f, 240.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(20.0f, 107.26f),
                    PathNode.CurveTo(39.472332f, 102.67635f, 54.676353f, 87.47233f, 59.26f, 68.0f),
                    PathNode.LineTo(196.74f, 68.0f),
                    PathNode.CurveTo(201.32365f, 87.47233f, 216.52766f, 102.67635f, 236.0f, 107.26f),
                    PathNode.LineTo(236.0f, 148.74f),
                    PathNode.CurveTo(216.52766f, 153.32365f, 201.32365f, 168.52766f, 196.74f, 188.0f),
                    PathNode.LineTo(59.26f, 188.0f),
                    PathNode.CurveTo(54.676353f, 168.52766f, 39.472332f, 153.32365f, 20.0f, 148.74f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 99.0f),
                    PathNode.CurveTo(220.97113f, 94.7739f, 209.22609f, 83.02888f, 205.0f, 68.0f),
                    PathNode.LineTo(236.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(51.0f, 68.0f),
                    PathNode.CurveTo(46.773903f, 83.02888f, 35.028877f, 94.7739f, 20.0f, 99.0f),
                    PathNode.LineTo(20.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(20.0f, 157.0f),
                    PathNode.CurveTo(35.028877f, 161.22609f, 46.773903f, 172.97113f, 51.0f, 188.0f),
                    PathNode.LineTo(20.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(205.0f, 188.0f),
                    PathNode.CurveTo(209.22609f, 172.97113f, 220.97113f, 161.22609f, 236.0f, 157.0f),
                    PathNode.LineTo(236.0f, 188.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _money!!
    }

private var _money: ImageVector? = null
