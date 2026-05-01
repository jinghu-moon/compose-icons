package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.InstagramLogo: ImageVector
    get() {
        if (_instagramLogo != null) return _instagramLogo!!
        _instagramLogo = phosphorThinIcon(
            name = "InstagramLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 84.0f),
                    PathNode.CurveTo(103.69947f, 84.0f, 84.0f, 103.69947f, 84.0f, 128.0f),
                    PathNode.CurveTo(84.0f, 152.30052f, 103.69947f, 172.0f, 128.0f, 172.0f),
                    PathNode.CurveTo(152.30052f, 172.0f, 172.0f, 152.30052f, 172.0f, 128.0f),
                    PathNode.CurveTo(171.97244f, 103.71089f, 152.28911f, 84.02756f, 128.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 164.0f),
                    PathNode.CurveTo(108.11775f, 164.0f, 92.0f, 147.88223f, 92.0f, 128.0f),
                    PathNode.CurveTo(92.0f, 108.11775f, 108.11775f, 92.0f, 128.0f, 92.0f),
                    PathNode.CurveTo(147.88223f, 92.0f, 164.0f, 108.11775f, 164.0f, 128.0f),
                    PathNode.CurveTo(164.0f, 147.88223f, 147.88223f, 164.0f, 128.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 28.0f),
                    PathNode.LineTo(80.0f, 28.0f),
                    PathNode.CurveTo(51.2949f, 28.033064f, 28.033064f, 51.2949f, 28.0f, 80.0f),
                    PathNode.LineTo(28.0f, 176.0f),
                    PathNode.CurveTo(28.033064f, 204.7051f, 51.2949f, 227.96693f, 80.0f, 228.0f),
                    PathNode.LineTo(176.0f, 228.0f),
                    PathNode.CurveTo(204.7051f, 227.96693f, 227.96693f, 204.7051f, 228.0f, 176.0f),
                    PathNode.LineTo(228.0f, 80.0f),
                    PathNode.CurveTo(227.96693f, 51.2949f, 204.7051f, 28.033064f, 176.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 176.0f),
                    PathNode.CurveTo(219.97244f, 200.28911f, 200.28911f, 219.97244f, 176.0f, 220.0f),
                    PathNode.LineTo(80.0f, 220.0f),
                    PathNode.CurveTo(55.71089f, 219.97244f, 36.027554f, 200.28911f, 36.0f, 176.0f),
                    PathNode.LineTo(36.0f, 80.0f),
                    PathNode.CurveTo(36.027554f, 55.71089f, 55.71089f, 36.027554f, 80.0f, 36.0f),
                    PathNode.LineTo(176.0f, 36.0f),
                    PathNode.CurveTo(200.28911f, 36.027554f, 219.97244f, 55.71089f, 220.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 76.0f),
                    PathNode.CurveTo(188.0f, 80.41828f, 184.41827f, 84.0f, 180.0f, 84.0f),
                    PathNode.CurveTo(175.58173f, 84.0f, 172.0f, 80.41828f, 172.0f, 76.0f),
                    PathNode.CurveTo(172.0f, 71.58172f, 175.58173f, 68.0f, 180.0f, 68.0f),
                    PathNode.CurveTo(184.41827f, 68.0f, 188.0f, 71.58172f, 188.0f, 76.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _instagramLogo!!
    }

private var _instagramLogo: ImageVector? = null
