package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MouseMiddleClick: ImageVector
    get() {
        if (_mouseMiddleClick != null) return _mouseMiddleClick!!
        _mouseMiddleClick = phosphorThinIcon(
            name = "MouseMiddleClick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(144.0f, 20.0f),
                    PathNode.LineTo(112.0f, 20.0f),
                    PathNode.CurveTo(78.87891f, 20.038574f, 52.038574f, 46.878906f, 52.0f, 80.0f),
                    PathNode.LineTo(52.0f, 176.0f),
                    PathNode.CurveTo(52.038574f, 209.1211f, 78.87891f, 235.96143f, 112.0f, 236.0f),
                    PathNode.LineTo(144.0f, 236.0f),
                    PathNode.CurveTo(177.1211f, 235.96143f, 203.96143f, 209.1211f, 204.0f, 176.0f),
                    PathNode.LineTo(204.0f, 80.0f),
                    PathNode.CurveTo(203.96143f, 46.878906f, 177.1211f, 20.038574f, 144.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 80.0f),
                    PathNode.LineTo(196.0f, 108.0f),
                    PathNode.LineTo(148.0f, 108.0f),
                    PathNode.LineTo(148.0f, 88.0f),
                    PathNode.CurveTo(148.0f, 81.37258f, 142.62741f, 76.0f, 136.0f, 76.0f),
                    PathNode.LineTo(132.0f, 76.0f),
                    PathNode.LineTo(132.0f, 28.0f),
                    PathNode.LineTo(144.0f, 28.0f),
                    PathNode.CurveTo(172.7051f, 28.033064f, 195.96693f, 51.2949f, 196.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 88.0f),
                    PathNode.CurveTo(116.0f, 85.79086f, 117.79086f, 84.0f, 120.0f, 84.0f),
                    PathNode.LineTo(136.0f, 84.0f),
                    PathNode.CurveTo(138.20914f, 84.0f, 140.0f, 85.79086f, 140.0f, 88.0f),
                    PathNode.LineTo(140.0f, 136.0f),
                    PathNode.CurveTo(140.0f, 138.20914f, 138.20914f, 140.0f, 136.0f, 140.0f),
                    PathNode.LineTo(120.0f, 140.0f),
                    PathNode.CurveTo(117.79086f, 140.0f, 116.0f, 138.20914f, 116.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 28.0f),
                    PathNode.LineTo(124.0f, 28.0f),
                    PathNode.LineTo(124.0f, 76.0f),
                    PathNode.LineTo(120.0f, 76.0f),
                    PathNode.CurveTo(113.37258f, 76.0f, 108.0f, 81.37258f, 108.0f, 88.0f),
                    PathNode.LineTo(108.0f, 108.0f),
                    PathNode.LineTo(60.0f, 108.0f),
                    PathNode.LineTo(60.0f, 80.0f),
                    PathNode.CurveTo(60.033066f, 51.2949f, 83.2949f, 28.033064f, 112.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 228.0f),
                    PathNode.LineTo(112.0f, 228.0f),
                    PathNode.CurveTo(83.2949f, 227.96693f, 60.033066f, 204.7051f, 60.0f, 176.0f),
                    PathNode.LineTo(60.0f, 116.0f),
                    PathNode.LineTo(108.0f, 116.0f),
                    PathNode.LineTo(108.0f, 136.0f),
                    PathNode.CurveTo(108.0f, 142.62741f, 113.37258f, 148.0f, 120.0f, 148.0f),
                    PathNode.LineTo(136.0f, 148.0f),
                    PathNode.CurveTo(142.62741f, 148.0f, 148.0f, 142.62741f, 148.0f, 136.0f),
                    PathNode.LineTo(148.0f, 116.0f),
                    PathNode.LineTo(196.0f, 116.0f),
                    PathNode.LineTo(196.0f, 176.0f),
                    PathNode.CurveTo(195.96693f, 204.7051f, 172.7051f, 227.96693f, 144.0f, 228.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _mouseMiddleClick!!
    }

private var _mouseMiddleClick: ImageVector? = null
