package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AnchorSimple: ImageVector
    get() {
        if (_anchorSimple != null) return _anchorSimple!!
        _anchorSimple = phosphorThinIcon(
            name = "AnchorSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 116.0f),
                    PathNode.LineTo(200.0f, 116.0f),
                    PathNode.CurveTo(197.79086f, 116.0f, 196.0f, 117.79086f, 196.0f, 120.0f),
                    PathNode.CurveTo(196.0f, 122.20914f, 197.79086f, 124.0f, 200.0f, 124.0f),
                    PathNode.LineTo(219.91f, 124.0f),
                    PathNode.CurveTo(217.77362f, 171.63838f, 179.63838f, 209.77362f, 132.0f, 211.91f),
                    PathNode.LineTo(132.0f, 91.71f),
                    PathNode.CurveTo(146.53531f, 89.61201f, 156.97981f, 76.64027f, 155.92812f, 61.99204f),
                    PathNode.CurveTo(154.87642f, 47.34381f, 142.68594f, 35.99719f, 128.0f, 35.99719f),
                    PathNode.CurveTo(113.314064f, 35.99719f, 101.12358f, 47.34381f, 100.07189f, 61.99204f),
                    PathNode.CurveTo(99.020195f, 76.64027f, 109.46469f, 89.61201f, 124.0f, 91.71f),
                    PathNode.LineTo(124.0f, 211.91f),
                    PathNode.CurveTo(76.36161f, 209.77362f, 38.226383f, 171.63838f, 36.09f, 124.0f),
                    PathNode.LineTo(56.0f, 124.0f),
                    PathNode.CurveTo(58.20914f, 124.0f, 60.0f, 122.20914f, 60.0f, 120.0f),
                    PathNode.CurveTo(60.0f, 117.79086f, 58.20914f, 116.0f, 56.0f, 116.0f),
                    PathNode.LineTo(32.0f, 116.0f),
                    PathNode.CurveTo(29.790861f, 116.0f, 28.0f, 117.79086f, 28.0f, 120.0f),
                    PathNode.CurveTo(28.0f, 175.22847f, 72.77152f, 220.0f, 128.0f, 220.0f),
                    PathNode.CurveTo(183.22847f, 220.0f, 228.0f, 175.22847f, 228.0f, 120.0f),
                    PathNode.CurveTo(228.0f, 117.79086f, 226.20914f, 116.0f, 224.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 64.0f),
                    PathNode.CurveTo(108.0f, 52.954304f, 116.95431f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(139.0457f, 44.0f, 148.0f, 52.954304f, 148.0f, 64.0f),
                    PathNode.CurveTo(148.0f, 75.04569f, 139.0457f, 84.0f, 128.0f, 84.0f),
                    PathNode.CurveTo(116.95431f, 84.0f, 108.0f, 75.04569f, 108.0f, 64.0f),
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
        return _anchorSimple!!
    }

private var _anchorSimple: ImageVector? = null
