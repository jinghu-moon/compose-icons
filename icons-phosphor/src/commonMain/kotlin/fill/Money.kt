package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Money: ImageVector
    get() {
        if (_money != null) return _money!!
        _money = phosphorFillIcon(
            name = "Money",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 128.0f),
                    PathNode.CurveTo(168.0f, 150.09138f, 150.09138f, 168.0f, 128.0f, 168.0f),
                    PathNode.CurveTo(105.90861f, 168.0f, 88.0f, 150.09138f, 88.0f, 128.0f),
                    PathNode.CurveTo(88.0f, 105.90861f, 105.90861f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(150.09138f, 88.0f, 168.0f, 105.90861f, 168.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(248.0f, 64.0f),
                    PathNode.LineTo(248.0f, 192.0f),
                    PathNode.CurveTo(248.0f, 196.41827f, 244.41827f, 200.0f, 240.0f, 200.0f),
                    PathNode.LineTo(16.0f, 200.0f),
                    PathNode.CurveTo(11.581722f, 200.0f, 8.0f, 196.41827f, 8.0f, 192.0f),
                    PathNode.LineTo(8.0f, 64.0f),
                    PathNode.CurveTo(8.0f, 59.581722f, 11.581722f, 56.0f, 16.0f, 56.0f),
                    PathNode.LineTo(240.0f, 56.0f),
                    PathNode.CurveTo(244.41827f, 56.0f, 248.0f, 59.581722f, 248.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 110.35f),
                    PathNode.CurveTo(213.5431f, 104.89266f, 199.10733f, 90.4569f, 193.65f, 72.0f),
                    PathNode.LineTo(62.35f, 72.0f),
                    PathNode.CurveTo(56.892666f, 90.4569f, 42.456898f, 104.89266f, 24.0f, 110.35f),
                    PathNode.LineTo(24.0f, 145.65f),
                    PathNode.CurveTo(42.456898f, 151.10733f, 56.892666f, 165.5431f, 62.35f, 184.0f),
                    PathNode.LineTo(193.65f, 184.0f),
                    PathNode.CurveTo(199.10733f, 165.5431f, 213.5431f, 151.10733f, 232.0f, 145.65f),
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
        return _money!!
    }

private var _money: ImageVector? = null
