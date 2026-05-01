package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Intersect: ImageVector
    get() {
        if (_intersect != null) return _intersect!!
        _intersect = phosphorRegularIcon(
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
                    PathNode.MoveTo(100.69f, 136.0f),
                    PathNode.LineTo(120.0f, 155.31f),
                    PathNode.CurveTo(112.37957f, 158.41402f, 104.228355f, 160.0069f, 96.0f, 160.0f),
                    PathNode.CurveTo(95.9931f, 151.77165f, 97.58598f, 143.62044f, 100.69f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(134.44f, 147.13f),
                    PathNode.LineTo(108.87f, 121.56f),
                    PathNode.CurveTo(112.48946f, 116.760605f, 116.760605f, 112.48946f, 121.56f, 108.87f),
                    PathNode.LineTo(147.13f, 134.44f),
                    PathNode.CurveTo(143.51053f, 139.2394f, 139.2394f, 143.51053f, 134.44f, 147.13f),
                    PathNode.Close,
                    PathNode.MoveTo(155.31f, 120.0f),
                    PathNode.LineTo(136.0f, 100.69f),
                    PathNode.CurveTo(143.62044f, 97.58598f, 151.77165f, 95.9931f, 160.0f, 96.0f),
                    PathNode.CurveTo(160.0069f, 104.228355f, 158.41402f, 112.37957f, 155.31f, 120.0f),
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
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _intersect!!
    }

private var _intersect: ImageVector? = null
