package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FolderMinus: ImageVector
    get() {
        if (_folderMinus != null) return _folderMinus!!
        _folderMinus = phosphorLightIcon(
            name = "FolderMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 74.0f),
                    PathNode.LineTo(130.49f, 74.0f),
                    PathNode.LineTo(102.59f, 46.1f),
                    PathNode.CurveTo(99.96804f, 43.468937f, 96.40445f, 41.993107f, 92.69f, 42.0f),
                    PathNode.LineTo(40.0f, 42.0f),
                    PathNode.CurveTo(32.268013f, 42.0f, 26.0f, 48.268013f, 26.0f, 56.0f),
                    PathNode.LineTo(26.0f, 200.62f),
                    PathNode.CurveTo(26.005514f, 208.00728f, 31.992716f, 213.99449f, 39.38f, 214.0f),
                    PathNode.LineTo(216.89f, 214.0f),
                    PathNode.CurveTo(224.12817f, 213.99449f, 229.99449f, 208.12817f, 230.0f, 200.89f),
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
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 200.89f),
                    PathNode.CurveTo(218.0f, 201.50304f, 217.50304f, 202.0f, 216.89f, 202.0f),
                    PathNode.LineTo(39.38f, 202.0f),
                    PathNode.CurveTo(38.622345f, 201.98926f, 38.01075f, 201.37766f, 38.0f, 200.62f),
                    PathNode.LineTo(38.0f, 86.0f),
                    PathNode.LineTo(216.0f, 86.0f),
                    PathNode.CurveTo(217.10457f, 86.0f, 218.0f, 86.89543f, 218.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(158.0f, 144.0f),
                    PathNode.CurveTo(158.0f, 147.3137f, 155.3137f, 150.0f, 152.0f, 150.0f),
                    PathNode.LineTo(104.0f, 150.0f),
                    PathNode.CurveTo(100.686295f, 150.0f, 98.0f, 147.3137f, 98.0f, 144.0f),
                    PathNode.CurveTo(98.0f, 140.6863f, 100.686295f, 138.0f, 104.0f, 138.0f),
                    PathNode.LineTo(152.0f, 138.0f),
                    PathNode.CurveTo(155.3137f, 138.0f, 158.0f, 140.6863f, 158.0f, 144.0f),
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
        return _folderMinus!!
    }

private var _folderMinus: ImageVector? = null
