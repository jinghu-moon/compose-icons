package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ListHeart: ImageVector
    get() {
        if (_listHeart != null) return _listHeart!!
        _listHeart = phosphorFillIcon(
            name = "ListHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 184.0f),
                    PathNode.LineTo(64.0f, 184.0f),
                    PathNode.CurveTo(59.581722f, 184.0f, 56.0f, 180.41827f, 56.0f, 176.0f),
                    PathNode.CurveTo(56.0f, 171.58173f, 59.581722f, 168.0f, 64.0f, 168.0f),
                    PathNode.LineTo(104.0f, 168.0f),
                    PathNode.CurveTo(108.41828f, 168.0f, 112.0f, 171.58173f, 112.0f, 176.0f),
                    PathNode.CurveTo(112.0f, 180.41827f, 108.41828f, 184.0f, 104.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 128.0f),
                    PathNode.CurveTo(56.0f, 123.58172f, 59.581722f, 120.0f, 64.0f, 120.0f),
                    PathNode.LineTo(96.0f, 120.0f),
                    PathNode.CurveTo(100.41828f, 120.0f, 104.0f, 123.58172f, 104.0f, 128.0f),
                    PathNode.CurveTo(104.0f, 132.41827f, 100.41828f, 136.0f, 96.0f, 136.0f),
                    PathNode.LineTo(64.0f, 136.0f),
                    PathNode.CurveTo(59.581722f, 136.0f, 56.0f, 132.41827f, 56.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(161.79f, 185.58f),
                    PathNode.CurveTo(160.66327f, 186.14381f, 159.33673f, 186.14381f, 158.21f, 185.58f),
                    PathNode.CurveTo(156.65f, 184.8f, 120.0f, 166.17f, 120.0f, 140.0f),
                    PathNode.CurveTo(120.003975f, 130.40675f, 126.223694f, 121.922134f, 135.3711f, 119.031555f),
                    PathNode.CurveTo(144.5185f, 116.14098f, 154.48427f, 119.51099f, 160.0f, 127.36f),
                    PathNode.CurveTo(165.51573f, 119.51099f, 175.4815f, 116.14098f, 184.6289f, 119.031555f),
                    PathNode.CurveTo(193.7763f, 121.922134f, 199.99603f, 130.40675f, 200.0f, 140.0f),
                    PathNode.CurveTo(200.0f, 166.17f, 163.35f, 184.8f, 161.79f, 185.58f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 88.0f),
                    PathNode.LineTo(64.0f, 88.0f),
                    PathNode.CurveTo(59.581722f, 88.0f, 56.0f, 84.41828f, 56.0f, 80.0f),
                    PathNode.CurveTo(56.0f, 75.58172f, 59.581722f, 72.0f, 64.0f, 72.0f),
                    PathNode.LineTo(192.0f, 72.0f),
                    PathNode.CurveTo(196.41827f, 72.0f, 200.0f, 75.58172f, 200.0f, 80.0f),
                    PathNode.CurveTo(200.0f, 84.41828f, 196.41827f, 88.0f, 192.0f, 88.0f),
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
        return _listHeart!!
    }

private var _listHeart: ImageVector? = null
