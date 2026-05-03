package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TextHTwo: ImageVector
    get() {
        if (_textHTwo != null) return _textHTwo!!
        _textHTwo = phosphorRegularIcon(
            name = "TextHTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 56.0f),
                    PathNode.LineTo(152.0f, 176.0f),
                    PathNode.CurveTo(152.0f, 180.41827f, 148.41827f, 184.0f, 144.0f, 184.0f),
                    PathNode.CurveTo(139.58173f, 184.0f, 136.0f, 180.41827f, 136.0f, 176.0f),
                    PathNode.LineTo(136.0f, 124.0f),
                    PathNode.LineTo(48.0f, 124.0f),
                    PathNode.LineTo(48.0f, 176.0f),
                    PathNode.CurveTo(48.0f, 180.41827f, 44.418278f, 184.0f, 40.0f, 184.0f),
                    PathNode.CurveTo(35.581722f, 184.0f, 32.0f, 180.41827f, 32.0f, 176.0f),
                    PathNode.LineTo(32.0f, 56.0f),
                    PathNode.CurveTo(32.0f, 51.581722f, 35.581722f, 48.0f, 40.0f, 48.0f),
                    PathNode.CurveTo(44.418278f, 48.0f, 48.0f, 51.581722f, 48.0f, 56.0f),
                    PathNode.LineTo(48.0f, 108.0f),
                    PathNode.LineTo(136.0f, 108.0f),
                    PathNode.LineTo(136.0f, 56.0f),
                    PathNode.CurveTo(136.0f, 51.581722f, 139.58173f, 48.0f, 144.0f, 48.0f),
                    PathNode.CurveTo(148.41827f, 48.0f, 152.0f, 51.581722f, 152.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 200.0f),
                    PathNode.LineTo(208.0f, 200.0f),
                    PathNode.LineTo(241.55f, 155.26f),
                    PathNode.CurveTo(249.12852f, 145.19139f, 250.09196f, 131.61234f, 244.01091f, 120.57459f),
                    PathNode.CurveTo(237.92987f, 109.53684f, 225.93681f, 103.095924f, 213.37666f, 104.12235f),
                    PathNode.CurveTo(200.8165f, 105.14878f, 190.0283f, 113.45139f, 185.82f, 125.33f),
                    PathNode.CurveTo(184.80742f, 128.03831f, 185.33504f, 131.08224f, 187.20004f, 133.29178f),
                    PathNode.CurveTo(189.06506f, 135.5013f, 191.97719f, 136.53252f, 194.81706f, 135.98904f),
                    PathNode.CurveTo(197.65694f, 135.44557f, 199.98257f, 133.412f, 200.9f, 130.67f),
                    PathNode.CurveTo(201.45262f, 129.12813f, 202.23476f, 127.67847f, 203.22f, 126.37f),
                    PathNode.CurveTo(206.61774f, 121.68265f, 212.28253f, 119.19636f, 218.03264f, 119.868675f),
                    PathNode.CurveTo(223.78276f, 120.541f, 228.72119f, 124.26705f, 230.94594f, 129.6118f),
                    PathNode.CurveTo(233.1707f, 134.95654f, 232.33473f, 141.0862f, 228.76f, 145.64f),
                    PathNode.LineTo(185.6f, 203.2f),
                    PathNode.CurveTo(183.78189f, 205.62415f, 183.48944f, 208.86742f, 184.84459f, 211.57771f),
                    PathNode.CurveTo(186.19972f, 214.28798f, 188.96982f, 216.0f, 192.0f, 216.0f),
                    PathNode.LineTo(240.0f, 216.0f),
                    PathNode.CurveTo(244.41827f, 216.0f, 248.0f, 212.41827f, 248.0f, 208.0f),
                    PathNode.CurveTo(248.0f, 203.58173f, 244.41827f, 200.0f, 240.0f, 200.0f),
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
        return _textHTwo!!
    }

private var _textHTwo: ImageVector? = null
