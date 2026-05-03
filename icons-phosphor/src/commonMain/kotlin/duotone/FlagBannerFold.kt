package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FlagBannerFold: ImageVector
    get() {
        if (_flagBannerFold != null) return _flagBannerFold!!
        _flagBannerFold = phosphorDuotoneIcon(
            name = "FlagBannerFold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(141.09f, 72.0f),
                    PathNode.LineTo(101.09f, 160.0f),
                    PathNode.LineTo(28.0f, 160.0f),
                    PathNode.LineTo(68.0f, 116.0f),
                    PathNode.LineTo(28.0f, 72.0f),
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
                    PathNode.MoveTo(238.73f, 43.67f),
                    PathNode.CurveTo(237.25696f, 41.381554f, 234.72154f, 39.998943f, 232.0f, 40.0f),
                    PathNode.LineTo(152.0f, 40.0f),
                    PathNode.CurveTo(148.86382f, 40.001225f, 146.0176f, 41.834846f, 144.72f, 44.69f),
                    PathNode.LineTo(135.94f, 64.0f),
                    PathNode.LineTo(28.0f, 64.0f),
                    PathNode.CurveTo(24.83394f, 64.000305f, 21.965921f, 65.86775f, 20.684883f, 68.76307f),
                    PathNode.CurveTo(19.403845f, 71.658394f, 19.950825f, 75.036804f, 22.08f, 77.38f),
                    PathNode.LineTo(57.19f, 116.0f),
                    PathNode.LineTo(22.08f, 154.62f),
                    PathNode.CurveTo(19.950825f, 156.9632f, 19.403845f, 160.34161f, 20.684883f, 163.23692f),
                    PathNode.CurveTo(21.965921f, 166.13223f, 24.83394f, 167.9997f, 28.0f, 168.0f),
                    PathNode.LineTo(101.09f, 168.0f),
                    PathNode.CurveTo(104.22618f, 167.99878f, 107.0724f, 166.16515f, 108.37f, 163.31f),
                    PathNode.LineTo(117.15f, 144.0f),
                    PathNode.LineTo(179.58f, 144.0f),
                    PathNode.LineTo(144.72f, 220.69f),
                    PathNode.CurveTo(143.4458f, 223.30508f, 143.69154f, 226.40573f, 145.36177f, 228.78746f),
                    PathNode.CurveTo(147.032f, 231.16917f, 149.86345f, 232.45656f, 152.7562f, 232.14948f),
                    PathNode.CurveTo(155.64894f, 231.8424f, 158.14702f, 229.9893f, 159.28f, 227.31f),
                    PathNode.LineTo(239.28f, 51.31f),
                    PathNode.CurveTo(240.407f, 48.835358f, 240.19983f, 45.9577f, 238.73f, 43.67f),
                    PathNode.Close,
                    PathNode.MoveTo(95.94f, 152.0f),
                    PathNode.LineTo(46.08f, 152.0f),
                    PathNode.LineTo(73.92f, 121.38f),
                    PathNode.CurveTo(76.6923f, 118.32904f, 76.6923f, 113.67096f, 73.92f, 110.62f),
                    PathNode.LineTo(46.08f, 80.0f),
                    PathNode.LineTo(128.67f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(186.85f, 128.0f),
                    PathNode.LineTo(124.42f, 128.0f),
                    PathNode.LineTo(157.15f, 56.0f),
                    PathNode.LineTo(219.58f, 56.0f),
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
        return _flagBannerFold!!
    }

private var _flagBannerFold: ImageVector? = null
