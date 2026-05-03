package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Coin: ImageVector
    get() {
        if (_coin != null) return _coin!!
        _coin = phosphorLightIcon(
            name = "Coin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(206.68f, 65.63f),
                    PathNode.CurveTo(186.23f, 55.41f, 159.0f, 50.0f, 128.0f, 50.0f),
                    PathNode.CurveTo(97.0f, 50.0f, 69.77f, 55.41f, 49.32f, 65.63f),
                    PathNode.CurveTo(29.41f, 75.58f, 18.0f, 89.57f, 18.0f, 104.0f),
                    PathNode.LineTo(18.0f, 152.0f),
                    PathNode.CurveTo(18.0f, 166.43f, 29.41f, 180.42f, 49.32f, 190.37f),
                    PathNode.CurveTo(69.77f, 200.59f, 97.0f, 206.0f, 128.0f, 206.0f),
                    PathNode.CurveTo(159.0f, 206.0f, 186.23f, 200.59f, 206.68f, 190.37f),
                    PathNode.CurveTo(226.59f, 180.42f, 238.0f, 166.43f, 238.0f, 152.0f),
                    PathNode.LineTo(238.0f, 104.0f),
                    PathNode.CurveTo(238.0f, 89.57f, 226.59f, 75.58f, 206.68f, 65.63f),
                    PathNode.Close,
                    PathNode.MoveTo(54.68f, 76.37f),
                    PathNode.CurveTo(73.21f, 67.1f, 99.25f, 62.0f, 128.0f, 62.0f),
                    PathNode.CurveTo(156.75f, 62.0f, 182.79f, 67.1f, 201.32f, 76.37f),
                    PathNode.CurveTo(217.0f, 84.21f, 226.0f, 94.28f, 226.0f, 104.0f),
                    PathNode.CurveTo(226.0f, 113.72f, 217.0f, 123.79f, 201.32f, 131.63f),
                    PathNode.CurveTo(182.79f, 140.9f, 156.75f, 146.0f, 128.0f, 146.0f),
                    PathNode.CurveTo(99.25f, 146.0f, 73.21f, 140.9f, 54.68f, 131.63f),
                    PathNode.CurveTo(39.0f, 123.79f, 30.0f, 113.72f, 30.0f, 104.0f),
                    PathNode.CurveTo(30.0f, 94.28f, 39.0f, 84.21f, 54.68f, 76.37f),
                    PathNode.Close,
                    PathNode.MoveTo(122.0f, 157.93f),
                    PathNode.LineTo(122.0f, 193.93f),
                    PathNode.CurveTo(102.76f, 193.45f, 84.93f, 190.65f, 70.0f, 185.82f),
                    PathNode.LineTo(70.0f, 150.42f),
                    PathNode.CurveTo(85.27f, 154.93f, 102.85f, 157.49f, 122.0f, 157.93f),
                    PathNode.Close,
                    PathNode.MoveTo(134.0f, 157.93f),
                    PathNode.CurveTo(153.15f, 157.49f, 170.73f, 154.93f, 186.0f, 150.41f),
                    PathNode.LineTo(186.0f, 185.81f),
                    PathNode.CurveTo(171.07f, 190.64f, 153.24f, 193.44f, 134.0f, 193.92f),
                    PathNode.Close,
                    PathNode.MoveTo(30.0f, 152.0f),
                    PathNode.LineTo(30.0f, 129.0f),
                    PathNode.CurveTo(35.70873f, 134.42764f, 42.22656f, 138.9348f, 49.32f, 142.36f),
                    PathNode.QuadTo(53.48f, 144.43f, 58.0f, 146.24f),
                    PathNode.LineTo(58.0f, 181.24f),
                    PathNode.CurveTo(56.87f, 180.72f, 55.76f, 180.24f, 54.68f, 179.66f),
                    PathNode.CurveTo(39.0f, 171.79f, 30.0f, 161.72f, 30.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(201.32f, 179.63f),
                    PathNode.CurveTo(200.24f, 180.17f, 199.13f, 180.69f, 198.0f, 181.21f),
                    PathNode.LineTo(198.0f, 146.21f),
                    PathNode.QuadTo(202.51f, 144.4f, 206.68f, 142.33f),
                    PathNode.CurveTo(213.77144f, 138.91397f, 220.28915f, 134.417f, 226.0f, 129.0f),
                    PathNode.LineTo(226.0f, 152.0f),
                    PathNode.CurveTo(226.0f, 161.72f, 217.0f, 171.79f, 201.32f, 179.63f),
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
        return _coin!!
    }

private var _coin: ImageVector? = null
