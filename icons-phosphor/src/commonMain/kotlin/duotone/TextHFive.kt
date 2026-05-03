package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TextHFive: ImageVector
    get() {
        if (_textHFive != null) return _textHFive!!
        _textHFive = phosphorDuotoneIcon(
            name = "TextHFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 72.0f),
                    PathNode.LineTo(240.0f, 192.0f),
                    PathNode.CurveTo(240.0f, 200.83656f, 232.83656f, 208.0f, 224.0f, 208.0f),
                    PathNode.LineTo(56.0f, 208.0f),
                    PathNode.CurveTo(47.163445f, 208.0f, 40.0f, 200.83656f, 40.0f, 192.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.LineTo(224.0f, 56.0f),
                    PathNode.CurveTo(232.83656f, 56.0f, 240.0f, 63.163445f, 240.0f, 72.0f),
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
                    PathNode.MoveTo(152.0f, 56.0f),
                    PathNode.LineTo(152.0f, 176.0f),
                    PathNode.CurveTo(152.0f, 180.41827f, 148.41827f, 184.0f, 144.0f, 184.0f),
                    PathNode.CurveTo(139.58173f, 184.0f, 136.0f, 180.41827f, 136.0f, 176.0f),
                    PathNode.LineTo(136.0f, 124.0f),
                    PathNode.LineTo(48.0f, 124.0f),
                    PathNode.LineTo(48.0f, 176.0f),
                    PathNode.CurveTo(48.0f, 180.41827f, 44.418278f, 184.0f, 40.0f, 184.0f),
                    PathNode.CurveTo(35.581722f, 184.0f, 32.0f, 180.41827f, 32.0f, 176.0f),
                    PathNode.LineTo(32.0f, 56.0f),
                    PathNode.CurveTo(32.0f, 51.581722f, 35.581722f, 48.0f, 40.0f, 48.0f),
                    PathNode.CurveTo(44.418278f, 48.0f, 48.0f, 51.581722f, 48.0f, 56.0f),
                    PathNode.LineTo(48.0f, 108.0f),
                    PathNode.LineTo(136.0f, 108.0f),
                    PathNode.LineTo(136.0f, 56.0f),
                    PathNode.CurveTo(136.0f, 51.581722f, 139.58173f, 48.0f, 144.0f, 48.0f),
                    PathNode.CurveTo(148.41827f, 48.0f, 152.0f, 51.581722f, 152.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 144.0f),
                    PathNode.CurveTo(208.82854f, 143.99399f, 205.66829f, 144.37685f, 202.59f, 145.14f),
                    PathNode.LineTo(206.78f, 120.0f),
                    PathNode.LineTo(240.0f, 120.0f),
                    PathNode.CurveTo(244.41827f, 120.0f, 248.0f, 116.41828f, 248.0f, 112.0f),
                    PathNode.CurveTo(248.0f, 107.58172f, 244.41827f, 104.0f, 240.0f, 104.0f),
                    PathNode.LineTo(200.0f, 104.0f),
                    PathNode.CurveTo(196.09126f, 104.00017f, 192.75494f, 106.82484f, 192.11f, 110.68f),
                    PathNode.LineTo(184.11f, 158.68f),
                    PathNode.CurveTo(183.53578f, 162.12392f, 185.26132f, 165.54243f, 188.37311f, 167.1258f),
                    PathNode.CurveTo(191.48491f, 168.70914f, 195.26411f, 168.09157f, 197.71f, 165.6f),
                    PathNode.CurveTo(201.52231f, 161.8812f, 206.67609f, 159.86151f, 212.0f, 160.0f),
                    PathNode.CurveTo(223.0457f, 160.0f, 232.0f, 168.9543f, 232.0f, 180.0f),
                    PathNode.CurveTo(232.0f, 191.0457f, 223.0457f, 200.0f, 212.0f, 200.0f),
                    PathNode.CurveTo(206.67609f, 200.13849f, 201.52231f, 198.1188f, 197.71f, 194.4f),
                    PathNode.CurveTo(195.72679f, 192.27962f, 192.75044f, 191.40013f, 189.93326f, 192.10204f),
                    PathNode.CurveTo(187.11607f, 192.80394f, 184.90028f, 194.97704f, 184.14372f, 197.78003f),
                    PathNode.CurveTo(183.38716f, 200.58304f, 184.20859f, 203.57591f, 186.29f, 205.6f),
                    PathNode.CurveTo(193.09793f, 212.40541f, 202.37521f, 216.15819f, 212.0f, 216.0f),
                    PathNode.CurveTo(231.88223f, 216.0f, 248.0f, 199.88223f, 248.0f, 180.0f),
                    PathNode.CurveTo(248.0f, 160.11777f, 231.88223f, 144.0f, 212.0f, 144.0f),
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
        return _textHFive!!
    }

private var _textHFive: ImageVector? = null
