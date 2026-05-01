package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TrainRegional: ImageVector
    get() {
        if (_trainRegional != null) return _trainRegional!!
        _trainRegional = phosphorThinIcon(
            name = "TrainRegional",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(219.86f, 119.0f),
                    PathNode.LineTo(197.47f, 36.84f),
                    PathNode.CurveTo(196.0449f, 31.619276f, 191.30173f, 27.998404f, 185.89f, 28.0f),
                    PathNode.LineTo(70.11f, 28.0f),
                    PathNode.CurveTo(64.69827f, 27.998404f, 59.95509f, 31.619276f, 58.53f, 36.84f),
                    PathNode.LineTo(36.14f, 119.0f),
                    PathNode.CurveTo(35.950016f, 119.68711f, 35.950016f, 120.41289f, 36.14f, 121.1f),
                    PathNode.LineTo(58.53f, 203.21f),
                    PathNode.CurveTo(59.97385f, 208.41089f, 64.71242f, 212.00778f, 70.11f, 212.0f),
                    PathNode.LineTo(88.0f, 212.0f),
                    PathNode.LineTo(68.8f, 237.6f),
                    PathNode.CurveTo(67.47452f, 239.36731f, 67.83269f, 241.87451f, 69.6f, 243.2f),
                    PathNode.CurveTo(71.36731f, 244.52548f, 73.87452f, 244.16731f, 75.2f, 242.4f),
                    PathNode.LineTo(98.0f, 212.0f),
                    PathNode.LineTo(158.0f, 212.0f),
                    PathNode.LineTo(180.8f, 242.4f),
                    PathNode.CurveTo(182.12549f, 244.16731f, 184.63269f, 244.52548f, 186.4f, 243.2f),
                    PathNode.CurveTo(188.16731f, 241.87451f, 188.52548f, 239.36731f, 187.2f, 237.6f),
                    PathNode.LineTo(168.0f, 212.0f),
                    PathNode.LineTo(185.89f, 212.0f),
                    PathNode.CurveTo(191.30173f, 212.0016f, 196.0449f, 208.38072f, 197.47f, 203.16f),
                    PathNode.LineTo(219.86f, 121.05f),
                    PathNode.CurveTo(220.04088f, 120.37864f, 220.04088f, 119.67136f, 219.86f, 119.0f),
                    PathNode.Close,
                    PathNode.MoveTo(66.25f, 39.0f),
                    PathNode.CurveTo(66.70478f, 37.238598f, 68.29084f, 36.00591f, 70.11f, 36.0f),
                    PathNode.LineTo(185.89f, 36.0f),
                    PathNode.CurveTo(187.70915f, 36.00591f, 189.29521f, 37.238598f, 189.75f, 39.0f),
                    PathNode.LineTo(211.0f, 116.84f),
                    PathNode.LineTo(128.0f, 131.93f),
                    PathNode.LineTo(45.0f, 116.84f),
                    PathNode.Close,
                    PathNode.MoveTo(66.25f, 201.1f),
                    PathNode.LineTo(45.53f, 125.1f),
                    PathNode.LineTo(124.0f, 139.34f),
                    PathNode.LineTo(124.0f, 204.0f),
                    PathNode.LineTo(70.11f, 204.0f),
                    PathNode.CurveTo(68.305145f, 204.00012f, 66.72378f, 202.79156f, 66.25f, 201.05f),
                    PathNode.Close,
                    PathNode.MoveTo(189.75f, 201.1f),
                    PathNode.CurveTo(189.27623f, 202.84157f, 187.69485f, 204.05013f, 185.89f, 204.05f),
                    PathNode.LineTo(132.0f, 204.05f),
                    PathNode.LineTo(132.0f, 139.34f),
                    PathNode.LineTo(210.47f, 125.07f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 88.0f),
                    PathNode.CurveTo(92.0f, 85.79086f, 93.79086f, 84.0f, 96.0f, 84.0f),
                    PathNode.LineTo(160.0f, 84.0f),
                    PathNode.CurveTo(162.20914f, 84.0f, 164.0f, 85.79086f, 164.0f, 88.0f),
                    PathNode.CurveTo(164.0f, 90.20914f, 162.20914f, 92.0f, 160.0f, 92.0f),
                    PathNode.LineTo(96.0f, 92.0f),
                    PathNode.CurveTo(93.79086f, 92.0f, 92.0f, 90.20914f, 92.0f, 88.0f),
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
        return _trainRegional!!
    }

private var _trainRegional: ImageVector? = null
