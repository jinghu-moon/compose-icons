package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Tooth: ImageVector
    get() {
        if (_tooth != null) return _tooth!!
        _tooth = phosphorBoldIcon(
            name = "Tooth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(172.46f, 83.15f),
                    PathNode.LineTo(160.31f, 88.0f),
                    PathNode.LineTo(172.46f, 92.85f),
                    PathNode.CurveTo(178.61522f, 95.31319f, 181.60818f, 102.29979f, 179.145f, 108.455f),
                    PathNode.CurveTo(176.68181f, 114.610214f, 169.69522f, 117.60319f, 163.54f, 115.14f),
                    PathNode.LineTo(128.0f, 100.93f),
                    PathNode.LineTo(92.46f, 115.15f),
                    PathNode.CurveTo(86.30479f, 117.61319f, 79.31819f, 114.62022f, 76.855f, 108.465f),
                    PathNode.CurveTo(74.39181f, 102.309784f, 77.38479f, 95.32319f, 83.54f, 92.86f),
                    PathNode.LineTo(95.69f, 88.0f),
                    PathNode.LineTo(83.54f, 83.15f),
                    PathNode.CurveTo(77.38479f, 80.68681f, 74.39181f, 73.70021f, 76.855f, 67.545f),
                    PathNode.CurveTo(79.31819f, 61.389786f, 86.30479f, 58.39681f, 92.46f, 60.86f),
                    PathNode.LineTo(128.0f, 75.08f),
                    PathNode.LineTo(163.54f, 60.86f),
                    PathNode.CurveTo(169.69522f, 58.39681f, 176.68181f, 61.389786f, 179.145f, 67.545f),
                    PathNode.CurveTo(181.60818f, 73.70021f, 178.61522f, 80.68681f, 172.46f, 83.15f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 79.75f),
                    PathNode.CurveTo(228.08f, 156.2f, 202.8f, 215.43f, 179.0f, 232.34f),
                    PathNode.CurveTo(173.10515f, 236.47888f, 165.44012f, 237.12836f, 158.93292f, 234.04036f),
                    PathNode.CurveTo(152.42574f, 230.95232f, 148.0816f, 224.60384f, 147.56f, 217.42f),
                    PathNode.CurveTo(146.89f, 208.36f, 145.23f, 195.42f, 141.1f, 185.19f),
                    PathNode.CurveTo(135.76f, 172.0f, 129.92f, 172.0f, 128.0f, 172.0f),
                    PathNode.CurveTo(120.24f, 172.0f, 116.23f, 181.92f, 114.92f, 185.18f),
                    PathNode.CurveTo(110.79f, 195.4f, 109.13f, 208.35f, 108.46f, 217.41f),
                    PathNode.CurveTo(107.71986f, 227.88232f, 99.008446f, 235.99988f, 88.51f, 236.0f),
                    PathNode.CurveTo(84.386406f, 236.00452f, 80.363655f, 234.72534f, 77.0f, 232.34f),
                    PathNode.CurveTo(53.2f, 215.43f, 27.92f, 156.2f, 28.0f, 79.75f),
                    PathNode.CurveTo(28.137665f, 46.710587f, 54.9603f, 19.999714f, 88.0f, 20.0f),
                    PathNode.LineTo(168.0f, 20.0f),
                    PathNode.CurveTo(201.0397f, 19.999714f, 227.86234f, 46.710587f, 228.0f, 79.75f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 79.75f),
                    PathNode.CurveTo(203.86261f, 59.96545f, 187.78503f, 43.999523f, 168.0f, 44.0f),
                    PathNode.LineTo(88.0f, 44.0f),
                    PathNode.CurveTo(68.20335f, 43.999626f, 52.12098f, 59.98372f, 52.0f, 79.78f),
                    PathNode.CurveTo(51.94f, 140.87f, 69.83f, 189.3f, 85.3f, 207.44f),
                    PathNode.CurveTo(91.24f, 156.0f, 114.32f, 148.0f, 128.0f, 148.0f),
                    PathNode.CurveTo(141.68f, 148.0f, 164.76f, 156.0f, 170.7f, 207.43f),
                    PathNode.CurveTo(186.17f, 189.31f, 204.06f, 140.88f, 204.0f, 79.78f),
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
        return _tooth!!
    }

private var _tooth: ImageVector? = null
