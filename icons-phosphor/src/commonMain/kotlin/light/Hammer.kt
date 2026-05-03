package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Hammer: ImageVector
    get() {
        if (_hammer != null) return _hammer!!
        _hammer = phosphorLightIcon(
            name = "Hammer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(249.92f, 113.4f),
                    PathNode.LineTo(182.47f, 45.49f),
                    PathNode.CurveTo(145.70944f, 8.820889f, 86.197464f, 8.847736f, 49.47f, 45.55f),
                    PathNode.LineTo(35.68f, 59.78f),
                    PathNode.CurveTo(33.37421f, 62.16311f, 33.43689f, 65.96421f, 35.82f, 68.27f),
                    PathNode.CurveTo(38.20311f, 70.57579f, 42.00421f, 70.51311f, 44.31f, 68.13f),
                    PathNode.LineTo(58.0f, 54.0f),
                    PathNode.CurveTo(64.027885f, 47.961304f, 70.96132f, 42.900406f, 78.55f, 39.0f),
                    PathNode.LineTo(127.55f, 88.0f),
                    PathNode.LineTo(30.09f, 185.4f),
                    PathNode.CurveTo(27.46112f, 188.02596f, 25.983986f, 191.58926f, 25.983986f, 195.305f),
                    PathNode.CurveTo(25.983986f, 199.02074f, 27.46112f, 202.58405f, 30.09f, 205.21f),
                    PathNode.LineTo(50.78f, 225.9f),
                    PathNode.CurveTo(53.405552f, 228.52582f, 56.96672f, 230.001f, 60.68f, 230.001f),
                    PathNode.CurveTo(64.39328f, 230.001f, 67.95445f, 228.52582f, 70.58f, 225.9f),
                    PathNode.LineTo(168.0f, 128.46f),
                    PathNode.LineTo(201.42f, 161.88f),
                    PathNode.CurveTo(204.04555f, 164.50581f, 207.60672f, 165.981f, 211.32f, 165.981f),
                    PathNode.CurveTo(215.03328f, 165.981f, 218.59445f, 164.50581f, 221.22f, 161.88f),
                    PathNode.LineTo(249.9f, 133.19f),
                    PathNode.CurveTo(255.36688f, 127.72921f, 255.37582f, 118.871826f, 249.92f, 113.4f),
                    PathNode.Close,
                    PathNode.MoveTo(62.1f, 217.41f),
                    PathNode.CurveTo(61.724865f, 217.78555f, 61.21582f, 217.99657f, 60.685f, 217.99657f),
                    PathNode.CurveTo(60.154182f, 217.99657f, 59.645138f, 217.78555f, 59.27f, 217.41f),
                    PathNode.LineTo(38.58f, 196.72f),
                    PathNode.CurveTo(38.204445f, 196.34486f, 37.993427f, 195.83582f, 37.993427f, 195.305f),
                    PathNode.CurveTo(37.993427f, 194.77419f, 38.204445f, 194.26514f, 38.58f, 193.89f),
                    PathNode.LineTo(108.0f, 124.46f),
                    PathNode.LineTo(131.51f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(163.76f, 115.73f),
                    PathNode.LineTo(140.0f, 139.49f),
                    PathNode.LineTo(116.48f, 116.0f),
                    PathNode.LineTo(140.24f, 92.24f),
                    PathNode.CurveTo(141.36667f, 91.11459f, 141.99973f, 89.587456f, 141.99973f, 87.995f),
                    PathNode.CurveTo(141.99973f, 86.40254f, 141.36667f, 84.875404f, 140.24f, 83.75f),
                    PathNode.LineTo(90.54f, 34.0f),
                    PathNode.CurveTo(119.90703f, 24.430546f, 152.15993f, 32.159492f, 174.0f, 54.0f),
                    PathNode.LineTo(219.62f, 99.93f),
                    PathNode.LineTo(188.0f, 131.49f),
                    PathNode.LineTo(172.24f, 115.73f),
                    PathNode.CurveTo(169.89746f, 113.39037f, 166.10254f, 113.39037f, 163.76f, 115.73f),
                    PathNode.Close,
                    PathNode.MoveTo(241.42f, 124.73f),
                    PathNode.LineTo(212.73f, 153.43f),
                    PathNode.CurveTo(212.35486f, 153.80556f, 211.84583f, 154.01657f, 211.315f, 154.01657f),
                    PathNode.CurveTo(210.78418f, 154.01657f, 210.27513f, 153.80556f, 209.9f, 153.43f),
                    PathNode.LineTo(196.49f, 140.0f),
                    PathNode.LineTo(228.05f, 108.43f),
                    PathNode.LineTo(241.42f, 121.89f),
                    PathNode.CurveTo(242.18884f, 122.668884f, 242.18884f, 123.921104f, 241.42f, 124.7f),
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
        return _hammer!!
    }

private var _hammer: ImageVector? = null
