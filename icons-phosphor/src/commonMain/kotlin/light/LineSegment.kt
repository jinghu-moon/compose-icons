package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LineSegment: ImageVector
    get() {
        if (_lineSegment != null) return _lineSegment!!
        _lineSegment = phosphorLightIcon(
            name = "LineSegment",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(213.23f, 42.77f),
                    PathNode.CurveTo(202.33717f, 31.879143f, 184.96646f, 31.007395f, 173.038f, 40.752968f),
                    PathNode.CurveTo(161.10954f, 50.498543f, 158.49995f, 67.69424f, 167.0f, 80.54f),
                    PathNode.LineTo(80.54f, 167.0f),
                    PathNode.CurveTo(68.63814f, 159.15808f, 52.865932f, 160.74908f, 42.77f, 170.81f),
                    PathNode.LineTo(42.77f, 170.81f),
                    PathNode.CurveTo(31.605858f, 181.97643f, 31.008415f, 199.88538f, 41.403538f, 211.77101f),
                    PathNode.CurveTo(51.798664f, 223.65665f, 69.62762f, 225.44995f, 82.181564f, 215.87262f),
                    PathNode.CurveTo(94.73553f, 206.2953f, 97.716675f, 188.62611f, 89.0f, 175.46f),
                    PathNode.LineTo(175.46f, 89.0f),
                    PathNode.CurveTo(188.3103f, 97.54738f, 205.54895f, 94.95053f, 215.31094f, 82.99681f),
                    PathNode.CurveTo(225.07294f, 71.04309f, 224.17278f, 53.63319f, 213.23f, 42.75f),
                    PathNode.Close,
                    PathNode.MoveTo(76.72f, 204.77f),
                    PathNode.CurveTo(69.68996f, 211.79774f, 58.294056f, 211.79651f, 51.26554f, 204.76723f),
                    PathNode.CurveTo(44.237026f, 197.73795f, 44.237026f, 186.34207f, 51.26554f, 179.31277f),
                    PathNode.CurveTo(58.294056f, 172.2835f, 69.68996f, 172.28226f, 76.72f, 179.31f),
                    PathNode.CurveTo(83.73222f, 186.33647f, 83.73222f, 197.71353f, 76.72f, 204.74f),
                    PathNode.Close,
                    PathNode.MoveTo(204.72f, 76.77f),
                    PathNode.CurveTo(201.34418f, 80.14693f, 196.76491f, 82.04416f, 191.99f, 82.04416f),
                    PathNode.CurveTo(187.21509f, 82.04416f, 182.63582f, 80.14693f, 179.26f, 76.77f),
                    PathNode.LineTo(179.26f, 76.77f),
                    PathNode.CurveTo(172.23225f, 69.73996f, 172.23349f, 58.344055f, 179.26277f, 51.31554f),
                    PathNode.CurveTo(186.29205f, 44.28703f, 197.68796f, 44.28703f, 204.71724f, 51.31554f),
                    PathNode.CurveTo(211.7465f, 58.344055f, 211.74774f, 69.73996f, 204.72f, 76.77f),
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
        return _lineSegment!!
    }

private var _lineSegment: ImageVector? = null
