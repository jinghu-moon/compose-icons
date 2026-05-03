package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Percent: ImageVector
    get() {
        if (_percent != null) return _percent!!
        _percent = phosphorThinIcon(
            name = "Percent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(202.83f, 58.81f),
                    PathNode.LineTo(58.83f, 202.81f),
                    PathNode.CurveTo(57.267033f, 204.37297f, 54.732967f, 204.37297f, 53.17f, 202.81f),
                    PathNode.CurveTo(51.607033f, 201.24704f, 51.607033f, 198.71297f, 53.17f, 197.15f),
                    PathNode.LineTo(197.17f, 53.15f),
                    PathNode.CurveTo(198.1702f, 52.095394f, 199.66374f, 51.666336f, 201.07117f, 52.02929f),
                    PathNode.CurveTo(202.47859f, 52.39224f, 203.57837f, 53.49008f, 203.94382f, 54.89686f),
                    PathNode.CurveTo(204.30925f, 56.30364f, 203.88283f, 57.797943f, 202.83f, 58.8f),
                    PathNode.Close,
                    PathNode.MoveTo(53.37f, 98.62f),
                    PathNode.CurveTo(42.578957f, 87.82188f, 40.918f, 70.904884f, 49.402847f, 58.21421f),
                    PathNode.CurveTo(57.887695f, 45.52353f, 74.15537f, 40.593426f, 88.25778f, 46.43879f),
                    PathNode.CurveTo(102.36018f, 52.28415f, 110.36988f, 67.277084f, 107.38874f, 82.249016f),
                    PathNode.CurveTo(104.4076f, 97.220955f, 91.26585f, 108.002304f, 76.0f, 108.0f),
                    PathNode.CurveTo(67.50716f, 108.01863f, 59.359287f, 104.64138f, 53.37f, 98.62f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 76.0f),
                    PathNode.CurveTo(52.028072f, 87.44812f, 60.138023f, 97.28266f, 71.371254f, 99.49057f),
                    PathNode.CurveTo(82.604485f, 101.69848f, 93.83332f, 95.665f, 98.1922f, 85.07914f),
                    PathNode.CurveTo(102.55109f, 74.49328f, 98.82638f, 62.302464f, 89.29543f, 55.96042f),
                    PathNode.CurveTo(79.764496f, 49.618374f, 67.08104f, 50.890923f, 59.0f, 59.0f),
                    PathNode.CurveTo(54.48859f, 63.5035f, 51.967735f, 69.62557f, 52.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 180.0f),
                    PathNode.CurveTo(211.99754f, 195.26624f, 201.21153f, 208.40485f, 186.23819f, 211.38089f),
                    PathNode.CurveTo(171.26485f, 214.35695f, 156.27435f, 206.3416f, 150.43417f, 192.23663f),
                    PathNode.CurveTo(144.59398f, 178.13167f, 149.53062f, 161.86543f, 162.2251f, 153.38557f),
                    PathNode.CurveTo(174.91959f, 144.9057f, 191.83638f, 146.57391f, 202.63f, 157.37f),
                    PathNode.CurveTo(208.64774f, 163.36093f, 212.02127f, 171.5086f, 212.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 180.0f),
                    PathNode.CurveTo(203.97192f, 168.55186f, 195.86197f, 158.71733f, 184.62874f, 156.50943f),
                    PathNode.CurveTo(173.39551f, 154.30153f, 162.16669f, 160.33499f, 157.80782f, 170.92085f),
                    PathNode.CurveTo(153.44891f, 181.50671f, 157.17363f, 193.69754f, 166.70456f, 200.03958f),
                    PathNode.CurveTo(176.2355f, 206.38162f, 188.91896f, 205.10907f, 197.0f, 197.0f),
                    PathNode.CurveTo(201.50763f, 192.49397f, 204.0278f, 186.37355f, 204.0f, 180.0f),
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
        return _percent!!
    }

private var _percent: ImageVector? = null
