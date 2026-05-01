package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.XLogo: ImageVector
    get() {
        if (_xLogo != null) return _xLogo!!
        _xLogo = phosphorFillIcon(
            name = "XLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(215.0f, 219.85f),
                    PathNode.CurveTo(213.59708f, 222.4054f, 210.91518f, 223.99538f, 208.0f, 224.0f),
                    PathNode.LineTo(160.0f, 224.0f),
                    PathNode.CurveTo(157.26357f, 223.99916f, 154.7174f, 222.59972f, 153.25f, 220.29f),
                    PathNode.LineTo(112.76f, 156.66f),
                    PathNode.LineTo(53.92f, 221.38f),
                    PathNode.CurveTo(50.934998f, 224.58652f, 45.926197f, 224.79579f, 42.68412f, 221.84944f),
                    PathNode.CurveTo(39.442047f, 218.90309f, 39.172737f, 213.89717f, 42.08f, 210.62f),
                    PathNode.LineTo(103.85f, 142.62f),
                    PathNode.LineTo(41.25f, 44.3f),
                    PathNode.CurveTo(39.679634f, 41.83631f, 39.577194f, 38.712494f, 40.982773f, 36.15122f),
                    PathNode.CurveTo(42.38835f, 33.58994f, 45.078392f, 31.99858f, 48.0f, 32.0f),
                    PathNode.LineTo(96.0f, 32.0f),
                    PathNode.CurveTo(98.73643f, 32.000847f, 101.28259f, 33.40029f, 102.75f, 35.71f),
                    PathNode.LineTo(143.24f, 99.34f),
                    PathNode.LineTo(202.08f, 34.62f),
                    PathNode.CurveTo(205.065f, 31.413485f, 210.0738f, 31.204214f, 213.31587f, 34.15056f),
                    PathNode.CurveTo(216.55795f, 37.0969f, 216.82726f, 42.102833f, 213.92f, 45.38f),
                    PathNode.LineTo(152.15f, 113.33f),
                    PathNode.LineTo(214.75f, 211.71f),
                    PathNode.CurveTo(216.3115f, 214.17473f, 216.4073f, 217.2941f, 215.0f, 219.85f),
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
        return _xLogo!!
    }

private var _xLogo: ImageVector? = null
