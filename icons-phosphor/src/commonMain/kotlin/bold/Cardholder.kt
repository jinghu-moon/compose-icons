package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Cardholder: ImageVector
    get() {
        if (_cardholder != null) return _cardholder!!
        _cardholder = phosphorBoldIcon(
            name = "Cardholder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 44.0f),
                    PathNode.LineTo(48.0f, 44.0f),
                    PathNode.CurveTo(32.536026f, 44.0f, 20.0f, 56.53603f, 20.0f, 72.0f),
                    PathNode.LineTo(20.0f, 184.0f),
                    PathNode.CurveTo(20.0f, 199.46397f, 32.536026f, 212.0f, 48.0f, 212.0f),
                    PathNode.LineTo(208.0f, 212.0f),
                    PathNode.CurveTo(223.46397f, 212.0f, 236.0f, 199.46397f, 236.0f, 184.0f),
                    PathNode.LineTo(236.0f, 72.0f),
                    PathNode.CurveTo(236.0f, 56.53603f, 223.46397f, 44.0f, 208.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 68.0f),
                    PathNode.LineTo(208.0f, 68.0f),
                    PathNode.CurveTo(210.20914f, 68.0f, 212.0f, 69.79086f, 212.0f, 72.0f),
                    PathNode.LineTo(212.0f, 88.0f),
                    PathNode.LineTo(160.0f, 88.0f),
                    PathNode.CurveTo(153.37259f, 88.0f, 148.0f, 93.37258f, 148.0f, 100.0f),
                    PathNode.CurveTo(148.0f, 111.04569f, 139.0457f, 120.0f, 128.0f, 120.0f),
                    PathNode.CurveTo(116.95431f, 120.0f, 108.0f, 111.04569f, 108.0f, 100.0f),
                    PathNode.CurveTo(108.0f, 93.37258f, 102.62742f, 88.0f, 96.0f, 88.0f),
                    PathNode.LineTo(44.0f, 88.0f),
                    PathNode.LineTo(44.0f, 72.0f),
                    PathNode.CurveTo(44.0f, 69.79086f, 45.79086f, 68.0f, 48.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 188.0f),
                    PathNode.LineTo(48.0f, 188.0f),
                    PathNode.CurveTo(45.79086f, 188.0f, 44.0f, 186.20914f, 44.0f, 184.0f),
                    PathNode.LineTo(44.0f, 112.0f),
                    PathNode.LineTo(85.66f, 112.0f),
                    PathNode.CurveTo(91.01734f, 130.94698f, 108.31018f, 144.02818f, 128.0f, 144.02818f),
                    PathNode.CurveTo(147.68982f, 144.02818f, 164.98267f, 130.94698f, 170.34f, 112.0f),
                    PathNode.LineTo(212.0f, 112.0f),
                    PathNode.LineTo(212.0f, 184.0f),
                    PathNode.CurveTo(212.0f, 186.20914f, 210.20914f, 188.0f, 208.0f, 188.0f),
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
        return _cardholder!!
    }

private var _cardholder: ImageVector? = null
