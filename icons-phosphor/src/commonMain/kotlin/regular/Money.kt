package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Money: ImageVector
    get() {
        if (_money != null) return _money!!
        _money = phosphorRegularIcon(
            name = "Money",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 88.0f),
                    PathNode.CurveTo(105.90861f, 88.0f, 88.0f, 105.90861f, 88.0f, 128.0f),
                    PathNode.CurveTo(88.0f, 150.09138f, 105.90861f, 168.0f, 128.0f, 168.0f),
                    PathNode.CurveTo(150.09138f, 168.0f, 168.0f, 150.09138f, 168.0f, 128.0f),
                    PathNode.CurveTo(168.0f, 105.90861f, 150.09138f, 88.0f, 128.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 152.0f),
                    PathNode.CurveTo(114.74516f, 152.0f, 104.0f, 141.25484f, 104.0f, 128.0f),
                    PathNode.CurveTo(104.0f, 114.74516f, 114.74516f, 104.0f, 128.0f, 104.0f),
                    PathNode.CurveTo(141.25484f, 104.0f, 152.0f, 114.74516f, 152.0f, 128.0f),
                    PathNode.CurveTo(152.0f, 141.25484f, 141.25484f, 152.0f, 128.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 56.0f),
                    PathNode.LineTo(16.0f, 56.0f),
                    PathNode.CurveTo(11.581722f, 56.0f, 8.0f, 59.581722f, 8.0f, 64.0f),
                    PathNode.LineTo(8.0f, 192.0f),
                    PathNode.CurveTo(8.0f, 196.41827f, 11.581722f, 200.0f, 16.0f, 200.0f),
                    PathNode.LineTo(240.0f, 200.0f),
                    PathNode.CurveTo(244.41827f, 200.0f, 248.0f, 196.41827f, 248.0f, 192.0f),
                    PathNode.LineTo(248.0f, 64.0f),
                    PathNode.CurveTo(248.0f, 59.581722f, 244.41827f, 56.0f, 240.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(193.65f, 184.0f),
                    PathNode.LineTo(62.35f, 184.0f),
                    PathNode.CurveTo(56.892666f, 165.5431f, 42.456898f, 151.10733f, 24.0f, 145.65f),
                    PathNode.LineTo(24.0f, 110.35f),
                    PathNode.CurveTo(42.456898f, 104.89266f, 56.892666f, 90.4569f, 62.35f, 72.0f),
                    PathNode.LineTo(193.65f, 72.0f),
                    PathNode.CurveTo(199.10733f, 90.4569f, 213.5431f, 104.89266f, 232.0f, 110.35f),
                    PathNode.LineTo(232.0f, 145.65f),
                    PathNode.CurveTo(213.5431f, 151.10733f, 199.10733f, 165.5431f, 193.65f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 93.37f),
                    PathNode.CurveTo(222.40437f, 89.24392f, 214.75607f, 81.59563f, 210.63f, 72.0f),
                    PathNode.LineTo(232.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(45.37f, 72.0f),
                    PathNode.CurveTo(41.243923f, 81.59563f, 33.595623f, 89.24392f, 24.0f, 93.37f),
                    PathNode.LineTo(24.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(24.0f, 162.63f),
                    PathNode.CurveTo(33.595623f, 166.75607f, 41.243923f, 174.40437f, 45.37f, 184.0f),
                    PathNode.LineTo(24.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.63f, 184.0f),
                    PathNode.CurveTo(214.75607f, 174.40437f, 222.40437f, 166.75607f, 232.0f, 162.63f),
                    PathNode.LineTo(232.0f, 184.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _money!!
    }

private var _money: ImageVector? = null
