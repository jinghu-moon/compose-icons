package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Sphere: ImageVector
    get() {
        if (_sphere != null) return _sphere!!
        _sphere = phosphorBoldIcon(
            name = "Sphere",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(68.35325f, 20.0f, 20.0f, 68.35325f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 187.64676f, 68.35325f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(187.64676f, 236.0f, 236.0f, 187.64676f, 236.0f, 128.0f),
                    PathNode.CurveTo(235.93387f, 68.38066f, 187.61934f, 20.066133f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 127.86f),
                    PathNode.CurveTo(211.44f, 129.27f, 206.3f, 134.97f, 189.12f, 140.19f),
                    PathNode.CurveTo(183.34764f, 141.90865f, 177.48131f, 143.29427f, 171.55f, 144.34f),
                    PathNode.CurveTo(171.85f, 138.9f, 172.0f, 133.43f, 172.0f, 128.0f),
                    PathNode.CurveTo(172.0f, 100.15f, 168.05f, 71.17f, 159.75f, 50.25f),
                    PathNode.CurveTo(191.27188f, 63.157257f, 211.90044f, 93.79804f, 212.0f, 127.86f),
                    PathNode.Close,
                    PathNode.MoveTo(127.86f, 44.0f),
                    PathNode.CurveTo(129.27f, 44.56f, 134.97f, 49.7f, 140.19f, 66.88f),
                    PathNode.CurveTo(145.19f, 83.48f, 148.0f, 105.19f, 148.0f, 128.0f),
                    PathNode.CurveTo(148.0f, 134.56f, 147.76f, 141.0f, 147.32f, 147.32f),
                    PathNode.CurveTo(141.03f, 147.76f, 134.56f, 148.0f, 128.0f, 148.0f),
                    PathNode.CurveTo(105.19f, 148.0f, 83.48f, 145.22f, 66.88f, 140.19f),
                    PathNode.CurveTo(49.7f, 135.0f, 44.56f, 129.27f, 44.0f, 127.86f),
                    PathNode.CurveTo(44.13183f, 81.60011f, 81.60011f, 44.13183f, 127.86f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(50.25f, 159.75f),
                    PathNode.CurveTo(71.17f, 168.05f, 100.15f, 172.0f, 128.0f, 172.0f),
                    PathNode.CurveTo(133.43f, 172.0f, 138.9f, 171.85f, 144.34f, 171.54f),
                    PathNode.CurveTo(143.29535f, 177.47482f, 141.90971f, 183.34454f, 140.19f, 189.12f),
                    PathNode.CurveTo(135.0f, 206.3f, 129.27f, 211.44f, 127.86f, 212.0f),
                    PathNode.CurveTo(93.79804f, 211.90044f, 63.157257f, 191.27188f, 50.25f, 159.75f),
                    PathNode.Close,
                    PathNode.MoveTo(159.75f, 205.75f),
                    PathNode.CurveTo(163.94f, 195.18f, 167.03f, 182.55f, 169.05f, 169.05f),
                    PathNode.CurveTo(182.55f, 167.05f, 195.18f, 163.94f, 205.75f, 159.75f),
                    PathNode.CurveTo(197.1775f, 180.61278f, 180.61278f, 197.1775f, 159.75f, 205.75f),
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
        return _sphere!!
    }

private var _sphere: ImageVector? = null
