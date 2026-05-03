package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Scales: ImageVector
    get() {
        if (_scales != null) return _scales!!
        _scales = phosphorBoldIcon(
            name = "Scales",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(243.14f, 131.54f),
                    PathNode.LineTo(211.14f, 51.54f),
                    PathNode.LineTo(211.14f, 51.54f),
                    PathNode.CurveTo(208.95401f, 46.089184f, 203.14415f, 43.02134f, 197.41f, 44.29f),
                    PathNode.LineTo(140.0f, 57.0f),
                    PathNode.LineTo(140.0f, 40.0f),
                    PathNode.CurveTo(140.0f, 33.37258f, 134.62741f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(121.37258f, 28.0f, 116.0f, 33.37258f, 116.0f, 40.0f),
                    PathNode.LineTo(116.0f, 62.37f),
                    PathNode.LineTo(53.4f, 76.29f),
                    PathNode.CurveTo(49.53076f, 77.14813f, 46.33477f, 79.86136f, 44.86f, 83.54f),
                    PathNode.LineTo(44.86f, 83.54f),
                    PathNode.LineTo(44.86f, 83.54f),
                    PathNode.LineTo(44.86f, 83.54f),
                    PathNode.LineTo(12.86f, 163.46f),
                    PathNode.CurveTo(12.281926f, 164.90334f, 11.989845f, 166.44524f, 12.0f, 168.0f),
                    PathNode.CurveTo(12.0f, 180.13f, 18.2f, 190.43f, 29.45f, 197.0f),
                    PathNode.CurveTo(37.565884f, 201.5404f, 46.700527f, 203.94879f, 56.0f, 204.0f),
                    PathNode.CurveTo(65.29947f, 203.94879f, 74.43411f, 201.5404f, 82.55f, 197.0f),
                    PathNode.CurveTo(93.8f, 190.43f, 100.0f, 180.13f, 100.0f, 168.0f),
                    PathNode.CurveTo(99.99988f, 166.47214f, 99.70798f, 164.95836f, 99.14f, 163.54f),
                    PathNode.LineTo(72.38f, 96.65f),
                    PathNode.LineTo(116.0f, 87.0f),
                    PathNode.LineTo(116.0f, 204.0f),
                    PathNode.LineTo(104.0f, 204.0f),
                    PathNode.CurveTo(97.37258f, 204.0f, 92.0f, 209.37259f, 92.0f, 216.0f),
                    PathNode.CurveTo(92.0f, 222.62741f, 97.37258f, 228.0f, 104.0f, 228.0f),
                    PathNode.LineTo(152.0f, 228.0f),
                    PathNode.CurveTo(158.62741f, 228.0f, 164.0f, 222.62741f, 164.0f, 216.0f),
                    PathNode.CurveTo(164.0f, 209.37259f, 158.62741f, 204.0f, 152.0f, 204.0f),
                    PathNode.LineTo(140.0f, 204.0f),
                    PathNode.LineTo(140.0f, 81.63f),
                    PathNode.LineTo(180.42f, 72.63f),
                    PathNode.LineTo(156.86f, 131.53f),
                    PathNode.CurveTo(156.29077f, 132.95148f, 155.99886f, 134.46878f, 156.0f, 136.0f),
                    PathNode.CurveTo(156.0f, 148.13f, 162.2f, 158.43f, 173.45f, 165.0f),
                    PathNode.CurveTo(189.91592f, 174.34732f, 210.08408f, 174.34732f, 226.55f, 165.0f),
                    PathNode.CurveTo(237.8f, 158.43f, 244.0f, 148.13f, 244.0f, 136.0f),
                    PathNode.CurveTo(243.99988f, 134.47214f, 243.70798f, 132.95836f, 243.14f, 131.54f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 180.0f),
                    PathNode.CurveTo(52.29f, 180.0f, 38.0f, 178.13f, 36.19f, 169.82f),
                    PathNode.LineTo(56.0f, 120.31f),
                    PathNode.LineTo(75.81f, 169.82f),
                    PathNode.CurveTo(74.0f, 178.13f, 59.71f, 180.0f, 56.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 148.0f),
                    PathNode.CurveTo(196.29f, 148.0f, 182.0f, 146.13f, 180.19f, 137.82f),
                    PathNode.LineTo(200.0f, 88.31f),
                    PathNode.LineTo(219.81f, 137.82f),
                    PathNode.CurveTo(218.0f, 146.13f, 203.71f, 148.0f, 200.0f, 148.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _scales!!
    }

private var _scales: ImageVector? = null
