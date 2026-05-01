package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FolderLock: ImageVector
    get() {
        if (_folderLock != null) return _folderLock!!
        _folderLock = phosphorLightIcon(
            name = "FolderLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 162.0f),
                    PathNode.LineTo(214.0f, 162.0f),
                    PathNode.LineTo(214.0f, 156.0f),
                    PathNode.CurveTo(214.0f, 141.6406f, 202.3594f, 130.0f, 188.0f, 130.0f),
                    PathNode.CurveTo(173.6406f, 130.0f, 162.0f, 141.6406f, 162.0f, 156.0f),
                    PathNode.LineTo(162.0f, 162.0f),
                    PathNode.LineTo(152.0f, 162.0f),
                    PathNode.CurveTo(148.6863f, 162.0f, 146.0f, 164.6863f, 146.0f, 168.0f),
                    PathNode.LineTo(146.0f, 208.0f),
                    PathNode.CurveTo(146.0f, 211.3137f, 148.6863f, 214.0f, 152.0f, 214.0f),
                    PathNode.LineTo(224.0f, 214.0f),
                    PathNode.CurveTo(227.3137f, 214.0f, 230.0f, 211.3137f, 230.0f, 208.0f),
                    PathNode.LineTo(230.0f, 168.0f),
                    PathNode.CurveTo(230.0f, 164.6863f, 227.3137f, 162.0f, 224.0f, 162.0f),
                    PathNode.Close,
                    PathNode.MoveTo(174.0f, 156.0f),
                    PathNode.CurveTo(174.0f, 148.26802f, 180.26802f, 142.0f, 188.0f, 142.0f),
                    PathNode.CurveTo(195.73198f, 142.0f, 202.0f, 148.26802f, 202.0f, 156.0f),
                    PathNode.LineTo(202.0f, 162.0f),
                    PathNode.LineTo(174.0f, 162.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 202.0f),
                    PathNode.LineTo(158.0f, 202.0f),
                    PathNode.LineTo(158.0f, 174.0f),
                    PathNode.LineTo(218.0f, 174.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 74.0f),
                    PathNode.LineTo(130.49f, 74.0f),
                    PathNode.LineTo(102.59f, 46.1f),
                    PathNode.CurveTo(99.96804f, 43.468937f, 96.40445f, 41.993107f, 92.69f, 42.0f),
                    PathNode.LineTo(40.0f, 42.0f),
                    PathNode.CurveTo(32.268013f, 42.0f, 26.0f, 48.268013f, 26.0f, 56.0f),
                    PathNode.LineTo(26.0f, 200.62f),
                    PathNode.CurveTo(26.005514f, 208.00728f, 31.992716f, 213.99449f, 39.38f, 214.0f),
                    PathNode.LineTo(112.56f, 214.0f),
                    PathNode.CurveTo(115.87371f, 214.0f, 118.56f, 211.3137f, 118.56f, 208.0f),
                    PathNode.CurveTo(118.56f, 204.6863f, 115.87371f, 202.0f, 112.56f, 202.0f),
                    PathNode.LineTo(39.38f, 202.0f),
                    PathNode.CurveTo(38.622345f, 201.98926f, 38.01075f, 201.37766f, 38.0f, 200.62f),
                    PathNode.LineTo(38.0f, 86.0f),
                    PathNode.LineTo(216.0f, 86.0f),
                    PathNode.CurveTo(217.10457f, 86.0f, 218.0f, 86.89543f, 218.0f, 88.0f),
                    PathNode.LineTo(218.0f, 104.0f),
                    PathNode.CurveTo(218.0f, 107.313705f, 220.6863f, 110.0f, 224.0f, 110.0f),
                    PathNode.CurveTo(227.3137f, 110.0f, 230.0f, 107.313705f, 230.0f, 104.0f),
                    PathNode.LineTo(230.0f, 88.0f),
                    PathNode.CurveTo(230.0f, 80.26801f, 223.73198f, 74.0f, 216.0f, 74.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 54.0f),
                    PathNode.LineTo(92.69f, 54.0f),
                    PathNode.CurveTo(93.219574f, 54.00223f, 93.72665f, 54.214413f, 94.1f, 54.59f),
                    PathNode.LineTo(113.51f, 74.0f),
                    PathNode.LineTo(38.0f, 74.0f),
                    PathNode.LineTo(38.0f, 56.0f),
                    PathNode.CurveTo(38.0f, 54.89543f, 38.89543f, 54.0f, 40.0f, 54.0f),
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
        return _folderLock!!
    }

private var _folderLock: ImageVector? = null
