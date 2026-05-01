package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Scales: ImageVector
    get() {
        if (_scales != null) return _scales!!
        _scales = phosphorLightIcon(
            name = "Scales",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(237.57f, 133.77f),
                    PathNode.LineTo(205.57f, 53.77f),
                    PathNode.LineTo(205.57f, 53.77f),
                    PathNode.CurveTo(204.47914f, 51.04485f, 201.57677f, 49.50904f, 198.71f, 50.14f),
                    PathNode.LineTo(134.0f, 64.52f),
                    PathNode.LineTo(134.0f, 40.0f),
                    PathNode.CurveTo(134.0f, 36.68629f, 131.3137f, 34.0f, 128.0f, 34.0f),
                    PathNode.CurveTo(124.686295f, 34.0f, 122.0f, 36.68629f, 122.0f, 40.0f),
                    PathNode.LineTo(122.0f, 67.19f),
                    PathNode.LineTo(54.7f, 82.19f),
                    PathNode.CurveTo(52.76428f, 82.62007f, 51.166054f, 83.97875f, 50.43f, 85.82f),
                    PathNode.LineTo(50.43f, 85.82f),
                    PathNode.LineTo(50.43f, 85.82f),
                    PathNode.LineTo(18.43f, 165.82f),
                    PathNode.CurveTo(18.154411f, 166.5142f, 18.00866f, 167.25314f, 18.0f, 168.0f),
                    PathNode.CurveTo(18.0f, 189.86f, 41.31f, 198.0f, 56.0f, 198.0f),
                    PathNode.CurveTo(70.69f, 198.0f, 94.0f, 189.86f, 94.0f, 168.0f),
                    PathNode.CurveTo(93.99753f, 167.2363f, 93.85166f, 166.47986f, 93.57f, 165.77f),
                    PathNode.LineTo(64.19f, 92.33f),
                    PathNode.LineTo(122.0f, 79.48f),
                    PathNode.LineTo(122.0f, 210.0f),
                    PathNode.LineTo(104.0f, 210.0f),
                    PathNode.CurveTo(100.686295f, 210.0f, 98.0f, 212.6863f, 98.0f, 216.0f),
                    PathNode.CurveTo(98.0f, 219.3137f, 100.686295f, 222.0f, 104.0f, 222.0f),
                    PathNode.LineTo(152.0f, 222.0f),
                    PathNode.CurveTo(155.3137f, 222.0f, 158.0f, 219.3137f, 158.0f, 216.0f),
                    PathNode.CurveTo(158.0f, 212.6863f, 155.3137f, 210.0f, 152.0f, 210.0f),
                    PathNode.LineTo(134.0f, 210.0f),
                    PathNode.LineTo(134.0f, 76.81f),
                    PathNode.LineTo(190.21f, 64.32f),
                    PathNode.LineTo(162.43f, 133.77f),
                    PathNode.CurveTo(162.14833f, 134.47986f, 162.00246f, 135.2363f, 162.0f, 136.0f),
                    PathNode.CurveTo(162.0f, 157.86f, 185.31f, 166.0f, 200.0f, 166.0f),
                    PathNode.CurveTo(214.69f, 166.0f, 238.0f, 157.86f, 238.0f, 136.0f),
                    PathNode.CurveTo(237.99754f, 135.2363f, 237.85167f, 134.47986f, 237.57f, 133.77f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 186.0f),
                    PathNode.CurveTo(49.88546f, 185.9522f, 43.878696f, 184.38522f, 38.52f, 181.44f),
                    PathNode.CurveTo(33.15f, 178.31f, 30.37f, 174.26f, 30.03f, 169.07f),
                    PathNode.LineTo(56.03f, 104.16f),
                    PathNode.LineTo(82.03f, 169.07f),
                    PathNode.CurveTo(81.06f, 182.85f, 62.58f, 186.0f, 56.0f, 186.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 154.0f),
                    PathNode.CurveTo(193.88545f, 153.9522f, 187.8787f, 152.38522f, 182.52f, 149.44f),
                    PathNode.CurveTo(177.15f, 146.31f, 174.37f, 142.26f, 174.03f, 137.07f),
                    PathNode.LineTo(200.03f, 72.16f),
                    PathNode.LineTo(226.03f, 137.07f),
                    PathNode.CurveTo(225.06f, 150.85f, 206.58f, 154.0f, 200.0f, 154.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _scales!!
    }

private var _scales: ImageVector? = null
