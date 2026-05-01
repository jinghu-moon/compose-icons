package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Path: ImageVector
    get() {
        if (_path != null) return _path!!
        _path = phosphorDuotoneIcon(
            name = "Path",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 200.0f),
                    PathNode.CurveTo(224.0f, 213.25484f, 213.25484f, 224.0f, 200.0f, 224.0f),
                    PathNode.CurveTo(186.74516f, 224.0f, 176.0f, 213.25484f, 176.0f, 200.0f),
                    PathNode.CurveTo(176.0f, 186.74516f, 186.74516f, 176.0f, 200.0f, 176.0f),
                    PathNode.CurveTo(213.25484f, 176.0f, 224.0f, 186.74516f, 224.0f, 200.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 168.0f),
                    PathNode.CurveTo(185.40929f, 168.0138f, 172.66814f, 177.8779f, 169.0f, 192.0f),
                    PathNode.LineTo(72.0f, 192.0f),
                    PathNode.CurveTo(54.32689f, 192.0f, 40.0f, 177.67311f, 40.0f, 160.0f),
                    PathNode.CurveTo(40.0f, 142.32689f, 54.32689f, 128.0f, 72.0f, 128.0f),
                    PathNode.LineTo(168.0f, 128.0f),
                    PathNode.CurveTo(190.09138f, 128.0f, 208.0f, 110.09139f, 208.0f, 88.0f),
                    PathNode.CurveTo(208.0f, 65.90861f, 190.09138f, 48.0f, 168.0f, 48.0f),
                    PathNode.LineTo(72.0f, 48.0f),
                    PathNode.CurveTo(67.58172f, 48.0f, 64.0f, 51.581722f, 64.0f, 56.0f),
                    PathNode.CurveTo(64.0f, 60.418278f, 67.58172f, 64.0f, 72.0f, 64.0f),
                    PathNode.LineTo(168.0f, 64.0f),
                    PathNode.CurveTo(181.25484f, 64.0f, 192.0f, 74.74516f, 192.0f, 88.0f),
                    PathNode.CurveTo(192.0f, 101.25484f, 181.25484f, 112.0f, 168.0f, 112.0f),
                    PathNode.LineTo(72.0f, 112.0f),
                    PathNode.CurveTo(45.490334f, 112.0f, 24.0f, 133.49033f, 24.0f, 160.0f),
                    PathNode.CurveTo(24.0f, 186.50967f, 45.490334f, 208.0f, 72.0f, 208.0f),
                    PathNode.LineTo(169.0f, 208.0f),
                    PathNode.CurveTo(173.15686f, 224.09944f, 188.9511f, 234.33292f, 205.34363f, 231.54794f),
                    PathNode.CurveTo(221.73616f, 228.76297f, 233.26459f, 213.8876f, 231.87132f, 197.31865f),
                    PathNode.CurveTo(230.47807f, 180.74968f, 216.62743f, 168.00838f, 200.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 216.0f),
                    PathNode.CurveTo(191.16344f, 216.0f, 184.0f, 208.83656f, 184.0f, 200.0f),
                    PathNode.CurveTo(184.0f, 191.16344f, 191.16344f, 184.0f, 200.0f, 184.0f),
                    PathNode.CurveTo(208.83656f, 184.0f, 216.0f, 191.16344f, 216.0f, 200.0f),
                    PathNode.CurveTo(216.0f, 208.83656f, 208.83656f, 216.0f, 200.0f, 216.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _path!!
    }

private var _path: ImageVector? = null
