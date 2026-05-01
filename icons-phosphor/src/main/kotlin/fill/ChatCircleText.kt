package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChatCircleText: ImageVector
    get() {
        if (_chatCircleText != null) return _chatCircleText!!
        _chatCircleText = phosphorFillIcon(
            name = "ChatCircleText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(91.476974f, 23.992031f, 57.626514f, 43.143078f, 38.82172f, 74.452995f),
                    PathNode.CurveTo(20.016926f, 105.76292f, 19.014177f, 144.64235f, 36.18f, 176.88f),
                    PathNode.LineTo(24.83f, 210.93f),
                    PathNode.CurveTo(22.912483f, 216.67986f, 24.408623f, 223.0196f, 28.694513f, 227.30548f),
                    PathNode.CurveTo(32.980404f, 231.59138f, 39.320145f, 233.08752f, 45.07f, 231.17f),
                    PathNode.LineTo(79.12f, 219.82f),
                    PathNode.CurveTo(117.32672f, 240.14143f, 164.12462f, 234.68008f, 196.6253f, 206.10704f),
                    PathNode.CurveTo(229.126f, 177.53398f, 240.53671f, 131.82114f, 225.27657f, 91.326164f),
                    PathNode.CurveTo(210.01642f, 50.8312f, 171.27486f, 24.01775f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 152.0f),
                    PathNode.LineTo(96.0f, 152.0f),
                    PathNode.CurveTo(91.58172f, 152.0f, 88.0f, 148.41827f, 88.0f, 144.0f),
                    PathNode.CurveTo(88.0f, 139.58173f, 91.58172f, 136.0f, 96.0f, 136.0f),
                    PathNode.LineTo(160.0f, 136.0f),
                    PathNode.CurveTo(164.41827f, 136.0f, 168.0f, 139.58173f, 168.0f, 144.0f),
                    PathNode.CurveTo(168.0f, 148.41827f, 164.41827f, 152.0f, 160.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 120.0f),
                    PathNode.LineTo(96.0f, 120.0f),
                    PathNode.CurveTo(91.58172f, 120.0f, 88.0f, 116.41828f, 88.0f, 112.0f),
                    PathNode.CurveTo(88.0f, 107.58172f, 91.58172f, 104.0f, 96.0f, 104.0f),
                    PathNode.LineTo(160.0f, 104.0f),
                    PathNode.CurveTo(164.41827f, 104.0f, 168.0f, 107.58172f, 168.0f, 112.0f),
                    PathNode.CurveTo(168.0f, 116.41828f, 164.41827f, 120.0f, 160.0f, 120.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _chatCircleText!!
    }

private var _chatCircleText: ImageVector? = null
