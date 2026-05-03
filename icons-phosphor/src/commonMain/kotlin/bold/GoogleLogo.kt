package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GoogleLogo: ImageVector
    get() {
        if (_googleLogo != null) return _googleLogo!!
        _googleLogo = phosphorBoldIcon(
            name = "GoogleLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 128.0f),
                    PathNode.CurveTo(227.9976f, 176.60794f, 193.04231f, 218.17393f, 145.15498f, 226.5126f),
                    PathNode.CurveTo(97.26762f, 234.85127f, 50.31991f, 207.54715f, 33.887527f, 161.80101f),
                    PathNode.CurveTo(17.45515f, 116.054886f, 36.298134f, 65.1182f, 78.545944f, 41.0796f),
                    PathNode.CurveTo(120.79375f, 17.041004f, 174.20831f, 26.863836f, 205.14f, 64.36f),
                    PathNode.CurveTo(209.35945f, 69.4714f, 208.6364f, 77.035545f, 203.525f, 81.255f),
                    PathNode.CurveTo(198.4136f, 85.47446f, 190.84946f, 84.7514f, 186.63f, 79.64f),
                    PathNode.CurveTo(163.84322f, 52.016636f, 124.8653f, 44.046955f, 93.06453f, 60.50899f),
                    PathNode.CurveTo(61.263752f, 76.97102f, 45.268402f, 113.39825f, 54.668102f, 147.95158f),
                    PathNode.CurveTo(64.0678f, 182.50493f, 96.312195f, 205.80928f, 132.06993f, 203.89307f),
                    PathNode.CurveTo(167.82768f, 201.97685f, 197.39687f, 175.36f, 203.05f, 140.0f),
                    PathNode.LineTo(128.0f, 140.0f),
                    PathNode.CurveTo(121.37258f, 140.0f, 116.0f, 134.62741f, 116.0f, 128.0f),
                    PathNode.CurveTo(116.0f, 121.37258f, 121.37258f, 116.0f, 128.0f, 116.0f),
                    PathNode.LineTo(216.0f, 116.0f),
                    PathNode.CurveTo(222.62741f, 116.0f, 228.0f, 121.37258f, 228.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _googleLogo!!
    }

private var _googleLogo: ImageVector? = null
