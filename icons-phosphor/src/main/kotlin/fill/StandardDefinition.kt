package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.StandardDefinition: ImageVector
    get() {
        if (_standardDefinition != null) return _standardDefinition!!
        _standardDefinition = phosphorFillIcon(
            name = "StandardDefinition",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 128.0f),
                    PathNode.CurveTo(192.0f, 145.67311f, 177.67311f, 160.0f, 160.0f, 160.0f),
                    PathNode.LineTo(152.0f, 160.0f),
                    PathNode.LineTo(152.0f, 96.0f),
                    PathNode.LineTo(160.0f, 96.0f),
                    PathNode.CurveTo(177.67311f, 96.0f, 192.0f, 110.32689f, 192.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 56.0f),
                    PathNode.LineTo(232.0f, 200.0f),
                    PathNode.CurveTo(232.0f, 208.83656f, 224.83656f, 216.0f, 216.0f, 216.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(31.163445f, 216.0f, 24.0f, 208.83656f, 24.0f, 200.0f),
                    PathNode.LineTo(24.0f, 56.0f),
                    PathNode.CurveTo(24.0f, 47.163445f, 31.163445f, 40.0f, 40.0f, 40.0f),
                    PathNode.LineTo(216.0f, 40.0f),
                    PathNode.CurveTo(224.83656f, 40.0f, 232.0f, 47.163445f, 232.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 148.0f),
                    PathNode.CurveTo(120.0f, 128.12f, 100.08f, 122.65f, 85.53f, 118.66f),
                    PathNode.CurveTo(73.47f, 115.35f, 65.53f, 112.82f, 65.53f, 108.0f),
                    PathNode.CurveTo(65.53f, 101.27f, 73.63f, 96.0f, 83.97f, 96.0f),
                    PathNode.CurveTo(91.97f, 96.0f, 98.82f, 99.13f, 101.39f, 104.0f),
                    PathNode.CurveTo(103.46383f, 107.90189f, 108.308105f, 109.38383f, 112.21f, 107.31f),
                    PathNode.CurveTo(116.11189f, 105.23617f, 117.59383f, 100.39189f, 115.52f, 96.49f),
                    PathNode.CurveTo(110.16f, 86.31f, 98.07f, 80.0f, 84.0f, 80.0f),
                    PathNode.CurveTo(64.36f, 80.0f, 49.56f, 92.0f, 49.56f, 108.0f),
                    PathNode.CurveTo(49.56f, 125.38f, 67.16f, 130.21f, 81.3f, 134.09f),
                    PathNode.CurveTo(97.3f, 138.48f, 104.0f, 141.39f, 104.0f, 148.0f),
                    PathNode.CurveTo(104.0f, 153.68f, 95.79f, 160.0f, 84.0f, 160.0f),
                    PathNode.CurveTo(72.21f, 160.0f, 64.0f, 153.68f, 64.0f, 148.0f),
                    PathNode.CurveTo(64.0f, 143.58173f, 60.418278f, 140.0f, 56.0f, 140.0f),
                    PathNode.CurveTo(51.581722f, 140.0f, 48.0f, 143.58173f, 48.0f, 148.0f),
                    PathNode.CurveTo(48.0f, 163.7f, 63.81f, 176.0f, 84.0f, 176.0f),
                    PathNode.CurveTo(104.19f, 176.0f, 120.0f, 163.7f, 120.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 128.0f),
                    PathNode.CurveTo(207.97244f, 101.501755f, 186.49825f, 80.02756f, 160.0f, 80.0f),
                    PathNode.LineTo(144.0f, 80.0f),
                    PathNode.CurveTo(139.58173f, 80.0f, 136.0f, 83.58172f, 136.0f, 88.0f),
                    PathNode.LineTo(136.0f, 168.0f),
                    PathNode.CurveTo(136.0f, 172.41827f, 139.58173f, 176.0f, 144.0f, 176.0f),
                    PathNode.LineTo(160.0f, 176.0f),
                    PathNode.CurveTo(186.49825f, 175.97244f, 207.97244f, 154.49825f, 208.0f, 128.0f),
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
        return _standardDefinition!!
    }

private var _standardDefinition: ImageVector? = null
