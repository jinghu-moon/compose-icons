package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Atom: ImageVector
    get() {
        if (_atom != null) return _atom!!
        _atom = phosphorDuotoneIcon(
            name = "Atom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(210.26f, 210.26f),
                    PathNode.CurveTo(193.03f, 227.49f, 142.26f, 204.63f, 96.8f, 159.2f),
                    PathNode.CurveTo(51.34f, 113.77f, 28.51f, 63.0f, 45.74f, 45.74f),
                    PathNode.CurveTo(62.97f, 28.48f, 113.74f, 51.37f, 159.2f, 96.8f),
                    PathNode.CurveTo(204.66f, 142.23f, 227.49f, 193.0f, 210.26f, 210.26f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
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
                    PathNode.CurveTo(80.53f, 224.0f, 104.53f, 212.83f, 128.05f, 196.12f),
                    PathNode.CurveTo(151.47f, 212.83f, 175.47f, 224.0f, 194.0f, 224.0f),
                    PathNode.CurveTo(202.76f, 224.0f, 210.29f, 221.48f, 215.91f, 215.86f),
                    PathNode.LineTo(215.91f, 215.86f),
                    PathNode.CurveTo(233.34f, 198.38f, 220.77f, 162.61f, 196.12f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.55f, 51.45f),
                    PathNode.CurveTo(212.19f, 59.09f, 207.03f, 83.85f, 186.03f, 114.73f),
                    PathNode.CurveTo(179.38644f, 106.50585f, 172.31326f, 98.63822f, 164.84f, 91.16f),
                    PathNode.CurveTo(157.36101f, 83.69698f, 149.49341f, 76.63383f, 141.27f, 70.0f),
                    PathNode.CurveTo(172.15f, 49.0f, 196.91f, 43.8f, 204.55f, 51.45f),
                    PathNode.Close,
                    PathNode.MoveTo(176.29f, 128.0f),
                    PathNode.CurveTo(169.21375f, 136.95164f, 161.61378f, 145.47656f, 153.53f, 153.53f),
                    PathNode.CurveTo(145.47656f, 161.61378f, 136.95164f, 169.21375f, 128.0f, 176.29f),
                    PathNode.CurveTo(119.04835f, 169.21375f, 110.52344f, 161.61378f, 102.47f, 153.53f),
                    PathNode.CurveTo(94.386215f, 145.47656f, 86.786255f, 136.95164f, 79.71f, 128.0f),
                    PathNode.CurveTo(93.90705f, 110.10964f, 110.10964f, 93.90705f, 128.0f, 79.71f),
                    PathNode.CurveTo(136.95164f, 86.786255f, 145.47656f, 94.386215f, 153.53f, 102.47f),
                    PathNode.CurveTo(161.61378f, 110.52344f, 169.21375f, 119.04835f, 176.29f, 128.0f),
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
                    PathNode.CurveTo(83.85f, 207.0f, 59.09f, 212.2f, 51.45f, 204.55f),
                    PathNode.Close,
                    PathNode.MoveTo(204.55f, 204.55f),
                    PathNode.CurveTo(196.91f, 212.2f, 172.15f, 207.03f, 141.27f, 186.03f),
                    PathNode.CurveTo(149.48956f, 179.38107f, 157.35692f, 172.30812f, 164.84f, 164.84f),
                    PathNode.CurveTo(172.30302f, 157.36101f, 179.36618f, 149.49341f, 186.0f, 141.27f),
                    PathNode.CurveTo(207.0f, 172.15f, 212.19f, 196.91f, 204.55f, 204.55f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 128.0f),
                    PathNode.CurveTo(140.0f, 134.62741f, 134.62741f, 140.0f, 128.0f, 140.0f),
                    PathNode.CurveTo(121.37258f, 140.0f, 116.0f, 134.62741f, 116.0f, 128.0f),
                    PathNode.CurveTo(116.0f, 121.37258f, 121.37258f, 116.0f, 128.0f, 116.0f),
                    PathNode.CurveTo(134.62741f, 116.0f, 140.0f, 121.37258f, 140.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _atom!!
    }

private var _atom: ImageVector? = null
