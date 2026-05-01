package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.InstagramLogo: ImageVector
    get() {
        if (_instagramLogo != null) return _instagramLogo!!
        _instagramLogo = phosphorBoldIcon(
            name = "InstagramLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 80.0f),
                    PathNode.CurveTo(101.49033f, 80.0f, 80.0f, 101.49033f, 80.0f, 128.0f),
                    PathNode.CurveTo(80.0f, 154.50967f, 101.49033f, 176.0f, 128.0f, 176.0f),
                    PathNode.CurveTo(154.50967f, 176.0f, 176.0f, 154.50967f, 176.0f, 128.0f),
                    PathNode.CurveTo(175.97244f, 101.501755f, 154.49825f, 80.02756f, 128.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 152.0f),
                    PathNode.CurveTo(114.74516f, 152.0f, 104.0f, 141.25484f, 104.0f, 128.0f),
                    PathNode.CurveTo(104.0f, 114.74516f, 114.74516f, 104.0f, 128.0f, 104.0f),
                    PathNode.CurveTo(141.25484f, 104.0f, 152.0f, 114.74516f, 152.0f, 128.0f),
                    PathNode.CurveTo(152.0f, 141.25484f, 141.25484f, 152.0f, 128.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 20.0f),
                    PathNode.LineTo(80.0f, 20.0f),
                    PathNode.CurveTo(46.878906f, 20.038574f, 20.038574f, 46.878906f, 20.0f, 80.0f),
                    PathNode.LineTo(20.0f, 176.0f),
                    PathNode.CurveTo(20.038574f, 209.1211f, 46.878906f, 235.96143f, 80.0f, 236.0f),
                    PathNode.LineTo(176.0f, 236.0f),
                    PathNode.CurveTo(209.1211f, 235.96143f, 235.96143f, 209.1211f, 236.0f, 176.0f),
                    PathNode.LineTo(236.0f, 80.0f),
                    PathNode.CurveTo(235.96143f, 46.878906f, 209.1211f, 20.038574f, 176.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 176.0f),
                    PathNode.CurveTo(212.0f, 195.88223f, 195.88223f, 212.0f, 176.0f, 212.0f),
                    PathNode.LineTo(80.0f, 212.0f),
                    PathNode.CurveTo(60.11775f, 212.0f, 44.0f, 195.88223f, 44.0f, 176.0f),
                    PathNode.LineTo(44.0f, 80.0f),
                    PathNode.CurveTo(44.0f, 60.11775f, 60.11775f, 44.0f, 80.0f, 44.0f),
                    PathNode.LineTo(176.0f, 44.0f),
                    PathNode.CurveTo(195.88223f, 44.0f, 212.0f, 60.11775f, 212.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 76.0f),
                    PathNode.CurveTo(196.0f, 84.836555f, 188.83656f, 92.0f, 180.0f, 92.0f),
                    PathNode.CurveTo(171.16344f, 92.0f, 164.0f, 84.836555f, 164.0f, 76.0f),
                    PathNode.CurveTo(164.0f, 67.163445f, 171.16344f, 60.0f, 180.0f, 60.0f),
                    PathNode.CurveTo(188.83656f, 60.0f, 196.0f, 67.163445f, 196.0f, 76.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _instagramLogo!!
    }

private var _instagramLogo: ImageVector? = null
