package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Pepper: ImageVector
    get() {
        if (_pepper != null) return _pepper!!
        _pepper = phosphorLightIcon(
            name = "Pepper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(165.57f, 42.26f),
                    PathNode.CurveTo(162.70674f, 23.718113f, 146.76164f, 10.026638f, 128.0f, 10.0f),
                    PathNode.CurveTo(124.686295f, 10.0f, 122.0f, 12.686292f, 122.0f, 16.0f),
                    PathNode.CurveTo(122.0f, 19.31371f, 124.686295f, 22.0f, 128.0f, 22.0f),
                    PathNode.CurveTo(140.18289f, 21.999382f, 150.73256f, 30.458237f, 153.38f, 42.35f),
                    PathNode.CurveTo(121.89808f, 45.76764f, 98.03438f, 72.33314f, 98.0f, 104.0f),
                    PathNode.CurveTo(98.0f, 151.75f, 71.77f, 183.68f, 20.0f, 198.93f),
                    PathNode.CurveTo(13.74014f, 200.75542f, 9.569335f, 206.66075f, 9.94215f, 213.17067f),
                    PathNode.CurveTo(10.314964f, 219.68059f, 15.132672f, 225.07117f, 21.56f, 226.17f),
                    PathNode.CurveTo(36.504375f, 228.7514f, 51.64435f, 230.03287f, 66.81f, 230.0f),
                    PathNode.CurveTo(107.17f, 230.0f, 152.04f, 221.0f, 183.0f, 195.0f),
                    PathNode.CurveTo(208.88f, 173.29f, 222.0f, 142.67f, 222.0f, 104.0f),
                    PathNode.CurveTo(221.96687f, 71.93132f, 197.50645f, 45.169212f, 165.57f, 42.26f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 54.0f),
                    PathNode.CurveTo(181.9751f, 54.02692f, 201.36655f, 68.37383f, 207.82f, 89.38f),
                    PathNode.LineTo(192.0f, 97.28f),
                    PathNode.LineTo(162.68f, 82.62f),
                    PathNode.CurveTo(160.99263f, 81.7776f, 159.00737f, 81.7776f, 157.32f, 82.62f),
                    PathNode.LineTo(128.0f, 97.28f),
                    PathNode.LineTo(112.19f, 89.37f),
                    PathNode.CurveTo(118.64038f, 68.367386f, 138.02919f, 54.02348f, 160.0f, 54.0f),
                    PathNode.Close,
                    PathNode.MoveTo(175.28f, 185.82f),
                    PathNode.CurveTo(150.15f, 206.89f, 95.36f, 227.0f, 23.67f, 214.33f),
                    PathNode.CurveTo(22.710634f, 214.22223f, 21.98883f, 213.40533f, 22.0f, 212.44f),
                    PathNode.CurveTo(21.881277f, 211.5022f, 22.50421f, 210.63097f, 23.43f, 210.44f),
                    PathNode.CurveTo(80.06f, 193.73f, 110.0f, 156.92f, 110.0f, 104.0f),
                    PathNode.CurveTo(110.0f, 103.24f, 110.0f, 102.49f, 110.06f, 101.74f),
                    PathNode.LineTo(125.32f, 109.37f),
                    PathNode.CurveTo(127.00737f, 110.212395f, 128.99263f, 110.212395f, 130.68f, 109.37f),
                    PathNode.LineTo(160.0f, 94.69f),
                    PathNode.LineTo(189.32f, 109.35f),
                    PathNode.CurveTo(191.00737f, 110.1924f, 192.99263f, 110.1924f, 194.68f, 109.35f),
                    PathNode.LineTo(209.94f, 101.72f),
                    PathNode.CurveTo(209.94f, 102.47f, 210.0f, 103.22f, 210.0f, 103.98f),
                    PathNode.CurveTo(210.0f, 139.0f, 198.32f, 166.49f, 175.28f, 185.81f),
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
        return _pepper!!
    }

private var _pepper: ImageVector? = null
