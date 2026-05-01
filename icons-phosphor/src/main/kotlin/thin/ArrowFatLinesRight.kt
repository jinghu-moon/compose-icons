package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowFatLinesRight: ImageVector
    get() {
        if (_arrowFatLinesRight != null) return _arrowFatLinesRight!!
        _arrowFatLinesRight = phosphorThinIcon(
            name = "ArrowFatLinesRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(234.83f, 125.17f),
                    PathNode.LineTo(138.83f, 29.17f),
                    PathNode.CurveTo(137.68596f, 28.02468f, 135.96437f, 27.681837f, 134.46884f, 28.30151f),
                    PathNode.CurveTo(132.97331f, 28.92118f, 131.99873f, 30.381174f, 132.0f, 32.0f),
                    PathNode.LineTo(132.0f, 76.0f),
                    PathNode.LineTo(104.0f, 76.0f),
                    PathNode.CurveTo(101.79086f, 76.0f, 100.0f, 77.79086f, 100.0f, 80.0f),
                    PathNode.LineTo(100.0f, 176.0f),
                    PathNode.CurveTo(100.0f, 178.20914f, 101.79086f, 180.0f, 104.0f, 180.0f),
                    PathNode.LineTo(132.0f, 180.0f),
                    PathNode.LineTo(132.0f, 224.0f),
                    PathNode.CurveTo(131.9983f, 225.61966f, 132.97351f, 227.08047f, 134.47f, 227.7f),
                    PathNode.CurveTo(135.9655f, 228.31877f, 137.68651f, 227.97536f, 138.83f, 226.83f),
                    PathNode.LineTo(234.83f, 130.83f),
                    PathNode.CurveTo(235.58112f, 130.07973f, 236.00314f, 129.06163f, 236.00314f, 128.0f),
                    PathNode.CurveTo(236.00314f, 126.93836f, 235.58112f, 125.92027f, 234.83f, 125.17f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 214.34f),
                    PathNode.LineTo(140.0f, 176.0f),
                    PathNode.CurveTo(140.0f, 173.79086f, 138.20914f, 172.0f, 136.0f, 172.0f),
                    PathNode.LineTo(108.0f, 172.0f),
                    PathNode.LineTo(108.0f, 84.0f),
                    PathNode.LineTo(136.0f, 84.0f),
                    PathNode.CurveTo(138.20914f, 84.0f, 140.0f, 82.20914f, 140.0f, 80.0f),
                    PathNode.LineTo(140.0f, 41.66f),
                    PathNode.LineTo(226.34f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 80.0f),
                    PathNode.LineTo(44.0f, 176.0f),
                    PathNode.CurveTo(44.0f, 178.20914f, 42.20914f, 180.0f, 40.0f, 180.0f),
                    PathNode.CurveTo(37.79086f, 180.0f, 36.0f, 178.20914f, 36.0f, 176.0f),
                    PathNode.LineTo(36.0f, 80.0f),
                    PathNode.CurveTo(36.0f, 77.79086f, 37.79086f, 76.0f, 40.0f, 76.0f),
                    PathNode.CurveTo(42.20914f, 76.0f, 44.0f, 77.79086f, 44.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 80.0f),
                    PathNode.LineTo(76.0f, 176.0f),
                    PathNode.CurveTo(76.0f, 178.20914f, 74.20914f, 180.0f, 72.0f, 180.0f),
                    PathNode.CurveTo(69.79086f, 180.0f, 68.0f, 178.20914f, 68.0f, 176.0f),
                    PathNode.LineTo(68.0f, 80.0f),
                    PathNode.CurveTo(68.0f, 77.79086f, 69.79086f, 76.0f, 72.0f, 76.0f),
                    PathNode.CurveTo(74.20914f, 76.0f, 76.0f, 77.79086f, 76.0f, 80.0f),
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
        return _arrowFatLinesRight!!
    }

private var _arrowFatLinesRight: ImageVector? = null
