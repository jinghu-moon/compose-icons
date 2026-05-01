package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Handbag: ImageVector
    get() {
        if (_handbag != null) return _handbag!!
        _handbag = phosphorBoldIcon(
            name = "Handbag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(243.86f, 197.65f),
                    PathNode.LineTo(229.61f, 77.65f),
                    PathNode.CurveTo(228.38983f, 67.56718f, 219.82637f, 59.987198f, 209.67f, 60.0f),
                    PathNode.LineTo(179.83f, 60.0f),
                    PathNode.CurveTo(177.6413f, 32.99884f, 155.08972f, 12.201322f, 128.0f, 12.201322f),
                    PathNode.CurveTo(100.91028f, 12.201322f, 78.3587f, 32.99884f, 76.17f, 60.0f),
                    PathNode.LineTo(46.33f, 60.0f),
                    PathNode.CurveTo(36.173622f, 59.987198f, 27.610176f, 67.56718f, 26.39f, 77.65f),
                    PathNode.LineTo(12.14f, 197.65f),
                    PathNode.CurveTo(11.466988f, 203.3377f, 13.264697f, 209.04103f, 17.077593f, 213.31476f),
                    PathNode.CurveTo(20.89049f, 217.5885f, 26.352657f, 220.02249f, 32.08f, 220.0f),
                    PathNode.LineTo(223.92f, 220.0f),
                    PathNode.CurveTo(229.64734f, 220.02249f, 235.10953f, 217.5885f, 238.92241f, 213.31476f),
                    PathNode.CurveTo(242.7353f, 209.04103f, 244.533f, 203.3377f, 243.86f, 197.65f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 36.0f),
                    PathNode.CurveTo(141.91772f, 36.0014f, 153.72176f, 46.22503f, 155.71f, 60.0f),
                    PathNode.LineTo(100.29f, 60.0f),
                    PathNode.CurveTo(102.27825f, 46.22503f, 114.08228f, 36.0014f, 128.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.5f, 196.0f),
                    PathNode.LineTo(49.81f, 84.0f),
                    PathNode.LineTo(76.0f, 84.0f),
                    PathNode.LineTo(76.0f, 104.0f),
                    PathNode.CurveTo(76.0f, 110.62742f, 81.37258f, 116.0f, 88.0f, 116.0f),
                    PathNode.CurveTo(94.62742f, 116.0f, 100.0f, 110.62742f, 100.0f, 104.0f),
                    PathNode.LineTo(100.0f, 84.0f),
                    PathNode.LineTo(156.0f, 84.0f),
                    PathNode.LineTo(156.0f, 104.0f),
                    PathNode.CurveTo(156.0f, 110.62742f, 161.37259f, 116.0f, 168.0f, 116.0f),
                    PathNode.CurveTo(174.62741f, 116.0f, 180.0f, 110.62742f, 180.0f, 104.0f),
                    PathNode.LineTo(180.0f, 84.0f),
                    PathNode.LineTo(206.19f, 84.0f),
                    PathNode.LineTo(219.5f, 196.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _handbag!!
    }

private var _handbag: ImageVector? = null
