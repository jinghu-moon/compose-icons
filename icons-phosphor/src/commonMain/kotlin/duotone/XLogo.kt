package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.XLogo: ImageVector
    get() {
        if (_xLogo != null) return _xLogo!!
        _xLogo = phosphorDuotoneIcon(
            name = "XLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 216.0f),
                    PathNode.LineTo(160.0f, 216.0f),
                    PathNode.LineTo(48.0f, 40.0f),
                    PathNode.LineTo(96.0f, 40.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(214.75f, 211.71f),
                    PathNode.LineTo(152.15f, 113.33f),
                    PathNode.LineTo(213.92f, 45.38f),
                    PathNode.CurveTo(216.82726f, 42.102833f, 216.55795f, 37.0969f, 213.31587f, 34.15056f),
                    PathNode.CurveTo(210.0738f, 31.204214f, 205.065f, 31.413485f, 202.08f, 34.62f),
                    PathNode.LineTo(143.24f, 99.34f),
                    PathNode.LineTo(102.75f, 35.71f),
                    PathNode.CurveTo(101.28259f, 33.40029f, 98.73643f, 32.000847f, 96.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(45.078392f, 31.99858f, 42.38835f, 33.58994f, 40.982773f, 36.15122f),
                    PathNode.CurveTo(39.577194f, 38.712494f, 39.679634f, 41.83631f, 41.25f, 44.3f),
                    PathNode.LineTo(103.85f, 142.67f),
                    PathNode.LineTo(42.08f, 210.67f),
                    PathNode.CurveTo(40.116978f, 212.7787f, 39.439384f, 215.78001f, 40.30605f, 218.52756f),
                    PathNode.CurveTo(41.17271f, 221.27509f, 43.44975f, 223.34444f, 46.26741f, 223.94514f),
                    PathNode.CurveTo(49.085068f, 224.54585f, 52.008102f, 223.58516f, 53.92f, 221.43f),
                    PathNode.LineTo(112.76f, 156.71f),
                    PathNode.LineTo(153.25f, 220.34f),
                    PathNode.CurveTo(154.72923f, 222.63062f, 157.27328f, 224.01006f, 160.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(210.91835f, 223.9991f, 213.60466f, 222.40912f, 215.00954f, 219.85118f),
                    PathNode.CurveTo(216.41443f, 217.29326f, 216.31496f, 214.17326f, 214.75f, 211.71f),
                    PathNode.Close,
                    PathNode.MoveTo(164.39f, 208.0f),
                    PathNode.LineTo(62.57f, 48.0f),
                    PathNode.LineTo(91.57f, 48.0f),
                    PathNode.LineTo(193.43f, 208.0f),
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
        return _xLogo!!
    }

private var _xLogo: ImageVector? = null
