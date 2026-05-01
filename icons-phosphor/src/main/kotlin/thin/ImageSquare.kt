package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ImageSquare: ImageVector
    get() {
        if (_imageSquare != null) return _imageSquare!!
        _imageSquare = phosphorThinIcon(
            name = "ImageSquare",
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
                    PathNode.MoveTo(44.0f, 208.0f),
                    PathNode.LineTo(44.0f, 48.0f),
                    PathNode.CurveTo(44.0f, 45.79086f, 45.79086f, 44.0f, 48.0f, 44.0f),
                    PathNode.LineTo(208.0f, 44.0f),
                    PathNode.CurveTo(210.20914f, 44.0f, 212.0f, 45.79086f, 212.0f, 48.0f),
                    PathNode.LineTo(212.0f, 135.0f),
                    PathNode.LineTo(180.49f, 103.48f),
                    PathNode.CurveTo(178.23837f, 101.22054f, 175.17982f, 99.95054f, 171.99f, 99.95054f),
                    PathNode.CurveTo(168.80019f, 99.95054f, 165.74162f, 101.22054f, 163.49f, 103.48f),
                    PathNode.LineTo(55.0f, 212.0f),
                    PathNode.LineTo(48.0f, 212.0f),
                    PathNode.CurveTo(45.79086f, 212.0f, 44.0f, 210.20914f, 44.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 212.0f),
                    PathNode.LineTo(66.34f, 212.0f),
                    PathNode.LineTo(169.17f, 109.17f),
                    PathNode.CurveTo(169.92027f, 108.418884f, 170.93837f, 107.99686f, 172.0f, 107.99686f),
                    PathNode.CurveTo(173.06163f, 107.99686f, 174.07973f, 108.418884f, 174.83f, 109.17f),
                    PathNode.LineTo(212.0f, 146.34f),
                    PathNode.LineTo(212.0f, 208.0f),
                    PathNode.CurveTo(212.0f, 210.20914f, 210.20914f, 212.0f, 208.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 116.0f),
                    PathNode.CurveTo(107.04569f, 116.0f, 116.0f, 107.04569f, 116.0f, 96.0f),
                    PathNode.CurveTo(116.0f, 84.95431f, 107.04569f, 76.0f, 96.0f, 76.0f),
                    PathNode.CurveTo(84.95431f, 76.0f, 76.0f, 84.95431f, 76.0f, 96.0f),
                    PathNode.CurveTo(76.0f, 107.04569f, 84.95431f, 116.0f, 96.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 84.0f),
                    PathNode.CurveTo(102.62742f, 84.0f, 108.0f, 89.37258f, 108.0f, 96.0f),
                    PathNode.CurveTo(108.0f, 102.62742f, 102.62742f, 108.0f, 96.0f, 108.0f),
                    PathNode.CurveTo(89.37258f, 108.0f, 84.0f, 102.62742f, 84.0f, 96.0f),
                    PathNode.CurveTo(84.0f, 89.37258f, 89.37258f, 84.0f, 96.0f, 84.0f),
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
        return _imageSquare!!
    }

private var _imageSquare: ImageVector? = null
