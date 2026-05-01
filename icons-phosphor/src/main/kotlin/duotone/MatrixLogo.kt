package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MatrixLogo: ImageVector
    get() {
        if (_matrixLogo != null) return _matrixLogo!!
        _matrixLogo = phosphorDuotoneIcon(
            name = "MatrixLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(72.0f, 216.0f),
                    PathNode.CurveTo(72.0f, 220.41827f, 68.41828f, 224.0f, 64.0f, 224.0f),
                    PathNode.LineTo(40.0f, 224.0f),
                    PathNode.CurveTo(35.581722f, 224.0f, 32.0f, 220.41827f, 32.0f, 216.0f),
                    PathNode.LineTo(32.0f, 40.0f),
                    PathNode.CurveTo(32.0f, 35.581722f, 35.581722f, 32.0f, 40.0f, 32.0f),
                    PathNode.LineTo(64.0f, 32.0f),
                    PathNode.CurveTo(68.41828f, 32.0f, 72.0f, 35.581722f, 72.0f, 40.0f),
                    PathNode.CurveTo(72.0f, 44.418278f, 68.41828f, 48.0f, 64.0f, 48.0f),
                    PathNode.LineTo(48.0f, 48.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(64.0f, 208.0f),
                    PathNode.CurveTo(68.41828f, 208.0f, 72.0f, 211.58173f, 72.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 32.0f),
                    PathNode.LineTo(192.0f, 32.0f),
                    PathNode.CurveTo(187.58173f, 32.0f, 184.0f, 35.581722f, 184.0f, 40.0f),
                    PathNode.CurveTo(184.0f, 44.418278f, 187.58173f, 48.0f, 192.0f, 48.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.LineTo(192.0f, 208.0f),
                    PathNode.CurveTo(187.58173f, 208.0f, 184.0f, 211.58173f, 184.0f, 216.0f),
                    PathNode.CurveTo(184.0f, 220.41827f, 187.58173f, 224.0f, 192.0f, 224.0f),
                    PathNode.LineTo(216.0f, 224.0f),
                    PathNode.CurveTo(220.41827f, 224.0f, 224.0f, 220.41827f, 224.0f, 216.0f),
                    PathNode.LineTo(224.0f, 40.0f),
                    PathNode.CurveTo(224.0f, 35.581722f, 220.41827f, 32.0f, 216.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 120.0f),
                    PathNode.CurveTo(183.98505f, 106.69795f, 175.74246f, 94.79235f, 163.29688f, 90.09637f),
                    PathNode.CurveTo(150.8513f, 85.40038f, 136.79848f, 88.89345f, 128.0f, 98.87f),
                    PathNode.CurveTo(117.74f, 87.176704f, 100.5463f, 84.57928f, 87.29f, 92.72f),
                    PathNode.CurveTo(85.73894f, 89.28815f, 82.00432f, 87.402824f, 78.32201f, 88.19276f),
                    PathNode.CurveTo(74.639694f, 88.98268f, 72.006966f, 92.233925f, 72.0f, 96.0f),
                    PathNode.LineTo(72.0f, 160.0f),
                    PathNode.CurveTo(72.0f, 164.41827f, 75.58172f, 168.0f, 80.0f, 168.0f),
                    PathNode.CurveTo(84.41828f, 168.0f, 88.0f, 164.41827f, 88.0f, 160.0f),
                    PathNode.LineTo(88.0f, 120.0f),
                    PathNode.CurveTo(88.0f, 111.163445f, 95.163445f, 104.0f, 104.0f, 104.0f),
                    PathNode.CurveTo(112.836555f, 104.0f, 120.0f, 111.163445f, 120.0f, 120.0f),
                    PathNode.LineTo(120.0f, 160.0f),
                    PathNode.CurveTo(120.0f, 164.41827f, 123.58172f, 168.0f, 128.0f, 168.0f),
                    PathNode.CurveTo(132.41827f, 168.0f, 136.0f, 164.41827f, 136.0f, 160.0f),
                    PathNode.LineTo(136.0f, 120.0f),
                    PathNode.CurveTo(136.0f, 111.163445f, 143.16344f, 104.0f, 152.0f, 104.0f),
                    PathNode.CurveTo(160.83656f, 104.0f, 168.0f, 111.163445f, 168.0f, 120.0f),
                    PathNode.LineTo(168.0f, 160.0f),
                    PathNode.CurveTo(168.0f, 164.41827f, 171.58173f, 168.0f, 176.0f, 168.0f),
                    PathNode.CurveTo(180.41827f, 168.0f, 184.0f, 164.41827f, 184.0f, 160.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _matrixLogo!!
    }

private var _matrixLogo: ImageVector? = null
