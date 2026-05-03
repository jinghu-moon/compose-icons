package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GoogleChromeLogo: ImageVector
    get() {
        if (_googleChromeLogo != null) return _googleChromeLogo!!
        _googleChromeLogo = phosphorBoldIcon(
            name = "GoogleChromeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(68.35325f, 20.0f, 20.0f, 68.35325f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 187.64676f, 68.35325f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(187.64676f, 236.0f, 236.0f, 187.64676f, 236.0f, 128.0f),
                    PathNode.CurveTo(235.93387f, 68.38066f, 187.61934f, 20.066133f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 44.0f),
                    PathNode.CurveTo(153.70963f, 44.004997f, 177.99736f, 55.79874f, 193.9f, 76.0f),
                    PathNode.LineTo(128.0f, 76.0f),
                    PathNode.CurveTo(108.58554f, 76.01753f, 90.79445f, 86.83868f, 81.85f, 104.07f),
                    PathNode.LineTo(64.18f, 73.47f),
                    PathNode.CurveTo(80.107506f, 54.769848f, 103.43619f, 43.99742f, 128.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 128.0f),
                    PathNode.CurveTo(156.0f, 143.46397f, 143.46397f, 156.0f, 128.0f, 156.0f),
                    PathNode.CurveTo(112.536026f, 156.0f, 100.0f, 143.46397f, 100.0f, 128.0f),
                    PathNode.CurveTo(100.0f, 112.536026f, 112.536026f, 100.0f, 128.0f, 100.0f),
                    PathNode.CurveTo(143.46397f, 100.0f, 156.0f, 112.536026f, 156.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 128.0f),
                    PathNode.CurveTo(43.99402f, 117.3419f, 46.030758f, 106.78142f, 50.0f, 96.89f),
                    PathNode.LineTo(83.0f, 154.0f),
                    PathNode.CurveTo(83.06f, 154.11f, 83.14f, 154.2f, 83.2f, 154.3f),
                    PathNode.CurveTo(92.52278f, 170.20149f, 109.567116f, 179.97916f, 128.0f, 180.0f),
                    PathNode.QuadTo(129.19f, 180.0f, 130.34f, 179.94f),
                    PathNode.LineTo(112.66f, 210.57f),
                    PathNode.CurveTo(72.897095f, 203.13557f, 44.056335f, 168.4519f, 44.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.05f, 211.12f),
                    PathNode.LineTo(173.0f, 154.0f),
                    PathNode.CurveTo(173.09f, 153.85f, 173.16f, 153.7f, 173.24f, 153.54f),
                    PathNode.CurveTo(182.73123f, 136.80638f, 182.16907f, 116.191505f, 171.78f, 100.0f),
                    PathNode.LineTo(207.18f, 100.0f),
                    PathNode.CurveTo(215.57635f, 123.701836f, 212.90627f, 149.91928f, 199.90405f, 171.44179f),
                    PathNode.CurveTo(186.90184f, 192.9643f, 164.93681f, 207.52525f, 140.05f, 211.12f),
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
        return _googleChromeLogo!!
    }

private var _googleChromeLogo: ImageVector? = null
