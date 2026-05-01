package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Waves: ImageVector
    get() {
        if (_waves != null) return _waves!!
        _waves = phosphorFillIcon(
            name = "Waves",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(197.2f, 176.87f),
                    PathNode.CurveTo(184.13f, 188.05f, 172.3f, 191.97f, 161.56f, 191.97f),
                    PathNode.CurveTo(147.3f, 191.97f, 134.94f, 185.05f, 124.09f, 178.97f),
                    PathNode.CurveTo(105.68f, 168.66f, 91.14f, 160.52f, 69.2f, 179.28f),
                    PathNode.CurveTo(65.84211f, 182.15189f, 60.79188f, 181.75789f, 57.92f, 178.4f),
                    PathNode.CurveTo(55.04812f, 175.04211f, 55.44211f, 169.99188f, 58.8f, 167.12f),
                    PathNode.CurveTo(89.22f, 141.12f, 112.89f, 154.36f, 131.91f, 165.01f),
                    PathNode.CurveTo(150.32f, 175.32f, 164.91f, 183.46f, 186.8f, 164.7f),
                    PathNode.CurveTo(190.1579f, 161.82812f, 195.20811f, 162.2221f, 198.08f, 165.58f),
                    PathNode.CurveTo(200.95187f, 168.9379f, 200.55789f, 173.98811f, 197.2f, 176.86f),
                    PathNode.Close,
                    PathNode.MoveTo(197.2f, 132.87f),
                    PathNode.CurveTo(184.13f, 144.05f, 172.3f, 147.97f, 161.56f, 147.97f),
                    PathNode.CurveTo(147.3f, 147.97f, 134.94f, 141.05f, 124.09f, 134.97f),
                    PathNode.CurveTo(105.68f, 124.66f, 91.14f, 116.52f, 69.2f, 135.28f),
                    PathNode.CurveTo(65.84211f, 138.15189f, 60.79188f, 137.75789f, 57.92f, 134.4f),
                    PathNode.CurveTo(55.04812f, 131.04211f, 55.44211f, 125.99188f, 58.8f, 123.12f),
                    PathNode.CurveTo(89.22f, 97.12f, 112.89f, 110.36f, 131.91f, 121.01f),
                    PathNode.CurveTo(150.32f, 131.32f, 164.91f, 139.46f, 186.8f, 120.7f),
                    PathNode.CurveTo(190.1579f, 117.82812f, 195.20811f, 118.22211f, 198.08f, 121.58f),
                    PathNode.CurveTo(200.95187f, 124.93789f, 200.55789f, 129.98811f, 197.2f, 132.86f),
                    PathNode.Close,
                    PathNode.MoveTo(197.2f, 88.87f),
                    PathNode.CurveTo(184.13f, 100.05f, 172.3f, 103.97f, 161.56f, 103.97f),
                    PathNode.CurveTo(147.3f, 103.97f, 134.94f, 97.05f, 124.09f, 90.97f),
                    PathNode.CurveTo(105.68f, 80.66f, 91.14f, 72.52f, 69.2f, 91.28f),
                    PathNode.CurveTo(65.8318f, 93.99703f, 60.91362f, 93.54315f, 58.099567f, 90.25558f),
                    PathNode.CurveTo(55.285515f, 86.968f, 55.595848f, 82.03868f, 58.8f, 79.13f),
                    PathNode.CurveTo(89.22f, 53.13f, 112.89f, 66.37f, 131.91f, 77.02f),
                    PathNode.CurveTo(150.32f, 87.33f, 164.91f, 95.47f, 186.8f, 76.71f),
                    PathNode.CurveTo(190.1579f, 73.83812f, 195.20811f, 74.23211f, 198.08f, 77.59f),
                    PathNode.CurveTo(200.95187f, 80.94789f, 200.55789f, 85.998116f, 197.2f, 88.87f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _waves!!
    }

private var _waves: ImageVector? = null
