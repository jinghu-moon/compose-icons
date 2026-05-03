package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Atom: ImageVector
    get() {
        if (_atom != null) return _atom!!
        _atom = phosphorFillIcon(
            name = "Atom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(196.12f, 128.0f),
                    PathNode.CurveTo(220.77f, 93.39f, 233.34f, 57.62f, 215.86f, 40.14f),
                    PathNode.CurveTo(198.38f, 22.66f, 162.61f, 35.23f, 128.0f, 59.88f),
                    PathNode.CurveTo(93.39f, 35.23f, 57.62f, 22.66f, 40.14f, 40.14f),
                    PathNode.CurveTo(22.66f, 57.62f, 35.23f, 93.39f, 59.88f, 128.0f),
                    PathNode.CurveTo(35.23f, 162.61f, 22.66f, 198.38f, 40.14f, 215.86f),
                    PathNode.LineTo(40.14f, 215.86f),
                    PathNode.CurveTo(45.77f, 221.49f, 53.29f, 224.0f, 62.05f, 224.0f),
                    PathNode.CurveTo(80.52f, 224.0f, 104.53f, 212.83f, 128.05f, 196.12f),
                    PathNode.CurveTo(151.47f, 212.83f, 175.47f, 224.0f, 194.0f, 224.0f),
                    PathNode.CurveTo(202.76f, 224.0f, 210.29f, 221.48f, 215.91f, 215.86f),
                    PathNode.LineTo(215.91f, 215.86f),
                    PathNode.CurveTo(233.34f, 198.38f, 220.77f, 162.61f, 196.12f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.55f, 51.45f),
                    PathNode.CurveTo(212.19f, 59.09f, 207.03f, 83.85f, 186.03f, 114.73f),
                    PathNode.CurveTo(179.38644f, 106.50585f, 172.31326f, 98.63822f, 164.84f, 91.16f),
                    PathNode.CurveTo(157.35829f, 83.699844f, 149.49084f, 76.63683f, 141.27f, 70.0f),
                    PathNode.CurveTo(172.15f, 49.0f, 196.91f, 43.81f, 204.55f, 51.45f),
                    PathNode.Close,
                    PathNode.MoveTo(51.45f, 51.45f),
                    PathNode.CurveTo(53.65f, 49.24f, 57.28f, 48.1f, 62.07f, 48.1f),
                    PathNode.CurveTo(73.89f, 48.1f, 92.76f, 55.0f, 114.72f, 70.0f),
                    PathNode.CurveTo(106.50438f, 76.63923f, 98.64038f, 83.70214f, 91.16f, 91.16f),
                    PathNode.CurveTo(83.69698f, 98.63899f, 76.63383f, 106.5066f, 70.0f, 114.73f),
                    PathNode.CurveTo(49.0f, 83.85f, 43.81f, 59.09f, 51.45f, 51.45f),
                    PathNode.Close,
                    PathNode.MoveTo(51.45f, 204.55f),
                    PathNode.CurveTo(43.81f, 196.91f, 49.0f, 172.15f, 70.0f, 141.27f),
                    PathNode.CurveTo(76.643555f, 149.49416f, 83.71673f, 157.36177f, 91.19f, 164.84f),
                    PathNode.CurveTo(98.66412f, 172.29709f, 106.52142f, 179.35999f, 114.73f, 186.0f),
                    PathNode.CurveTo(83.85f, 207.0f, 59.09f, 212.19f, 51.45f, 204.55f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 140.0f),
                    PathNode.CurveTo(121.37258f, 140.0f, 116.0f, 134.62741f, 116.0f, 128.0f),
                    PathNode.CurveTo(116.0f, 121.37258f, 121.37258f, 116.0f, 128.0f, 116.0f),
                    PathNode.CurveTo(134.62741f, 116.0f, 140.0f, 121.37258f, 140.0f, 128.0f),
                    PathNode.CurveTo(140.0f, 134.62741f, 134.62741f, 140.0f, 128.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.55f, 204.56f),
                    PathNode.CurveTo(196.91f, 212.21f, 172.15f, 207.04f, 141.27f, 186.04f),
                    PathNode.CurveTo(149.48956f, 179.39107f, 157.35692f, 172.31813f, 164.84f, 164.85f),
                    PathNode.CurveTo(172.30328f, 157.36777f, 179.36646f, 149.49681f, 186.0f, 141.27f),
                    PathNode.CurveTo(207.0f, 172.15f, 212.19f, 196.91f, 204.55f, 204.55f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _atom!!
    }

private var _atom: ImageVector? = null
