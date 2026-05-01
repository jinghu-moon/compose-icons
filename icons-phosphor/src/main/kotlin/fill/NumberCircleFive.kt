package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberCircleFive: ImageVector
    get() {
        if (_numberCircleFive != null) return _numberCircleFive!!
        _numberCircleFive = phosphorFillIcon(
            name = "NumberCircleFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(124.0f, 112.0f),
                    PathNode.CurveTo(143.88223f, 112.0f, 160.0f, 128.11775f, 160.0f, 148.0f),
                    PathNode.CurveTo(160.0f, 167.88223f, 143.88223f, 184.0f, 124.0f, 184.0f),
                    PathNode.CurveTo(114.37521f, 184.15819f, 105.09792f, 180.40541f, 98.29f, 173.6f),
                    PathNode.CurveTo(96.208595f, 171.57591f, 95.38717f, 168.58304f, 96.14373f, 165.78003f),
                    PathNode.CurveTo(96.90029f, 162.97704f, 99.11607f, 160.80394f, 101.93326f, 160.10204f),
                    PathNode.CurveTo(104.75044f, 159.40013f, 107.726776f, 160.27962f, 109.71f, 162.4f),
                    PathNode.CurveTo(113.52231f, 166.1188f, 118.67609f, 168.13849f, 124.0f, 168.0f),
                    PathNode.CurveTo(135.0457f, 168.0f, 144.0f, 159.0457f, 144.0f, 148.0f),
                    PathNode.CurveTo(144.0f, 136.9543f, 135.0457f, 128.0f, 124.0f, 128.0f),
                    PathNode.CurveTo(118.67609f, 127.86151f, 113.52231f, 129.8812f, 109.71f, 133.6f),
                    PathNode.CurveTo(107.26411f, 136.09157f, 103.48491f, 136.70914f, 100.373116f, 135.1258f),
                    PathNode.CurveTo(97.26132f, 133.54243f, 95.53578f, 130.12392f, 96.11f, 126.68f),
                    PathNode.LineTo(104.11f, 78.68f),
                    PathNode.CurveTo(104.754944f, 74.82484f, 108.09126f, 72.00017f, 112.0f, 72.0f),
                    PathNode.LineTo(152.0f, 72.0f),
                    PathNode.CurveTo(156.41827f, 72.0f, 160.0f, 75.58172f, 160.0f, 80.0f),
                    PathNode.CurveTo(160.0f, 84.41828f, 156.41827f, 88.0f, 152.0f, 88.0f),
                    PathNode.LineTo(118.78f, 88.0f),
                    PathNode.LineTo(114.59f, 113.14f),
                    PathNode.CurveTo(117.66829f, 112.37685f, 120.82853f, 111.993996f, 124.0f, 112.0f),
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
        return _numberCircleFive!!
    }

private var _numberCircleFive: ImageVector? = null
