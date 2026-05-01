package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowFatLinesDown: ImageVector
    get() {
        if (_arrowFatLinesDown != null) return _arrowFatLinesDown!!
        _arrowFatLinesDown = phosphorThinIcon(
            name = "ArrowFatLinesDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(227.7f, 134.47f),
                    PathNode.CurveTo(227.08047f, 132.97351f, 225.61966f, 131.9983f, 224.0f, 132.0f),
                    PathNode.LineTo(180.0f, 132.0f),
                    PathNode.LineTo(180.0f, 104.0f),
                    PathNode.CurveTo(180.0f, 101.79086f, 178.20914f, 100.0f, 176.0f, 100.0f),
                    PathNode.LineTo(80.0f, 100.0f),
                    PathNode.CurveTo(77.79086f, 100.0f, 76.0f, 101.79086f, 76.0f, 104.0f),
                    PathNode.LineTo(76.0f, 132.0f),
                    PathNode.LineTo(32.0f, 132.0f),
                    PathNode.CurveTo(30.381174f, 131.99873f, 28.92118f, 132.97331f, 28.30151f, 134.46884f),
                    PathNode.CurveTo(27.681837f, 135.96437f, 28.02468f, 137.68596f, 29.17f, 138.83f),
                    PathNode.LineTo(125.17f, 234.83f),
                    PathNode.CurveTo(125.92027f, 235.58112f, 126.93836f, 236.00314f, 128.0f, 236.00314f),
                    PathNode.CurveTo(129.06163f, 236.00314f, 130.07973f, 235.58112f, 130.83f, 234.83f),
                    PathNode.LineTo(226.83f, 138.83f),
                    PathNode.CurveTo(227.97536f, 137.68651f, 228.31877f, 135.9655f, 227.7f, 134.47f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 226.34f),
                    PathNode.LineTo(41.66f, 140.0f),
                    PathNode.LineTo(80.0f, 140.0f),
                    PathNode.CurveTo(82.20914f, 140.0f, 84.0f, 138.20914f, 84.0f, 136.0f),
                    PathNode.LineTo(84.0f, 108.0f),
                    PathNode.LineTo(172.0f, 108.0f),
                    PathNode.LineTo(172.0f, 136.0f),
                    PathNode.CurveTo(172.0f, 138.20914f, 173.79086f, 140.0f, 176.0f, 140.0f),
                    PathNode.LineTo(214.34f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 40.0f),
                    PathNode.CurveTo(76.0f, 37.79086f, 77.79086f, 36.0f, 80.0f, 36.0f),
                    PathNode.LineTo(176.0f, 36.0f),
                    PathNode.CurveTo(178.20914f, 36.0f, 180.0f, 37.79086f, 180.0f, 40.0f),
                    PathNode.CurveTo(180.0f, 42.20914f, 178.20914f, 44.0f, 176.0f, 44.0f),
                    PathNode.LineTo(80.0f, 44.0f),
                    PathNode.CurveTo(77.79086f, 44.0f, 76.0f, 42.20914f, 76.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 72.0f),
                    PathNode.CurveTo(76.0f, 69.79086f, 77.79086f, 68.0f, 80.0f, 68.0f),
                    PathNode.LineTo(176.0f, 68.0f),
                    PathNode.CurveTo(178.20914f, 68.0f, 180.0f, 69.79086f, 180.0f, 72.0f),
                    PathNode.CurveTo(180.0f, 74.20914f, 178.20914f, 76.0f, 176.0f, 76.0f),
                    PathNode.LineTo(80.0f, 76.0f),
                    PathNode.CurveTo(77.79086f, 76.0f, 76.0f, 74.20914f, 76.0f, 72.0f),
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
        return _arrowFatLinesDown!!
    }

private var _arrowFatLinesDown: ImageVector? = null
