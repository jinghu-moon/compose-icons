package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Intersect: ImageVector
    get() {
        if (_intersect != null) return _intersect!!
        _intersect = phosphorFillIcon(
            name = "Intersect",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(174.63f, 81.37f),
                    PathNode.CurveTo(167.25375f, 41.643192f, 131.41199f, 13.653009f, 91.081825f, 16.12408f),
                    PathNode.CurveTo(50.751663f, 18.595154f, 18.595154f, 50.751663f, 16.12408f, 91.081825f),
                    PathNode.CurveTo(13.653009f, 131.41199f, 41.643192f, 167.25375f, 81.37f, 174.63f),
                    PathNode.CurveTo(88.74625f, 214.35681f, 124.58801f, 242.34698f, 164.91817f, 239.87592f),
                    PathNode.CurveTo(205.24834f, 237.40485f, 237.40485f, 205.24834f, 239.87592f, 164.91817f),
                    PathNode.CurveTo(242.34698f, 124.58801f, 214.35681f, 88.74625f, 174.63f, 81.37f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 96.0f),
                    PathNode.CurveTo(31.936466f, 63.723f, 55.9177f, 36.44989f, 87.93764f, 32.383865f),
                    PathNode.CurveTo(119.957565f, 28.317842f, 149.99426f, 48.731533f, 158.0f, 80.0f),
                    PathNode.CurveTo(115.40238f, 81.11942f, 81.142105f, 115.40167f, 80.05f, 158.0f),
                    PathNode.CurveTo(51.783897f, 150.68594f, 32.029987f, 125.19704f, 32.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 224.0f),
                    PathNode.CurveTo(130.81737f, 223.97592f, 105.333206f, 204.24626f, 98.0f, 176.0f),
                    PathNode.CurveTo(140.61714f, 174.90672f, 174.90672f, 140.61714f, 176.0f, 98.0f),
                    PathNode.CurveTo(207.26846f, 106.00573f, 227.68216f, 136.04243f, 223.61613f, 168.06236f),
                    PathNode.CurveTo(219.55011f, 200.0823f, 192.277f, 224.06354f, 160.0f, 224.0f),
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
        return _intersect!!
    }

private var _intersect: ImageVector? = null
