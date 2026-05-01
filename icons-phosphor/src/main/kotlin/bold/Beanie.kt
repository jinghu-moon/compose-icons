package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Beanie: ImageVector
    get() {
        if (_beanie != null) return _beanie!!
        _beanie = phosphorBoldIcon(
            name = "Beanie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 160.0f),
                    PathNode.LineTo(228.0f, 144.0f),
                    PathNode.CurveTo(227.9469f, 100.1437f, 199.37111f, 61.421307f, 157.48f, 48.44f),
                    PathNode.CurveTo(163.10812f, 35.050064f, 159.01222f, 19.548979f, 147.50438f, 10.686935f),
                    PathNode.CurveTo(135.99655f, 1.824892f, 119.963455f, 1.824892f, 108.45562f, 10.686935f),
                    PathNode.CurveTo(96.94777f, 19.548979f, 92.85187f, 35.050064f, 98.48f, 48.44f),
                    PathNode.CurveTo(56.60473f, 61.435596f, 28.047663f, 100.15457f, 28.0f, 144.0f),
                    PathNode.LineTo(28.0f, 160.0f),
                    PathNode.CurveTo(22.963882f, 163.77708f, 20.0f, 169.70485f, 20.0f, 176.0f),
                    PathNode.LineTo(20.0f, 208.0f),
                    PathNode.CurveTo(20.0f, 219.0457f, 28.954306f, 228.0f, 40.0f, 228.0f),
                    PathNode.LineTo(216.0f, 228.0f),
                    PathNode.CurveTo(227.0457f, 228.0f, 236.0f, 219.0457f, 236.0f, 208.0f),
                    PathNode.LineTo(236.0f, 176.0f),
                    PathNode.CurveTo(236.0f, 169.70485f, 233.03612f, 163.77708f, 228.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 36.0f),
                    PathNode.CurveTo(120.0f, 31.581722f, 123.58172f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(132.41827f, 28.0f, 136.0f, 31.581722f, 136.0f, 36.0f),
                    PathNode.CurveTo(136.0f, 40.418278f, 132.41827f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(123.58172f, 44.0f, 120.0f, 40.418278f, 120.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 68.0f),
                    PathNode.CurveTo(169.95538f, 68.04409f, 203.9559f, 102.04464f, 204.0f, 144.0f),
                    PathNode.LineTo(204.0f, 156.0f),
                    PathNode.LineTo(52.0f, 156.0f),
                    PathNode.LineTo(52.0f, 144.0f),
                    PathNode.CurveTo(52.044098f, 102.04464f, 86.04464f, 68.04409f, 128.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 180.0f),
                    PathNode.LineTo(116.0f, 204.0f),
                    PathNode.LineTo(84.0f, 204.0f),
                    PathNode.LineTo(84.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 180.0f),
                    PathNode.LineTo(172.0f, 180.0f),
                    PathNode.LineTo(172.0f, 204.0f),
                    PathNode.LineTo(140.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 180.0f),
                    PathNode.LineTo(60.0f, 180.0f),
                    PathNode.LineTo(60.0f, 204.0f),
                    PathNode.LineTo(44.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 204.0f),
                    PathNode.LineTo(196.0f, 204.0f),
                    PathNode.LineTo(196.0f, 180.0f),
                    PathNode.LineTo(212.0f, 180.0f),
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
        return _beanie!!
    }

private var _beanie: ImageVector? = null
