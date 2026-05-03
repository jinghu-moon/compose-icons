package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HighDefinition: ImageVector
    get() {
        if (_highDefinition != null) return _highDefinition!!
        _highDefinition = phosphorFillIcon(
            name = "HighDefinition",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(196.0f, 128.0f),
                    PathNode.CurveTo(196.0f, 145.67311f, 181.67311f, 160.0f, 164.0f, 160.0f),
                    PathNode.LineTo(152.0f, 160.0f),
                    PathNode.LineTo(152.0f, 96.0f),
                    PathNode.LineTo(164.0f, 96.0f),
                    PathNode.CurveTo(181.67311f, 96.0f, 196.0f, 110.32689f, 196.0f, 128.0f),
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
                    PathNode.MoveTo(120.0f, 88.0f),
                    PathNode.CurveTo(120.0f, 83.58172f, 116.41828f, 80.0f, 112.0f, 80.0f),
                    PathNode.CurveTo(107.58172f, 80.0f, 104.0f, 83.58172f, 104.0f, 88.0f),
                    PathNode.LineTo(104.0f, 120.0f),
                    PathNode.LineTo(64.0f, 120.0f),
                    PathNode.LineTo(64.0f, 88.0f),
                    PathNode.CurveTo(64.0f, 83.58172f, 60.418278f, 80.0f, 56.0f, 80.0f),
                    PathNode.CurveTo(51.581722f, 80.0f, 48.0f, 83.58172f, 48.0f, 88.0f),
                    PathNode.LineTo(48.0f, 168.0f),
                    PathNode.CurveTo(48.0f, 172.41827f, 51.581722f, 176.0f, 56.0f, 176.0f),
                    PathNode.CurveTo(60.418278f, 176.0f, 64.0f, 172.41827f, 64.0f, 168.0f),
                    PathNode.LineTo(64.0f, 136.0f),
                    PathNode.LineTo(104.0f, 136.0f),
                    PathNode.LineTo(104.0f, 168.0f),
                    PathNode.CurveTo(104.0f, 172.41827f, 107.58172f, 176.0f, 112.0f, 176.0f),
                    PathNode.CurveTo(116.41828f, 176.0f, 120.0f, 172.41827f, 120.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 128.0f),
                    PathNode.CurveTo(211.97244f, 101.501755f, 190.49825f, 80.02756f, 164.0f, 80.0f),
                    PathNode.LineTo(144.0f, 80.0f),
                    PathNode.CurveTo(139.58173f, 80.0f, 136.0f, 83.58172f, 136.0f, 88.0f),
                    PathNode.LineTo(136.0f, 168.0f),
                    PathNode.CurveTo(136.0f, 172.41827f, 139.58173f, 176.0f, 144.0f, 176.0f),
                    PathNode.LineTo(164.0f, 176.0f),
                    PathNode.CurveTo(190.49825f, 175.97244f, 211.97244f, 154.49825f, 212.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _highDefinition!!
    }

private var _highDefinition: ImageVector? = null
