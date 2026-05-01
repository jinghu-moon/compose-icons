package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PhoneDisconnect: ImageVector
    get() {
        if (_phoneDisconnect != null) return _phoneDisconnect!!
        _phoneDisconnect = phosphorThinIcon(
            name = "PhoneDisconnect",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.79f, 93.0f),
                    PathNode.CurveTo(174.15f, 38.34f, 81.85f, 38.34f, 27.21f, 93.0f),
                    PathNode.CurveTo(8.69f, 111.5f, 6.9f, 138.81f, 22.85f, 159.39f),
                    PathNode.CurveTo(26.120531f, 163.56454f, 31.743404f, 165.09732f, 36.68f, 163.16f),
                    PathNode.LineTo(85.68f, 145.77f),
                    PathNode.LineTo(85.83f, 145.71f),
                    PathNode.CurveTo(89.59549f, 144.20354f, 92.34527f, 140.89703f, 93.14f, 136.92f),
                    PathNode.LineTo(99.04f, 107.41f),
                    PathNode.CurveTo(99.28425f, 106.03508f, 100.23976f, 104.89304f, 101.55f, 104.41f),
                    PathNode.CurveTo(118.54605f, 98.51117f, 137.02716f, 98.468925f, 154.05f, 104.29f),
                    PathNode.CurveTo(155.34685f, 104.76115f, 156.30273f, 105.87636f, 156.57f, 107.23f),
                    PathNode.LineTo(162.81f, 137.0f),
                    PathNode.CurveTo(163.63121f, 140.9348f, 166.36795f, 144.1971f, 170.1f, 145.69f),
                    PathNode.LineTo(170.25f, 145.75f),
                    PathNode.LineTo(219.32f, 163.16f),
                    PathNode.CurveTo(224.25659f, 165.09732f, 229.87947f, 163.56454f, 233.15f, 159.39f),
                    PathNode.CurveTo(249.1f, 138.81f, 247.31f, 111.5f, 228.79f, 93.0f),
                    PathNode.Close,
                    PathNode.MoveTo(226.79f, 154.51f),
                    PathNode.CurveTo(225.6876f, 155.88475f, 223.81544f, 156.37614f, 222.18f, 155.72f),
                    PathNode.LineTo(222.03f, 155.66f),
                    PathNode.LineTo(173.0f, 138.24f),
                    PathNode.CurveTo(171.7859f, 137.73155f, 170.89967f, 136.65834f, 170.63f, 135.37f),
                    PathNode.LineTo(164.42f, 105.62f),
                    PathNode.CurveTo(163.56526f, 101.51164f, 160.62653f, 98.148224f, 156.67f, 96.75f),
                    PathNode.CurveTo(137.94727f, 90.35025f, 117.621475f, 90.39953f, 98.93f, 96.89f),
                    PathNode.CurveTo(94.9507f, 98.32028f, 92.0179f, 101.73936f, 91.21f, 105.89f),
                    PathNode.LineTo(85.31f, 135.4f),
                    PathNode.CurveTo(85.04967f, 136.67168f, 84.18844f, 137.73795f, 83.0f, 138.26f),
                    PathNode.LineTo(34.0f, 155.64f),
                    PathNode.LineTo(33.85f, 155.7f),
                    PathNode.CurveTo(32.21456f, 156.35614f, 30.342388f, 155.86475f, 29.24f, 154.49f),
                    PathNode.CurveTo(15.82f, 137.19f, 17.34f, 114.23f, 32.93f, 98.64f),
                    PathNode.CurveTo(58.65f, 72.85f, 93.33f, 60.0f, 128.0f, 60.0f),
                    PathNode.CurveTo(162.67f, 60.0f, 197.35f, 72.89f, 223.13f, 98.68f),
                    PathNode.CurveTo(238.71f, 114.23f, 240.24f, 137.19f, 226.82f, 154.49f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 200.0f),
                    PathNode.CurveTo(220.0f, 202.20914f, 218.20914f, 204.0f, 216.0f, 204.0f),
                    PathNode.LineTo(40.0f, 204.0f),
                    PathNode.CurveTo(37.79086f, 204.0f, 36.0f, 202.20914f, 36.0f, 200.0f),
                    PathNode.CurveTo(36.0f, 197.79086f, 37.79086f, 196.0f, 40.0f, 196.0f),
                    PathNode.LineTo(216.0f, 196.0f),
                    PathNode.CurveTo(218.20914f, 196.0f, 220.0f, 197.79086f, 220.0f, 200.0f),
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
        return _phoneDisconnect!!
    }

private var _phoneDisconnect: ImageVector? = null
