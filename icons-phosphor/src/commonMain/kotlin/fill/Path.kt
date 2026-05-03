package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Path: ImageVector
    get() {
        if (_path != null) return _path!!
        _path = phosphorFillIcon(
            name = "Path",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 200.0f),
                    PathNode.CurveTo(227.99532f, 213.89888f, 217.79582f, 225.69052f, 204.04256f, 227.6972f),
                    PathNode.CurveTo(190.28929f, 229.70389f, 177.1458f, 221.31812f, 173.17f, 208.0f),
                    PathNode.LineTo(72.0f, 208.0f),
                    PathNode.CurveTo(45.490334f, 208.0f, 24.0f, 186.50967f, 24.0f, 160.0f),
                    PathNode.CurveTo(24.0f, 133.49033f, 45.490334f, 112.0f, 72.0f, 112.0f),
                    PathNode.LineTo(168.0f, 112.0f),
                    PathNode.CurveTo(181.25484f, 112.0f, 192.0f, 101.25484f, 192.0f, 88.0f),
                    PathNode.CurveTo(192.0f, 74.74516f, 181.25484f, 64.0f, 168.0f, 64.0f),
                    PathNode.LineTo(72.0f, 64.0f),
                    PathNode.CurveTo(67.58172f, 64.0f, 64.0f, 60.418278f, 64.0f, 56.0f),
                    PathNode.CurveTo(64.0f, 51.581722f, 67.58172f, 48.0f, 72.0f, 48.0f),
                    PathNode.LineTo(168.0f, 48.0f),
                    PathNode.CurveTo(190.09138f, 48.0f, 208.0f, 65.90861f, 208.0f, 88.0f),
                    PathNode.CurveTo(208.0f, 110.09139f, 190.09138f, 128.0f, 168.0f, 128.0f),
                    PathNode.LineTo(72.0f, 128.0f),
                    PathNode.CurveTo(54.32689f, 128.0f, 40.0f, 142.32689f, 40.0f, 160.0f),
                    PathNode.CurveTo(40.0f, 177.67311f, 54.32689f, 192.0f, 72.0f, 192.0f),
                    PathNode.LineTo(173.17f, 192.0f),
                    PathNode.CurveTo(177.1458f, 178.68188f, 190.28929f, 170.29611f, 204.04256f, 172.3028f),
                    PathNode.CurveTo(217.79582f, 174.30948f, 227.99532f, 186.10112f, 228.0f, 200.0f),
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
        return _path!!
    }

private var _path: ImageVector? = null
