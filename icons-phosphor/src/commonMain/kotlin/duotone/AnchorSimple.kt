package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.AnchorSimple: ImageVector
    get() {
        if (_anchorSimple != null) return _anchorSimple!!
        _anchorSimple = phosphorDuotoneIcon(
            name = "AnchorSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 64.0f),
                    PathNode.CurveTo(152.0f, 77.25484f, 141.25484f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(114.74516f, 88.0f, 104.0f, 77.25484f, 104.0f, 64.0f),
                    PathNode.CurveTo(104.0f, 50.745167f, 114.74516f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(141.25484f, 40.0f, 152.0f, 50.745167f, 152.0f, 64.0f),
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
                    PathNode.MoveTo(224.0f, 112.0f),
                    PathNode.LineTo(200.0f, 112.0f),
                    PathNode.CurveTo(195.58173f, 112.0f, 192.0f, 115.58172f, 192.0f, 120.0f),
                    PathNode.CurveTo(192.0f, 124.41828f, 195.58173f, 128.0f, 200.0f, 128.0f),
                    PathNode.LineTo(215.64f, 128.0f),
                    PathNode.CurveTo(211.71965f, 170.25201f, 178.25252f, 203.71495f, 136.0f, 207.63f),
                    PathNode.LineTo(136.0f, 95.0f),
                    PathNode.CurveTo(151.60245f, 90.971466f, 161.7754f, 75.9697f, 159.74495f, 59.983997f),
                    PathNode.CurveTo(157.7145f, 43.998287f, 144.11415f, 32.016132f, 128.0f, 32.016132f),
                    PathNode.CurveTo(111.88586f, 32.016132f, 98.2855f, 43.998287f, 96.25505f, 59.983997f),
                    PathNode.CurveTo(94.2246f, 75.9697f, 104.397545f, 90.971466f, 120.0f, 95.0f),
                    PathNode.LineTo(120.0f, 207.63f),
                    PathNode.CurveTo(77.74749f, 203.71495f, 44.28035f, 170.25201f, 40.36f, 128.0f),
                    PathNode.LineTo(56.0f, 128.0f),
                    PathNode.CurveTo(60.418278f, 128.0f, 64.0f, 124.41828f, 64.0f, 120.0f),
                    PathNode.CurveTo(64.0f, 115.58172f, 60.418278f, 112.0f, 56.0f, 112.0f),
                    PathNode.LineTo(32.0f, 112.0f),
                    PathNode.CurveTo(27.581722f, 112.0f, 24.0f, 115.58172f, 24.0f, 120.0f),
                    PathNode.CurveTo(24.0f, 177.4376f, 70.562386f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(185.4376f, 224.0f, 232.0f, 177.4376f, 232.0f, 120.0f),
                    PathNode.CurveTo(232.0f, 115.58172f, 228.41827f, 112.0f, 224.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 64.0f),
                    PathNode.CurveTo(112.0f, 55.163445f, 119.163445f, 48.0f, 128.0f, 48.0f),
                    PathNode.CurveTo(136.83656f, 48.0f, 144.0f, 55.163445f, 144.0f, 64.0f),
                    PathNode.CurveTo(144.0f, 72.836555f, 136.83656f, 80.0f, 128.0f, 80.0f),
                    PathNode.CurveTo(119.163445f, 80.0f, 112.0f, 72.836555f, 112.0f, 64.0f),
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
        return _anchorSimple!!
    }

private var _anchorSimple: ImageVector? = null
