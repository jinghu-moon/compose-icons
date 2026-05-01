package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberSquareSix: ImageVector
    get() {
        if (_numberSquareSix != null) return _numberSquareSix!!
        _numberSquareSix = phosphorThinIcon(
            name = "NumberSquareSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 36.0f),
                    PathNode.LineTo(48.0f, 36.0f),
                    PathNode.CurveTo(41.37258f, 36.0f, 36.0f, 41.37258f, 36.0f, 48.0f),
                    PathNode.LineTo(36.0f, 208.0f),
                    PathNode.CurveTo(36.0f, 214.62741f, 41.37258f, 220.0f, 48.0f, 220.0f),
                    PathNode.LineTo(208.0f, 220.0f),
                    PathNode.CurveTo(214.62741f, 220.0f, 220.0f, 214.62741f, 220.0f, 208.0f),
                    PathNode.LineTo(220.0f, 48.0f),
                    PathNode.CurveTo(220.0f, 41.37258f, 214.62741f, 36.0f, 208.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 208.0f),
                    PathNode.CurveTo(212.0f, 210.20914f, 210.20914f, 212.0f, 208.0f, 212.0f),
                    PathNode.LineTo(48.0f, 212.0f),
                    PathNode.CurveTo(45.79086f, 212.0f, 44.0f, 210.20914f, 44.0f, 208.0f),
                    PathNode.LineTo(44.0f, 48.0f),
                    PathNode.CurveTo(44.0f, 45.79086f, 45.79086f, 44.0f, 48.0f, 44.0f),
                    PathNode.LineTo(208.0f, 44.0f),
                    PathNode.CurveTo(210.20914f, 44.0f, 212.0f, 45.79086f, 212.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 116.0f),
                    PathNode.CurveTo(124.691055f, 116.00079f, 121.40216f, 116.51353f, 118.25f, 117.52f),
                    PathNode.LineTo(139.43f, 82.05f),
                    PathNode.CurveTo(140.44333f, 80.166336f, 139.79547f, 77.8188f, 137.95946f, 76.72148f),
                    PathNode.CurveTo(136.12346f, 75.62416f, 133.74907f, 76.1654f, 132.57f, 77.95f),
                    PathNode.LineTo(100.33f, 131.95f),
                    PathNode.CurveTo(93.06234f, 144.48564f, 95.12507f, 160.34045f, 105.35831f, 170.59921f),
                    PathNode.CurveTo(115.591545f, 180.85797f, 131.44118f, 182.96019f, 143.9949f, 175.72377f),
                    PathNode.CurveTo(156.5486f, 168.48735f, 162.67308f, 153.71844f, 158.92456f, 139.72168f),
                    PathNode.CurveTo(155.17601f, 125.7249f, 142.49004f, 115.99371f, 128.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 172.0f),
                    PathNode.CurveTo(114.74516f, 172.0f, 104.0f, 161.25484f, 104.0f, 148.0f),
                    PathNode.CurveTo(104.0f, 134.74516f, 114.74516f, 124.0f, 128.0f, 124.0f),
                    PathNode.CurveTo(141.25484f, 124.0f, 152.0f, 134.74516f, 152.0f, 148.0f),
                    PathNode.CurveTo(152.0f, 161.25484f, 141.25484f, 172.0f, 128.0f, 172.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _numberSquareSix!!
    }

private var _numberSquareSix: ImageVector? = null
