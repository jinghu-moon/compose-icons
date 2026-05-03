package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BaseballHelmet: ImageVector
    get() {
        if (_baseballHelmet != null) return _baseballHelmet!!
        _baseballHelmet = phosphorBoldIcon(
            name = "BaseballHelmet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(120.0f, 156.0f),
                    PathNode.CurveTo(120.0f, 138.32689f, 105.67311f, 124.0f, 88.0f, 124.0f),
                    PathNode.CurveTo(70.32689f, 124.0f, 56.0f, 138.32689f, 56.0f, 156.0f),
                    PathNode.CurveTo(56.0f, 173.67311f, 70.32689f, 188.0f, 88.0f, 188.0f),
                    PathNode.CurveTo(105.67311f, 188.0f, 120.0f, 173.67311f, 120.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 156.0f),
                    PathNode.CurveTo(80.0f, 151.58173f, 83.58172f, 148.0f, 88.0f, 148.0f),
                    PathNode.CurveTo(92.41828f, 148.0f, 96.0f, 151.58173f, 96.0f, 156.0f),
                    PathNode.CurveTo(96.0f, 160.41827f, 92.41828f, 164.0f, 88.0f, 164.0f),
                    PathNode.CurveTo(83.58172f, 164.0f, 80.0f, 160.41827f, 80.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(244.0f, 116.0f),
                    PathNode.LineTo(227.34f, 116.0f),
                    PathNode.CurveTo(221.01036f, 59.007874f, 171.24461f, 16.898127f, 113.990906f, 20.088636f),
                    PathNode.CurveTo(56.737198f, 23.279146f, 11.958233f, 70.65748f, 12.0f, 128.0f),
                    PathNode.LineTo(12.0f, 152.0f),
                    PathNode.CurveTo(12.044094f, 193.95538f, 46.044636f, 227.9559f, 88.0f, 228.0f),
                    PathNode.LineTo(128.0f, 228.0f),
                    PathNode.CurveTo(169.95538f, 227.9559f, 203.9559f, 193.95538f, 204.0f, 152.0f),
                    PathNode.LineTo(204.0f, 140.0f),
                    PathNode.LineTo(244.0f, 140.0f),
                    PathNode.CurveTo(250.62741f, 140.0f, 256.0f, 134.62741f, 256.0f, 128.0f),
                    PathNode.CurveTo(256.0f, 121.37258f, 250.62741f, 116.0f, 244.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 152.0f),
                    PathNode.LineTo(36.0f, 128.0f),
                    PathNode.CurveTo(35.957672f, 83.91101f, 70.0091f, 47.2921f, 113.984924f, 44.134995f),
                    PathNode.CurveTo(157.96075f, 40.977894f, 196.89389f, 72.35711f, 203.15f, 116.0f),
                    PathNode.LineTo(152.0f, 116.0f),
                    PathNode.CurveTo(145.37259f, 116.0f, 140.0f, 121.37258f, 140.0f, 128.0f),
                    PathNode.LineTo(140.0f, 152.0f),
                    PathNode.CurveTo(140.0f, 180.71881f, 116.7188f, 204.0f, 88.0f, 204.0f),
                    PathNode.CurveTo(59.281193f, 204.0f, 36.0f, 180.71881f, 36.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 152.0f),
                    PathNode.CurveTo(179.9748f, 173.63718f, 166.57124f, 193.00407f, 146.33f, 200.65f),
                    PathNode.CurveTo(157.75856f, 187.01628f, 164.0152f, 169.79016f, 164.0f, 152.0f),
                    PathNode.LineTo(164.0f, 140.0f),
                    PathNode.LineTo(180.0f, 140.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _baseballHelmet!!
    }

private var _baseballHelmet: ImageVector? = null
