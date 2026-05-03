package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ShirtFolded: ImageVector
    get() {
        if (_shirtFolded != null) return _shirtFolded!!
        _shirtFolded = phosphorLightIcon(
            name = "ShirtFolded",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 42.0f),
                    PathNode.LineTo(178.48f, 42.0f),
                    PathNode.LineTo(164.25f, 27.76f),
                    PathNode.CurveTo(163.12341f, 26.632008f, 161.59422f, 25.998747f, 160.0f, 26.0f),
                    PathNode.LineTo(96.0f, 26.0f),
                    PathNode.CurveTo(94.40577f, 25.998747f, 92.87659f, 26.632008f, 91.75f, 27.76f),
                    PathNode.LineTo(77.52f, 42.0f),
                    PathNode.LineTo(56.0f, 42.0f),
                    PathNode.CurveTo(48.268013f, 42.0f, 42.0f, 48.268013f, 42.0f, 56.0f),
                    PathNode.LineTo(42.0f, 208.0f),
                    PathNode.CurveTo(42.0f, 215.73198f, 48.268013f, 222.0f, 56.0f, 222.0f),
                    PathNode.LineTo(200.0f, 222.0f),
                    PathNode.CurveTo(207.73198f, 222.0f, 214.0f, 215.73198f, 214.0f, 208.0f),
                    PathNode.LineTo(214.0f, 56.0f),
                    PathNode.CurveTo(214.0f, 48.268013f, 207.73198f, 42.0f, 200.0f, 42.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 69.18f),
                    PathNode.LineTo(107.21f, 38.0f),
                    PathNode.LineTo(148.79f, 38.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.93f, 41.42f),
                    PathNode.LineTo(170.0f, 50.49f),
                    PathNode.LineTo(170.0f, 104.0f),
                    PathNode.CurveTo(169.99953f, 104.76872f, 169.55849f, 105.46915f, 168.86546f, 105.80179f),
                    PathNode.CurveTo(168.17244f, 106.134445f, 167.35008f, 106.04045f, 166.75f, 105.56f),
                    PathNode.LineTo(135.93f, 78.92f),
                    PathNode.Close,
                    PathNode.MoveTo(86.0f, 50.49f),
                    PathNode.LineTo(95.07f, 41.42f),
                    PathNode.LineTo(120.07f, 78.92f),
                    PathNode.LineTo(89.25f, 105.54f),
                    PathNode.CurveTo(88.65273f, 106.018265f, 87.83494f, 106.113846f, 87.14348f, 105.7862f),
                    PathNode.CurveTo(86.45202f, 105.45856f, 86.008095f, 104.765114f, 86.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(54.0f, 208.0f),
                    PathNode.LineTo(54.0f, 56.0f),
                    PathNode.CurveTo(54.0f, 54.89543f, 54.89543f, 54.0f, 56.0f, 54.0f),
                    PathNode.LineTo(74.0f, 54.0f),
                    PathNode.LineTo(74.0f, 104.0f),
                    PathNode.CurveTo(73.96649f, 109.44186f, 77.11845f, 114.40052f, 82.06f, 116.68f),
                    PathNode.CurveTo(83.92043f, 117.546776f, 85.94756f, 117.99725f, 88.0f, 118.0f),
                    PathNode.CurveTo(91.2918f, 118.01577f, 94.48191f, 116.860245f, 97.0f, 114.74f),
                    PathNode.LineTo(97.08f, 114.67f),
                    PathNode.LineTo(122.08f, 93.11f),
                    PathNode.LineTo(122.08f, 210.0f),
                    PathNode.LineTo(56.0f, 210.0f),
                    PathNode.CurveTo(54.89543f, 210.0f, 54.0f, 209.10457f, 54.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(202.0f, 208.0f),
                    PathNode.CurveTo(202.0f, 209.10457f, 201.10457f, 210.0f, 200.0f, 210.0f),
                    PathNode.LineTo(134.0f, 210.0f),
                    PathNode.LineTo(134.0f, 93.11f),
                    PathNode.LineTo(159.0f, 114.67f),
                    PathNode.LineTo(159.08f, 114.74f),
                    PathNode.CurveTo(161.57707f, 116.84247f, 164.73569f, 117.99686f, 168.0f, 118.0f),
                    PathNode.CurveTo(170.07504f, 117.99763f, 172.12392f, 117.53663f, 174.0f, 116.65f),
                    PathNode.CurveTo(178.90822f, 114.357445f, 182.03252f, 109.41713f, 182.0f, 104.0f),
                    PathNode.LineTo(182.0f, 54.0f),
                    PathNode.LineTo(200.0f, 54.0f),
                    PathNode.CurveTo(201.10457f, 54.0f, 202.0f, 54.89543f, 202.0f, 56.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _shirtFolded!!
    }

private var _shirtFolded: ImageVector? = null
