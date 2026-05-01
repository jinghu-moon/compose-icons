package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Flask: ImageVector
    get() {
        if (_flask != null) return _flask!!
        _flask = phosphorLightIcon(
            name = "Flask",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 200.8f),
                    PathNode.LineTo(158.0f, 97.48f),
                    PathNode.LineTo(158.0f, 38.0f),
                    PathNode.LineTo(168.0f, 38.0f),
                    PathNode.CurveTo(171.3137f, 38.0f, 174.0f, 35.31371f, 174.0f, 32.0f),
                    PathNode.CurveTo(174.0f, 28.68629f, 171.3137f, 26.0f, 168.0f, 26.0f),
                    PathNode.LineTo(88.0f, 26.0f),
                    PathNode.CurveTo(84.686295f, 26.0f, 82.0f, 28.68629f, 82.0f, 32.0f),
                    PathNode.CurveTo(82.0f, 35.31371f, 84.686295f, 38.0f, 88.0f, 38.0f),
                    PathNode.LineTo(98.0f, 38.0f),
                    PathNode.LineTo(98.0f, 97.48f),
                    PathNode.LineTo(36.0f, 200.8f),
                    PathNode.CurveTo(33.406967f, 205.12411f, 33.339386f, 210.50854f, 35.823067f, 214.89638f),
                    PathNode.CurveTo(38.30675f, 219.28421f, 42.957996f, 221.9976f, 48.0f, 222.0f),
                    PathNode.LineTo(208.0f, 222.0f),
                    PathNode.CurveTo(213.042f, 221.9976f, 217.69325f, 219.28421f, 220.17693f, 214.89638f),
                    PathNode.CurveTo(222.66061f, 210.50854f, 222.59303f, 205.12411f, 220.0f, 200.8f),
                    PathNode.Close,
                    PathNode.MoveTo(109.15f, 102.23f),
                    PathNode.CurveTo(109.70826f, 101.29612f, 110.002075f, 100.22802f, 110.0f, 99.14f),
                    PathNode.LineTo(110.0f, 38.0f),
                    PathNode.LineTo(146.0f, 38.0f),
                    PathNode.LineTo(146.0f, 99.14f),
                    PathNode.CurveTo(145.99792f, 100.22802f, 146.29175f, 101.29612f, 146.85f, 102.23f),
                    PathNode.LineTo(186.5f, 168.31f),
                    PathNode.CurveTo(174.09f, 171.47f, 155.64f, 171.31f, 130.71f, 158.65f),
                    PathNode.CurveTo(113.77f, 150.07f, 97.71f, 145.85f, 82.88f, 146.01f),
                    PathNode.Close,
                    PathNode.MoveTo(209.72f, 209.0f),
                    PathNode.CurveTo(209.36131f, 209.62126f, 208.69737f, 210.00285f, 207.98f, 210.0f),
                    PathNode.LineTo(48.0f, 210.0f),
                    PathNode.CurveTo(47.289413f, 209.99219f, 46.636333f, 209.60791f, 46.284428f, 208.99052f),
                    PathNode.CurveTo(45.93252f, 208.37315f, 45.934643f, 207.6154f, 46.29f, 207.0f),
                    PathNode.LineTo(75.29f, 158.59f),
                    PathNode.CurveTo(90.18f, 156.51f, 106.97f, 160.14f, 125.23f, 169.38f),
                    PathNode.CurveTo(144.0f, 178.8f, 159.67f, 182.0f, 172.42f, 182.0f),
                    PathNode.CurveTo(179.35652f, 182.05164f, 186.26f, 181.0399f, 192.89f, 179.0f),
                    PathNode.LineTo(209.69f, 207.0f),
                    PathNode.CurveTo(210.0566f, 207.61343f, 210.06801f, 208.37585f, 209.72f, 209.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _flask!!
    }

private var _flask: ImageVector? = null
