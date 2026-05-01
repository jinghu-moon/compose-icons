package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Eyeglasses: ImageVector
    get() {
        if (_eyeglasses != null) return _eyeglasses!!
        _eyeglasses = phosphorBoldIcon(
            name = "Eyeglasses",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 36.0f),
                    PathNode.CurveTo(193.37259f, 36.0f, 188.0f, 41.37258f, 188.0f, 48.0f),
                    PathNode.CurveTo(188.0f, 54.62742f, 193.37259f, 60.0f, 200.0f, 60.0f),
                    PathNode.CurveTo(206.62741f, 60.0f, 212.0f, 65.37258f, 212.0f, 72.0f),
                    PathNode.LineTo(212.0f, 122.46f),
                    PathNode.CurveTo(199.65392f, 115.30535f, 184.76236f, 114.022385f, 171.37447f, 118.95995f),
                    PathNode.CurveTo(157.98659f, 123.897514f, 147.4941f, 134.54234f, 142.75f, 148.0f),
                    PathNode.LineTo(113.25f, 148.0f),
                    PathNode.CurveTo(108.505905f, 134.54234f, 98.01341f, 123.897514f, 84.625534f, 118.95995f),
                    PathNode.CurveTo(71.237656f, 114.022385f, 56.34609f, 115.30535f, 44.0f, 122.46f),
                    PathNode.LineTo(44.0f, 72.0f),
                    PathNode.CurveTo(44.0f, 65.37258f, 49.37258f, 60.0f, 56.0f, 60.0f),
                    PathNode.CurveTo(62.62742f, 60.0f, 68.0f, 54.62742f, 68.0f, 48.0f),
                    PathNode.CurveTo(68.0f, 41.37258f, 62.62742f, 36.0f, 56.0f, 36.0f),
                    PathNode.CurveTo(36.11775f, 36.0f, 20.0f, 52.11775f, 20.0f, 72.0f),
                    PathNode.LineTo(20.0f, 164.0f),
                    PathNode.CurveTo(20.026379f, 188.93385f, 39.13903f, 209.69574f, 63.985546f, 211.78105f),
                    PathNode.CurveTo(88.83207f, 213.86636f, 111.13798f, 196.58066f, 115.32f, 172.0f),
                    PathNode.LineTo(140.68f, 172.0f),
                    PathNode.CurveTo(144.86203f, 196.58066f, 167.16792f, 213.86636f, 192.01445f, 211.78105f),
                    PathNode.CurveTo(216.86096f, 209.69574f, 235.97362f, 188.93385f, 236.0f, 164.0f),
                    PathNode.LineTo(236.0f, 72.0f),
                    PathNode.CurveTo(236.0f, 52.11775f, 219.88223f, 36.0f, 200.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 188.0f),
                    PathNode.CurveTo(54.745167f, 188.0f, 44.0f, 177.25484f, 44.0f, 164.0f),
                    PathNode.CurveTo(44.0f, 150.74516f, 54.745167f, 140.0f, 68.0f, 140.0f),
                    PathNode.CurveTo(81.25484f, 140.0f, 92.0f, 150.74516f, 92.0f, 164.0f),
                    PathNode.CurveTo(92.0f, 177.25484f, 81.25484f, 188.0f, 68.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 188.0f),
                    PathNode.CurveTo(174.74516f, 188.0f, 164.0f, 177.25484f, 164.0f, 164.0f),
                    PathNode.CurveTo(164.0f, 150.74516f, 174.74516f, 140.0f, 188.0f, 140.0f),
                    PathNode.CurveTo(201.25484f, 140.0f, 212.0f, 150.74516f, 212.0f, 164.0f),
                    PathNode.CurveTo(212.0f, 177.25484f, 201.25484f, 188.0f, 188.0f, 188.0f),
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
        return _eyeglasses!!
    }

private var _eyeglasses: ImageVector? = null
