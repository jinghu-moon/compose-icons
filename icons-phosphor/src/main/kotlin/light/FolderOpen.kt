package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) return _folderOpen!!
        _folderOpen = phosphorLightIcon(
            name = "FolderOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(243.36f, 111.81f),
                    PathNode.CurveTo(240.72726f, 108.16003f, 236.5004f, 105.99822f, 232.0f, 106.0f),
                    PathNode.LineTo(214.0f, 106.0f),
                    PathNode.LineTo(214.0f, 88.0f),
                    PathNode.CurveTo(214.0f, 80.26801f, 207.73198f, 74.0f, 200.0f, 74.0f),
                    PathNode.LineTo(130.0f, 74.0f),
                    PathNode.LineTo(101.74f, 52.8f),
                    PathNode.CurveTo(99.31463f, 50.986355f, 96.368484f, 50.004307f, 93.34f, 50.0f),
                    PathNode.LineTo(40.0f, 50.0f),
                    PathNode.CurveTo(32.268013f, 50.0f, 26.0f, 56.268013f, 26.0f, 64.0f),
                    PathNode.LineTo(26.0f, 208.0f),
                    PathNode.CurveTo(26.0f, 211.3137f, 28.68629f, 214.0f, 32.0f, 214.0f),
                    PathNode.LineTo(211.1f, 214.0f),
                    PathNode.CurveTo(213.6811f, 213.99948f, 215.97264f, 212.34828f, 216.79f, 209.9f),
                    PathNode.LineTo(245.28f, 124.43f),
                    PathNode.CurveTo(246.70665f, 120.15933f, 245.99217f, 115.46315f, 243.36f, 111.81f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 62.0f),
                    PathNode.LineTo(93.34f, 62.0f),
                    PathNode.CurveTo(93.77274f, 62.0f, 94.19381f, 62.140354f, 94.54f, 62.4f),
                    PathNode.LineTo(124.4f, 84.8f),
                    PathNode.CurveTo(125.438576f, 85.57893f, 126.70178f, 86.0f, 128.0f, 86.0f),
                    PathNode.LineTo(200.0f, 86.0f),
                    PathNode.CurveTo(201.10457f, 86.0f, 202.0f, 86.89543f, 202.0f, 88.0f),
                    PathNode.LineTo(202.0f, 106.0f),
                    PathNode.LineTo(69.77f, 106.0f),
                    PathNode.CurveTo(63.745296f, 106.00027f, 58.39639f, 109.854866f, 56.49f, 115.57f),
                    PathNode.LineTo(38.0f, 171.0f),
                    PathNode.LineTo(38.0f, 64.0f),
                    PathNode.CurveTo(38.0f, 62.89543f, 38.89543f, 62.0f, 40.0f, 62.0f),
                    PathNode.Close,
                    PathNode.MoveTo(233.9f, 120.63f),
                    PathNode.LineTo(206.78f, 202.0f),
                    PathNode.LineTo(40.33f, 202.0f),
                    PathNode.LineTo(67.87f, 119.37f),
                    PathNode.CurveTo(68.14168f, 118.55142f, 68.90752f, 117.999214f, 69.77f, 118.0f),
                    PathNode.LineTo(232.0f, 118.0f),
                    PathNode.CurveTo(232.64275f, 117.99941f, 233.24661f, 118.30778f, 233.62303f, 118.8288f),
                    PathNode.CurveTo(233.9994f, 119.34981f, 234.10246f, 120.01997f, 233.9f, 120.63f),
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
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
