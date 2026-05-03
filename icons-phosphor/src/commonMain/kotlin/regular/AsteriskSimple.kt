package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.AsteriskSimple: ImageVector
    get() {
        if (_asteriskSimple != null) return _asteriskSimple!!
        _asteriskSimple = phosphorRegularIcon(
            name = "AsteriskSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(211.0f, 103.43f),
                    PathNode.LineTo(140.87f, 131.43f),
                    PathNode.LineTo(190.34f, 195.04f),
                    PathNode.CurveTo(192.1427f, 197.29239f, 192.59303f, 200.34091f, 191.51859f, 203.01833f),
                    PathNode.CurveTo(190.44414f, 205.69574f, 188.01135f, 207.58727f, 185.1517f, 207.96866f),
                    PathNode.CurveTo(182.29207f, 208.35005f, 179.4486f, 207.16223f, 177.71f, 204.86f),
                    PathNode.LineTo(128.0f, 141.0f),
                    PathNode.LineTo(78.32f, 204.91f),
                    PathNode.CurveTo(75.58663f, 208.32524f, 70.61698f, 208.91179f, 67.16361f, 206.22675f),
                    PathNode.CurveTo(63.710255f, 203.5417f, 63.053825f, 198.58081f, 65.69f, 195.09f),
                    PathNode.LineTo(115.16f, 131.48f),
                    PathNode.LineTo(45.0f, 103.43f),
                    PathNode.CurveTo(40.896523f, 101.77315f, 38.913147f, 97.10348f, 40.57f, 93.0f),
                    PathNode.CurveTo(42.226856f, 88.89652f, 46.896523f, 86.91315f, 51.0f, 88.57f),
                    PathNode.LineTo(120.0f, 116.18f),
                    PathNode.LineTo(120.0f, 40.0f),
                    PathNode.CurveTo(120.0f, 35.581722f, 123.58172f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(132.41827f, 32.0f, 136.0f, 35.581722f, 136.0f, 40.0f),
                    PathNode.LineTo(136.0f, 116.18f),
                    PathNode.LineTo(205.0f, 88.57f),
                    PathNode.CurveTo(209.10347f, 86.91315f, 213.77315f, 88.89652f, 215.43f, 93.0f),
                    PathNode.CurveTo(217.08685f, 97.10348f, 215.10347f, 101.77315f, 211.0f, 103.43f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _asteriskSimple!!
    }

private var _asteriskSimple: ImageVector? = null
