package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ClosedCaptioning: ImageVector
    get() {
        if (_closedCaptioning != null) return _closedCaptioning!!
        _closedCaptioning = phosphorBoldIcon(
            name = "ClosedCaptioning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 44.0f),
                    PathNode.LineTo(32.0f, 44.0f),
                    PathNode.CurveTo(20.954306f, 44.0f, 12.0f, 52.954304f, 12.0f, 64.0f),
                    PathNode.LineTo(12.0f, 192.0f),
                    PathNode.CurveTo(12.0f, 203.0457f, 20.954306f, 212.0f, 32.0f, 212.0f),
                    PathNode.LineTo(224.0f, 212.0f),
                    PathNode.CurveTo(235.0457f, 212.0f, 244.0f, 203.0457f, 244.0f, 192.0f),
                    PathNode.LineTo(244.0f, 64.0f),
                    PathNode.CurveTo(244.0f, 52.954304f, 235.0457f, 44.0f, 224.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 188.0f),
                    PathNode.LineTo(36.0f, 188.0f),
                    PathNode.LineTo(36.0f, 68.0f),
                    PathNode.LineTo(220.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 128.0f),
                    PathNode.CurveTo(51.998257f, 112.27944f, 60.38392f, 97.75226f, 73.99789f, 89.89123f),
                    PathNode.CurveTo(87.611855f, 82.03019f, 104.3856f, 82.02973f, 118.0f, 89.89f),
                    PathNode.CurveTo(123.6047f, 93.26437f, 125.47379f, 100.50623f, 122.2022f, 106.17155f),
                    PathNode.CurveTo(118.9306f, 111.83686f, 111.72404f, 113.83772f, 106.0f, 110.67f),
                    PathNode.CurveTo(97.594f, 105.82744f, 86.92489f, 107.71567f, 80.6915f, 115.1491f),
                    PathNode.CurveTo(74.458115f, 122.58254f, 74.458115f, 133.41747f, 80.6915f, 140.8509f),
                    PathNode.CurveTo(86.92489f, 148.28435f, 97.594f, 150.17256f, 106.0f, 145.33f),
                    PathNode.CurveTo(109.7195f, 143.0168f, 114.40388f, 142.91396f, 118.22131f, 145.06168f),
                    PathNode.CurveTo(122.03875f, 147.2094f, 124.38274f, 151.26645f, 124.33666f, 155.64633f),
                    PathNode.CurveTo(124.29059f, 160.02621f, 121.86178f, 164.03307f, 118.0f, 166.1f),
                    PathNode.CurveTo(104.387146f, 173.95938f, 87.615524f, 173.95987f, 74.00221f, 166.10127f),
                    PathNode.CurveTo(60.388905f, 158.24269f, 52.001827f, 143.71877f, 52.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 128.0f),
                    PathNode.CurveTo(131.99826f, 112.27944f, 140.38393f, 97.75226f, 153.99788f, 89.89123f),
                    PathNode.CurveTo(167.61185f, 82.03019f, 184.3856f, 82.02973f, 198.0f, 89.89f),
                    PathNode.CurveTo(203.6047f, 93.26437f, 205.4738f, 100.50623f, 202.2022f, 106.17155f),
                    PathNode.CurveTo(198.9306f, 111.83686f, 191.72404f, 113.83772f, 186.0f, 110.67f),
                    PathNode.CurveTo(177.59401f, 105.82744f, 166.92488f, 107.71567f, 160.6915f, 115.1491f),
                    PathNode.CurveTo(154.45811f, 122.58254f, 154.45811f, 133.41747f, 160.6915f, 140.8509f),
                    PathNode.CurveTo(166.92488f, 148.28435f, 177.59401f, 150.17256f, 186.0f, 145.33f),
                    PathNode.CurveTo(189.7195f, 143.0168f, 194.40387f, 142.91396f, 198.22131f, 145.06168f),
                    PathNode.CurveTo(202.03876f, 147.2094f, 204.38274f, 151.26645f, 204.33667f, 155.64633f),
                    PathNode.CurveTo(204.29059f, 160.02621f, 201.86177f, 164.03307f, 198.0f, 166.1f),
                    PathNode.CurveTo(184.38715f, 173.95938f, 167.61552f, 173.95987f, 154.00221f, 166.10127f),
                    PathNode.CurveTo(140.3889f, 158.24269f, 132.00183f, 143.71877f, 132.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _closedCaptioning!!
    }

private var _closedCaptioning: ImageVector? = null
