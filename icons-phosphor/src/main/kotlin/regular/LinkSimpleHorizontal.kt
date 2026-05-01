package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.LinkSimpleHorizontal: ImageVector
    get() {
        if (_linkSimpleHorizontal != null) return _linkSimpleHorizontal!!
        _linkSimpleHorizontal = phosphorRegularIcon(
            name = "LinkSimpleHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(80.0f, 120.0f),
                    PathNode.LineTo(176.0f, 120.0f),
                    PathNode.CurveTo(180.41827f, 120.0f, 184.0f, 123.58172f, 184.0f, 128.0f),
                    PathNode.CurveTo(184.0f, 132.41827f, 180.41827f, 136.0f, 176.0f, 136.0f),
                    PathNode.LineTo(80.0f, 136.0f),
                    PathNode.CurveTo(75.58172f, 136.0f, 72.0f, 132.41827f, 72.0f, 128.0f),
                    PathNode.CurveTo(72.0f, 123.58172f, 75.58172f, 120.0f, 80.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 168.0f),
                    PathNode.LineTo(64.0f, 168.0f),
                    PathNode.CurveTo(41.90861f, 168.0f, 24.0f, 150.09138f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 105.90861f, 41.90861f, 88.0f, 64.0f, 88.0f),
                    PathNode.LineTo(104.0f, 88.0f),
                    PathNode.CurveTo(108.41828f, 88.0f, 112.0f, 84.41828f, 112.0f, 80.0f),
                    PathNode.CurveTo(112.0f, 75.58172f, 108.41828f, 72.0f, 104.0f, 72.0f),
                    PathNode.LineTo(64.0f, 72.0f),
                    PathNode.CurveTo(33.072056f, 72.0f, 8.0f, 97.07206f, 8.0f, 128.0f),
                    PathNode.CurveTo(8.0f, 158.92795f, 33.072056f, 184.0f, 64.0f, 184.0f),
                    PathNode.LineTo(104.0f, 184.0f),
                    PathNode.CurveTo(108.41828f, 184.0f, 112.0f, 180.41827f, 112.0f, 176.0f),
                    PathNode.CurveTo(112.0f, 171.58173f, 108.41828f, 168.0f, 104.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 72.0f),
                    PathNode.LineTo(152.0f, 72.0f),
                    PathNode.CurveTo(147.58173f, 72.0f, 144.0f, 75.58172f, 144.0f, 80.0f),
                    PathNode.CurveTo(144.0f, 84.41828f, 147.58173f, 88.0f, 152.0f, 88.0f),
                    PathNode.LineTo(192.0f, 88.0f),
                    PathNode.CurveTo(214.09138f, 88.0f, 232.0f, 105.90861f, 232.0f, 128.0f),
                    PathNode.CurveTo(232.0f, 150.09138f, 214.09138f, 168.0f, 192.0f, 168.0f),
                    PathNode.LineTo(152.0f, 168.0f),
                    PathNode.CurveTo(147.58173f, 168.0f, 144.0f, 171.58173f, 144.0f, 176.0f),
                    PathNode.CurveTo(144.0f, 180.41827f, 147.58173f, 184.0f, 152.0f, 184.0f),
                    PathNode.LineTo(192.0f, 184.0f),
                    PathNode.CurveTo(222.92795f, 184.0f, 248.0f, 158.92795f, 248.0f, 128.0f),
                    PathNode.CurveTo(248.0f, 97.07206f, 222.92795f, 72.0f, 192.0f, 72.0f),
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
        return _linkSimpleHorizontal!!
    }

private var _linkSimpleHorizontal: ImageVector? = null
