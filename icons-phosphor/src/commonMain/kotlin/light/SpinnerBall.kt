package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SpinnerBall: ImageVector
    get() {
        if (_spinnerBall != null) return _spinnerBall!!
        _spinnerBall = phosphorLightIcon(
            name = "SpinnerBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 26.0f),
                    PathNode.CurveTo(71.666954f, 26.0f, 26.0f, 71.666954f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 184.33304f, 71.666954f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(184.33304f, 230.0f, 230.0f, 184.33304f, 230.0f, 128.0f),
                    PathNode.CurveTo(229.93387f, 71.69437f, 184.30563f, 26.066126f, 128.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(217.89f, 123.44f),
                    PathNode.CurveTo(186.89f, 145.81f, 164.23f, 138.8f, 139.96f, 127.19f),
                    PathNode.CurveTo(161.39f, 112.44f, 182.23f, 93.98f, 181.47f, 55.65f),
                    PathNode.CurveTo(203.14555f, 71.65562f, 216.50969f, 96.530815f, 217.89f, 123.44f),
                    PathNode.Close,
                    PathNode.MoveTo(169.0f, 47.89f),
                    PathNode.CurveTo(172.84f, 85.89f, 155.47f, 102.02f, 133.29f, 117.23f),
                    PathNode.CurveTo(131.22f, 91.29f, 125.67f, 64.0f, 92.06f, 45.5f),
                    PathNode.CurveTo(116.76735f, 34.718185f, 145.00948f, 35.595474f, 169.0f, 47.89f),
                    PathNode.Close,
                    PathNode.MoveTo(79.14f, 52.45f),
                    PathNode.CurveTo(114.0f, 68.15f, 119.23f, 91.23f, 121.32f, 118.0f),
                    PathNode.CurveTo(97.82f, 106.82f, 71.4f, 98.0f, 38.57f, 117.83f),
                    PathNode.CurveTo(41.642567f, 91.06865f, 56.525143f, 67.08485f, 79.14f, 52.45f),
                    PathNode.Close,
                    PathNode.MoveTo(38.14f, 132.56f),
                    PathNode.CurveTo(69.19f, 110.19f, 91.8f, 117.2f, 116.07f, 128.81f),
                    PathNode.CurveTo(94.61f, 143.56f, 73.77f, 162.0f, 74.53f, 200.35f),
                    PathNode.CurveTo(52.854443f, 184.34438f, 39.49031f, 159.4692f, 38.11f, 132.56f),
                    PathNode.Close,
                    PathNode.MoveTo(87.0f, 208.11f),
                    PathNode.CurveTo(83.16f, 170.11f, 100.53f, 153.98f, 122.71f, 138.77f),
                    PathNode.CurveTo(124.77f, 164.71f, 130.32f, 192.01f, 163.93f, 210.5f),
                    PathNode.CurveTo(139.2255f, 221.27864f, 110.987785f, 220.40138f, 87.0f, 208.11f),
                    PathNode.Close,
                    PathNode.MoveTo(176.85f, 203.55f),
                    PathNode.CurveTo(142.0f, 187.85f, 136.77f, 164.77f, 134.68f, 138.0f),
                    PathNode.CurveTo(148.04f, 144.36f, 162.35f, 150.0f, 178.24f, 150.0f),
                    PathNode.CurveTo(190.3f, 150.0f, 203.24f, 146.77f, 217.43f, 138.21f),
                    PathNode.CurveTo(214.34193f, 164.95538f, 199.46169f, 188.92075f, 176.86f, 203.55f),
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
        return _spinnerBall!!
    }

private var _spinnerBall: ImageVector? = null
