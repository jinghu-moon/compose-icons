package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextB: ImageVector
    get() {
        if (_textB != null) return _textB!!
        _textB = phosphorThinIcon(
            name = "TextB",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(170.27f, 117.21f),
                    PathNode.CurveTo(184.88075f, 107.401024f, 191.36447f, 89.19522f, 186.24297f, 72.35893f),
                    PathNode.CurveTo(181.12148f, 55.52265f, 165.598f, 44.01128f, 148.0f, 44.0f),
                    PathNode.LineTo(80.0f, 44.0f),
                    PathNode.CurveTo(77.79086f, 44.0f, 76.0f, 45.79086f, 76.0f, 48.0f),
                    PathNode.LineTo(76.0f, 200.0f),
                    PathNode.CurveTo(76.0f, 202.20914f, 77.79086f, 204.0f, 80.0f, 204.0f),
                    PathNode.LineTo(160.0f, 204.0f),
                    PathNode.CurveTo(182.30896f, 204.0113f, 201.09587f, 187.32492f, 203.71744f, 165.17052f),
                    PathNode.CurveTo(206.339f, 143.01613f, 191.96547f, 122.40581f, 170.27f, 117.21f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 52.0f),
                    PathNode.LineTo(148.0f, 52.0f),
                    PathNode.CurveTo(165.67311f, 52.0f, 180.0f, 66.32689f, 180.0f, 84.0f),
                    PathNode.CurveTo(180.0f, 101.67311f, 165.67311f, 116.0f, 148.0f, 116.0f),
                    PathNode.LineTo(84.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 196.0f),
                    PathNode.LineTo(84.0f, 196.0f),
                    PathNode.LineTo(84.0f, 124.0f),
                    PathNode.LineTo(160.0f, 124.0f),
                    PathNode.CurveTo(179.88223f, 124.0f, 196.0f, 140.11777f, 196.0f, 160.0f),
                    PathNode.CurveTo(196.0f, 179.88223f, 179.88223f, 196.0f, 160.0f, 196.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _textB!!
    }

private var _textB: ImageVector? = null
