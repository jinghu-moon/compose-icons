package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PingPong: ImageVector
    get() {
        if (_pingPong != null) return _pingPong!!
        _pingPong = phosphorFillIcon(
            name = "PingPong",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 196.0f),
                    PathNode.CurveTo(239.61102f, 191.31206f, 237.1788f, 187.03282f, 233.35f, 184.3f),
                    PathNode.LineTo(195.35f, 157.15f),
                    PathNode.LineTo(212.35f, 140.2f),
                    PathNode.CurveTo(221.77019f, 130.85965f, 225.89815f, 117.4288f, 223.35f, 104.41f),
                    PathNode.CurveTo(218.69603f, 81.56216f, 206.1673f, 61.073807f, 187.95f, 46.52f),
                    PathNode.CurveTo(169.44914f, 31.62668f, 146.32822f, 23.661507f, 122.58f, 24.0f),
                    PathNode.CurveTo(68.51896f, 24.914173f, 24.914173f, 68.51896f, 24.0f, 122.58f),
                    PathNode.CurveTo(23.706945f, 146.29855f, 31.67986f, 169.37935f, 46.55f, 187.86f),
                    PathNode.CurveTo(61.103806f, 206.0773f, 81.592155f, 218.60602f, 104.44f, 223.26f),
                    PathNode.CurveTo(117.4587f, 225.8063f, 130.8887f, 221.67862f, 140.23f, 212.26f),
                    PathNode.LineTo(157.18f, 195.26f),
                    PathNode.LineTo(184.33f, 233.26f),
                    PathNode.CurveTo(187.03798f, 237.11523f, 191.3074f, 239.58104f, 196.0f, 240.0f),
                    PathNode.CurveTo(196.44f, 240.0f, 196.88f, 240.05f, 197.32f, 240.05f),
                    PathNode.CurveTo(201.56271f, 240.04803f, 205.63092f, 238.36104f, 208.63f, 235.36f),
                    PathNode.LineTo(235.27f, 208.72f),
                    PathNode.CurveTo(238.65579f, 205.39177f, 240.38864f, 200.73177f, 240.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(197.4f, 224.0f),
                    PathNode.LineTo(164.77f, 178.31f),
                    PathNode.CurveTo(163.40259f, 176.39749f, 161.2631f, 175.18329f, 158.92f, 174.99f),
                    PathNode.QuadTo(158.59f, 174.99f, 158.26f, 174.99f),
                    PathNode.CurveTo(156.13763f, 174.98833f, 154.10158f, 175.8301f, 152.6f, 177.33f),
                    PathNode.LineTo(128.97f, 200.96f),
                    PathNode.CurveTo(123.40795f, 206.60495f, 115.39085f, 209.0934f, 107.61f, 207.59f),
                    PathNode.CurveTo(103.42347f, 206.75218f, 99.31043f, 205.5818f, 95.31f, 204.09f),
                    PathNode.LineTo(204.11f, 95.29f),
                    PathNode.CurveTo(205.60048f, 99.29087f, 206.77083f, 103.4038f, 207.61f, 107.59f),
                    PathNode.CurveTo(209.11525f, 115.37095f, 206.62653f, 123.38891f, 200.98f, 128.95f),
                    PathNode.LineTo(177.3f, 152.55f),
                    PathNode.CurveTo(175.63522f, 154.21194f, 174.78627f, 156.52235f, 174.97891f, 158.8668f),
                    PathNode.CurveTo(175.17155f, 161.21126f, 176.38626f, 163.3521f, 178.3f, 164.72f),
                    PathNode.LineTo(224.0f, 197.36f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _pingPong!!
    }

private var _pingPong: ImageVector? = null
