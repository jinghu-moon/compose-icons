package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Plant: ImageVector
    get() {
        if (_plant != null) return _plant!!
        _plant = phosphorLightIcon(
            name = "Plant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(245.63f, 48.0f),
                    PathNode.CurveTo(245.44821f, 44.969128f, 243.03087f, 42.551792f, 240.0f, 42.37f),
                    PathNode.CurveTo(189.0f, 39.37f, 148.12f, 54.79f, 130.65f, 83.63f),
                    PathNode.CurveTo(119.02f, 102.84f, 119.27f, 126.31f, 131.18f, 148.63f),
                    PathNode.CurveTo(123.543686f, 157.3721f, 118.22138f, 167.88948f, 115.7f, 179.22f),
                    PathNode.LineTo(95.9f, 159.41f),
                    PathNode.CurveTo(104.05f, 143.31f, 104.0f, 126.46f, 95.58f, 112.56f),
                    PathNode.CurveTo(82.77f, 91.41f, 53.0f, 80.07f, 15.9f, 82.27f),
                    PathNode.CurveTo(12.865545f, 82.45231f, 10.446924f, 84.87523f, 10.27f, 87.91f),
                    PathNode.CurveTo(8.09f, 125.0f, 19.41f, 154.77f, 40.56f, 167.58f),
                    PathNode.CurveTo(47.448273f, 171.78996f, 55.36708f, 174.01195f, 63.44f, 174.0f),
                    PathNode.CurveTo(71.80048f, 173.9148f, 80.02302f, 171.85916f, 87.44f, 168.0f),
                    PathNode.LineTo(114.0f, 194.48f),
                    PathNode.LineTo(114.0f, 224.0f),
                    PathNode.CurveTo(114.0f, 227.3137f, 116.686295f, 230.0f, 120.0f, 230.0f),
                    PathNode.CurveTo(123.313705f, 230.0f, 126.0f, 227.3137f, 126.0f, 224.0f),
                    PathNode.LineTo(126.0f, 194.51f),
                    PathNode.CurveTo(125.959984f, 180.76463f, 130.841f, 167.45888f, 139.76f, 157.0f),
                    PathNode.CurveTo(150.97f, 162.93f, 162.48f, 165.91f, 173.58f, 165.91f),
                    PathNode.CurveTo(184.43703f, 165.94571f, 195.09268f, 162.97984f, 204.37f, 157.34f),
                    PathNode.CurveTo(233.21f, 139.89f, 248.63f, 99.0f, 245.63f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(46.78f, 157.31f),
                    PathNode.CurveTo(30.47f, 147.44f, 21.39f, 124.0f, 22.0f, 94.0f),
                    PathNode.CurveTo(52.0f, 93.35f, 75.41f, 102.44f, 85.28f, 118.75f),
                    PathNode.CurveTo(90.96f, 128.12f, 91.44f, 139.13f, 86.82f, 150.34f),
                    PathNode.LineTo(60.24f, 123.75f),
                    PathNode.CurveTo(57.89555f, 121.405556f, 54.094448f, 121.405556f, 51.75f, 123.75f),
                    PathNode.CurveTo(49.405552f, 126.094444f, 49.405552f, 129.89555f, 51.75f, 132.24f),
                    PathNode.LineTo(78.37f, 158.85f),
                    PathNode.CurveTo(67.16f, 163.47f, 56.15f, 163.0f, 46.78f, 157.31f),
                    PathNode.Close,
                    PathNode.MoveTo(198.16f, 147.09f),
                    PathNode.CurveTo(183.42f, 156.01f, 166.02f, 156.27f, 148.49f, 147.99f),
                    PathNode.LineTo(204.25f, 92.24f),
                    PathNode.CurveTo(206.59445f, 89.89555f, 206.59445f, 86.094444f, 204.25f, 83.75f),
                    PathNode.CurveTo(201.90555f, 81.405556f, 198.10445f, 81.405556f, 195.76f, 83.75f),
                    PathNode.LineTo(140.0f, 139.51f),
                    PathNode.CurveTo(131.72f, 121.98f, 132.0f, 104.58f, 140.9f, 89.85f),
                    PathNode.CurveTo(155.42f, 65.85f, 189.96f, 52.67f, 233.9f, 54.1f),
                    PathNode.CurveTo(235.33f, 98.0f, 222.14f, 132.56f, 198.16f, 147.09f),
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
        return _plant!!
    }

private var _plant: ImageVector? = null
