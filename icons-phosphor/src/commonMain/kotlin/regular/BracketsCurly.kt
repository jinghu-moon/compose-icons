package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BracketsCurly: ImageVector
    get() {
        if (_bracketsCurly != null) return _bracketsCurly!!
        _bracketsCurly = phosphorRegularIcon(
            name = "BracketsCurly",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(43.18f, 128.0f),
                    PathNode.CurveTo(46.57027f, 130.78857f, 49.302124f, 134.29218f, 51.18f, 138.26f),
                    PathNode.CurveTo(55.98f, 148.16f, 55.98f, 160.26f, 55.98f, 172.0f),
                    PathNode.CurveTo(55.98f, 196.31f, 56.98f, 208.0f, 79.98f, 208.0f),
                    PathNode.CurveTo(84.39828f, 208.0f, 87.98f, 211.58173f, 87.98f, 216.0f),
                    PathNode.CurveTo(87.98f, 220.41827f, 84.39828f, 224.0f, 79.98f, 224.0f),
                    PathNode.CurveTo(62.5f, 224.0f, 50.66f, 217.86f, 44.78f, 205.74f),
                    PathNode.CurveTo(39.98f, 195.84f, 39.98f, 183.74f, 39.98f, 172.0f),
                    PathNode.CurveTo(39.98f, 147.69f, 38.98f, 136.0f, 15.98f, 136.0f),
                    PathNode.CurveTo(11.561722f, 136.0f, 7.98f, 132.41827f, 7.98f, 128.0f),
                    PathNode.CurveTo(7.98f, 123.58172f, 11.561722f, 120.0f, 15.98f, 120.0f),
                    PathNode.CurveTo(38.98f, 120.0f, 39.98f, 108.31f, 39.98f, 84.0f),
                    PathNode.CurveTo(39.98f, 72.28f, 39.98f, 60.16f, 44.78f, 50.26f),
                    PathNode.CurveTo(50.68f, 38.14f, 62.52f, 32.0f, 80.0f, 32.0f),
                    PathNode.CurveTo(84.41828f, 32.0f, 88.0f, 35.581722f, 88.0f, 40.0f),
                    PathNode.CurveTo(88.0f, 44.418278f, 84.41828f, 48.0f, 80.0f, 48.0f),
                    PathNode.CurveTo(57.0f, 48.0f, 56.0f, 59.69f, 56.0f, 84.0f),
                    PathNode.CurveTo(56.0f, 95.72f, 56.0f, 107.84f, 51.2f, 117.74f),
                    PathNode.CurveTo(49.316334f, 121.70979f, 46.57753f, 125.213554f, 43.18f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 120.0f),
                    PathNode.CurveTo(217.0f, 120.0f, 216.0f, 108.31f, 216.0f, 84.0f),
                    PathNode.CurveTo(216.0f, 72.28f, 216.0f, 60.16f, 211.2f, 50.26f),
                    PathNode.CurveTo(205.32f, 38.14f, 193.48f, 32.0f, 176.0f, 32.0f),
                    PathNode.CurveTo(171.58173f, 32.0f, 168.0f, 35.581722f, 168.0f, 40.0f),
                    PathNode.CurveTo(168.0f, 44.418278f, 171.58173f, 48.0f, 176.0f, 48.0f),
                    PathNode.CurveTo(199.0f, 48.0f, 200.0f, 59.69f, 200.0f, 84.0f),
                    PathNode.CurveTo(200.0f, 95.72f, 200.0f, 107.84f, 204.8f, 117.74f),
                    PathNode.CurveTo(206.67787f, 121.707825f, 209.40973f, 125.211426f, 212.8f, 128.0f),
                    PathNode.CurveTo(209.40973f, 130.78857f, 206.67787f, 134.29218f, 204.8f, 138.26f),
                    PathNode.CurveTo(200.0f, 148.16f, 200.0f, 160.26f, 200.0f, 172.0f),
                    PathNode.CurveTo(200.0f, 196.31f, 199.0f, 208.0f, 176.0f, 208.0f),
                    PathNode.CurveTo(171.58173f, 208.0f, 168.0f, 211.58173f, 168.0f, 216.0f),
                    PathNode.CurveTo(168.0f, 220.41827f, 171.58173f, 224.0f, 176.0f, 224.0f),
                    PathNode.CurveTo(193.48f, 224.0f, 205.32f, 217.86f, 211.2f, 205.74f),
                    PathNode.CurveTo(216.0f, 195.84f, 216.0f, 183.74f, 216.0f, 172.0f),
                    PathNode.CurveTo(216.0f, 147.69f, 217.0f, 136.0f, 240.0f, 136.0f),
                    PathNode.CurveTo(244.41827f, 136.0f, 248.0f, 132.41827f, 248.0f, 128.0f),
                    PathNode.CurveTo(248.0f, 123.58172f, 244.41827f, 120.0f, 240.0f, 120.0f),
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
        return _bracketsCurly!!
    }

private var _bracketsCurly: ImageVector? = null
