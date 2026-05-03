package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FolderSimplePlus: ImageVector
    get() {
        if (_folderSimplePlus != null) return _folderSimplePlus!!
        _folderSimplePlus = phosphorLightIcon(
            name = "FolderSimplePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 74.0f),
                    PathNode.LineTo(130.0f, 74.0f),
                    PathNode.LineTo(101.73f, 52.8f),
                    PathNode.CurveTo(99.306656f, 50.98249f, 96.359184f, 50.0f, 93.33f, 50.0f),
                    PathNode.LineTo(40.0f, 50.0f),
                    PathNode.CurveTo(32.268013f, 50.0f, 26.0f, 56.268013f, 26.0f, 64.0f),
                    PathNode.LineTo(26.0f, 200.0f),
                    PathNode.CurveTo(26.0f, 207.73198f, 32.268013f, 214.0f, 40.0f, 214.0f),
                    PathNode.LineTo(216.89f, 214.0f),
                    PathNode.CurveTo(224.12817f, 213.99449f, 229.99449f, 208.12817f, 230.0f, 200.89f),
                    PathNode.LineTo(230.0f, 88.0f),
                    PathNode.CurveTo(230.0f, 80.26801f, 223.73198f, 74.0f, 216.0f, 74.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 200.89f),
                    PathNode.CurveTo(218.0f, 201.50304f, 217.50304f, 202.0f, 216.89f, 202.0f),
                    PathNode.LineTo(40.0f, 202.0f),
                    PathNode.CurveTo(38.89543f, 202.0f, 38.0f, 201.10457f, 38.0f, 200.0f),
                    PathNode.LineTo(38.0f, 64.0f),
                    PathNode.CurveTo(38.0f, 62.89543f, 38.89543f, 62.0f, 40.0f, 62.0f),
                    PathNode.LineTo(93.33f, 62.0f),
                    PathNode.CurveTo(93.76274f, 62.0f, 94.18381f, 62.140354f, 94.53f, 62.4f),
                    PathNode.LineTo(124.4f, 84.8f),
                    PathNode.CurveTo(125.438576f, 85.57893f, 126.70178f, 86.0f, 128.0f, 86.0f),
                    PathNode.LineTo(216.0f, 86.0f),
                    PathNode.CurveTo(217.10457f, 86.0f, 218.0f, 86.89543f, 218.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(158.0f, 144.0f),
                    PathNode.CurveTo(158.0f, 147.3137f, 155.3137f, 150.0f, 152.0f, 150.0f),
                    PathNode.LineTo(134.0f, 150.0f),
                    PathNode.LineTo(134.0f, 168.0f),
                    PathNode.CurveTo(134.0f, 171.3137f, 131.3137f, 174.0f, 128.0f, 174.0f),
                    PathNode.CurveTo(124.686295f, 174.0f, 122.0f, 171.3137f, 122.0f, 168.0f),
                    PathNode.LineTo(122.0f, 150.0f),
                    PathNode.LineTo(104.0f, 150.0f),
                    PathNode.CurveTo(100.686295f, 150.0f, 98.0f, 147.3137f, 98.0f, 144.0f),
                    PathNode.CurveTo(98.0f, 140.6863f, 100.686295f, 138.0f, 104.0f, 138.0f),
                    PathNode.LineTo(122.0f, 138.0f),
                    PathNode.LineTo(122.0f, 120.0f),
                    PathNode.CurveTo(122.0f, 116.686295f, 124.686295f, 114.0f, 128.0f, 114.0f),
                    PathNode.CurveTo(131.3137f, 114.0f, 134.0f, 116.686295f, 134.0f, 120.0f),
                    PathNode.LineTo(134.0f, 138.0f),
                    PathNode.LineTo(152.0f, 138.0f),
                    PathNode.CurveTo(155.3137f, 138.0f, 158.0f, 140.6863f, 158.0f, 144.0f),
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
        return _folderSimplePlus!!
    }

private var _folderSimplePlus: ImageVector? = null
