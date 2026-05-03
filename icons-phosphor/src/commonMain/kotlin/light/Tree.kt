package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Tree: ImageVector
    get() {
        if (_tree != null) return _tree!!
        _tree = phosphorLightIcon(
            name = "Tree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(196.55f, 64.09f),
                    PathNode.CurveTo(185.21039f, 36.20158f, 158.10567f, 17.962881f, 128.0f, 17.962881f),
                    PathNode.CurveTo(97.89434f, 17.962881f, 70.789604f, 36.20158f, 59.45f, 64.09f),
                    PathNode.CurveTo(34.25275f, 75.2642f, 18.005873f, 100.23618f, 18.0f, 127.8f),
                    PathNode.CurveTo(17.9f, 164.91f, 49.13f, 197.0f, 86.19f, 198.0f),
                    PathNode.CurveTo(98.7006f, 198.29216f, 111.062546f, 195.24051f, 122.0f, 189.16f),
                    PathNode.LineTo(122.0f, 232.0f),
                    PathNode.CurveTo(122.0f, 235.3137f, 124.686295f, 238.0f, 128.0f, 238.0f),
                    PathNode.CurveTo(131.3137f, 238.0f, 134.0f, 235.3137f, 134.0f, 232.0f),
                    PathNode.LineTo(134.0f, 189.16f),
                    PathNode.CurveTo(144.39929f, 194.94476f, 156.10005f, 197.98697f, 168.0f, 198.0f),
                    PathNode.LineTo(169.77f, 198.0f),
                    PathNode.CurveTo(206.87f, 197.0f, 238.1f, 164.9f, 238.0f, 127.8f),
                    PathNode.CurveTo(237.99413f, 100.23618f, 221.74725f, 75.2642f, 196.55f, 64.09f),
                    PathNode.Close,
                    PathNode.MoveTo(169.5f, 186.0f),
                    PathNode.CurveTo(156.7792f, 186.33546f, 144.30238f, 182.4694f, 134.0f, 175.0f),
                    PathNode.LineTo(134.0f, 131.71f),
                    PathNode.LineTo(178.68f, 109.37f),
                    PathNode.CurveTo(181.64577f, 107.88988f, 182.85013f, 104.28577f, 181.37f, 101.32f),
                    PathNode.CurveTo(179.88988f, 98.35423f, 176.28577f, 97.14988f, 173.32f, 98.63f),
                    PathNode.LineTo(134.0f, 118.29f),
                    PathNode.LineTo(134.0f, 88.0f),
                    PathNode.CurveTo(134.0f, 84.686295f, 131.3137f, 82.0f, 128.0f, 82.0f),
                    PathNode.CurveTo(124.686295f, 82.0f, 122.0f, 84.686295f, 122.0f, 88.0f),
                    PathNode.LineTo(122.0f, 142.29f),
                    PathNode.LineTo(82.68f, 122.63f),
                    PathNode.CurveTo(79.71423f, 121.14988f, 76.11012f, 122.35423f, 74.63f, 125.32f),
                    PathNode.CurveTo(73.14988f, 128.28577f, 74.35423f, 131.88988f, 77.32f, 133.37f),
                    PathNode.LineTo(122.0f, 155.71f),
                    PathNode.LineTo(122.0f, 175.0f),
                    PathNode.CurveTo(111.690544f, 182.45528f, 99.218636f, 186.31981f, 86.5f, 186.0f),
                    PathNode.CurveTo(55.79f, 185.23f, 29.92f, 158.6f, 30.0f, 127.86f),
                    PathNode.CurveTo(29.998747f, 104.21315f, 44.40645f, 82.95219f, 66.37f, 74.19f),
                    PathNode.CurveTo(67.946236f, 73.5531f, 69.17829f, 72.27743f, 69.76f, 70.68f),
                    PathNode.CurveTo(78.69112f, 46.217045f, 101.95771f, 29.9427f, 128.0f, 29.9427f),
                    PathNode.CurveTo(154.0423f, 29.9427f, 177.30888f, 46.217045f, 186.24f, 70.68f),
                    PathNode.CurveTo(186.8217f, 72.27743f, 188.05377f, 73.5531f, 189.63f, 74.19f),
                    PathNode.CurveTo(211.5852f, 82.94587f, 225.99174f, 104.193245f, 226.0f, 127.83f),
                    PathNode.CurveTo(226.08f, 158.58f, 200.21f, 185.2f, 169.5f, 186.0f),
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
        return _tree!!
    }

private var _tree: ImageVector? = null
