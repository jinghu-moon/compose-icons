package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.InstagramLogo: ImageVector
    get() {
        if (_instagramLogo != null) return _instagramLogo!!
        _instagramLogo = phosphorLightIcon(
            name = "InstagramLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 82.0f),
                    PathNode.CurveTo(102.5949f, 82.0f, 82.0f, 102.5949f, 82.0f, 128.0f),
                    PathNode.CurveTo(82.0f, 153.4051f, 102.5949f, 174.0f, 128.0f, 174.0f),
                    PathNode.CurveTo(153.4051f, 174.0f, 174.0f, 153.4051f, 174.0f, 128.0f),
                    PathNode.CurveTo(173.96695f, 102.608604f, 153.39139f, 82.03306f, 128.0f, 82.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 162.0f),
                    PathNode.CurveTo(109.22232f, 162.0f, 94.0f, 146.77768f, 94.0f, 128.0f),
                    PathNode.CurveTo(94.0f, 109.22232f, 109.22232f, 94.0f, 128.0f, 94.0f),
                    PathNode.CurveTo(146.77768f, 94.0f, 162.0f, 109.22232f, 162.0f, 128.0f),
                    PathNode.CurveTo(162.0f, 146.77768f, 146.77768f, 162.0f, 128.0f, 162.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 26.0f),
                    PathNode.LineTo(80.0f, 26.0f),
                    PathNode.CurveTo(50.19033f, 26.033068f, 26.033068f, 50.19033f, 26.0f, 80.0f),
                    PathNode.LineTo(26.0f, 176.0f),
                    PathNode.CurveTo(26.033068f, 205.80966f, 50.19033f, 229.96693f, 80.0f, 230.0f),
                    PathNode.LineTo(176.0f, 230.0f),
                    PathNode.CurveTo(205.80966f, 229.96693f, 229.96693f, 205.80966f, 230.0f, 176.0f),
                    PathNode.LineTo(230.0f, 80.0f),
                    PathNode.CurveTo(229.96693f, 50.19033f, 205.80966f, 26.033068f, 176.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 176.0f),
                    PathNode.CurveTo(218.0f, 199.19595f, 199.19595f, 218.0f, 176.0f, 218.0f),
                    PathNode.LineTo(80.0f, 218.0f),
                    PathNode.CurveTo(56.80404f, 218.0f, 38.0f, 199.19595f, 38.0f, 176.0f),
                    PathNode.LineTo(38.0f, 80.0f),
                    PathNode.CurveTo(38.0f, 56.80404f, 56.80404f, 38.0f, 80.0f, 38.0f),
                    PathNode.LineTo(176.0f, 38.0f),
                    PathNode.CurveTo(199.19595f, 38.0f, 218.0f, 56.80404f, 218.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(190.0f, 76.0f),
                    PathNode.CurveTo(190.0f, 81.52285f, 185.52284f, 86.0f, 180.0f, 86.0f),
                    PathNode.CurveTo(174.47716f, 86.0f, 170.0f, 81.52285f, 170.0f, 76.0f),
                    PathNode.CurveTo(170.0f, 70.47715f, 174.47716f, 66.0f, 180.0f, 66.0f),
                    PathNode.CurveTo(185.52284f, 66.0f, 190.0f, 70.47715f, 190.0f, 76.0f),
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
        return _instagramLogo!!
    }

private var _instagramLogo: ImageVector? = null
